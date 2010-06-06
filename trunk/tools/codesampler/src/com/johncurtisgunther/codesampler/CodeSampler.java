package com.johncurtisgunther.codesampler;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

import com.sun.tools.doclets.*;
import com.sun.javadoc.*;

/**
 *
 * This Taglet lets you include a literal source code excerpt within the javadocs
 *
 * Here is an example use of the tag:
 * <p>
 * <pre>{@code
 * {@code.sample ..\..\HelloWorld.java#mySnippet}
 * } </pre>
 * <p>
 * Within HelloWorld.java there must be two delimiting lines:
 * <p>
 * <pre>{@code 
 * //<<mySnippet
 *    JOptionPane.showMessage(null, new JLabel("<html><h1>Hello, World!"));
 * //>>   
 * } </pre>
 * <p>
 * The delimiting lines will not be included in the snippet placed into the
 * javadoc HTML. The characters <>& will be replaced with &lt;&gt;&amp;
 * so they display properly in the HTML, and the entire snippet enclosed
 * via <pre> ... </pre>.
 * <p>
 * There can be any number of snippets, but each must have a unique name.
 * <p>
 * If the # delimiter is omitted, the snippet will include the entire file.
 * <p>
 * 
 */ 

public class CodeSampler implements Taglet {

    private static final String NAME = "code.sample";
    
    /**
     * Return the name of this custom tag.
     */
    public String getName() {
        return NAME;
    }
    
    /**
     * @return true since this tag can be used in a field
     *         doc comment
     */
    public boolean inField() {
        return true;
    }

    /**
     * @return true since this tag can be used in a constructor
     *         doc comment
     */
    public boolean inConstructor() {
        return true;
    }
    
    /**
     * @return true since this tag can be used in a method
     *         doc comment
     */
    public boolean inMethod() {
        return true;
    }
    
    /**
     * @return true since this tag can be used in an overview
     *         doc comment
     */
    public boolean inOverview() {
        return true;
    }

    /**
     * @return true since this tag can be used in a package
     *         doc comment
     */
    public boolean inPackage() {
        return true;
    }

    /**
     * @return true since this 
     */
    public boolean inType() {
        return true;
    }
    
    /**
     * Will return true since this is an inline tag.
     * @return true since this is an inline tag.
     */
    
    public boolean isInlineTag() {
        return true;
    }
    
    /**
     * Register this Taglet.
     * @param tagletMap  the map to register this tag to.
     */
    @SuppressWarnings("unchecked")
        public static void register(Map tagletMap) {
       CodeSampler tag = new CodeSampler();
       Taglet t = (Taglet) tagletMap.get(tag.getName());
       if (t != null) {
           tagletMap.remove(tag.getName());
       }
       tagletMap.put(tag.getName(), tag);
    }

    // retrieves an HTML-appropriate excerpt from a source code file
    private String fileExcerpt(String fileName, String snippetName, boolean asIs) {
       boolean itFailed = false;
       int iLine = 1;
       StringBuffer result = new StringBuffer();
       if (!asIs) result.append("<pre>\n");
       
       BufferedReader inp = null;
        try {
                inp = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
                e.printStackTrace();
                System.err.println("FileNotFoundException in " + getName() + " taglet " +
                                   "while trying to open the file: "
                                   + fileName);
                if (null != snippetName)
                  System.err.print(" to retrieve the excerpt named " + snippetName);
                System.exit(0);
        }
       boolean startLineSeen = (null == snippetName);
       boolean endLineSeen = false;
       String commonWhitespacePrefix = null;
       try {
                for (String s = inp.readLine(); s != null; s = inp.readLine()) {
                      if (null != snippetName && s.startsWith(BEGIN_SNIPPET + snippetName))
                         startLineSeen = true;
                      else if (null != snippetName && s.startsWith(END_SNIPPET + snippetName))
                         endLineSeen = true;
                      else if (s.startsWith(BEGIN_SNIPPET) ||
                               s.startsWith(END_SNIPPET))
                         continue;
                      else if (startLineSeen && !endLineSeen) {
                         if (!asIs) {
                            if (null == commonWhitespacePrefix) {
                               // we assume that any whitespace at the beginning of first line is
                               // common to all lines (if first line contains tabs and rest do not (or
                               // visa versa), or if first line is indented more than subsequent lines
                               // (unlikely with most code excerpts) this won't work right. But it
                               // usually works as expected, zapping the common leading whitespace from the excerpt.
                               commonWhitespacePrefix = (s.split("\\S",2))[0];
                               commonWhitespacePrefix = "^" + commonWhitespacePrefix;
                            }
                            s = s.replaceFirst(commonWhitespacePrefix, "");

                            // Compiler directives such as @SuppressWarnings("serial") are
                            // are removed, both to avoid clutter and because the javadoc tool
                            // aborts when they are present (they look too much like it's own @
                            // directives, I guess)
                            if (s.trim().startsWith("@SuppressWarnings")) 
                               s = s.replaceFirst("@SuppressWarnings\\(\"\\w+\"\\)\\s*","");
                            // needed to support code samples that include HTML
                            s = s.replaceAll("\\&","&amp;");
                            s = s.replaceAll("\\<","&lt;");
                            s = s.replaceAll("\\>","&gt;");
                         }
                         // else just insert text as is without any special encoding

                         result.append(s);
                         result.append("\n");
                      }
                      iLine++;
                   }
       } catch (IOException e) {
                
          e.printStackTrace();
          System.err.println("IOException while trying to read line #" + iLine +
                             " of file " + fileName + " in the " + getName() + " taglet");
          if (null != snippetName)
             System.err.print(" within the excerpt named " + snippetName);
          itFailed = true;   
        }
        finally {
           try {
                inp.close();
           } catch (IOException e) {

                if (!itFailed) e.printStackTrace();
                System.err.println("IOException while trying to close the file: "
                                   + fileName + " in the " + getName() + " taglet.");
                itFailed = true;
           }
        }

        if (!itFailed && !startLineSeen) {
           itFailed = true;
           System.err.println("Could not find snippet \"" + snippetName + "\" within the " +
                             "file " + fileName + " as referenced in the " + getName() + " taglet");
        }

        if (itFailed)
          System.exit(0);
       if (!asIs) result.append("</pre>\n");
       return result.toString();
    }
    
    /**
     * Returns the requested code excerpt, properly encoded for use within HTML
     * 
     */
    private final String BEGIN_SNIPPET = "//<<";
    private final String END_SNIPPET = "//>>";
    private final String AS_IS_PATTERN = "^AS_IS ";
    public String toString(Tag tag) {
       boolean asIs = true;
       String sansQualifiers = tag.text().replaceFirst(AS_IS_PATTERN, "");
       if (sansQualifiers.equals(tag.text()))
          asIs = false;
       
       String[] parts = sansQualifiers.split("#");
       String fileName = parts[0];
       String result = "";
       String parentDir = tag.position().file().getParentFile().getPath();
       if (parts.length == 1)  // include entire file if no part specified
          result = fileExcerpt(parentDir + File.separator + fileName, null, asIs);
       else
          result = fileExcerpt(parentDir + File.separator + fileName, parts[1], asIs);
       return result;
       
    }
    
    /**
     * This method should not be called since arrays of inline tags do not
     * exist.  Method {@link #tostring(Tag)} should be used to convert this
     * inline tag to a string.
     * @param tags the array of <code>Tag</code>s representing of this custom tag.
     */
    public String toString(Tag[] tags) {
        return null;
    }

}

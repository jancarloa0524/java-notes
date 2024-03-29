public class EscapeSequences {
    public static void main(String[] arg) {
        // On the AP exam, escape sequences are very important to remember, so make sure to use these whenever you practice!

        // The following allows you to include quotes in your text! Simply add the following \" \" in order to implement slashes
        String includeQuotes = "\"Hello\" World!";

        // The following allows you to include single quotes in your text! Simply add the following \' \' in order to implement slashes
        String includeSingleQuotes = "\'Hello\' World!";

        // The following allows you to inlcude backlasshes in your text, by simply typing \\
        String includeBackslash = "Here \\ are \\ my \\ backslahes!";

        // The following allows you to enter text on a new line, by typing \n
        String includeNewLine = "The next line: \nis a new line!";

        // The following allows you to add a tab
        String includeTab = "The next line: \n\t is tabbed";

        System.out.println(includeQuotes);

        System.out.println(includeSingleQuotes);

        System.out.println(includeBackslash);

        System.out.println(includeNewLine);

        System.out.println(includeTab);
    }
}
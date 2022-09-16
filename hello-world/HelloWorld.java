public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello World!");

    System.out.print("Goobye");
    System.out.println(" World!");
    // This will force the next line of text to be on the next line. 

    System.out.print("New");
    // Because the output before the following one isn't a "println", the following output is printed on the same line.
    System.out.print("Line");
  }
}

// public class is the name of the file. A java program can have multiple of these. It represents a real-world idea. 
// main runs a certain task
// java should include white-space, curly braces, and semi-colons

// System: Built in java class containing tools
// out: output
// println: print line
// print: print text in current line

/* 
Multi
Line
Comments
Still
Exist!
*/

// Once done, use the terminal to compile your java code with:
// javac ExampleName.java
// And then run it with
// java ExampleName

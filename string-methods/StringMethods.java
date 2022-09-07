public class StringMethods {
  
  public static void main(String[] args) {
    String sentence = "I love to play video games";
    // Makes all letters either upper/lower case
    System.out.println(sentence.toUpperCase());
    System.out.println(sentence.toLowerCase());
    // Finds the index of the first letter it can find
    System.out.println(sentence.indexOf("l"));
    // Finds what a character is using it's index in a string
    System.out.println(sentence.charAt(0));
    // Finds the length of a string
    System.out.println(sentence.length());
    // Can take out specific sections of a string
    System.out.println(sentence.substring(15));
    System.out.println(sentence.substring(10, 14));
    String sentence2 = ", specifically Halo";
    // Can combine strings, concatenation
    System.out.println(sentence.concat(sentence2));

    // Can compare two words and see if they are the same, such as a password
    String word1 = "Apples";
    String word2 = "Bananas";
    System.out.println(word1.equals("Apples"));
    System.out.println(word1.equals(word2));

    // Another method which accomplishes a similiar task, but with different results
    /*
        !!! AP EXAM NOTE !!!
    The output of the "compareTo()" method is going to be a number, 
    where 0 means that lexicographically, the strings are eqal.
    If greater, then lexicographically, the String object is greater than the String obj argument
    If less, then lexicographically, the String object is less than the String obj argument
    This is all done by converting each character in a string to unicode, and the unicode of each string is compared.
    */
    System.out.println(word1.compareTo(word2));
    System.out.println(word1.compareTo("apples"));
  }
  
}
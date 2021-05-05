/*
* The reverse string program uses recursion to reverse a string.
*
* @author  Cameron Teed
* @version 1.0
* @since   2021-05-05
* Class StringReverse.
*/

final class StringReverse {

  private StringReverse() {
    // Prevent instantiation
    // Optional: throw an exception e.g. AssertionError
    // if this ever *is* called
     throw new IllegalStateException("Cannot be instantiated");
  }

  /**
  * Function reverses the string.
  *
  * @param revString
  * @return revString
  */
  public static String reverser(final String revString) {

    // check if string is empty
    if (revString.isEmpty()) {
      // Returns null
      return revString;
    // enter reverser function again if it is not empty
    } else {
      /*
      * Function calls itself passing the string minus the first charecter
      * then recursivly takes the 0th charcter and adds it to the final string
      */
      return reverser(revString.substring(1)) + revString.charAt(0);
    }
  }

  /**
  * The main function.
  *
  * @param args
  */
  public static void main(final String[] args) {
    // Creates string
    String newString = "recursion";
    // Prints out the original and the reversed string
    System.out.println("The original string is: " + newString);
    System.out.println();
    System.out.println("The reversed string is: " + reverser(newString));
    System.out.println();
    System.out.println("Done");
  }
}

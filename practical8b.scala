object Scala_String {

  def main(args: Array[String]): Unit = {
    val str = "My name is Pallavi Khurana";

    // Convert the above string to all lowercase.
    val lowerStr = str.toLowerCase();
    val upperStr = str.toUpperCase();

    // Display the two strings for comparison.
    println("Original String: " + str);
    println("String in lowercase: " + lowerStr);
    println("String in uppercase: " + upperStr);
  }
}

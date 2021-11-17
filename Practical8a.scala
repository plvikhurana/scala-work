object MyClass {
    def main(args: Array[String]) {
        val string1 = "ABC"
        val string2 = "ABC"
        
        println("String1 = " + string1)
        println("String2 = " + string2)
        
        val compStr = string1.compareTo(string2)
        println("Value of comparison between '" + string1 + "' and '" + string2 + "' is " + compStr)
    }
}

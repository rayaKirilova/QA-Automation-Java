public class String_Operations {
    public static void main(String[] args) {

        String greeting = "Hello. I am from Sofia. How was your day?";

        // return length - integer number
        int length = greeting.length() ;
        System.out.println(length);
/*
        // return index number
        System.out.println(greeting.indexOf("hello")) ;
        System.out.println(greeting.indexOf("Hello")) ; // we have exact occurrence

        System.out.println(greeting.lastIndexOf("how")) ;
        System.out.println(greeting.lastIndexOf("How")) ; // we have exact occurrence

        // return boolean values
        System.out.println(greeting.startsWith("Sofia")) ; // false
        System.out.println(greeting.startsWith("Hello")) ; // true

        System.out.println(greeting.endsWith("day?")) ; // true
        System.out.println(greeting.endsWith("Sofia")) ; // false

        System.out.println(greeting.contains("Sofia")) ; // true
        System.out.println(greeting.contains("Pesho")) ; // false
*/
        String word = "computer" ;
        System.out.println(word.compareTo("computer")) ; // return 0 => true
        System.out.println(word.compareTo("pc")) ; // return negative value => false

        System.out.println(word.substring(1, 5)) ; // return "ompu"

        System.out.println(word.isEmpty()) ; // false
        String emptyStr = "" ;
        System.out.println(emptyStr.isEmpty()) ; // true

        System.out.println(word.replace("om", "to")) ; // return "ctoputer"

        String needTrim = "I need trim    " ;
        System.out.println(needTrim.trim()) ; // I need trim











    }
}

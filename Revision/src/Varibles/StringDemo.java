package Varibles;

public class StringDemo {
    public static void main(String[] args) {
        String greeting = "Hello, World!";
        
        // Length of the string
        System.out.println("Length: " + greeting.length());

        // Access a character
        System.out.println("First character: " + greeting.charAt(0));

        // Substring
        String sub = greeting.substring(7, 12);
        System.out.println("Substring: " + sub);

        // Concatenation
        String newGreeting = greeting + " How are you?";
        System.out.println(newGreeting);

        // String comparison
        boolean isEqual = greeting.equals("Hello, World!");
        System.out.println("Is equal: " + isEqual);

        // Replacing characters
        String replaced = greeting.replace("World", "Java");
        System.out.println("Replaced: " + replaced);
    }
}


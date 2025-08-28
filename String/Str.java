public class Str {
    public static void main(String[] args) {
        String s = "Hello World";

        // Length
        System.out.println("Length: " + s.length());

        // Convert case
        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("Lowercase: " + s.toLowerCase());

        // Character at index
        System.out.println("Char at 1: " + s.charAt(1));

        // Substring
        System.out.println("Substring (0,5): " + s.substring(0, 5));

        // Contains
        System.out.println("Contains 'World': " + s.contains("World"));

        // Starts/Ends
        System.out.println("Starts with 'He': " + s.startsWith("He"));
        System.out.println("Ends with 'ld': " + s.endsWith("ld"));

        // Equals / Ignore Case
        System.out.println("Equals 'Hello World': " + s.equals("Hello World"));
        System.out.println("EqualsIgnoreCase 'hello world': " + s.equalsIgnoreCase("hello world"));

        // Replace
        System.out.println("Replace o -> 0: " + s.replace("o", "0"));

        // Index Of
        System.out.println("Index of 'o': " + s.indexOf("o"));
        System.out.println("Last Index of 'o': " + s.lastIndexOf("o"));

        // Trim
        String s2 = "   Java   ";
        System.out.println("Before trim: [" + s2 + "]");
        System.out.println("After trim: [" + s2.trim() + "]");

        // Split
        String[] words = s.split(" ");
        System.out.println("Split words:");
        for (String w : words) {
            System.out.println(w);
        }
    }
}

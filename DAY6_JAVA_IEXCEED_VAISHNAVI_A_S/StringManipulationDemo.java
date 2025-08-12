public class StringManipulationDemo {
    public static void main(String[] args) {
        String original = "  Hello World!  ";
        String another = "hello world!";

        // 1. length()
        System.out.println("Length: " + original.length());

        // 2. charAt()
        System.out.println("Character at index 1: " + original.charAt(1));

        // 3. substring()
        System.out.println("Substring (2 to 7): " + original.substring(2, 7));

        // 4. equals()
        System.out.println("Equals another: " + original.equals(another));

        // 5. equalsIgnoreCase()
        System.out.println("EqualsIgnoreCase: " + original.trim().equalsIgnoreCase(another));

        // 6. compareTo()
        System.out.println("CompareTo: " + original.compareTo(another));

        // 7. contains()
        System.out.println("Contains 'World': " + original.contains("World"));

        // 8. indexOf()
        System.out.println("Index of 'o': " + original.indexOf('o'));

        // 9. lastIndexOf()
        System.out.println("Last index of 'o': " + original.lastIndexOf('o'));

        // 10. toUpperCase()
        System.out.println("To Upper Case: " + original.toUpperCase());

        // 11. toLowerCase()
        System.out.println("To Lower Case: " + original.toLowerCase());

        // 12. trim()
        System.out.println("Trimmed: '" + original.trim() + "'");

        // 13. replace()
        System.out.println("Replace 'l' with '*': " + original.replace('l', '*'));

        // 14. split()
        String[] words = original.trim().split(" ");
        System.out.println("Split:");
        for (String word : words) {
            System.out.println(" - " + word);
        }

        // 15. startsWith()
        System.out.println("Starts with '  He': " + original.startsWith("  He"));

        // 16. endsWith()
        System.out.println("Ends with '!  ': " + original.endsWith("!  "));

        // 17. isEmpty()
        String emptyStr = "";
        System.out.println("Is empty: " + emptyStr.isEmpty());

        // 18. concat()
        System.out.println("Concatenated: " + original.concat(" Let's go!"));

        // 19. matches() (regex)
        System.out.println("Matches regex '.*World.*': " + original.matches(".*World.*"));

        // 20. toCharArray()
        char[] chars = original.toCharArray();
        System.out.println("Characters:");
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();

        // 21. format()
        String formatted = String.format("Welcome %s, your score is %d", "Vaishnavi", 95);
        System.out.println("Formatted: " + formatted);

        // 22. intern()
        String s1 = new String("Java");
        String s2 = "Java";
        System.out.println("Using intern(): " + (s1.intern() == s2)); // true
    }
}

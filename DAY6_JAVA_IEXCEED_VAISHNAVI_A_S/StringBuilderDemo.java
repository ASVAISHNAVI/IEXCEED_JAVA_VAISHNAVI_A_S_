public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        // 1. append()
        sb.append(" World");
        System.out.println("append(): " + sb);

        // 2. insert()
        sb.insert(6, "Java ");
        System.out.println("insert(): " + sb);

        // 3. replace()
        sb.replace(6, 10, "C++");
        System.out.println("replace(): " + sb);

        // 4. delete()
        sb.delete(6, 10);
        System.out.println("delete(): " + sb);

        // 5. deleteCharAt()
        sb.deleteCharAt(5);
        System.out.println("deleteCharAt(): " + sb);

        // 6. reverse()
        sb.reverse();
        System.out.println("reverse(): " + sb);
        sb.reverse(); // restore original

        // 7. capacity()
        System.out.println("capacity(): " + sb.capacity());

        // 8. ensureCapacity()
        sb.ensureCapacity(50);
        System.out.println("ensureCapacity(50): " + sb.capacity());

        // 9. length()
        System.out.println("length(): " + sb.length());

        // 10. charAt()
        System.out.println("charAt(1): " + sb.charAt(1));

        // 11. setCharAt()
        sb.setCharAt(1, 'a');
        System.out.println("setCharAt(1, 'a'): " + sb);

        // 12. substring()
        System.out.println("substring(0, 5): " + sb.substring(0, 5));

        // 13. indexOf()
        System.out.println("indexOf(\"World\"): " + sb.indexOf("World"));

        // 14. lastIndexOf()
        sb.append(" World");
        System.out.println("lastIndexOf(\"World\"): " + sb.lastIndexOf("World"));

        // 15. toString()
        String str = sb.toString();
        System.out.println("toString(): " + str);
    }
}

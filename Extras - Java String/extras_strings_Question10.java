public class extras_strings_Question10 {
    public static void main(String[] args) {
        String string1 = "Hello World";
        String string2 = "";
        for (int i = 0; i < string1.length(); i++) {
            char c = string1.charAt(i);
            if (c != 'l') {
                string2 += String.valueOf(c);
            }
        }
        System.out.println(string2);
    }
}

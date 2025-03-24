public class extras_strings_Question9 {
    public static void main(String[] args) {
        String string1 = "Success";
        string1=string1.toLowerCase();
        char mostFrequentCharacter = ' ';
        int frequentCharacterLength = 0;
        for (int i = 0; i < string1.length(); i++) {
            int length = 0;
            char c = string1.charAt(i);
            for (int j = 0; j < string1.length(); j++) {
                if (c == string1.charAt(j)) {
                    length++;
                }
            }
            if (length > frequentCharacterLength) {
                frequentCharacterLength = length;
                mostFrequentCharacter = c;

            }
        }
        System.out.println(" Most Frequent Character: '"+mostFrequentCharacter+"'");
    }
}

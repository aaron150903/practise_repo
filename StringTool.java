public class StringTool {

    public static String upper(String str) {
        return str.toUpperCase();
    }


    public static String toTitleCase(String input) {
        StringBuilder titleCase = new StringBuilder(input.length());
        //adding comment
        //adding another comment
        boolean nextTitleCase = true;

        for (char c : input.toCharArray()) {
            if (Character.isSpaceChar(c)) {
                nextTitleCase = true;
            } else if (nextTitleCase) {
                c = Character.toTitleCase(c);
                nextTitleCase = false;
            }

            titleCase.append(c);
        }

        return titleCase.toString();


    public static String lower(String str) {
        return str.toLowerCase();

    public static String reverse(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            new_str += str.charAt(i);
        }
        return new_str;
    }

    public static void main(String[] args) {

    }
}
public class CaesarCipher extends ROT13{

    public String crypt(String text, Integer shift) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {

            if (Character.isUpperCase(text.charAt(i))) {
                //Uppercase characters start on ASCII Table at 65
                char ch = (char) (((int) text.charAt(i) + shift - 65) % 26 + 65);
                stringBuilder.append(ch);
            } else if (Character.isLowerCase(text.charAt(i))) {
                //Lowercase characters start on ASCII Table at 97
                char ch = (char) (((int) text.charAt(i) + shift - 97) % 26 + 97);
                stringBuilder.append(ch);
            } else {
                stringBuilder.append(text.charAt(i));
            }

        }
        return stringBuilder.toString();
    }


}

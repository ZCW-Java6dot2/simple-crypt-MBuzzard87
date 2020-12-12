import java.io.*;

public class ROT13 {

    private Character cs;
    private Character cf;
    private Integer shift;


    ROT13(Character cs, Character cf) {
        this.cs = cs;
        this.cf = cf;
        this.shift = cf - cs;
    }

    ROT13() {
        this.shift = 13;
    }

    public String crypt(String text) throws UnsupportedOperationException {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'm') {
                ch += this.shift;
            } else if (ch >= 'A' && ch <= 'M') {
                ch += this.shift;
            } else if (ch >= 'n' && ch <= 'z') {
                ch -= (26 - this.shift);
            } else if (ch >= 'N' && ch <= 'Z') {
                ch -= (26 - this.shift);
            }

            stringBuilder.append(ch);
        }

        return stringBuilder.toString();
    }

    public String encryptAndDecrypt(String text) {
        return crypt(text);
    }


    public static String rotate(String s, Character c) {
        StringBuilder stringBuilder = new StringBuilder();

        int ch = s.indexOf(c);
        String cutString = s.substring(ch);
        String cutFront = s.substring(0, ch);

        stringBuilder.append(cutString).append(cutFront);

        return stringBuilder.toString();
    }

    public void encryptFile(File fileIn, File fileOut) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileIn));
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileOut));
            String line;

            while ((line = reader.readLine()) != null) {
                writer.write(encryptAndDecrypt(line) + "\n");

            }

            reader.close();
            writer.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
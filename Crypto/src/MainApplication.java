import java.io.*;

public class MainApplication {


    public static void main(String[] args) {
        ROT13 rot13 = new ROT13();
        File fileTxt = new File("sonnet18.txt");
        File fileEnc = new File("sonnet18.enc");
        File fileDec = new File("sonnet18.dec");
        rot13.encryptFile(fileTxt,fileEnc);
        rot13.encryptFile(fileEnc,fileDec);
    }
}

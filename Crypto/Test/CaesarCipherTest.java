import org.junit.Test;

import static org.junit.Assert.*;

public class CaesarCipherTest {

        @Test
        public void caesarCipherEncryptTest() {

            CaesarCipher cipherTest = new CaesarCipher();
            String encryptStr = "If it ain't boo, it ain't TRUE!!!";
            String expectedEnc = "Kh kv ckp'v dqq, kv ckp'v VTWG!!!";


            String actual = cipherTest.crypt(encryptStr, 2);
            String actualDec = cipherTest.crypt(expectedEnc,-2);


            assertEquals(expectedEnc, actual);
            assertEquals(encryptStr,actualDec);
        }

}
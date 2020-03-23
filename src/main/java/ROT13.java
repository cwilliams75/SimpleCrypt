import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {
    private int shift;

    ROT13(Character cs, Character cf) {
        shift = cf - cs;
    }

    ROT13() {
        shift = 0;
    }


    public String crypt(String text) throws UnsupportedOperationException {

        for (int i =0; i < text.length(); i++){
            char c = text.charAt(i);
                if  (c >= 'a' && c <= 'm' ) c += 13;
            else if (c >= 'A' && c <= 'M') c += 13;
            else if (c >= 'n' && c <= 'z') c -= 13;
            else if (c >= 'N' && c <= 'Z') c -= 13;
        }

        return text;
    }

    public String encrypt(String text) {

        String encrypt = crypt(text);
        return encrypt;
    }

    public String decrypt(String text) {

        String decrypt = crypt(text);
        return decrypt;
    }

    public static String rotate(String s, Character c) {
        Integer index = s.indexOf(c);

        return s.substring(index) + s.substring(0,index);
    }

    public String readTxtFile() throws Exception {

        ROT13 rot13 = new ROT13();
        File file = new File( "/ Users / cwilliams / Labs / SimpleCrypt / sonnet18.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        StringBuilder stringBuilder = new StringBuilder();

        String line = bufferedReader.readLine();
        while (line != null) {
            stringBuilder.append(line).append("\n");
            line = bufferedReader.readLine();
        }
        return null;
    }
}

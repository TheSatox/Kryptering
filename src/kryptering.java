/**
 * Created by grel14 on 2017-01-13.
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.*;
public class kryptera {

    public static void main (String[] args) throws FileNotFoundException {
        Scanner keyboard = new Scanner(System.in);
        String crypt = keyboard.nextLine();
        PrintWriter writer = new PrintWriter("crypt"+crypt);
        Scanner text = new Scanner(new FileReader(crypt));
        Scanner key = new Scanner(new FileReader("crypt_key.txt"));
        if (text.hasNext()) {
            String rad = text.nextLine();
            String radKey = key.nextLine();
            String result = "";
            while(rad.length()>radKey.length()){
                radKey = radKey+radKey;
            }
            for(int i = 0; i < rad.length(); i++){
                char crypted = (char)(rad.charAt(i)^radKey.charAt(i));
                result += crypted;
            }
            writer.println(result);
            System.out.println(result);
        }
        writer.close();
    }
}

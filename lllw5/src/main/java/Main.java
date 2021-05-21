import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Locale;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Main {
    public static void main(String[] args) throws IOException {

    List<String> lines = Files.readAllLines(Paths.get("D:\\llw5\\file.txt"), UTF_8);

    for (String s: lines) {
        System.out.println(s);
    }

    for (String s: lines) {
        String lower = s.toLowerCase();
        char[] c = lower.toCharArray();
        int[] en = new int[200];
        int[] ru = new int[2000];


        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            int ascii = (int) character;

            if (ascii >= 65 && ascii <= 241) {

                en[(c[i] - 65)]++;

            } else if (ascii >= 1072 && ascii <= 1103) {
                ru[(c[i]-65)]++;

            }
        }

        /*for (int i = 0; i < 200; i++){ //сорт англ букв
            int temp = en[i];
            int k = i;
            for (int j = i + 1; j<200; j++){
                if (en[j] > temp){
                    temp = en[j];
                    k = j;
                }
            }
            en[k] = en[i];
            en[i] = temp;
        }

        for (int i = 0; i < 2000; i++){ //сорт рус букв
            int temp = ru[i];
            int k = i;
            for (int j = i + 1; j<2000; j++){
                if (ru[j] > temp){
                    temp = ru[j];
                    k = j;
                }
            }
            ru[k] = ru[i];
            ru[i] = temp;
        }*/

        System.out.println("Всего символов " + c.length);

        for (int i = 0; i < 200; i++) {
            if (en[i] != 0)
                System.out.println(((char) (i + 65)) + "\t" + en[i]);}

        for (int i = 0; i < 2000; i++) {
            if (ru[i] != 0)
                System.out.println(((char) (i + 65)) + "\t" + ru[i]);
        }
    }

}
}


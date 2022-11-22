package n14.n9;

public class RusDict {
    //form russian frequency dictionary
    public static void main(String[] args) {
        //fill array with random russian long words
        String[] words = new String[16];
        words[0] = "абажур";
        words[1] = "абзац";
        words[2] = "абонент";
        words[3] = "абрикос";
        words[4] = "абсурд";
        words[5] = "авангард";
        words[6] = "август";
        words[7] = "авиация";
        words[8] = "авоська";
        words[9] = "автор";
        words[10] = "агат";
        words[11] = "агент";
        words[12] = "агитация";
        words[13] = "агнец";
        words[14] = "трамбон";
        words[15] = "агрегат";

        int[] letters = new int[33];
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                letters[words[i].charAt(j) - 'а']++;
            }
        }

        String dictionary = "";
        for (int i = 0; i < 5; i++) {
            int max = 0;
            int index = 0;
            for (int j = 0; j < letters.length; j++) {
                if (letters[j] > max) {
                    max = letters[j];
                    index = j;
                }
            }
            dictionary += (char) (index + 'а');
            letters[index] = 0;
        }
        System.out.println("Most frequency letters: "+dictionary);


    }

}

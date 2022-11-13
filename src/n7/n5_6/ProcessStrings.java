package n7.n5_6;

public class ProcessStrings implements StringWorker {
    @Override
    public String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    @Override
    public int countWords(String str) {
        return str.split(" ").length;
    }

    @Override
    public String newStringUnevenPosition(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 != 0) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}

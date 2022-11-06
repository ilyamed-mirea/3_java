package n6.n13;

import n6.n12.Operation;
import n6.n12.OperationTypes;

import java.util.ArrayList;

public class StringBuilder4 {
    private StringBuilder value;
    ArrayList<Sub> subsList = new ArrayList<>();

    public StringBuilder4() {
        this.value = new StringBuilder();
        this.subsList = new ArrayList<>();
    }

    public void subscribe(Sub sub) {
        subsList.add(sub);
    }

    public void unsubscribe(Sub sub) {
        subsList.remove(sub);
    }

    public void append(String str) {
        this.value.append(str);
        for (Sub sub : subsList) {
            sub.notificate(new Operation(OperationTypes.APPEND, value.length(), str.length()));
        }
    }

    public void delete(int start, int end) {
        String deleted = value.substring(start, end);
        this.value.delete(start, end);
        for (Sub sub : subsList) {
            sub.notificate(new Operation(OperationTypes.DELETE, start, end - start, deleted));
        }
    }

    public void changeCharAt(int index, char newChar) {
        char prevSymbol = value.charAt(index);
        this.value.setCharAt(index, newChar);
        for (Sub sub : subsList) {
            sub.notificate(new Operation(OperationTypes.REPLACE, index, newChar, prevSymbol));
        }
    }

}

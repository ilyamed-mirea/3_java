package n6.n12;

import java.util.ArrayList;

public class StringBuilder2 implements Undo {
    private StringBuilder value;
    ArrayList<Operation> operationsList = new ArrayList<>();

    public StringBuilder2() {
        this.value = new StringBuilder();
    }

    public StringBuilder2(String value) {
        this.value = new StringBuilder(value);
    }

    public void append(String str) {
        operationsList.add(new Operation(OperationTypes.APPEND, value.length(), str.length()));
        this.value.append(str);
    }

    public void delete(int start, int end) {
        operationsList.add(new Operation(OperationTypes.DELETE, start, end - start, value.substring(start, end)));
        this.value.delete(start, end);
    }

    public void changeCharAt(int index, char newChar) {
        operationsList.add(new Operation(OperationTypes.REPLACE, index, newChar, value.charAt(index)));
        this.value.setCharAt(index, newChar);
    }

    public void undo() {
        if (operationsList.size() == 0) {
            System.out.println("Nothing to undo");
            return;
        }
        Operation lastOperation = operationsList.get(operationsList.size() - 1);
        operationsList.remove(operationsList.size() - 1);
        switch (lastOperation.type) {
            case APPEND -> this.value.deleteCharAt(lastOperation.index);
            case DELETE -> this.value.insert(lastOperation.start, lastOperation.deleted);
            case REPLACE -> this.value.setCharAt(lastOperation.index, lastOperation.prevSymbol);
        }
    }

    @Override
    public String toString() {
        return "StringBuilder2{" +
                "value=" + value +
                '}';
    }
}

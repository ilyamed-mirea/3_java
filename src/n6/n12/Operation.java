package n6.n12;

public class Operation {
    OperationTypes type;
    int length;
    int index;
    int start = 0;
    int end = 0;
    String deleted;
    char symbol = 'x';
    char prevSymbol = 'x';

    public Operation(OperationTypes type, int index) {
        this.type = type;
        this.index = index;
    }

    public Operation(OperationTypes type, int index, int length) {
        this.type = type;
        this.index = index;
        this.length = length;
    }

    public Operation(OperationTypes type, int start, int end, String deleted) {
        this.type = type;
        this.start = start;
        this.end = end;
        this.deleted = deleted;
    }

    public Operation(OperationTypes type, int index, char symbol, char prevSymbol) {
        this.type = type;
        this.index = index;
        this.symbol = symbol;
        this.prevSymbol = prevSymbol;
    }
}

package n24.n3;

public class CreateTextDocument implements ICreateDocument {

    @Override
    public IDocument createNew(String name) {
        return new TextDocument(name);
    }

    @Override
    public IDocument createOpen(String name) {
        return new TextDocument(name);
    }
}

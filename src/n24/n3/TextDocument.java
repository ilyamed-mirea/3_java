package n24.n3;

public class TextDocument implements IDocument {
    private String name;

    public TextDocument(String name) {
        this.name = name;
    }

    @Override
    public void open() {
        System.out.println("Open text document");
    }

    @Override
    public void close() {
        System.out.println("Close text document");
    }

    @Override
    public void save() {
        System.out.println("Save text document");
    }

    @Override
    public void create() {
        System.out.println("Create text document");
    }
}

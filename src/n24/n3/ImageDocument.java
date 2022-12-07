package n24.n3;

public class ImageDocument implements IDocument {
    @Override
    public void open() {
        System.out.println("ImageDocument open");
    }

    @Override
    public void close() {
        System.out.println("ImageDocument close");
    }

    @Override
    public void save() {
        System.out.println("ImageDocument save");
    }

    @Override
    public void create() {
        System.out.println("ImageDocument create");
    }
}

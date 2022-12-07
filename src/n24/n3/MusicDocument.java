package n24.n3;

public class MusicDocument implements IDocument {
    @Override
    public void open() {
        System.out.println("MusicDocument open");
    }

    @Override
    public void close() {
        System.out.println("MusicDocument close");
    }

    @Override
    public void save() {
        System.out.println("MusicDocument save");
    }

    @Override
    public void create() {
        System.out.println("MusicDocument create");
    }
}

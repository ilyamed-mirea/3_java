package n24.n3;

import javax.swing.*;

public class Carcass extends JFrame {
    private IDocument document;
    private ICreateDocument createDocument;


    private JMenuBar menu;
    private JMenu fileMenu;
    private JMenuItem newMenuItem;
    private JMenuItem openMenuItem;
    private JMenuItem saveMenuItem;
    private JMenuItem exitMenuItem;


    public Carcass() {
        menu = new JMenuBar();
        fileMenu = new JMenu("File");
        newMenuItem = new JMenuItem("New");
        openMenuItem = new JMenuItem("Open");
        saveMenuItem = new JMenuItem("Save");
        exitMenuItem = new JMenuItem("Exit");

        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.add(exitMenuItem);
        menu.add(fileMenu);
        setJMenuBar(menu);
    }

    public void getDocument(ICreateDocument createDoc) {
        createDocument = createDoc;
    }

    public void listeners() {
        newMenuItem.addActionListener(e -> {
            document = createDocument.createNew("New document");
            document.create();
        });
        openMenuItem.addActionListener(e -> {
            document = createDocument.createOpen("Open document");
            document.open();
        });
        saveMenuItem.addActionListener(e -> {
            document.save();
        });
        exitMenuItem.addActionListener(e -> {
            document.close();
            System.exit(0);
        });
    }

    public static void main(String[] args) {
        // продемонстрировать работу каркаса на примере текстового док-а
        Carcass docFrame = new Carcass();
        docFrame.getDocument(new CreateTextDocument()); // текстовый документ
        docFrame.listeners();
        docFrame.setSize(200, 200);
        docFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        docFrame.setVisible(true);
    }
}

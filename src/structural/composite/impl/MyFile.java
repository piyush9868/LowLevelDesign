package structural.composite.impl;

import structural.composite.FileSystemComponent;

public class MyFile implements FileSystemComponent {

    private final String name;

    public MyFile(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void display(int baseIndent) {
        String line = " ".repeat(baseIndent) + this.name;
        System.out.println(line);
    }
}

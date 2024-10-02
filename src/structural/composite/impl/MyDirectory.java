package structural.composite.impl;

import structural.composite.FileSystemComponent;

import java.util.*;

public class MyDirectory implements FileSystemComponent {

    private final String name;
    private final List<FileSystemComponent> components;
    private static final int NUMBER_OF_INTENT = 3;

    public MyDirectory(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    public void addComponent(FileSystemComponent fileSystemComponent) {
        components.add(fileSystemComponent);
    }

    @Override
    public void display(int baseIndent) {
        String line = " ".repeat(baseIndent) + name;
        System.out.println(line);
        components.forEach(components -> components.display(baseIndent + NUMBER_OF_INTENT));

    }
}

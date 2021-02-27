package io.github.jacobcreator;

public class Horse extends Animal{
    public Horse(String name) {
        super("Horse");
    }

    @Override
    public String speak() {
        return getName() + ": neighhhh";
    }

}

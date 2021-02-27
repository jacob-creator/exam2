package io.github.jacobcreator;

public class Duck extends Animal{
    public Duck(String name) {
        super("Duck");
    }

    @Override
    public String speak() {
        return getName() + ": Quack";
    }

}

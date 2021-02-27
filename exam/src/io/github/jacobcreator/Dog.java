package io.github.jacobcreator;

public class Dog extends Animal{
    public Dog(String name) {
        super("Dog");
    }

    @Override
    public String speak() {
        return getName() + ": bark";
    }

}

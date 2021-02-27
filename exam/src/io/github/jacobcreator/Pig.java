package io.github.jacobcreator;

public class Pig extends Animal{
    public Pig(String name) {
        super("Pig");
    }

    @Override
    public String speak() {
       return getName() + ": Oink";
    }

}

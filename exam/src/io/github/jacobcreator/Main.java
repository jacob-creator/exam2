package io.github.jacobcreator;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = new Animal[] {
                new Dog("Dog"),
                new Pig("Pig"),
                new Horse("Horse"),
                new Duck("Duck")
        };

        StringBuilder output = new StringBuilder();

        for (Animal animal : animals) output.append(animal.speak()).append("\n");

        System.out.print(output);
    }
}

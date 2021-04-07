package io.github.zhdanok.animals;


public class AnimalsDemo {
    public static void main(String[] args) {
        Animals animals = new Animals("Animal");
        Mammals mammals = new Mammals("Mammals", 4);
        Dog dog = new Dog("Dog", 4, "Gav-gav");
        Cat cat = new Cat("Cat", 4, "mau-mau", "fish");
        Bird bird = new Bird("Bird", false);
        Parrot parrot = new Parrot("Parrot", true);

        System.out.println(animals);
        animals.sleeping();
        animals.eating();
        System.out.println();

        System.out.println(mammals);
        mammals.sleeping();
        mammals.eating();
        mammals.jogging();
        mammals.saying();
        System.out.println();

        System.out.println(dog);
        dog.sleeping();
        dog.eating();
        dog.jogging();
        dog.saying();
        System.out.println();

        System.out.println(cat);
        cat.sleeping();
        cat.eating();
        cat.jogging();
        cat.saying();
        System.out.println();

        System.out.println(bird);
        bird.sleeping();
        bird.eating();
        bird.letsSpeak();
        System.out.println();

        System.out.println(parrot);
        parrot.sleeping();
        parrot.eating();
        parrot.letsSpeak();

    }
}

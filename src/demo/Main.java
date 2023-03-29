package demo;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Human human = new Human();
        human.age = 24;
        human.name = "Masha";
        System.out.println("Имя: " + human.name + "\nвозраст: " + human.age);
        human.eat();
        human.sleep();


        Dog dog = new Dog();
        dog.name = "Шарик";
        System.out.println("\nКличка собаки: " + dog.name);
        dog.bark();
        dog.eat();
        dog.sleep();
        dog.bite();
        dog.clean();

        Doctors doctor = new Doctors();
        doctor.name = "Dr Watson";
        doctor.age = 26;
        System.out.println("\nИмя: " + doctor.name + "\nвозраст: " + doctor.age);
        doctor.eat();
        doctor.sleep();

        Tools tool = new Tools();
        tool.bite();
        tool.clean();

    }
}
package demo;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Human human = new Human();
        human.age = 24;
        human.name = "Masha";
        System.out.println("���: " + human.name + "\n�������: " + human.age);
        human.eat();
        human.sleep();


        Dog dog = new Dog();
        dog.name = "�����";
        System.out.println("\n������ ������: " + dog.name);
        dog.bark();
        dog.eat();
        dog.sleep();
        dog.bite();
        dog.clean();

        Doctors doctor = new Doctors();
        doctor.name = "Dr Watson";
        doctor.age = 26;
        System.out.println("\n���: " + doctor.name + "\n�������: " + doctor.age);
        doctor.eat();
        doctor.sleep();

        Tools tool = new Tools();
        tool.bite();
        tool.clean();

    }
}
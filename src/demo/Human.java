package demo;

public class Human extends Mammal{
    int age;
    @Override
    public void eat() {
        System.out.println("человек ест");
    }
    @Override
    public void sleep() {
        System.out.println("человек спит");
    }
}

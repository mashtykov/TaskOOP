package demo;

public class Human extends Mammal{
    int age;
    @Override
    public void eat() {
        System.out.println("������� ���");
    }
    @Override
    public void sleep() {
        System.out.println("������� ����");
    }
}

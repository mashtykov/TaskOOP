package demo;

public class Dog extends Mammal implements Biteable{
    public  void bark(){
        System.out.println("���!");
    }

    @Override
    public void eat() {
        System.out.println("������ ���");
    }

    @Override
    public void sleep() {
        System.out.println("������ ����");
    }

    @Override
    public boolean clean() {
        System.out.println("������ ������");
        return true;
    }
}

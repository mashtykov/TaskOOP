package demo;

public interface Biteable {
    default void bite() {
        System.out.println("������");
    }

    boolean clean();
}

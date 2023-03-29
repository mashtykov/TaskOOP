package demo;

public interface Biteable {
    default void bite() {
        System.out.println("кусает");
    }

    boolean clean();
}

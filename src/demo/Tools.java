package demo;

public class Tools implements Biteable {
    @Override
    public boolean clean() {
        System.out.println(" инструмнт вымыт");
        return true;
    }
}

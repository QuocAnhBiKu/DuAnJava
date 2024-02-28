package Java.HocInterface;

public class Pig implements Animal {
    @Override
    public void animalSound() {
        System.out.println("ec ec");
    }

    @Override
    public void sleep() {
        System.out.println("ZZZZ");
    }
}

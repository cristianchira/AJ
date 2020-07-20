package abstraction;

public abstract class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is peaking");
    }

    @Override
    public void breath() {
        System.out.println("Breath in, breath out, repeat");
    }

    public abstract void fly();
}

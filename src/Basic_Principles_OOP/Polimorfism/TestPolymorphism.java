package Basic_Principles_OOP.Polimorfism;

public class TestPolymorphism {

    public static void main(String[] args) {
       // Animal animal1 = new Animal ();
        //System.out.println(animal1.shout()); // Don't Know!


//        List<Animal> animals = Arrays.asList (new Dog (), new Cat ());
//
//        animals.forEach (animal -> System.out.println (animal.shout ()));

        Animal animal1 = new Dog();
        System.out.println (animal1.shout ());
        // Reference variable type => Animal
        // lang.classes.Object referred to => Dog
        // Dog's bark method is called.
        //System.out.println(animal2.shout()); // BOW BOW

        // Even though dog has a method run,it cannot be
        // invoked using super class reference variable
        // animal2.run();//COMPILE ERROR
    }
}
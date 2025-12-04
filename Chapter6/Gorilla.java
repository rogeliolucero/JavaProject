package Chapter6;

interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

public class Gorilla implements Animal {

    @Override
    public boolean feed(boolean timeToEat) {
        // put gorilla food into cage
        if (timeToEat) {
            System.out.println("Feeding the gorilla...");
            return true;
        }
        System.out.println("It's not feeding time.");
        return false;
    }

    @Override
    public void groom() {
        // lather, rinse, repeat
        System.out.println("Grooming the gorilla...");
    }

    @Override
    public void pet() {
        // pet at your own risk
        System.out.println("You cautiously attempt to pet the gorilla...");
    }
}

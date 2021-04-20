public interface AnimalInterface {
    void talk();
    void eat();
}

class Duck implements AnimalInterface{
    @Override
    public void talk() {
        System.out.println("Duck says kquack, kquack");
    }

    @Override
    public void eat() {
        System.out.println("Duck eats in the water");
    }
}

class Tiger implements AnimalInterface{
    @Override
    public void talk() {
        System.out.println("Tiger says roar, roar");
    }

    @Override
    public void eat() {
        System.out.println("Tiger eats on the ground");
    }
}

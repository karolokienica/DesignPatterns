public class Client {
    public static void main(String[] args) throws Exception{
        AnimalFactory animalFactory = new AnimalFactory();

        AnimalInterface animal1 = animalFactory.getAnimalType("DUCK");
        AnimalInterface animal2 = animalFactory.getAnimalType("TIGER");

        animal1.talk();
        animal1.eat();

        animal2.talk();
        animal2.eat();

        System.out.println("Instructors version challenge");
        AnimalFactoryInterface animalFactoryInterface = new ConcreteFactory();

        AnimalInterface duckType = animalFactoryInterface.getAnimalType("Duck");
        duckType.talk();
        duckType.eat();

        AnimalInterface tigerType = animalFactoryInterface.getAnimalType("Tiger");
        tigerType.talk();
        tigerType.eat();

        AnimalInterface lionType = animalFactoryInterface.getAnimalType("Lion");
    }
}

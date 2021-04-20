public class AnimalFactory {
    public AnimalInterface getAnimalType(String animalType){
        if(animalType == null){
            return null;
        }

        if(animalType.equalsIgnoreCase("DUCK")){
            return new Duck();
        }else if(animalType.equalsIgnoreCase("TIGER")){
            return new Tiger();
        }

        return null;
    }
}

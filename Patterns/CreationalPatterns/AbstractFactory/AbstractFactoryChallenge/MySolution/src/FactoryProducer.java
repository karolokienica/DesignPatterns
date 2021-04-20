public class FactoryProducer {
    public static IMovieFactory getFactory(String choice){
        if (choice == null) {
            return null;
        }

        if(choice.equalsIgnoreCase("COMEDY")){
            return new ComedyMovieFactory();
        }else if(choice.equalsIgnoreCase("ACTION")){
            return new ActionMovieFactory();
        }

        return null;
    }
}

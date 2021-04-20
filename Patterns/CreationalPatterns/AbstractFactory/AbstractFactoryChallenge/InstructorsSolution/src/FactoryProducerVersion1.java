public class FactoryProducerVersion1 {
    public static MovieFactoryInterfaceVersion1 getFactory(String choice){
        if(choice.equalsIgnoreCase("Hollywood")){
            return new HollywoodMovieFactory();
        }else if(choice.equalsIgnoreCase("Bollywood")){
            return new BollywoodMovieFactory();
        }

        return null;
    }
}

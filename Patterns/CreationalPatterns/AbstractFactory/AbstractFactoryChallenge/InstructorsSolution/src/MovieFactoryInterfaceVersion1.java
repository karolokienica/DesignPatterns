public interface MovieFactoryInterfaceVersion1 {
    HollywoodMovieInterface getHollywoodMovie(String type);
    BollywoodMovieInterface getBollywoodMovie(String type);
}

class HollywoodMovieFactory implements MovieFactoryInterfaceVersion1{
    @Override
    public BollywoodMovieInterface getBollywoodMovie(String type) {
        return null;
    }

    @Override
    public HollywoodMovieInterface getHollywoodMovie(String type) {
        if(type.equalsIgnoreCase("Action")){
            return new HollywoodActionMovie();
        }else if(type.equalsIgnoreCase("Comedy")){
            return new HollywoodComedyMovie();
        }

        return null;
    }
}

class BollywoodMovieFactory implements MovieFactoryInterfaceVersion1{
    @Override
    public BollywoodMovieInterface getBollywoodMovie(String type) {
        if(type.equalsIgnoreCase("Action")){
            return new BollywoodActionMovie();
        }else if(type.equalsIgnoreCase("Comedy")){
            return new BollywoodComedyMovie();
        }

        return null;
    }

    @Override
    public HollywoodMovieInterface getHollywoodMovie(String type) {
        return null;
    }
}


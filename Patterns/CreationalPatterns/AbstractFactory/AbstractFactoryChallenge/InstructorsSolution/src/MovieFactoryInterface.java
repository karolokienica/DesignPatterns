public interface MovieFactoryInterface {
    HollywoodMovieInterface getHollywoodMovie();
    BollywoodMovieInterface getBollywoodMovie();
}

class ActionMovieFactory implements MovieFactoryInterface{
    @Override
    public BollywoodMovieInterface getBollywoodMovie() {
        return new BollywoodActionMovie();
    }

    @Override
    public HollywoodMovieInterface getHollywoodMovie() {
        return new HollywoodActionMovie();
    }
}

class ComedyMovieFactory implements MovieFactoryInterface{
    @Override
    public HollywoodMovieInterface getHollywoodMovie() {
        return new HollywoodComedyMovie();
    }

    @Override
    public BollywoodMovieInterface getBollywoodMovie() {
        return new BollywoodComedyMovie();
    }
}

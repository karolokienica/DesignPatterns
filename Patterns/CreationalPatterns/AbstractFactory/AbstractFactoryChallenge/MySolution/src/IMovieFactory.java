public abstract class IMovieFactory {
    abstract IHollywoodMovie getHollywoodMovie();
    abstract IBollywoodMovie getBollywoodMovie();
}

class ComedyMovieFactory extends IMovieFactory{
    @Override
    public IHollywoodMovie getHollywoodMovie() {
        return new HollywoodComedyMovie();
    }

    @Override
    public IBollywoodMovie getBollywoodMovie() {
        return new BollywoodComedyMovie();
    }
}

class ActionMovieFactory extends IMovieFactory{
    @Override
    public IHollywoodMovie getHollywoodMovie() {
        return new HollywoodActionMovie();
    }

    @Override
    public IBollywoodMovie getBollywoodMovie() {
        return new BollywoodActionMovie();
    }
}

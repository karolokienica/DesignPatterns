public interface BollywoodMovieInterface {
    String getMovieName();
}

class BollywoodActionMovie implements BollywoodMovieInterface{
    @Override
    public String getMovieName() {
        return "Bollywood Action Movie";
    }
}

class BollywoodComedyMovie implements BollywoodMovieInterface{
    @Override
    public String getMovieName() {
        return "Bollywood Comedy Movie";
    }
}

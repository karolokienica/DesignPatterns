

public interface HollywoodMovieInterface {
    String getMovieName();
}

class HollywoodActionMovie implements HollywoodMovieInterface{
    @Override
    public String getMovieName() {
        return "Hollywood Action Movie";
    }
}

class HollywoodComedyMovie implements HollywoodMovieInterface{
    @Override
    public String getMovieName() {
        return "Hollywood Comedy Movie";
    }
}

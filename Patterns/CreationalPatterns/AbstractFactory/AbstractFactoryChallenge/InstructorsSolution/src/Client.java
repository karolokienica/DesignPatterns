public class Client {
    public static void main(String[] args) {
        MovieFactoryInterface actionMovies = FactoryProducer.getFactory("Action");

        HollywoodMovieInterface hAction = actionMovies.getHollywoodMovie();
        BollywoodMovieInterface bAction = actionMovies.getBollywoodMovie();

        System.out.println(hAction.getMovieName());
        System.out.println(bAction.getMovieName());

        MovieFactoryInterface comedyMovies = FactoryProducer.getFactory("Comedy");

        HollywoodMovieInterface hComedy = comedyMovies.getHollywoodMovie();
        BollywoodMovieInterface bComedy = comedyMovies.getBollywoodMovie();

        System.out.println(hComedy.getMovieName());
        System.out.println(hComedy.getMovieName());

        MovieFactoryInterfaceVersion1 hollywoodMovies = FactoryProducerVersion1.getFactory("Hollywood");

        HollywoodMovieInterface hAction1 = hollywoodMovies.getHollywoodMovie("Action");
        HollywoodMovieInterface hComedy1 = hollywoodMovies.getHollywoodMovie("Comedy");

        MovieFactoryInterfaceVersion1 bollywoodMovies = FactoryProducerVersion1.getFactory("Bollywood");

        BollywoodMovieInterface bAction1 = bollywoodMovies.getBollywoodMovie("Action");
        BollywoodMovieInterface bComedy1 = bollywoodMovies.getBollywoodMovie("Comedy");

        System.out.println("Version 1:");
        System.out.println(hAction1.getMovieName());
        System.out.println(hComedy1.getMovieName());
        System.out.println(bAction1.getMovieName());
        System.out.println(bComedy1.getMovieName());
    }
}

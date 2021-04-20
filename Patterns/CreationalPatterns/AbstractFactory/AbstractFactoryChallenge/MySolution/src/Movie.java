public class Movie {
    private String title;
    private String type;

    public Movie(String title, String type) {
        this.title = title;
        this.type = type;
    }

    public void getData() {
        if(type.equalsIgnoreCase("bollywood action")){
            System.out.print(title);
            FactoryProducer.getFactory("ACTION").getBollywoodMovie().getMovieName();
        }else if(type.equalsIgnoreCase("hollywood action")) {
            System.out.print(title);
            FactoryProducer.getFactory("ACTION").getHollywoodMovie().getMovieName();;
        }else if(type.equalsIgnoreCase("bollywood comedy")) {
            System.out.print(title);
            FactoryProducer.getFactory("COMEDY").getBollywoodMovie().getMovieName();;
        }else if(type.equalsIgnoreCase("hollywood comedy")) {
            System.out.print(title);
            FactoryProducer.getFactory("COMEDY").getHollywoodMovie().getMovieName();;
        }
    }
}

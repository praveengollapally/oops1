package oops;// classes and object

public class game { 
    private String tournament;
    private String country;

    public game(String tournament, String country) {
        this.tournament = tournament;
        this.country = country;
    }
    
    public void match() {
        System.out.println(country + " is playing " + tournament + " " );
    }

    public void start() {
        System.out.println(country + " is playing " + tournament + " " );
    }

    public static void main(String[] args) {
        game car1 = new game("Asia cup", "India");
        game car2 = new game("Worldcup", "India");

        System.out.println("BCCI UPCOMING");  
        car1.match(); 
        car2.start();
    }
}




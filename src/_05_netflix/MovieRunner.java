package _05_netflix;

	
public class MovieRunner {

public static void main(String[] args) {
		Movie Witcher  = new Movie("Witcher", 9);
	Movie Original = new Movie("Original", 8);
	Movie Legacies = new Movie("Legacies", 8);
	Movie CriminalMind = new Movie("Criminal Mind", 8);
	Movie Lucifer = new Movie("Lucifer", 8);
	int y = Witcher.getRating();
	
	String x = Witcher.getTicketPrice();
	System.out.println(x);
System.out.println(y);

}
}

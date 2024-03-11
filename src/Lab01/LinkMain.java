package Lab01;

public class LinkMain {

	public static void main(String[] args) {
		
		Link nipuna = new Link("nipuna",53.5);
		Link aravinda = new Link("aravinda",78.4);
		Link prashani = new Link("prashani",69.5);
		
		nipuna.next = aravinda;
		aravinda.next = prashani;
		
		nipuna.displayDetails();
		aravinda.displayDetails();
		prashani.displayDetails();
		

	}

}

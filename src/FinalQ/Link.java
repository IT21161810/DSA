package FinalQ;

public class Link {

	public String name;
	public double avg;
	public Link next;
	
	public Link(String name,double avg) {
		this.name = name;
		this.avg = avg;
		this.next = null;
	}
	
	public void displayDetails() {
		System.out.println("name :"+name+"average :"+avg);
	}
}

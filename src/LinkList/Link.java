package LinkList;

public class Link {

	public  String name;
	public double avg; 
	public Link next;

	public Link(String name,double avg){
		this.name = name;
		this.avg  = avg;
		next      = null;
	}
	
	public void displayDetails() {
		System.out.println("Name : "+name+" Average : "+avg);
	}
	
	
	
}

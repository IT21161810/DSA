package Lab01;

public class Link {
	
	public String name;
	public double average;
	public Link next;
	
	public Link(String name,double average){
		
		name = this.name;
		average  = this.average;
		this.next = null;
	}
	
	public void displayDetails() {
		System.out.println("name : "+name+"  Average : "+average);
	}
	
	

}

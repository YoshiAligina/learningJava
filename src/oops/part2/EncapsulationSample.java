package oops.part2;

class ContactDetails {
	private int id;
	private String name;
	private String emailID;
	
	public int getID() {	
		return id;	               
	}
	public void setID(int id) {	
		this.id = id;	               
	}
	public String getName() {	
		return name;               
	}
	public void setName(String name) {	
		this.name = name               ;	               
	}
	public String getEmailID() {	
		return emailID;               
	}
	public void setEmailID(String emailID) {	
		this.emailID = emailID;               ;	               
	}
	
	
}

public class EncapsulationSample {
	public static void main(String[] args) {
		ContactDetails contactDetails = new ContactDetails();
		contactDetails.setID(1);
		contactDetails.setName("YOSHI");
		contactDetails.setEmailID("yoshi@gmail.com");
		
		System.out.println(contactDetails.getEmailID());
	}

}

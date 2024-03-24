package oops.part2;

class StudentDetails{
	private int classYear;
	private String name;
	private int age;
	private String email;
	
	public int classYear() {	
		return classYear;	               
	}
	public void setClassYear(int classYear) {	
		this.classYear = classYear;	               
	}
	public int age() {	
		return age;	               
	}
	public void setage(int age) {	
		this.age = age;	               
	}
	public String name() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String email() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	
}


	public class EncapsulationPrac {
		public static void main(String[] args)
		{
			StudentDetails details = new StudentDetails();
			details.setage(13);
			details.setClassYear(7);
			details.setname("Abhi");
			details.setemail("abhi@gmail.com");
			
			System.out.println("The student's name is: "+details.name()+". They are "+ details.age()+ " years old.");
		}

}

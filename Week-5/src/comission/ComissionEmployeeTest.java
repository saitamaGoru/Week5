package comission;

public class ComissionEmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComissionEmployee emp = new ComissionEmployee("Sue","James","22-233-123",1000,0.6);
		
		System.out.println("Employee information obtained by get Methoods:");
		System.out.printf("%n%s %s%n", "First name is:",emp.getfName());
		System.out.printf("%n%s %s%n", "Last name is:",emp.getlName());
		System.out.printf("%n%s %s%n", "Social Security Number is:",emp.SocialSecurityNumber());
		System.out.printf("%n%s %.2f%n", "Gross Sale is:",emp.getGrossSale());
		System.out.printf("%n%s %.2f%n", "Comission Rate  is:",emp.getComissionRate());
		
		emp.setGrossSale(5000);
		emp.setComissionRate(0.1);
		System.out.printf("%n%s %.2f%n", "Gross Sale is:",emp.getGrossSale());
		System.out.printf("%n%s %.2f%n", "Comission Rate  is:",emp.getComissionRate());
	}

}

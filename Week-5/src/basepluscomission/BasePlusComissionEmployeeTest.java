package basepluscomission;

public class BasePlusComissionEmployeeTest {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		BasePlusComissionEmployee emp = new BasePlusComissionEmployee("Julia","Sanders","444-555-112",50000,.04,300);
		
		System.out.println("Employee information obtained by get Methoods:");
		System.out.printf("%n%s %s%n", "First name is:",emp.getfName());
		System.out.printf("%n%s %s%n", "Last name is:",emp.getlName());
		System.out.printf("%n%s %s%n", "Social Security Number is:",emp.SocialSecurityNumber());
		System.out.printf("%n%s %.2f%n", "Gross Sale is:",emp.getGrossSale());
		System.out.printf("%n%s %.2f%n", "Comission Rate  is:",emp.getComissionRate());
		System.out.printf("%n%s %.2f%n", "Base Salary  is:",emp.getBaseSalary());
		System.out.printf("%n%s %.2f%n", "Earnings  is:",emp.earnings());
		
	}

}

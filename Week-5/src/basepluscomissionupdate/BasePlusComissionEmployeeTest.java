package basepluscomissionupdate;

import basepluscomission.BasePlusComissionEmployee;

public class BasePlusComissionEmployeeTest {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		ComissionEmployee emp = new ComissionEmployee("Julia","Sanders","444-555-112",50000,.04);
		
		BasePlusComission baseEmp = new BasePlusComission("Kulia","Landers","424-554-142",60000,.05,400);
	
		
		System.out.printf("%s%s:%n%n%s%n%n","Call comission employee's toString with superclass reference","to superclass object",emp.toString());
		
		System.out.printf("%s%s:%n%n%s%n%n","Call base plus comission employee's toString with superclass reference","to superclass object",baseEmp.toString());
		
		ComissionEmployee emp2 = baseEmp;
		System.out.printf("%s%s:%n%n%s%n%n","Call base plus comission employee's toString with superclass","ref to subclass object",emp2.toString());
		
	}

}




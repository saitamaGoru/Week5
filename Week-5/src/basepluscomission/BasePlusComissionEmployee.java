package basepluscomission;

public class BasePlusComissionEmployee extends ComissionEmployee
{
	private double baseSalary;
	
	public BasePlusComissionEmployee(String fName, String lName, String SocialSecurityNumber, double grossSale, double comissionRate, double baseSalary)
	{
		super(fName, lName, SocialSecurityNumber, grossSale,comissionRate); //super keywrd inherits constructor parms of the parent class. (Comission Employee)
		
		this.baseSalary=baseSalary;
	}
	
	public void setBaseSalary(double baseSalary)
	{
		if(baseSalary<0.0)
			throw new IllegalArgumentException("Bae Salary must be >=0.0");
		this.baseSalary=baseSalary;
	}
	public double getBaseSalary()
	{
		return baseSalary;
	}
	public double earnings() {
		return baseSalary + (comissionRate*grossSale);
	}
	
	public String toStrng()
	{
		return String.format("Bsae salary Comissionioned Employee:%nFirst Name:%s%nLast Name %s%nSocial Security Number: %s%n"
				+ "GrossSales: %.2f%n ComissionRate: %.2f%nBase Salary:%.2f%n",fName,lName,SocialSecurityNumber, grossSale, comissionRate,baseSalary);
	}
}

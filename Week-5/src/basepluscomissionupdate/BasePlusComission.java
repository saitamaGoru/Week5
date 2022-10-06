package basepluscomissionupdate;

public class BasePlusComission extends ComissionEmployee
{
	private double baseSalary;
	
	public BasePlusComission(String fName, String lName, String SocialSecurityNumber, double grossSale, double comissionRate, double baseSalary)
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
		return getBaseSalary() + super.earnings();
	}
	
	public String toStrng()
	{
		return String.format("%s%n: %d%n", super.toString(),earnings());
	}
}
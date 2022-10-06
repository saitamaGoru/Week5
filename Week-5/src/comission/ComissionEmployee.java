package comission;

public class ComissionEmployee extends Object
{
	private final String fName;
	private final String lName;
	private final String SocialSecurityNumber;
	private double  grossSale;
	private double  comissionRate;
	
	public ComissionEmployee(String fName, String lName, String SocialSecurityNumber, double grossSale, double comissionRate)
	{
		if(grossSale < 0.0)
			throw new IllegalArgumentException("Gross Salees must be >=0.0");
		
		if(comissionRate <= 0.0 || comissionRate>=1.0)
			throw new IllegalArgumentException("Comission Rate  must be >=0.0 abd <1.0");
		
		this.fName=fName;
		this.lName=lName;
		this.SocialSecurityNumber=SocialSecurityNumber;
		this.grossSale=grossSale;
		this.comissionRate=comissionRate;
	}
	
	public String getfName()
	{
		return fName;
	}
	public String getlName()
	{
		return lName;
	}
	public String SocialSecurityNumber()
	{
		return SocialSecurityNumber;
	}
	public void setGrossSale(double grossSale)
	{
		if(grossSale < 0.0)
			throw new IllegalArgumentException("Gross Salees must be >=0.0");
		this.grossSale=grossSale;
	}
	public double getGrossSale()
	{
		return grossSale;
	}
	
	public void setComissionRate(double comissionRate)
	{
		if(comissionRate <= 0.0 || comissionRate>=1.0)
			throw new IllegalArgumentException("Comission Rate  must be >=0.0 abd <1.0");
		this.comissionRate=comissionRate;
	}
	public double getComissionRate()
	{
		return comissionRate;
	}
	
	public String toString()
	{
		return String.format("Comission Employee:%nFirst Name:%s%nLast Name %s%nSocial Security Number: %s%n"
				+ "GrossSales: %.2f%n ComissionRate: %.2f%n",fName,lName,SocialSecurityNumber, grossSale, comissionRate);
	}
	
}

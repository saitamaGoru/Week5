package basepluscomissionupdate;





public class ComissionEmployee //extends Object //inherits from the class object, toString can be overrided, extends keyword used for inheritance  
{
	protected final String fName; //final and constants never chnge, value can be changed through out the execution of objct
	protected final String lName;
	protected final String SocialSecurityNumber;
	protected double  grossSale;
	protected double  comissionRate;
	
	public ComissionEmployee(String fName, String lName, String SocialSecurityNumber, double grossSale, double comissionRate)
	{
		if(grossSale < 0.0)/*always validate the data*/
			throw new IllegalArgumentException("Gross Salees must be >=0.0");  /*always validate the data*/
		
		if(comissionRate <= 0.0 || comissionRate>=1.0)/*always validate the data*/
			throw new IllegalArgumentException("Comission Rate  must be >=0.0 abd <1.0");/*always validate the data*/
		
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
	public double earnings()
	{
		return comissionRate*grossSale;
	}
	
	public String toString()
	{
		return String.format("Comission Employee:%nFirst Name:%s%nLast Name %s%nSocial Security Number: %s%n"
				+ "GrossSales: %.2f%n ComissionRate: %.2f%n Earnings:%.2f%n",fName,lName,SocialSecurityNumber, grossSale, comissionRate,earnings());
	}
	
}

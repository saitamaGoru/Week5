package employees;

public class Employee {

		private static int count = 0;
		private String fName;
		private String lName;
		
		public Employee(String fName, String lName)
		{
			this.fName=fName;
			this.lName=lName;
			count++;
		}
		
		public String getfName()
		{
			return fName;
		}
		public String getlName()
		{
			return lName;
		}
		public static int getCount()
		{
			return count;
		}
		public String toString()
		{
			return String.format("Employee number: %d%n First Name: %s%n Last Name: %s%n",count,fName,lName);
		}
}

import java.util.*;
class University
{
	String name;
	String address;
	String chancellor;
	int collegesAffiliated;
	String website;
	College college;

	University(String name,String address,String chancellor,int collegesAffiliated,String website )
	{
	this.name= name;
	this.address = address;
	this.chancellor= chancellor;
	this.collegesAffiliated =collegesAffiliated;
	this.website = website;
	}
	public void displayUniversity()
	{
	System.out.println("University Details");
	System.out.println("Name : "+name);
	System.out.println("chancellor name :"+chancellor);
	System.out.println("Address : "+address);
	System.out.println("Number of collegesAffiliated :"+collegesAffiliated);
	System.out.println("website :"+website);
	}
	public void addCollege(String name, String address, String principal, int noDepartments,String email,int instituteCode)
	{
	college = new College(name,address ,principal,noDepartments,email,instituteCode);
	}
}
class College
{
	String name;
	String address;
	String principal;
	int noDepartments;
	String email;
	int instituteCode;
	Department depart;

	College(String name, String address, String principal,int noDepartments,String email,int instituteCode)
{
	this.name = name;
	this.address = address;
	this.principal = principal;
	this.noDepartments = noDepartments;
	this.email = email;
	this.instituteCode = instituteCode;
}
public void displayCollege()
{
	System.out.println();
	System.out.println("College Details");
	System.out.println("Name : "+name);
	System.out.println("principal name : "+principal);
	System.out.println("Address : "+address);
	System.out.println("Number of Departments :"+noDepartments);
	System.out.println("Email : "+ email);
	System.out.println("instituteCode :"+instituteCode);
	System.out.println();
}
public void addDepartment(String name, String hod, int students, int faculty)
{
	depart = new Department(name,hod,students,faculty);
   }
}
class Department
{
	String name;
	String hod;
	int students;
	int faculty;

	Department(String name, String hod, int students, int faculty)
	{
	this.name =name;
	this.hod = hod;
	this.students = students;
	this.faculty = faculty;
	}
	public void displayDepartment()
	{
	System.out.println("College details");
	System.out.println("Name : " + name);
	System.out.println("HOD : " + hod);
	System.out.println("Students : " + students);
	System.out.println("faculty : "+ faculty);
	}
}
class AggregationDriver
{
	public static void main(String []args)
	{
	University uni = new University("SPPU", "GaneshKhind Road, Pune, Maharashtra,India",
		                         "Shri.Ramesh Bais",705, "https://www.unipune.ac.in");
	uni.displayUniversity();
	uni.addCollege("Sinhagad", "44/1, vadgaon,(bk) off sinhagad road Pune","Lokhande shashikant dnyandev",
	 15,"register.sinhagad.in",123);
	uni.college.displayCollege();
	uni.college.addDepartment("Computer", "Ramesh Kumar",500,20);
	uni.college.depart.displayDepartment();
	uni.college.addDepartment("Electrical", "Surash Kumar",500,20);
	uni.college.depart.displayDepartment();
	uni.college.addDepartment("Mechanical", "Dinesh Kumar",500,20);
	uni.college.depart.displayDepartment();

	}
}


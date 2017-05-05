import java.util.Scanner;
public class EncapsulationEmpDetails {
	
	public int EmpNo;
	public String Empname;
	public int EmpAge;
	
	public int getEmpno()
	{
		return EmpNo;
	}
	public String geteEmpName()
	{
		return Empname;
	}
	public int getempage()
	{
		return EmpAge;
	}
	public void setEmpNo(int empno)
	{
		EmpNo=empno;
		System.out.print("Empno is : "+EmpNo +"\n");
	}
	public void setEmpName(String name)
	{
		Empname=name;
		System.out.print("EmpName is :"+Empname +"\n");
	}
	public void setEmpage(int age)
	{
		EmpAge=age;
		System.out.print("Emp Age is :"+EmpAge +"\n");
	}
	private static Scanner sc;
	public static void main(String[] args) {
		int empno,age;
		String name;
		EncapsulationEmpDetails e=new EncapsulationEmpDetails();
		sc=new Scanner(System.in);
		System.out.print("Enter Empno:\n");
		empno=sc.nextInt();
		System.out.print("Enter Age :\n");
		age=sc.nextInt();
		System.out.print("Enter Name : \n");
		name=sc.next();
			
		e.setEmpNo(empno);
		e.setEmpName(name);
		e.setEmpage(age);

	}

}

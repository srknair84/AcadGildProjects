import java.util.Scanner;
class Dimension  
 {  
      
		int length,breath;
 }  
   
 class Triangle extends Dimension  
 {  
	 int triarea;
      void InheritanceDemo()  
      {  
           //calculate area of square  
    	  triarea=length*breath/2;  
      }  
 }  
   
 class Rectangle extends Triangle  
 {  
	  int rectarea;
      void InheritanceDemo()  
      {
    	  rectarea = length*breath;  
      }  
 }  
   
  public class Sigle_Inheritance  
 {  
	  private static Scanner sc;
      public static void main(String[] args)  
      {  
    	  int length,breath;
           sc=new Scanner(System.in);  
           Triangle tri = new Triangle();  
           //object of child class rectangle  
           Rectangle rec = new Rectangle();  
           
           System.out.print("Enter Length :  \n");
           length=sc.nextInt();
           System.out.print("Enter Breath :  \n");
           breath=sc.nextInt();
           tri.length=length;
           tri.breath=breath;
           tri.InheritanceDemo();
           System.out.print("Area of triangle is : " +tri.triarea + "\n");
           
           rec.length=length;
           rec.breath=breath;
           rec.InheritanceDemo();
           System.out.print("Area of Rectangle is : " + rec.rectarea);
             
      }  
 }  
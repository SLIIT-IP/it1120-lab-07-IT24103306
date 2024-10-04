import java.util.Scanner;
 
  public class IT24103306Lab7Q1{
	public static void main(String[] args){

Scanner scan=new Scanner(System.in);
System.out.println("Enter marks for four subjects :");
System.out.print("Enter Subject Mark 1:");
int mark1=scan.nextInt();
System.out.print("Enter Subject Mark 2:");
int mark2=scan.nextInt();
System.out.print("Enter Subject Mark 3:");
int mark3=scan.nextInt();
System.out.print("Enter Subject Mark 4:");
int mark4=scan.nextInt();
System.out.println();

 double avg=(mark1+mark2+mark3+mark4)/4;
 System.out.println("Average is:" +avg);
 
 if(avg<=100 && avg>=75){
    System.out.println("Overall Grade is : Distinction");
  }
 if(avg<=74 && avg>=50){
     System.out.println("Overall Grade is : Credit");
   }
   
 if(avg<=49 && avg>=0){
   System.out.println("Overall Grade is : Fail");
  }
    


 }
}





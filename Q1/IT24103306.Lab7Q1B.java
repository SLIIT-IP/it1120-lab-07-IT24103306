import java.util.Scanner;
 
  public class IT24103306Lab7Q1B{
	public static void main(String[] args){

Scanner scan=new Scanner(System.in);
int i;

for(i=1; i<=3; i++){
 System.out.println("Student"+ i );
System.out.print("Enter your marks: ");

int mark1=scan.nextInt();
int mark2=scan.nextInt();
int mark3=scan.nextInt();
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
   System.out.println(); 


  }
 }

}



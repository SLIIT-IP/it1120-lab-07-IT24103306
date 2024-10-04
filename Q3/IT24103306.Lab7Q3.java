import java.util.Scanner;
	public class IT24103306Lab7Q3{
		public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
		int i;
		for(i=1; i<=5; i++){
		System.out.println("Customer"+i);
		System.out.print("Enter total bill amount:");
		int total=scan.nextInt();
		System.out.print("Enter the mode of payment(C for cash, O for other): ");
		char pay=scan.next().charAt(0);
		if(pay=='C' || pay=='c'){
		   double dis;
		   dis=(total*0.05);
		   System.out.println("Discount is:"+dis);
		   double last;
		   last=(total-dis);
		   System.out.println("Amount to be paid is:"+last);
		   }
		

		if(pay=='O' || pay=='o'){
			System.out.println("No discount applicable");
			System.out.println("Amount to be paid:"+total);}
			
		   else{
		       System.out.println("Payment method is not valid");
			   }
			
			
            System.out.println();
		}
     }
}	 
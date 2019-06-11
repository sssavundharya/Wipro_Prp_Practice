import java.util.Scanner;

public class OTPGeneration {
	public static int SingleDigit(String s){
		int n=Integer.parseInt(s);
		int sum=0;
		while(n>0 ||sum>9){
			if(n==0){
				n=sum;
				sum=0;
			}
			int r=n%10;
			sum+=r;
			n/=10;
		}
		//System.out.print(sum);
		return sum;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=scan.next();
		System.out.println("Enter your account number:");
		long account_no=scan.nextLong();
		System.out.println("Enter type of account:1.Savings 2.Current 3.Loan");
		String type=scan.next();
		String temp_account_no=account_no+"";
		if(temp_account_no.length()==11){
			String otp=type.substring(0,2);//first two character of name
			otp+=temp_account_no.substring(0, 1);//first character of account number
			otp+=OTPGeneration.SingleDigit(temp_account_no.substring(0, 5));//Add first 5 character of account numberuntil it becomes single digit
			otp+=name.substring(0,1);//first character of name 
			otp+=OTPGeneration.SingleDigit(temp_account_no.substring(5,10));//add 5th to 10th character of account bum until it becomes single digit
			otp+=name.substring(name.length()-1)+temp_account_no.substring(temp_account_no.length()-1);//last character of name and last character of digit
			System.out.println("your otp:"+otp);
		}
		else{
			System.out.println("please give the correct input");
		}
		
	}

}

/*		OTP GENERATION RULES
1. The length of the OTP is exactly 8
2. The OTP starts with first two characters of the account type (Case sensitive)
3. The third character is first digit of the account number
4. The fourth character is the sum of first five digits of account number (if the sum
exceeds single digit then sum of digits should be done to form a single digit.
Repeat if necessary)
5. The fifth character is the first character of the account holder’s name
6. The sixth character is the sum of sixth to tenth digit positions of the account
number (if the sum exceeds single digit then sum of digits should be done to
form a single digit. Repeat if necessary)
7. The seventh character is the last character of the account holder’s name
8. The eighth character is the last digit of the account number
9. All characters should be same case of the input string*/
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

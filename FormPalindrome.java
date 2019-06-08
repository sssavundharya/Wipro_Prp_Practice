import java.util.Scanner;
/*input:12231
  output:1221*/
public class FormPalindrome {
	public static void  reverse(int num){
		int sum=0,original_num=num;
		while(num>0){
			int r=num%10;
			sum=(sum*10)+r;
			num/=10;
		}
		if(original_num==sum)System.out.println("palindromenumber :"+sum );
		else {
			String s=original_num+"",str="";
			int count=0;
			for(int i=0;i<s.length();i++){
				count=0;
				for(int j=0;j<s.length();j++){
					if(s.charAt(i)==s.charAt(j)){
						count++;
					}
				}
				if(count%2==0)str+=s.charAt(i);
			}
			int intval=Integer.parseInt(str);
			reverse(intval);
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		Palindrome.reverse(n);
	}

}

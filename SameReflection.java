import java.util.Scanner;

public class SameReflection {
	public static int fun(String s1,String s2){
		String res="";
		String str1= s1.substring(s1.length()-1)+s1.substring(0,s1.length()-1);
		//System.out.println(str1);
		if(str1.equals(s2))return 1;
		else return -1;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s1=scan.next();
		String s2=scan.next();
		 int r=SameReflection.fun(s1,s2);
		 System.out.println(r);
	}

}

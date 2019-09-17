import java.util.Scanner;

public class PatternPgm {
	public static void fun(int n,int s){
		int t=0;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(s);
				 
			}
			System.out.println();
			s++;
		}
		t=s-1;
		for(int i=n;i>0;i--){
			for(int j=1;j<=i;j++){
				System.out.print(t);
			}
			System.out.println();
			t--;
		}
		
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int start=scan.nextInt();
		PatternPgm.fun(n,start);
	}

}

import java.util.Scanner;

public class ProductMatrix {
	public static int[][] fun(int s,int m,int n){
		int a[][]=new int[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				a[i][j]=s;
				s++;
			}
		}
		int b[][]=new int[n][m];
		for(int j=0;j<n;j++){
			for(int i=0;i<m;i++){
				b[i][j]=a[j][i];
			}
		}
		int c[][]=new int[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				for(int k=0;k<n;k++){
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int s=scan.nextInt();
		int m=scan.nextInt();
		int n=scan.nextInt();
		 int a[][]=ProductMatrix.fun(s,m,n);
		 for(int i=0;i<m;i++){
			 for(int j=0;j<n;j++){
				 System.out.print(a[i][j]+" ");
			 }
			 System.out.println();
		 }
		
	}

}

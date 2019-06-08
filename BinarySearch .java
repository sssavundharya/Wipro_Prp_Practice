import java.util.Scanner;

public class BinarySearch {
	public static void binary(int a[],int beg,int end,int x){
		int mid=(beg+end)/2;
		int count=0;
		if(a[mid]==x){
			count=1;
			System.out.println(mid+1);
		}
		else if(a[mid]<x) binary(a,mid+1,end,x);
		else if (a[mid]>x)  binary(a,beg,mid-1,x);
		else {
			if(count==0)System.out.println("not found");
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
		}
		int x=scan.nextInt();
		int beg=0,end=n;
		BinarySearch.binary(a,beg,end,x);

		
	}

}

import java.util.Scanner;

public class ValidDate {
	public static int fun(int d,int m,int y){
		int res=0;
		if(y<3000){
			if(m>=1&& m<=12){
				if((d>=1 && d<=31 && (m==1 ||m==3 ||m==5 ||m==7 ||m==8 ||m==10 ||m==12))||(d>=1 && d<=28 && (m==2))){
					 res=1;
				}
				if((y%4==0 ||y%400==0) && y%100!=0){
					if(d==29 && m==2)res=1;
				}
			}
		}
		if(res==1)return 1;
		else return 0;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int d=scan.nextInt();
		int m=scan.nextInt();
		int y=scan.nextInt();
		 int r=ValidDate.fun(d,m,y);
		if(r==1) System.out.println("valid");
		else System.out.println("not valid");

	}

}

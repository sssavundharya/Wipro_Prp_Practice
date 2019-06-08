import java.util.Scanner;

public class SepCharConst {
	public static void seperate(String str,int choice){
		String vowels="";
		String constant="";
		int count=0;
		for(int i=0;i<str.length();i++){
			String c=str.substring(i,i+1);
			if(c.matches("[0-9]")){
					count++;
					continue;		
					}
			else if(c.equals("a")||c.equals("e")||c.equals("i")||c.equals("o")||c.equals("u")){
					vowels+=c;
				}
				else{
					constant+=c;
				}
		}
		if(count==str.length())choice=5;
		switch(choice){
		case 1:
			System.out.println("vowels:"+vowels.toUpperCase());	
			System.out.println("consonant:"+constant.toUpperCase());	
			break;
		case 2:
			System.out.println("vowels:"+vowels.toLowerCase());	
			System.out.println("consonant:"+constant.toLowerCase());	
			break;
		default:
			System.out.println("Invalid");
			}
		 
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println();
		String s=scan.nextLine();
		int n=scan.nextInt();
		SepCharConst.seperate(s.toLowerCase(),n);

		
	}

}

import java.util.*;
public class RevWithoutSpecialChar {
    public static void main(String args[]) {
          Scanner scan=new Scanner(System.in);
        String s=scan.next();
        char a[]=s.toCharArray();
        String str="",str1="";
        for(int i=0;i<s.length();i++){
            if(a[i]>='a' && a[i]<='z'||a[i]>='0'&& a[i]<='9'){
                str+=a[i]+"";
            }
            else{
                str1+=a[i]+"";
            }
        }
        int l = 0;
        int k = 0;
        StringBuffer sb=new StringBuffer(str);
        String rev=sb.reverse().toString();
        for(int i=0;i<s.length();i++){
            if(a[i]>='a' && a[i]<='z'||a[i]>='0'&& a[i]<='9'){
                System.out.print(rev.substring(l,l+1));
                l++;
            }
           else {
               System.out.print(str1.substring(k,k+1));
               k++;
            }
        }
    }
}

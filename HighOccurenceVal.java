import java.util.*;
public class HighOccurenceVal{
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
          int n=scan.nextInt();
          String a[]=new String[n];
        String str="",st="";
        for(int i=0;i<n;i++){
            a[i]=scan.next();
            str+=a[i];
        }
        for(int i=0;i<str.length();i++){
          if(!st.contains(str.substring(i,i+1))){
              st+=str.substring(i,i+1);
          }
        }
        int max=0;
        int count=0;
        String m = "";
        String s="";
        for(int i=0;i<st.length();i++){
            count=0;
            for(int j=0;j<str.length();j++){
                if(st.substring(i,i+1).equals(str.substring(j,j+1))){
                    count++;
                }
            }
            if(max<=count){
                max=count;
                m=st.substring(i,i+1);
            }
            
        }

        
        //System.out.print(str+" "+st);
        System.out.print(m);

    }
}

import java.util.*;
public class NonPrimeValueAddition {
    public static void main(String args[]) {
          Scanner scan=new Scanner(System.in);
          int n=scan.nextInt();
          int a[]=new int[n];
          for(int i=0;i<n;i++){
              a[i]=scan.nextInt();
          }
          int count=0,sum=0;
          for(int i=0;i<n;i++){
              if(i==0||i==1)sum+=a[i];
              else{
                  count=0;
                  for(int j=2;j<i;j++){
                      if(i%j==0){
                            sum+=a[i];
                        }
                     }
              
                }
          }
          System.out.println(sum);
          
    }
}

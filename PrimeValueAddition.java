import java.util.*;
public class PrimeValueAddition {
    public static void main(String args[]) {
          Scanner scan=new Scanner(System.in);
          int n=scan.nextInt();
          int a[]=new int[n];
          for(int i=0;i<n;i++){
              a[i]=scan.nextInt();
          }
          int count=0,sum=0;
          for(int i=2;i<n;i++){
              count=0;
              for(int j=2;j<i;j++){
                  if(i%j==0){
                      count=1;
                      break;
                  }
              }
              if(count==0){
                //System.out.print(i+" ");
              sum+=a[i];
              }
          }
          System.out.println(sum);
          
    }
}

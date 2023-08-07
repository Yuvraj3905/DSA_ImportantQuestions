import java.util.*;

public class primefactor{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=2; i<n; i++){
            while(n%i==0){
               n=n/i;
               System.out.println(i);
            }
        }
    }
}
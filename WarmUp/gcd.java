import java.util.*;

public class gcd {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        for(int i=1; i<=a; i++){
if(a%i==0 && b%i==0){
    System.out.println(i);
}
        }
        int g=0;
        for(int i=1; i<=a; i++){
            if(a%i==0 && b%i==0){
                g=1;
            }
    }
    System.out.println(g);
}
}
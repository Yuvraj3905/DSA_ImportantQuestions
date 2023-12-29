import java.util.*;

class Pallindrome{
        public static void main(String[] args) {
           String s="NaMAN";
        //   StringBuilder t=new StringBuilder();
        //   t.append(s);
        //   t.reverse();
        //   if(t.toString()==s) System.out.println(true);
        //   else System.out.println(false);

        
        // while(i<j){
        //     if(s.charAt(i)==s.charAt(j)){
        //         i++;
        //         j--;
        //     }else{
        //         System.out.println(false);
        //         break;
        //     }
        // } 
        // if(i>=j){
        //     System.out.println(true);
        // }
        
        int l=s.length();
        // int i=0,j=l-1;
        System.out.println(rec(s,0,l-1));
        
        }
    
        public static boolean rec(String s,int i,int j){
            if(i>j){
                return true;
            }
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            return rec(s,i+1,j-1);
        }
            
}
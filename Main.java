import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();

        while(t > 0){
            String s = sc.next();

            if(s.length() < 11){
                System.out.println(s);
            }
            else{
                int length = s.length()-2;
                System.out.println(s.charAt(0) + "" + length + s.charAt(s.length()-1));
            }
            t--;
        }
    }
}
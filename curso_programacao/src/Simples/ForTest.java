package Simples;

public class ForTest {
    public static void main(String[] args) {
        int x = 2992;
        if (x<0 || (x!=0 && x%10==0)) System.out.println("nao é");;
        int rev = 0;
        while (x>rev){
            rev = rev*10 + x%10;
            x = x/10;
        }
        System.out.println(x);
        System.out.println(rev);
        System.out.println((x==rev || x==rev/10));

        /*int x = 5;
        int z = 121;
        int y = 5%10;
        String s = String.valueOf(z);
        int n = s.length();
        System.out.println(y);
        for (int i = 0; i <x ; i++) {
            //System.out.println(i);

        }*/

    }
}

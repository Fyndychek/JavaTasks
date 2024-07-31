import java.time.LocalDateTime;
import java.util.Scanner;
class Box {
    double width;
    double depth,height;
}
public class Main {
    public static void main(String[] args) throws java.io.IOException {
        //alt+enter to suggest solution
        //shift+f9 to debug
        //ctrl+f8 to set breakpoint
        for (int i=0; i<10; i++) {
            System.out.print(i+" ");
            if (i%2==0) continue;
            System.out.println("");
        }
        int a=130;
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(input);
        for(int c=10, b=20; c<b; c++, b--){
            System.out.println(c);
            System.out.println(b);
        }
        first:
        {
            int n;
            n = sc.nextInt();
            if(n==10) break first;
            if (n < 100) System.out.println("5");
            char h, j, k;
            h = 'B';
            j = 'A';
            k = 88;
            System.out.println(j);
            byte b;
            b = (byte) a;
            System.out.println(b);
            String str;
        }
        second:
        {
            int x, y;
            x = 52;
            y = ++x;
            System.out.println(y);
            x = 52;
            y = x++;
            y = y << 1;
            y <<= 1;
            System.out.println(y);
            java.time.LocalDateTime d;
            d = LocalDateTime.now();
            System.out.println(d);
            int it = 0;
            do{
                System.out.println(it);
            }while(++it<9);
        }
        third:
        {
            int q;
            q = -10;
            System.out.println(q < 0 ? -q : q);
            int z, v;
            z = 150;
            v = 200;
            while (++z < --v) ;
            System.out.println(z);
            char choice;
            choice = (char) System.in.read();
            int[] mas = {1, 2, 3, 4, 5};
            int sum = 0;
            for (int buff : mas) {

                if (buff == 5) break;
                sum += buff;

            }
            System.out.println(sum);
            int[][] nums =new int[4][5];
            for(int i =0; i<4; i++)
                for(int ii=0; ii<5; ii++)
                    nums[i][ii]=(i+1)*(ii+1);
            for(int[] mass : nums){
                for(int l : mass){
                    System.out.println(l);
                    sum+=l;
                }
            }
            System.out.println(sum);
            Box box = new Box();
            box.width = 10;
            System.out.println(box.width);
        }

        //Connection con =
    }



}

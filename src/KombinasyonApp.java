import java.util.Scanner;

public class KombinasyonApp {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n,r;
        System.out.print("Kombinasyon heasbi icin n: ");
        n= inp.nextInt();
        System.out.print("Kombinasyon heasbi icin r: ");
        r=inp.nextInt();
        int total=1;
        int i=1;
        while (i<=n){
            total= total * i;
            i++;
        }
        System.out.println("n!= "+total);

        int total2=1;
        int j=1;
        while (j<=r){
            total2= total2 * j;
            j++;
        }
        System.out.println("r!= "+total2);

        int total3=1;
        int t=1;
        while (t<=(n-r)){
            total3= total3 * t;
            t++;
        }
        System.out.println("(n-r)!= "+total3);
        System.out.println("(r! * (n-r)!)= "+(total2*total3));
        System.out.println("C(n,r)= n! / (r! * (n-r)!) "+(total/(total2*total3)));

    }
}


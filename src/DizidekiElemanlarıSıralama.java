import java.util.Arrays;
import java.util.Scanner;
public class DizidekiElemanlarıSıralama {
    public static void main(String[] args) {
        int size,temp=0;
        Scanner tara=new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz: ");
        size= tara.nextByte();

        if(size>0){
            int[] arr=new int[size];
            for(int i=0; i<size; i++){
                System.out.print("Dizinin elemanlarını giriniz: "+(i+1));
                arr[i]=tara.nextInt();
            }
            System.out.print("Siralanmis dizi: "+Arrays.toString(arr));

            for(int i=0; i<size; i++){
                for(int j=i+1; j<size; j++){
                    if(arr[i]>arr[j]){
                        temp=(arr[i]);
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
            System.out.print("Siralanmis dizi: "+Arrays.toString(arr));
        }
        else{
            System.out.print("Hatali giris yaptiniz.");
            System.exit(0);
        }
    }
}

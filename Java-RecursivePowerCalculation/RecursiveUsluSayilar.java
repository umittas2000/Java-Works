import java.util.Scanner;

public class RecursiveUsluSayilar {
    static int hesapla(int x,int y,int ret){
        if(y==1){
            return ret;
        }
        ret = ret*x;
        //System.out.println(y + ", " + ret); //Adim adim kontrol icin
        return hesapla(x,y-1,ret);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi,ussu;

        System.out.print("Sayi girin: ");
        sayi = input.nextInt();

        System.out.print("Ussunu girin: ");
        ussu=input.nextInt();

        System.out.println(sayi+ " sayisinin "+ussu+". ussu = " +hesapla(sayi,ussu,sayi));
    }
}

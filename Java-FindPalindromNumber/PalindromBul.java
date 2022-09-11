import java.util.Scanner;

public class PalindromBul {

    static boolean isPalindrom(int x){
        int temp,reverse=0,basamak=0,carpan=1,basamakSayisi=0;

        temp=x;

        while(temp!=0)
        {
            temp = temp/10;
            basamak++;
        }

        temp=x;
        for(int i=basamak;i>0;i--) //basamak sayisina gore reverse'e basla
        {

            basamakSayisi=temp%10;
            carpan=1;
            for(int tot=1;tot<i;tot++) //basamak sayisina gore carpan hesapla
            {
                carpan *=10;
            }
            reverse+=(carpan*basamakSayisi);
            //asagisaki satiri Adimlari takip etmek icin aciniz ( uncomment below line for step by step follow up ).
            //System.out.println("Carpan:"+carpan+" , Basamak: " + i+" , Moddan kalan: "+temp + " , BasamakSayisi: "+basamakSayisi +", Reverse: "+reverse);
            temp=temp/10;
        }

        if(reverse==x){
            return true;
        }else{
            return false;
        }
    }
}

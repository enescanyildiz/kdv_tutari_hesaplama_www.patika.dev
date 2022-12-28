import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
    Scanner input = new Scanner (System.in);
    double fiyat, kdv_orani=0.18,kdv_orani2=0.08, kdv_tutari, kdv_fiyat;
        System.out.println("----------------KDV Hesaplama Programı----------------");
        System.out.print("Lütfen Hesaplanacak Tutarı Giriniz: ");
        fiyat=input.nextDouble();
        if(fiyat<=1000)
        {
            kdv_tutari=fiyat*kdv_orani;
        }
        else
        {
            kdv_tutari=fiyat*kdv_orani2;
        }

        kdv_fiyat=fiyat+kdv_tutari;
        System.out.println("KDV'siz Tutar: "+ fiyat);
        if(fiyat<=1000)
        {
            System.out.println("KDV Oranı: "+ kdv_orani);
        }
        else
        {
            System.out.println("KDV Oranı: "+ kdv_orani2);
        }
        System.out.println("KDV Tutarı: "+ kdv_tutari);
        System.out.println("KDV'li Tutar: "+ kdv_fiyat);


    }
}
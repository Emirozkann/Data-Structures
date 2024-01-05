package OgrenciKayitUygulamasi;

import java.util.Scanner;

public class uygulama {
    public static void main(String[] args) {
        OgrListe bilBolum=new OgrListe();
        int secim=-1;
        Scanner inp=new Scanner(System.in);

        while (secim!=0){
            System.out.println("ÖĞRENCİ KAYIT UYGULAMASI");
            System.out.println("1- Yeni kayıt");
            System.out.println("2- Kayıt sil");
            System.out.println("3- Kayıtları listele");
            System.out.println("0- Çıkış yap");
            System.out.println("SEÇİMİNİZ: ");
            secim= inp.nextInt();
            if (secim == 1) {
                bilBolum.ekle();
            } else if (secim==2) {
                bilBolum.sil();
            } else if (secim==3) {
                bilBolum.yazdir();
            } else if (secim==0) {
                System.out.println("Çıkış yapılıyor");
            }
            else System.out.println("Hatalı seçim yaptınız");
        }
    }
}

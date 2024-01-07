package tekyonluDairesel;

import java.util.Scanner;

public class uygulama {
    public static void main(String[] args) {
        daireselListe liste=new daireselListe();
        Scanner inp=new Scanner(System.in);
        int x=-1;
        while (x!=0){
            System.out.println("1-Başa ekle");
            System.out.println("2-Sona ekle");
            System.out.println("3-Araya ekle");
            System.out.println("4-Baştan sil");
            System.out.println("5-Sondan sil");
            System.out.println("6-Aradan sil");
            System.out.println("0-Çıkış yap");
            System.out.print("Seçiminiz? ");
            x= inp.nextInt();
            if (x == 1)liste.basaEkle();
            else if (x==2)liste.sonaEkle();
            else if (x==3)liste.arayaEkle();
            else if (x==4)liste.bastanSil();
            else if (x==5)liste.sondanSil();
            else if (x==6)liste.aradanSil();
            else System.out.println("Yanlış seçim!!!");
        }
    }
}

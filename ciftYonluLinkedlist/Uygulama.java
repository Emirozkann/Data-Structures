package ciftYonluLinkedlist;

import java.util.Scanner;

public class Uygulama {
    public static void main(String[] args) {
        BagliListe bliste=new BagliListe();
        Scanner inp = new Scanner(System.in);
        boolean a = true;
        while (a) {
            System.out.println();
            System.out.println("1-Sona eleman ekle");
            System.out.println("2-Başa eleman ekle");
            System.out.println("3-İndise eleman ekle");
            System.out.println("4-Sondan eleman sil");
            System.out.println("5-Baştan eleman sil");
            System.out.println("6-indisden eleman sil");
            System.out.println("0-çıkış yap");
            System.out.print("Seçimiz:");
            int secim = inp.nextInt();
            int number=0;
            if (secim == 1||secim==2||secim==3) {
                System.out.print("Sayı giriniz:");
                number = inp.nextInt();
            }
            int indis;
            switch (secim) {
                case 1:
                    bliste.sonaEkle(number);
                    break;
                case 2:
                    bliste.basaEkle(number);
                    break;
                case 3: {
                    System.out.print("--İndis giriniz:");
                    indis = inp.nextInt();
                    bliste.arayaEkle(indis, number);
                }
                break;
                case 4:
                    bliste.sondanSil();
                    break;
                case 5:
                    bliste.bastanSil();
                    break;
                case 6: {
                    System.out.print("--İndis giriniz:");
                    indis = inp.nextInt();
                    bliste.indisdenSil(indis);
                }
                break;
                case 0:
                    a = false;
                    break;
            }
            bliste.bastanYazdir();
        }
    }
}

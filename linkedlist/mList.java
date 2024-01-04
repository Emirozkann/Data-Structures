package linkedlist;

import java.util.Scanner;

public class mList {
    public static void main(String[] args) {
        listeYapisi liste = new listeYapisi();
        Scanner inp = new Scanner(System.in);
        boolean a = true;
        while (a) {
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
                    liste.SonaEkle(number);
                    break;
                case 2:
                    liste.basaEkle(number);
                    break;
                case 3: {
                    System.out.print("--İndis giriniz:");
                    indis = inp.nextInt();
                    liste.indiseEkle(indis, number);
                }
                break;
                case 4:
                    liste.sondanSil();
                    break;
                case 5:
                    liste.bastanSil();
                    break;
                case 6: {
                    System.out.print("--İndis giriniz:");
                    indis = inp.nextInt();
                    liste.indisdenSil(indis);
                }
                break;
                case 0:
                    a = false;
                    break;
            }
            liste.yazdir();
        }


    }
}

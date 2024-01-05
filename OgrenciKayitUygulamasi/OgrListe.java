package OgrenciKayitUygulamasi;

import java.util.Scanner;

public class OgrListe {
    Node head = null;
    Node tail = null;

    Node temp;
    Node temp2;

    int numara;
    String ad;
    String soyad;
    int vize;
    int fin;
    double ortalama;
    String durum;

    Scanner inp = new Scanner(System.in);

    void ekle() {
        System.out.println("Bilgisayar bölümüne kayıt olacak öğrenci bilgilerini giriniz:");
        System.out.println("Numara: ");
        numara = inp.nextInt();
        System.out.println("Ad: ");
        ad = inp.nextLine();
        inp.nextLine();
        System.out.println("Soyad: ");
        soyad = inp.nextLine();
        System.out.println("Vize: ");
        vize = inp.nextInt();
        System.out.println("Final: ");
        fin = inp.nextInt();

        Node eleman = new Node(numara, ad, soyad, vize, fin);
        if (head == null) {
            head = eleman;
            tail = eleman;
            System.out.println("Liste yapısı oluşturuldu");
        } else {
            eleman.next = head;
            head = eleman;
            System.out.println(numara + " numaralı öğrenci eklendi:");
        }
    }

    void sil() {
        if (head == null) {
            System.out.println("Liste boş!!");
        } else {
            System.out.println("Silmek istediğiniz öğrencinin numarasını giriniz :");
            numara = inp.nextInt();
            if (numara == head.numara && head.next == null) {
                head = null;
                tail = null;
                System.out.println("Liste silindi.");
            } else if (numara == head.numara) {
                head = head.next;
                System.out.println(numara + " numaralı öğrenci silindi.:");
            } else {
                if (tail.numara == numara) {
                    while (temp.next != tail) {
                        temp = temp.next;
                    }
                    tail = temp;
                    tail.next = null;
                } else {
                    temp = head;
                    temp2 = head;
                    while (temp.next.numara != numara) {
                        temp2 = temp;
                        temp = temp.next;
                    }
                    temp2.next = temp.next;
                }
                System.out.println(numara + " numaralı öğrenci silindi.:");
            }
        }
    }

    void yazdir(){
        if (head == null) {
            System.out.println("Liste boştur!!!");
        }
        else{
            temp=head;
            while (temp!=null){
                System.out.println("************************************");
                System.out.println("Numara   : "+temp.numara);

                System.out.println("Ad       : "+temp.ad);

                System.out.println("Soyad    : "+temp.soyad);

                System.out.println("Vize     : "+temp.vize);

                System.out.println("Final    : "+temp.fin);

                System.out.println("Ortalama : "+temp.ortalama);

                System.out.println("Durum    : "+temp.durum);
                System.out.println("************************************");
                temp=temp.next;
            }

        }
    }
}

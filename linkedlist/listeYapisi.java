package linkedlist;

public class listeYapisi {
    node head = null;
    node tail = null;
    //---------------------------------------EKLEME KISMI---------------------------------------------------------------

    void SonaEkle(int x) {
        node eleman = new node();
        eleman.data = x;
        eleman.next = null;
        if (head == null) {
            head = eleman;
            tail = eleman;
            System.out.println("Başa elaman eklendi.");
        } else {
            tail.next = eleman;

            tail = eleman;

            System.out.println("sona eleman eklendi.");
        }

    }

    void basaEkle(int a) {
        node eleman = new node();
        eleman.data = a;
        eleman.next = null;
        if (head == null) {
            head = eleman;
            tail = eleman;
        } else {
            eleman.next = head;
            head = eleman;
        }

    }

    void indiseEkle(int indis, int number) {
        node eleman = new node();
        eleman.data = number;
        eleman.next = null;
        if (indis < 0) {
            System.out.println("İndis 0 dan küçük olamaz!");
        } else if (indis > uzunluk() + 1) {
            System.out.println("İndis liste uzunluğundan daha uzun!");
        } else if (indis == 0) {
            basaEkle(number);
        } else if (uzunluk() == indis) {
            node temp = head, temp2 = head;
            while (temp.next != null) {
                temp2 = temp;
                temp = temp.next;
            }
            temp2.next = eleman;
            eleman.next = tail;
        } else if (uzunluk() + 1 == indis) {
            SonaEkle(number);

        } else {
            int sayac = 1;
            node temp = head;
            while (sayac != indis) {
                temp = temp.next;
                sayac++;
            }
            eleman.next = temp.next;
            temp.next = eleman;
        }


    }
    //---------------------------------------ARAMA VE YAZDIRMA----------------------------------------------------
    int uzunluk() {
        int lenght = 0;
        node temp = head;
        while (temp.next != null) {
            lenght++;
            temp = temp.next;
        }
        return lenght;
    }

    void yazdir() {
        System.out.println();
        if (head == null) {
            System.out.println("Liste boş!!");
        } else {
            node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " - ");
                temp = temp.next;
            }

        }
        System.out.println();
        System.out.println();
    }

//     void indisOncesiBul(int indis){
//        //geriye sınıf döndürmeye bak
//        node indisOncesidegeri=head;
//        int sayac=0;
//        while (sayac!=indis){
//            indisOncesidegeri=indisOncesidegeri.next;
//            sayac++;
//        }
//        return indisOncesidegeri;
//    }


    //-----------------------------------------------SİLME KISMI--------------------------------------------------
    void elemanSilme(int indis) {
        if (indis == 0) {
            head = head.next;
        } else if (indis == uzunluk()) {


        } else {

        }
    }
    void sondanSil(){
        if (head == null) {
            System.out.println("Liste boştur!!");
        }
        else {
            node temp=head;
            while (temp.next!=tail){
                temp=temp.next;
            }
            temp.next=null;
            tail=temp;
        }
    }
    void bastanSil(){
        if (head == null) {
            System.out.println("Liste boştur!!");
        } else if (head.next==null) {
            System.out.println("Liste boşaltıldı!");
        }
        else {
            head=head.next;
        }
    }

    void indisdenSil(int indis){
        if (indis == 0) {
            bastanSil();
        } else if (indis==uzunluk()) {
            sondanSil();
        } else if (indis>uzunluk() ||indis<0) {
            System.out.println("Hatalı indis değeri!!");
        }
        else {
            int sayac=0;
            node temp=head, temp2=head;
            while (sayac!=indis){
                temp2=temp;
                temp=temp.next;
                sayac++;
            }
            temp2.next=temp.next;

        }
    }
}

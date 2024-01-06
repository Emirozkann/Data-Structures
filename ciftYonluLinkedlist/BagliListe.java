package ciftYonluLinkedlist;

public class BagliListe {
    Node head = null;
    Node tail = null;

    Node temp;

    void basaEkle(int data) {
        Node eleman = new Node(data);
        if (head == null) {
            head = eleman;
            tail = eleman;
        } else {
            eleman.next = head;
            head.prev = eleman;
            head = eleman;
        }
    }

    void sonaEkle(int data) {
        Node eleman = new Node(data);
        if (head == null) {
            head = eleman;
            tail = eleman;
        } else {
            eleman.prev = tail;
            tail.next = eleman;
            tail = eleman;
        }
    }

    void arayaEkle(int indis, int data) {
        Node eleman = new Node(data);
        if (head == null) {
            head = eleman;
            tail = eleman;
        } else if (indis == 0) {
            eleman.next = head;
            head.prev = eleman;
            head = eleman;
        } else {
            int n = 0;
            temp = head;
            while (temp != null) {
                temp = temp.next;
                n++;
            }
            temp = head;
            if (n == indis + 1) {
                eleman.prev = tail;
                tail.next = eleman;
                tail = eleman;
            } else {
//                int i = 0;
//                while (i != indis) {
//                    temp = temp.next;
//                    i++;
//                }
                temp=tempDondur(indis);
                temp.prev.next = eleman;
                eleman.prev = temp.prev;
                eleman.next = temp;
                temp.prev = eleman;
            }
        }

    }

    //--------------------------------------------SİLME-----------------------------------
    void bastanSil() {
        if (head == null) {
            System.out.println("Liste boştur!!!");
        } else {
            if (head.next == null) {
                head = null;
                tail = null;
                System.out.println("Liste boşaltıldı");
            } else {
                head = head.next;
                head.prev = null;
            }
        }

    }

    void sondanSil() {
        if (head == null) {
            System.out.println("Liste boştur!!!");
        } else {
            if (head.next == null) {
                head = null;
                tail = null;
                System.out.println("Liste boşaltıldı");
            } else {
                tail = tail.prev;
                tail.next = null;
            }
        }

    }

    void indisdenSil(int indis){
        if (head == null) {
            System.out.println("Liste boştur!!!");
        } else {
            if (indis == 0) {
                bastanSil();
            } else if (indis==uzunluk()) {
                sondanSil();
            }
            else {
//                temp=head;
//                int i=0;
//                while (i!=indis){
//                    temp=temp.next;
//                    i++;
//                }
                temp=tempDondur(indis);
                temp.prev.next=temp.next;
                temp.next.prev=temp.prev;
            }
        }
    }


    //--------------------------------------------YAZDIR----------------------------------
    void bastanYazdir() {
        temp = head;
        System.out.print("Baş-->");
        while (temp != null) {
            System.out.print(temp.data + "-");
            temp = temp.next;
        }
        System.out.print("->Son");
    }

    void sondanYazdir() {
        temp = tail;
        System.out.print("Son-->");
        while (temp != null) {
            System.out.print(temp.data + "-");
            temp = temp.prev;
        }
        System.out.print("->Baş");
    }



    int uzunluk(){
        Node x=head;
        int uzunluk=0;
        while (x.next!=null){
            uzunluk++;
            x=x.next;
        }
        return uzunluk;
    }

    Node tempDondur(int indis){
        temp=head;
        int i=0;
        while (i!=indis){
            temp=temp.next;
            i++;
        }
        return temp;

    }
}

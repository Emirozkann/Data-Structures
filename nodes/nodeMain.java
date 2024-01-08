package nodes;

public class nodeMain {
    public static void main(String[] args) {
        node nesne1=new node();
        node nesne2=new node();
        node nesne3=new node();

        nesne1.num=3;
        nesne2.num=6;
        nesne3.num=9;

        nesne1.Next=nesne2;
        nesne2.Next=nesne3;
        nesne3.Next=null;

        node temp =nesne1;
        while (temp !=null){
            System.out.println(temp.num);
            temp=temp.Next;
        }
    }
}

public class Main {

    public static void main(String[] args) {
        BagliListe bagliListe = new BagliListe();
        Node node1 = new Node(7);
        Node node2 = new Node(5);
        Node node3 = new Node(19);
        Node node4 = new Node(50);
        Node node5 = new Node(40);
        Node node6 = new Node(1);
        Node node7 = new Node(8);


        bagliListe.sonaEkle(node1);
        bagliListe.yazdir();
        bagliListe.sonaEkle(node2);
        bagliListe.yazdir();
        bagliListe.sonaEkle(node3);
        bagliListe.yazdir();
        bagliListe.sonaEkle(node4);
        bagliListe.yazdir();
        bagliListe.sonaEkle(node5);
        bagliListe.yazdir();
        bagliListe.sonaEkle(node6);
        bagliListe.yazdir();
        bagliListe.sonaEkle(node7);
        bagliListe.yazdir();
        bagliListe.sondanSil();
        bagliListe.yazdir();
        bagliListe.sondanSil();
        bagliListe.yazdir();
        bagliListe.sondanSil();
        bagliListe.sondanSil();


    }
}
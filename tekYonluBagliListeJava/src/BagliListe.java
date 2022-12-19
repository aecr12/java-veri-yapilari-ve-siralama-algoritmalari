public class BagliListe {

    Node head;
    int elemanSayisi;

    public BagliListe() {
        head = null;
        elemanSayisi = 0;
    }

    public void ekle(Node n) {

        if (head == null) {
            head = n;
        } else {
            Node gecici = head;
            while (gecici.next != null) {
                gecici = gecici.next;
            }
            gecici.next = n;
        }

    }


    public void siraylaEkle(Node n) {

        if (head == null) {
            head = n;
        } else if (head.data > n.data) {
            n.next = head;
            head = n;
        } else {
            Node gecici = head;
            while (gecici.next != null && gecici.next.data < n.data) {
                gecici = gecici.next;
            }
            n.next = gecici.next;
            gecici.next = n;
        }

    }
    public void sil(int silinecekDeger){
        if (head == null){
            System.out.println("Liste zaten boş");
        }else if (head.data == silinecekDeger){
            head = head.next;
        }else {
            Node tmp = head;
            while (tmp != null){
                if(tmp.next.data == silinecekDeger){
                    tmp.next = tmp.next.next;
                }
                tmp = tmp.next;
            }

        }
    }


    public void yazdir() {
        System.out.println(this.head);
    }
}





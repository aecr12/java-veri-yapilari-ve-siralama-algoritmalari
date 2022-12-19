public class BagliListe {

    Node head;
    Node tail;
    int elemanSayisi;

    public BagliListe() {
        head = null;
        tail = null;
        elemanSayisi = 0;
    }

    public void basaEkle(Node n) {
        if (head == null) {
            tail = n;
        } else {
            n.next = head;
        }
        head = n;
    }

    public void bastanSil() {
        if (head != null) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
            }

        }
    }

    public void sonaEkle(Node n) {
        if (head == null) {
            head = n;
        } else {
            tail.next = head;
        }
        tail = n;
    }

    public void sondanSil() {

        if (head == null) {
            System.out.println("Liste Boş");
        } else {
            if (head == tail) {
                head = null;
                tail = null;
            }else {
                Node tmp = head;
                while (tail.next != tail){
                    tmp = tmp.next;
                }
                tmp.next = null;
                tail = tmp;
            }
        }
    }
    public void yazdir() {
        System.out.println(this.head);
    }

}


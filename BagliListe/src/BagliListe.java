public class BagliListe {
    Node head = null;
    public class Node{
        int deger;
        Node next;
        public Node(int deger){
            this.deger = deger;
        }

        Node siraliListe(Node a, Node b){

            Node sonuc = null;
            if (a == null)
                return b;
            if (b == null)
                return a;

            if(a.deger<=b.deger){
                sonuc = a;
                sonuc.next = siraliListe(a,b.next);
            }
            return sonuc;
        }
        Node mergeSort(Node h){

            if(h == null || h.next == null){
                return  h;
            }

            Node orta = ortayiBul(h);
            Node nextOrta = orta.next;
            orta.next = null;
            Node sol = mergeSort(h);
            Node sag = mergeSort(nextOrta);
            Node siraliMerge = siraliListe(sol, sag);
            return siraliMerge;
        }
        Node ortayiBul(Node h){

            if (h == null)
                return h;
            Node fastptr = h.next;
            Node slowptr = h;

            while (fastptr != null) {
                fastptr = fastptr.next;
                if (fastptr != null) {
                    slowptr = slowptr.next;
                    fastptr = fastptr.next;
                }
            }
            return slowptr;

        }
        public void push(int yeniVeri){

            Node yeniNode = new Node(yeniVeri);
            yeniNode.next = head;

        }

        void listeyiYazdir(Node headref){

            while (headref != null) {
                System.out.print(headref.deger + " ");
                headref = headref.next;
            }

        }
    }
}

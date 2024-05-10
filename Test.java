public class Test {

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        
        ll.addFirst("Le Thi Hai Ha");
        ll.addFirst("CTDL va Giai Thuat");
        ll.addFirst("HiHi");
        
        ll.traverse();
        
        ll.addLast("Hazzz");
        ll.traverse();
}
    
}

public class LinkedList<T> {
    private Node<T> head;

    public LinkedList() {
        this.head = null;
    }
    
    //duyet tung phan tu
    public void traverse() {
        Node<T> tmp = head;
        while (tmp != null) {
            // in phan tu
            System.out.println(tmp.getData());
            // chuyen den phan tu tiep theo
            tmp = tmp.getNext();
        }
    }
    //them node vao dau danh sach
    public void addFirst(T item) {
        //buoc 1
        //Node<T> newNode = new Node<>(item. head);
        Node<T> newNode = new Node<>();
        newNode.setData(item);
        newNode.setNext(this.head);
        
        //buoc 2
        this.head = newNode;
    }
    
    // them node vao cuoi danh sach lien ket
    public void addLast(T item) {
        if(head == null){
            addFirst(item);
        }else{
            //buoc 1
            Node<T> newNode = new Node<>(item, null);
            
            //buoc 2
            Node<T> tmp = head;
            while (tmp.getNext()!= null){
                tmp = tmp.getNext();
            }
            tmp.setNext(newNode);
        }
    }
    // them vao phia sau mot node bat ki
    
}

public class SingleLinkedList implements List {
    private Node head = new Node();

    private int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int i) {
        Node p = head;
        for (int j = 0; j <= i; j++) {
            p = p.next;
        }
        return p.data;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object e) {
        return false;
    }

    @Override
    public int indexOf(Object e) {
        return 0;
    }

    @Override
    public void add(int i, Object e) {
        Node p = head;
        for (int j = 0; j < i; j++) {
            p = p.next;
        }
        Node newNode = new Node(e);
        newNode.next = p.next;
        p.next = newNode;
        size++;
    }

    @Override
    public void add(Object e) {
        this.add(size, e);
    }

    @Override
    public boolean addBefore(Object obj, Object e) {
        return false;
    }

    @Override
    public boolean addAfter(Object obj, Object e) {
        return false;
    }

    @Override
    public Object remove(int i) {
        Node p = head;
        for (int j = 0; j < i; j++) {
            p = p.next;
        }
        p.next = p.next.next;
        size--;
        return p;
    }

    @Override
    public boolean remove(Object e) {
        return false;
    }

    @Override
    public Object replace(int i, Object e) {
        return null;
    }

    @Override
    public String toString() {
        if(size == 0){
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        Node p = head.next;
        for(int i=0;i<size;i++){
            if(i !=size -1){
                builder.append(p.data+",");
            }else{
                builder.append(p.data);
            }
            p  = p.next;

        }
        builder.append("]");
        return builder.toString();
    }
}

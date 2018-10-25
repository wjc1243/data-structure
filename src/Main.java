public class Main {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(3, 5);
        list.remove(0);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.get(3));
        System.out.println(list.toString());

        List list2 = new SingleLinkedList();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);

        list2.add(3, 5);
        list2.remove(0);
        System.out.println(list2.size());
        System.out.println(list2.isEmpty());
        System.out.println(list2.get(3));
        System.out.println(list2.toString());

        String s1 = "Hello";
        String s2 = "World";
        String s3 = "Hello";
        String s4 = "world";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
    }
}

import java.util.ArrayDeque;

public class AV_93_arrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<Integer>();
        ad1.add(11);
        ad1.add(22);
        ad1.add(33);
        ad1.addFirst(44);
        ad1.addLast(55);
        ad1.add(66);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
        System.out.println(ad1.pollFirst());  //remove
        System.out.println(ad1);
    }
}

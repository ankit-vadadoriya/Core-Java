import java.util.HashSet;

public class AV_95_hashSet {
    public static void main(String[] args) {

        //repetition not allow in HashSet

        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
        myHashSet.add(5);
        myHashSet.add(8);
        myHashSet.add(10);
        myHashSet.add(11);
        myHashSet.add(11);
        myHashSet.add(7);
//        System.out.println(myHashSet.remove(8));
        System.out.println(myHashSet.size());
        System.out.println(myHashSet);

        HashSet<String> myName = new HashSet<>();
        myName.add("ankit");
        myName.add("mayur");
        myName.add("jeel");
        myName.add("ankit");
        myName.add("niv");
        if (myName.contains("ankit")){
            System.out.println("ankit is available!");
        }
        System.out.println(myName);
    }
}

import java.util.ArrayList;

class MyGeneric<T1, T2>{
    int val = 344;
    private T1 t1;
    private T2 t2;
    public MyGeneric(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }
    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }
}

public class AV_110_generics {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
//        arrayList.add("str1");
        arrayList.add(1);
        arrayList.add(16);
        int a = arrayList.get(0);
        System.out.println(a);

        MyGeneric<String, Integer> g1 = new MyGeneric(23, "MyString",45);
        int int1 = g1.getVal();
        String str = g1.getT1();
        int int2 = g1.getT2();
        System.out.println(int1 + " " + str + " " + int2);
        //------------------OR-----------------------
//        System.out.println(g1.getVal() + " " + g1.getT1() + " " + g1.getT2());
    }
}

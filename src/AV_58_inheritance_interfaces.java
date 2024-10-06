interface sampleInternface{
    void meth1();
    void meth2();
}

interface childSampleInterfaces extends sampleInternface{
    void meth3();
    void meth4();
}

class MySampleClass implements childSampleInterfaces{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}

public class AV_58_inheritance_interfaces {
    public static void main(String[] args) {
        MySampleClass obj = new MySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}

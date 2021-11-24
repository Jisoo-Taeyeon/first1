/*
测试list

*/

class SxtArayList {
    private Object[] elementData;
    private  int size;
    private static final int Flag=10;

    public SxtArayList() {
        elementData =new Object[Flag];

    }

    public SxtArayList(int capacity) {
        elementData=new Object[capacity];
    }

    public static void main(String[] args) {
        SxtArayList s1=new SxtArayList(20);
        System.out.println("运行成功");
    }
}

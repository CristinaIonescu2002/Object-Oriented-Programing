package Lab4.pb2;

public class MyStack {
    private Array arr;

    public MyStack() {
        arr=new Array();
    }

    public void push(Integer x){
        int lungime= arr.getSize();
        arr.addElement(x, lungime);
    }

    public Integer pop(){
        Integer nr= arr.get(arr.getSize());
        arr.remove(arr.getSize()-1);
        return nr;
    }

    public String toString() {
        String result = "{";
        for(int i = 0; i < arr.getSize(); i++) {
            result += arr.get(i) + ", ";
        }
        result += "}";
        return result;
    }
}

package Lab4.pb2;

public class Main {

    public static void main(String[] args) {
        SortedArray arr=new SortedArray();

        arr.addElement(4);
        arr.addElement(2);
        arr.addElement(1);
        arr.addElement(6);

        System.out.println(arr);

        MyStack st=new MyStack();

        st.push(2);
        st.push(3);
        st.push(1);
        st.push(0);
        st.pop();
        st.pop();

        System.out.println(st);

    }
}

package Lab3.prob3;

public class MyQueue {
    private MyArray array;
    private static final int infinit = 9500;
    private int indicePrim;
    private int indiceUltim;
    private int nrElem;

    public MyQueue() {
        array = new MyArray();
        indicePrim = 0;
        indiceUltim = 0;
        nrElem = 0;
    }

    int getSize() {
        return nrElem;
    }

    void enqueue(int value) {
        array.set(indiceUltim,value);
        indiceUltim++;
        nrElem++;
    }

    int dequeue(){
        if(nrElem>0){
            int val = array.get(indicePrim);
            indicePrim++;
            nrElem--;
            return val;
        }
        return infinit;
    }

    boolean isEmpty(){
        if(nrElem==0)
            return true;
        return false;
    }

    public String toString(){
        String s1 = "";
        s1=s1+array.get(indicePrim);
        for(int i=indicePrim+1; i<indiceUltim; i++)
            s1=s1 + " "+array.get(i);
        return s1 + "\n" + "Indici:\n" + indicePrim + " " + indiceUltim + " " + nrElem;
    }

}

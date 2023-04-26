package Lab4.pb2;

public class SortedArray extends Array{

    public SortedArray(){
        super();
    }

    public void addElement(Integer x){
        if(getSize()==0){
            super.addElement(x);
        }else if(get(getSize()-1)<x) {
            addElement(x, getSize());
        }else{
            for(int i=0; i<getSize(); i++)
                if(get(i)>=x){
                    addElement(x, i);
                    break;
                }
        }

    }

}

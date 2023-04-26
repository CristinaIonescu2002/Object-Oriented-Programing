package Lab6.pb1;

public class Square extends Rectangle{
    public Square(){
        this(1);
    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side,String color, boolean filled){
        super(side, side,color,filled);
    }
    public double getSide(){
        return getLength();
    }
    public void setSide(double side){
        setLength(side);
        setWidth(side);
    }
    public void setWidth(double side){
        super.setWidth(side);
    }
    public void setLength(double side){
        super.setLength(side);
    }
    public String toString(){
        return "Square "+ getSide()+" "+getColor()+" "+isFilled();
    }
}

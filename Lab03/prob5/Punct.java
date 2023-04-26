package Lab3.prob5;


public class Punct {
    private int x, y;

    public Punct(){
        x=0;
        y=0;
    }

    public Punct(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x=x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y=y;
    }

    public String toString(){
        return "("+getX()+", "+getY()+")";
    }

    public double distance(int x, int y){
        double val_x, val_y;
        val_x=Math.abs(this.x-x);
        val_y=Math.abs(this.y-y);
        if(this.x==x)
            return val_y;
        else if(this.y==y)
            return val_x;
        else return Math.sqrt(Math.pow(val_x,2)+Math.pow(val_y,2));
    }

    public double distance(Punct p1){
        double val_x, val_y;
        val_x=Math.abs(x-p1.getX());
        val_y=Math.abs(y-p1.getY());
        if(x==p1.getX())
            return val_y;
        else if(y==p1.getY())
            return val_x;
        else return Math.sqrt(Math.pow(val_x,2)+Math.pow(val_y,2));
    }
}

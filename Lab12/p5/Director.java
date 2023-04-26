package Lab12.p5;

import java.util.ArrayList;
import java.util.List;

public class Director extends Repository{
    private List<Repository> children = new ArrayList<>();

    public void addChildren(Repository rep){
        children.add(rep);
    }

    public List<Repository> getChildren() {
        return children;
    }
    public void accept (Visitor f) {
        f.visit(this);
    }
}

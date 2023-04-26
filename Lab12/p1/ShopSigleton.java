package Lab12.p1;

import java.util.ArrayList;

public class ShopSigleton {
    private static ShopSigleton magazin = null;
    String name;
    ArrayList<Product> produse = new ArrayList<>();

    public ShopSigleton(){}

    public static ShopSigleton getInstance(){
        if(magazin == null)
            magazin = new ShopSigleton();
        return magazin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showProducts(){
        for(Product p : produse){
            System.out.println(p.getNume() + " " + p.getPret());
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Product> getProduse() {
        return produse;
    }

    public void addProduct(Product produs){
        produse.add(produs);
    }
    public void removeProduct(Product produs){
        if(produse.contains(produs)){
            produse.remove(produse.indexOf(produs));
        }
    }
    public Product getCheapestProduct(){
        float min = produse.get(0).getPret();
        Product produsIeftin = produse.get(0);
        for(Product p : produse){
            if(min > p.getPret()){
                min = p.getPret();
                produsIeftin = p;
            }

        }
        return produsIeftin;
    }
}

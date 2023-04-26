package Lab6.pb5;

public class Vagon{
    String name;
    int cap_pas;
    int cap_colete;
    int desc_usi;
    int inc_usi;
    int block_geam;

    public Vagon(){
    }
    public Vagon(String name, int cap_pas, int cap_colete, int desc_usi, int inc_usi, int block_geam) {
        this.name = "nimic";
        this.cap_pas = cap_pas;
        this.cap_colete = cap_colete;
        this.desc_usi = desc_usi;
        this.inc_usi = inc_usi;
        this.block_geam = block_geam;
    }
    public String getName() {
        return name;
    }
}

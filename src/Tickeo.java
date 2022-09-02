import java.util.List;
public class Tickeo {
    String humano;
    Integer suben;
    Integer bajan;
    List<Autobus> autobus;
    List<Parada>parada;
    public Tickeo() {
    }
    public Tickeo(String humano, Integer suben, Integer bajan, List<Autobus> autobus, List<Parada> parada) {
        this.humano = humano;
        this.suben = suben;
        this.bajan = bajan;
        this.autobus = autobus;
        this.parada = parada;
    }
}

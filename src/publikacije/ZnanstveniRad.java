package publikacije;

public class ZnanstveniRad extends Publikacija{
    public String podrucje;

    public ZnanstveniRad(String naslov, int godinaizdanja, String podrucje) {
        super(naslov, godinaizdanja);
        this.podrucje = podrucje;
    }

    public String getPodrucje() {
        return podrucje;
    }

    @Override
    public String toString() {
        return "Odabrana publikacija je Znanstveni rad u području " + podrucje + " naslova " + naslov + ", godina izdanja " + godinaizdanja + ".";
    }
}

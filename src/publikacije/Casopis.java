package publikacije;

public class Casopis extends Publikacija {
    public int brojIzdanja;

    public Casopis(String naslov, int godinaizdanja, int brojIzdanja) {
        super(naslov, godinaizdanja);
        this.brojIzdanja = brojIzdanja;
    }

    public int getBrojIzdanja() {
        return brojIzdanja;
    }

    @Override
    public String toString() {
        return "Odabrana publikacija je Casopis naslova " + naslov + ", brojaIzdanja " + brojIzdanja + ", godine izdanja " + godinaizdanja + ".";
    }
}

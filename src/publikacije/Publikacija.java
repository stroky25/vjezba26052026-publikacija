package publikacije;

public abstract class Publikacija implements Comparable<Publikacija>{
    protected String naslov;
    public int godinaizdanja;

    public Publikacija(String naslov, int godinaizdanja) {
        this.naslov = naslov;
        this.godinaizdanja = godinaizdanja;
    }

    public int getGodinaizdanja() {
        return godinaizdanja;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public void setGodinaizdanja(int godinaizdanja) {
        this.godinaizdanja = godinaizdanja;
    }

    @Override
    public int compareTo(Publikacija o) {
        return Integer.compare(godinaizdanja, o.godinaizdanja);
    }

}

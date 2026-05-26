package publikacije;

public class Knjiga extends Publikacija {

    private String autor;

    public Knjiga(String naslov,
                  String autor,
                  int godinaIzdanja) {

        super(naslov, godinaIzdanja);

        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {

        return "Odabrana publikacija je Knjiga naslova '" +
                naslov +
                "', autora " +
                autor +
                ", godine izdanja " +
                godinaizdanja +
                ".";
    }
}
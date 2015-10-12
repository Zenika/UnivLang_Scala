package univ.lang.java.lab3;

public enum City {

    PARIS(true), MARSEILLE(true), MONTREAL(false), STRASBOURG(true), BERLIN(false), LUXEMBOURG(false);

    private boolean french;

    private City(final boolean french) {
        this.french = french;
    }

    public boolean isFrench() {
        return this.french;
    }
}

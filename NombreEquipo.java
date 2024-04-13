public enum NombreEquipo {

    REAL_MADRID("Real Madrid"),
    BARCELONA("Barcelona"),
    JUVENTUS("Juventus"),
    COLOMBIA("Colombia"),
    BRASIL("Brasil");

    private String nom;

    private NombreEquipo(String nom) {
        this.nom = nom;
    }

    public String getnom() {
        return nom;
    }

}

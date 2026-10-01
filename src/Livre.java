public class Livre {    
    private int id;
    private String titre;
    private String auteur;
    private boolean disponible = true;

    public Livre(int id, String titre, String auteur) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
    }

    public boolean isDisponible() { return disponible; }
    public void setDisponible(boolean d) { this.disponible = d; }

    @Override
    public String toString() {
        return id + " | " + titre + " | " + auteur + (disponible ? "" : " (emprunté)");
    }
    
}

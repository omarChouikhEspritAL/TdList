public interface University {
    public void ajoutEtudiant(Etudiant e);
    public boolean rechercherEtudiant(Etudiant e);
    public boolean rechercherEtudiant(String nom);
    public void supprimerEtudiant(Etudiant e);
    public void displayEtudiants();
    public void trierEtudiantsParId();
    public void trierEtudiantsParNom();
}

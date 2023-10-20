import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EspritArrayList implements University{
    ArrayList<Etudiant> ListeEtudiants = new ArrayList();
    @Override
    public void ajoutEtudiant(Etudiant e) {
        ListeEtudiants.add(e);
    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
        for (Etudiant etudiant:ListeEtudiants) {
            return etudiant.getNom().equals(e.getNom()) && etudiant.getId()==e.getId() && etudiant.getPrenom()==e.getPrenom();
        }
        return false;
    }

    @Override
    public boolean rechercherEtudiant(String nom) {
        for (Etudiant e:ListeEtudiants) {
            return e.getNom().equals(nom);
        }
        return false;
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
        ListeEtudiants.remove(e);
    }

    @Override
    public void displayEtudiants() {
        System.out.println(ListeEtudiants);
    }

    @Override
    public void trierEtudiantsParId() {
        Collections.sort(ListeEtudiants, new Comparator<Etudiant>() {
            @Override
            public int compare(Etudiant e1, Etudiant e2) {
                return Integer.compare(e1.getId(), e2.getId());
            }
        });
    }

    @Override
    public void trierEtudiantsParNom() {
        Collections.sort(ListeEtudiants, new Comparator<Etudiant>() {
            @Override
            public int compare(Etudiant e1, Etudiant e2) {
                return e1.getNom().compareTo(e2.getNom());
            }
        });
    }
}

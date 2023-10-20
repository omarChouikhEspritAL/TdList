public class Main {
    public static void main(String[] args) {
        Etudiant e1 = new Etudiant(1,"chouikh","omar");
        Etudiant e2 = new Etudiant();
        e2.setId(2); e2.setNom("tounsi"); e2.setPrenom("salah");
        Etudiant e3 = new Etudiant(2,"chouikh","omar");
        System.out.println("etudiant 2 == etudiant 1 ? :"+e2.equals(e1));
        System.out.println(e1);
        System.out.println(e2);
        EspritArrayList list =new EspritArrayList();
        list.ajoutEtudiant(e1);
        list.ajoutEtudiant(e2);
        list.ajoutEtudiant(e3);
        System.out.println( list.rechercherEtudiant(e1));
        list.supprimerEtudiant(e1);
        list.displayEtudiants();
        list.trierEtudiantsParId();
        list.displayEtudiants();


    }
}
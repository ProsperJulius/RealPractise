package Rufaro;
public class Etudiant {
    private String nom;
    private String matricule;
    private String prenom;
    private String adresse;
    private double note;
    public Etudiant() {
    }
    public Etudiant(String nom,
                    String matricule,
                    String prenom,
                    String adresse,
                    double note) {
        this.nom = nom;
        this.matricule = matricule;
        this.prenom = prenom;
        this.adresse = adresse;
        this.note = note;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public double getNote() {
        return note;
    }
    @Override
    public String toString() {
        return matricule +
                "," + nom +
                "," + prenom +
                "," + adresse +
                "," + note + ";";
    }
    public void setNote(double note) {
        this.note = note;
    }
    /*

    public static class EtudiantBuilder {
        private String nom;
        private String matricule;
        private String prenom;
        private String adresse;
        private double note;

        public EtudiantBuilder(String matricule) {
            this.matricule = matricule;
        }

        public EtudiantBuilder withNom(String nom) {
            this.nom = nom;
            return this;
        }

        public EtudiantBuilder withPrenom(String prenom) {
            this.prenom = prenom;
            return this;
        }

        public EtudiantBuilder withNote(double note) {
            this.note = note;
            return this;
        }

        public EtudiantBuilder withAdresse(String adresse) {
            this.adresse = adresse;
            return this;
        }
        public Etudiant build() {
            Etudiant etudiant = new Etudiant();
            etudiant.setAdresse(adresse);
            etudiant.setMatricule(matricule);
            etudiant.setNote(note);
            etudiant.setPrenom(prenom);
            etudiant.setNom(nom);
            return etudiant;
        }

    }*/
}

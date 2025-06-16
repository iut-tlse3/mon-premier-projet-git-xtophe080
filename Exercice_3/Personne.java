// Fichier : Personne.java
import java.util.Objects;

public class Personne {
    private final String nom;
    private final int age;

    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personne personne = (Personne) o;
        return age == personne.age && Objects.equals(nom, personne.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, age);
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", age=" + age +
                '}';
    }
}
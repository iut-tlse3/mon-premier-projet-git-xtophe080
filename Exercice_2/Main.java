public class Main {
    public static void main(String[] args) {
        String nom = null;
        // Ceci va provoquer une NullPointerException
        System.out.println(nom.toUpperCase());
    }
}

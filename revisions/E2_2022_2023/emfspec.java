public class emfspec {

    final int PRIX_CATEGORIE_UN = 25;
    final int PRIX_CATEGORIE_DEUX = 18;
    final int PRIX_CATEGORIE_TROIS = 12;
    final int[] CATEGORIE_SALLE = { 3, 3, 2, 2, 1, 1, 2, 2, 3, 3, };

    public static void afficherTarifs(int une, int deux, int trois) {

        System.out.println("Catégorie 1 : " + une);
        System.out.println("Catégorie 2 : " + deux);
        System.out.println("Catégorie 1 : " + trois);

        return afficherTarifs(25, 18, 12);
    }

    public static void afficherSalle(boolean[] occupationSalle) {
        System.out.println("occupationSalle");

        for (int categorie : occupationSalle) {
            System.out.println(categorie + " ");
        }

        System.out.println();

        for (boolean estoccupe : occupationSalle) {
            if (estoccupe) {
                System.out.println("X ");
            } else {
                System.out.println("O ");
            }
        }
    }

    public static void trouverPlace(int categorie) {
        
    }

}
public class devoir6 {
// J'ai utilisé chatgpt pour le tableau recherche
    public static int[] genereTableau(int min, int max, int taille) {
        final int TAILLE_TABLEAU = 20;
        final int VALEUR_MIN = 0;
        final int VALEUR_MAX = 50;
        final int VALEUR_RECHERCHEE = 7;

        int[] tableau = new int[taille];
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = (int) (Math.random() * (VALEUR_MAX - VALEUR_MIN + 1)) + VALEUR_MIN;
        }

        return tableau;
    }

    public static int rechercheMIN(int[] tableau) {
        int min = tableau[0];
        for (int val : tableau) {
            if (val < min) {
                min = val;
            }
        }
        return min;
    }

    public static int rechercheMAX(int[] tableau) {
        int max = tableau[0];
        for (int val : tableau) {
            if (val > max) {
                max = val;
            }
        }
        return max;
    }

    public static int rechercheValeur(int[] tableau, int valeur) {
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == valeur) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        final int TAILLE_TABLEAU = 20;
        final int VALEUR_MIN = 0;
        final int VALEUR_MAX = 50;
        final int VALEUR_RECHERCHEE = 7;

        int[] tableau = genereTableau(VALEUR_MIN, VALEUR_MAX, TAILLE_TABLEAU);

        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Tableau[" + i + "] = [" + tableau[i] + "]");
        }

        int minVal = rechercheMIN(tableau);
        int maxVal = rechercheMAX(tableau);
        System.out.println("La plus petite valeur trouvée est : " + minVal);
        System.out.println("La plus grande valeur trouvée est : " + maxVal);

        int position = rechercheValeur(tableau, VALEUR_RECHERCHEE);
        System.out.println("Le nombre [" + VALEUR_RECHERCHEE + "] figure à la position [" + position + "] du tableau");
    }
}

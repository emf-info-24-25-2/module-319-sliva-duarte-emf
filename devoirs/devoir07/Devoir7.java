public class Devoir7 {

    final static int TAILLE_TABLEAU = 10;
    final static int MIN_NOMBRE = -8;
    final static int MAX_NOMBRE = 8;
    final static int VALEUR_RECHERCHEE = 7;

    public static int[] genererValeursAleatoires(int nbrval, int min, int max) {
        int tableau [] = new int[nbrval];
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = (int) (Math.random() * (max - min + 1)) + min;
        }

        return tableau;
    }

    public static int positionValeur(int[] tableau, int valeur) {
    
        for (int index = 0; index < tableau.length; index++) {
            if (tableau[index] == valeur) {
                return index; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] tableau = genererValeursAleatoires(TAILLE_TABLEAU, MIN_NOMBRE, MAX_NOMBRE);

        System.out.println("Voici le contenu du tableau :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Tableau[" + i + "] = " + tableau[i]);
        }

        int position = positionValeur(tableau, VALEUR_RECHERCHEE);

        if (position != -1) {
            System.out.println("La valeur " + VALEUR_RECHERCHEE + " se trouve à la position " + position + ".");
        } else {
            System.out.println("La valeur " + VALEUR_RECHERCHEE + " n'a pas été trouvée dans le tableau.");
        }

    }
}
public class devoir6 {

    //la syntaxe de la méthode n'est pas vraiment correcte, je passerai voir avec vous
    public static int[] genereTableau(int min, int max, int taille) {

    final int TAILLE_TABLEAU = 20;
    final int VALEUR_MIN = 0;
    final int VALEUR_MAX = 50;
    final int VALUER_RECHERCHEE = 7;

    int[] tableau = new int [taille];
    for (int i = 0; i < tableau.length; i++) {
    tableau[i] = (int) (Math.random() * (VALEUR_MAX - VALEUR_MIN + 1)) + VALEUR_MIN;

    return genereTableau(VALEUR_MIN, VALEUR_MAX, TAILLE_TABLEAU);
            
}  
}
}

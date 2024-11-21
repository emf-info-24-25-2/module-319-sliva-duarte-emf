public class TEST {

    public static void main(String[] args) {

        int[] tableau = { 1, 3, 7, 8, 3, 5, 3, 9 };
        int valeurRecherchee = 9;

        int index = -1;
        for (int i = tableau.length - 1; i >= 0; i--) {
            if (tableau[i] == valeurRecherchee) {
                index = i;
                break;
            }
        }

        System.out.println(index);
    }
}

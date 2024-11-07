public class devoir2 {

    public static void main(String[] args) {

        // Variable des capacités des reservoirs
        final int CAPACITE_RESERVOIR_A = 3;
        final int CAPACITE_RESERVOIR_B = 5;

        // Variable des reservoirs
        int reservoir_a = 0;
        int reservoir_b = 0;

        // Capacité totale
        int capcacite_totale = CAPACITE_RESERVOIR_A + CAPACITE_RESERVOIR_B;

        // Génère un entier entre 0 et 8
        int remplissage = (int) (Math.random() * (capcacite_totale + 9));

        // Print screen
        System.out.println("Il y a " + remplissage + " litres a remplir");

        // remplissage

        while (reservoir_a + reservoir_b < remplissage) {
            if (reservoir_a < CAPACITE_RESERVOIR_A) {
                reservoir_a++;
                System.out.println("Remplissage du réservoir A");
            } else if (reservoir_b < CAPACITE_RESERVOIR_B) {
                reservoir_b++;
                System.out.println("Remplissage du récervoir B");
            }
            System.out.println("Reservoir a : " + reservoir_a + " Reservoir b : " + reservoir_b);
            System.out.println("Rmplissage terminé");

        }

    }
}

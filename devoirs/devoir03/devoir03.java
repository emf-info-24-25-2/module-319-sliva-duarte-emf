public class devoir03 {

    public static void main(String[] args) {
        int jour = 26;
        int mois = 10;
        int annee = 2017;
        
        int numeroJour = jour;

        //RIF: belle utilisation du switch!
        switch (mois) {
            case 12: numeroJour += 30;
            case 11: numeroJour += 31;
            case 10: numeroJour += 30;
            case 9:  numeroJour += 31;
            case 8:  numeroJour += 31;
            case 7:  numeroJour += 30;
            case 6:  numeroJour += 31;
            case 5:  numeroJour += 30;
            case 4:  numeroJour += 31;
            case 3: 
                if ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)) {
                    numeroJour += 29;
                } else {
                    numeroJour += 28;
                }
            case 2:  numeroJour += 31;
        }

        System.out.println("Le " + jour + "/" + mois + "/" + annee + " est le jour " + numeroJour + " de l'An.");
    }
}

public class devoir8 {

    public static final String[] CARACTERES = {
        "a", "b", "c", "d", "e", "f", "g", "h", "i", "j"
    };

    final static int NBR_ESSAI = 5;
    final static int TAILLE_MOT_DE_PASSE = 15;

    public static int generePassword(int taille) {
        String resultat = "";

        Random random = new Random();

        while(resultat.length() < taille) {
            int index = random.nextint(CARACTERES.length);

            resultat += CARACTERES[index];
        }

        return generePassword(taille);

    }

    
    public static void main(String[] args) {
    
        for (int i = 0; i < NBR_ESSAI; i++) {
           
            String motDePasse = genereMotDePasse(TAILLE_MOT_DE_PASSE);
            
            
            System.out.println("Mot de passe généré : " + motDePasse);
    }
}
}


// chat gpt m'a aidé pour les randoms car je ne connaissais pas
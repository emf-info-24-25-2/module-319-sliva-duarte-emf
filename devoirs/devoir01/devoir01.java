package devoirs.devoir01;

public class devoir01 {

    public static void main(String[] args) {
        
        int monAge = 15;  // cette variable permet de nous indiquer l'âge 
        
        boolean estMajeur; // cette variable permet de nous indiquer si quelque chose est true or false

        estMajeur = (monAge > 20); // indique à la variable boolean l'age de la maturité au USA
        
        
        System.out.println("Je m'appelle Duarte."); // affiche mon prénom
        System.out.println("Mon âge est de " + monAge + " ans."); // affiche mon age

        if (estMajeur) {  // affiche si je suis majeur ou pas
            System.out.println("Je suis majeur."); 
        } else {
            System.out.println("Je ne suis pas encore majeur."); 
        }
    }
}

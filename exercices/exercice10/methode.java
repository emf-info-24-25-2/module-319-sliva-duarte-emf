public class methode {
    public static void direBonjour() {
        System.out.println("Bonjour");
    }

    public static void direNimporteQuoi(String message) {
        System.out.println(message);
    }

    public static void affichiermin(int a, int b) {
        System.out.println("le minimum est " + Math.min(a, b));
    }

    public static void affichiermax(int a, int b) {
        System.out.println("le maximum est " + Math.max(a, b));
    }

    public static void affichiercarré(double base, double exponent) {
        System.out.println("le nombre " + base + " élevé a la puissanse " + exponent + " est " + Math.pow(base, exponent));
    }

    public static void affichierracine(double nombre) {
        System.out.println("la racine carré de " + nombre + " est " + Math.sqrt(nombre));
    }

    public static void affichierabsolu(int nombre) {
        System.out.println("la valeure absolue de " + nombre + " est de " + Math.abs(nombre));
    }

    public static void main(String[] args) {
        direBonjour();
        direNimporteQuoi("N'importe quoi !");
        affichiermax(5423, 343);
        affichiermin(645, 867);
        affichierracine(432);
        affichiercarré(45, 5);
        affichierabsolu(42);
    }
}

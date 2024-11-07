public class exercice8 {

    public static void main(String[] args) {
        int nombre = 0;
        for (nombre <=5; nombre++) {
            System.out.println(nombre);
        }
        while (nombre <= 6) {
            System.out.println(nombre);
            nombre++;

            do {
                System.out.println(nombre);
                nombre++;
            } while (nombre <= 5);

        }
    }
}
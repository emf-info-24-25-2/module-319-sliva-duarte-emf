public class exeswitch1 {

    public static void main(String[] args) {
        int notedumodule = 5;

        if (notedumodule == 1) {
            System.out.println("Travail non rendu");
        } else if (notedumodule == 2) {
            System.out.println("Très insuffisant");
        } else if (notedumodule == 3) {
            System.out.println("Insuffisant");
        } else if (notedumodule == 4) {
            System.out.println("Suffisant");
        } else if (notedumodule == 5) {
            System.out.println("Bien");
        } else if (notedumodule == 6) {
            System.out.println("Très bien");

            switch (notedumodule) {
                case 1:
                    System.out.println("Travail non rendu");
                    break;
                case 2:
                    System.out.println("Très insuffisant");
                    break;
                case 3:
                    System.out.println("Insuffisant");
                    break;
                case 4:
                    System.out.println("Suffisant");
                    break;
                case 5:
                    System.out.println("Bien");
                    break;
                case 6:
                    System.out.println("Très bien");
                    break;

            }
        }
    }
}
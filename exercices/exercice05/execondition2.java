public class execondition2 {

    public static void main(String[] args) {
        int variableatester = 17;
        boolean estpaire = (variableatester % 2 == 0);

        if (estpaire)
            System.out.println(variableatester + " ce nombre est paire");
        else {
            System.out.println(variableatester + " ce nombre est impaire");
        }
    }
}
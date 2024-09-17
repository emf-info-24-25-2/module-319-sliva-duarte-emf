public class echangevaleurs {
    public static void main(String[] args) {
        int variable1 = 1; <br>
        int variable2 = 2; <br> 

        System.out.println("Avant échange");
        System.out.println("Le contenu de la variable1 est" + variable1);
        System.out.println("Le contenu de la variable1 est" + variable2);
        System.out.println(".... TRAITEMENT ....");¨

        int newvariable = variable1;
        variable1 = variable2;
        variable2 = newvariable;

        System.out.println("Après échange")
        System.out.println("Le contenu de la variable1 est" + variable1);
        System.out.println("Le contenu de la variable1 est" + variable2);


    }
    
}

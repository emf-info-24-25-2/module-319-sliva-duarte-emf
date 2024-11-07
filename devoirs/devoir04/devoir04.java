public class devoir04 {
    public static void main(String[] args) {

        int year = 2014;
        int month = 9;
        int day = 12;

        System.out.println("La date entrée est le " + day + "." + month + "." + year);

        if (year < 0 || year > 9999) {
            System.out.println("L'année [" + year + "] est hors limites !");
            return;
        }

        if (month < 1 || month > 12) {
            System.out.println("Le mois [" + month + "] est hors limites !");
            return;
        }

        int daysInMonth;
        switch (month) {
            case 2:

                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            default:
                daysInMonth = 31;
                break;
        }

        if (day < 1 || day > daysInMonth) {
            System.out.println("Le jour [" + day + "] est hors limites !");
            return;
        }

        String monthName;
        switch (month) {
            case 1:
                monthName = "janvier";
                break;
            case 2:
                monthName = "février";
                break;
            case 3:
                monthName = "mars";
                break;
            case 4:
                monthName = "avril";
                break;
            case 5:
                monthName = "mai";
                break;
            case 6:
                monthName = "juin";
                break;
            case 7:
                monthName = "juillet";
                break;
            case 8:
                monthName = "août";
                break;
            case 9:
                monthName = "septembre";
                break;
            case 10:
                monthName = "octobre";
                break;
            case 11:
                monthName = "novembre";
                break;
            case 12:
                monthName = "décembre";
                break;

        }

        System.out.println("La date formatée est le " + day + " " + monthName + " " + year);
    }
}
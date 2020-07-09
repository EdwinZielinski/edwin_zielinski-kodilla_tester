public class LeapYear {
    public static void main(String[] args) {
        int y = 2016;

        if (y % 4 == 0) {
            if (y % 100 == 0) {
                if (y % 400 == 0) {
                    System.out.println("To jest rok przestępny");
                }
                System.out.println("To nie jest rok przestępny");
            }
            System.out.println("To jest rok przestępny");
        }
        else {
            System.out.println("To nie jest rok przestępny");
        }
    }
}
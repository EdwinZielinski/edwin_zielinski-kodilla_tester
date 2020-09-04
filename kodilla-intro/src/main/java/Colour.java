import java.util.Scanner;

public class Colour {
    public String getFirstLetter() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter fist letter of the colour");
            String colour = scanner.nextLine().trim();
            if (colour.length() >= 2) {
                return colour;
            }
            System.out.println("Colour name is too short. Try again");
        }

    }

    public static String getColourSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select colour (R-red, Y-yellow, B-black)");
            String colour = scanner.nextLine().trim().toUpperCase();
            switch (colour) {
                case "R":
                    return "red";
                case "Y":
                    return "yellow";
                case "B":
                    return "black";
                default:
                    System.out.println("Wrong letter. Try again");


            }
        }
    }
    public static void getLetter(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chose your colour letter");

    }
}



public class SimpleArray {
    public static void main(String[] args) {

        String band[] = new String[5];

        band[0] = "Metallica";
        band[1] = "Slayer";
        band[2] = "Megadeth";
        band[3] = "Anthrax";
        band[4] = "Manowar";

        System.out.println(band[0]);

        int numberOfElements = band.length;

            System.out.println("moja tablica ma " + numberOfElements + " elementów");

    }
}

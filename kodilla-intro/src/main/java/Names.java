public class Names {
    public static void main(String[] args) {

        String names[] = new String[3];

        names[0] = "Andrzej";
        names[1] = "Adam";
        names[2] = "Anna";
        int numberOfElements = names.length;
            System.out.println(names.length);
            for (int i = names.length - 1; i >=0; i-- ) {
                System.out.println(names[i]);
            }



    }
}

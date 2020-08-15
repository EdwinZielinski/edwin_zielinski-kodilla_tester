public class User {
    String name;
    int wiek;

    public User(String name, int wiek) {
        this.name=name;
        this.wiek=wiek;
    }
    public static void main(String[] args) {

        User betty = new User("Betty", 33);
        User carl = new User("Carl", 58);
        User david = new User("David", 13);
        User eva = new User("Eva", 18);
        User frankie = new User("Frankie", 45);

        User[] users = {betty, carl, david, eva, frankie};

        int numberOfUsers = users.length;

        //tutaj nie wiem co dalej zrobić. kombinuje coś z "for". nie wiem czy idę w dobrym kierunku.

        for( int i=0 ; i < users.length; i++){
            System.out.println(users[i].wiek);

        }

    }



    }






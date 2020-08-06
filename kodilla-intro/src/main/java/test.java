class contoAlfa
{
    String nazwa = "Tomek";
    int wiek = 30;
    double stanKonta = 3156.4;

    void wypisz()
    {
        System.out.println("nazwa użytkownika " + nazwa);
        System.out.println("wiek użytkownika " + wiek);
        System.out.println("stan konta użytkownika " + stanKonta);
    }
}

class main {
    public static void main(String[] args) {
        contoAlfa k1 = new contoAlfa();
        k1.wypisz();
    }
}

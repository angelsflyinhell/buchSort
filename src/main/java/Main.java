import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Buch[] buchListe = new Buch[26];

        for (int i = 0; i < buchListe.length; i++) {
            buchListe[i] = new Buch(randStr(5), randStr(10), randStr(5), new Random().nextInt(1), randStr(5));
        }

        Buch[] sorted = sortBuecher(buchListe);

        for (Buch buch : sorted) {
            System.out.println(buch.getAutor() + ", " + buch.getErscheinungsjahr() + ", " + buch.getTitel());
        }
    }

    public static Buch[] sortBuecher(Buch[] buchListe) {
        for (int i = 1; i < buchListe.length; i++) {
            for (int j = 0; j < buchListe.length - i; j++) {
                if (buchListe[j].getAutor().compareTo(buchListe[j + 1].getAutor()) > 0)
                    swap(buchListe, j, j + 1);

                if (buchListe[j].getAutor().compareTo(buchListe[j + 1].getAutor()) == 0 && buchListe[j].getErscheinungsjahr() > buchListe[j + 1].getErscheinungsjahr())
                    swap(buchListe, j, j + 1);

                if (buchListe[j].getAutor().compareTo(buchListe[j + 1].getAutor()) == 0 && buchListe[j].getErscheinungsjahr() == buchListe[j + 1].getErscheinungsjahr() && buchListe[j].getTitel().compareTo(buchListe[j + 1].getTitel()) > 0)
                    swap(buchListe, j, j + 1);
            }
        }
        return buchListe;
    }

    public static Buch[] swap(Buch[] buchListe, int i, int j) {
        Buch temp = buchListe[i];
        buchListe[i] = buchListe[j];
        buchListe[j] = temp;
        return buchListe;
    }

    public static String randStr(int length) {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String random = "";
        for (int i = 0; i < length; i++) {
            random += letters.toCharArray()[new Random().nextInt(2454) % letters.length()];
        }
        return random;
    }
}

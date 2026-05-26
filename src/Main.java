import publikacije.Publikacija;
import publikacije.Knjiga;
import publikacije.Casopis;
import publikacije.ZnanstveniRad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner mojSkener = new Scanner(System.in);

        // lista svih publikacija
        ArrayList<Publikacija> publikacije =
                new ArrayList<>();

        String menu;

        do {

            System.out.println("\n****** MENU ******");
            System.out.println("1 - Unos knjige");
            System.out.println("2 - Unos časopisa");
            System.out.println("3 - Unos znanstvenog rada");
            System.out.println("X - Izlaz");

            menu = mojSkener.nextLine();

            switch (menu) {

                case "1":

                    System.out.println(
                            "\n--- UNOS KNJIGE ---"
                    );

                    System.out.print(
                            "Naslov knjige: "
                    );

                    String naslov =
                            mojSkener.nextLine();

                    System.out.print(
                            "Autor knjige: "
                    );

                    String autor =
                            mojSkener.nextLine();

                    System.out.print(
                            "Godina izdanja: "
                    );

                    int godinaIzdanja =
                            Integer.parseInt(
                                    mojSkener.nextLine()
                            );

                    Knjiga knjiga =
                            new Knjiga(naslov, autor, godinaIzdanja);

                    publikacije.add(knjiga);

                    System.out.println(
                            "Knjiga dodana."
                    );

                    break;

                case "2":

                    System.out.println(
                            "\n--- UNOS ČASOPISA ---"
                    );

                    System.out.print(
                            "Naziv časopisa: "
                    );

                    String naziv =
                            mojSkener.nextLine();

                    System.out.print(
                            "Broj izdanja: "
                    );

                    int brojIzdanja =
                            Integer.parseInt(
                                    mojSkener.nextLine()
                            );

                    System.out.print(
                            "Godina izdanja: "
                    );

                    godinaIzdanja =
                            Integer.parseInt(
                                    mojSkener.nextLine()
                            );

                    Casopis casopis =
                            new Casopis(
                                    naziv,
                                    brojIzdanja,
                                    godinaIzdanja
                            );

                    publikacije.add(casopis);

                    System.out.println(
                            "Časopis dodan."
                    );

                    break;

                case "3":

                    System.out.println(
                            "\n--- UNOS ZNANSTVENOG RADA ---"
                    );

                    System.out.print(
                            "Naslov rada: "
                    );

                    String naslovRada =
                            mojSkener.nextLine();

                    System.out.print(
                            "Godina izdanja: "
                    );

                    godinaIzdanja =
                            Integer.parseInt(
                                    mojSkener.nextLine()
                            );

                    System.out.print(
                            "Područje rada: "
                    );

                    String podrucje =
                            mojSkener.nextLine();

                    ZnanstveniRad rad =
                            new ZnanstveniRad(
                                    naslovRada,
                                    godinaIzdanja,
                                    podrucje
                            );

                    publikacije.add(rad);

                    System.out.println(
                            "Znanstveni rad dodan."
                    );

                    break;

                case "X":
                case "x":

                    System.out.println(
                            "\nIzlaz iz programa"
                    );

                    break;

                default:

                    System.out.println(
                            "Pogrešan odabir"
                    );
            }

        } while (!menu.equalsIgnoreCase("X"));

        // sortiranje liste
        Collections.sort(publikacije);

        // ispis sortirane liste
        System.out.println(
                "\n--- SORTIRANE PUBLIKACIJE ---"
        );

        for (Publikacija p : publikacije) {
            System.out.println(p);
        }

        mojSkener.close();
    }
}
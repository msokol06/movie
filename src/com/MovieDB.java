package com;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MovieDB {
    static List<Movie> movieList = new ArrayList<>();

    public static void main(String[] args) {

        dataPreparation();
        menuSelection();
    }

    private static void menuSelection() {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while (counter == 0) {
            System.out.println("Co chcesz zrobić? Wprowadź liczbę:");
            System.out.println("1 - Dodaj film");
            System.out.println("2 - Szukaj film po nazwie");
            System.out.println("3 - Wypisz filmy z zakresu dat");
            System.out.println("4 - Sprawdź w jakich filmach grał dany aktor");
            System.out.println("5 - Sprawdź ile kosztowało wyprodukowanie danego filmu");


            int selectMenu = scanner.nextInt();

            switch (selectMenu) {
                case 1:
                    break;
                case 2:
                    findMovieByTitle();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Brak takiej opcji");
                    counter++;

            }

        }
    }

    private static void findMovieByTitle() {
        System.out.println("Podaj nazwę szukanego filmu");
        Scanner scanner1 = new Scanner(System.in);
        String movieTitle = scanner1.nextLine();
        for (Movie movie : movieList) {
            if (movie.getTitle().equals(movieTitle)) {
                System.out.println(movie.toString());
            }
        }
    }

    private static void dataPreparation() {
        List<Director> directorList = new ArrayList<>();
        Director stevenSpielsberg = new Director("Steven", "Spilberg", 2000);
        Director jamesCameron = new Director("James", "Spilberg", 2000);
        directorList.add(stevenSpielsberg);
        directorList.add(jamesCameron);

        Actor tomCruise = new Actor("Tom", "Cruise", 1000);
        Actor juliaRoberts = new Actor("Julia", "Roberts", 1100);
        Actor stevenSigal = new Actor("Steven", "Sigal", 1200);

        Movie titanic = new Movie("Titanic", stevenSpielsberg, LocalDate.of(2020, 12, 1),
                Arrays.asList(tomCruise, juliaRoberts), MovieType.action);
        Movie rambo = new Movie("Rambo", jamesCameron, LocalDate.of(2018, 12, 1),
                Arrays.asList(tomCruise, stevenSigal), MovieType.horror);
    }
}


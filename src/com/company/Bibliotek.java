package com.company;

import java.util.ArrayList;
import java.util.List;

public class Bibliotek {
    private List<Bog> bibliotek = new ArrayList<>();

    public Bibliotek() {
        Bog bog1 = new Bog("213415", "Sommeren i Berlin", 1923);
        Bog bog2 = new Bog("923152", "Java For beginners", 2012);
        Bog bog3 = new Bog("001232", "Gilead", 2020);
        bibliotek.add(bog1);
        bibliotek.add(bog2);
        bibliotek.add(bog3);
    }

    public boolean doesBookExistInLibrary(Bog bog) {
        boolean bookExistsInLibrary = false;
        String isbnNummerForBog = bog.getIsbn_Nummer();

        for (Bog book : this.bibliotek) {
            if (book.getIsbn_Nummer().contentEquals(isbnNummerForBog)) {
                bookExistsInLibrary = true;
            }
        }

        return bookExistsInLibrary;
    }



}

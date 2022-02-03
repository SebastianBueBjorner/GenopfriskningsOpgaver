package com.company;

public class Bog {
    private String isbn_Nummer;
    private String titel;
    private int udgivelsesår;

    //Constructor
    public Bog(String isbn_Nummer, String titel, int udgivelsesår) {
        this.isbn_Nummer = isbn_Nummer;
        this.titel = titel;
        this.udgivelsesår = udgivelsesår;
    }

    //Getter og setters
    public String getIsbn_Nummer() {
        return isbn_Nummer;
    }
    public void setIsbn_Nummer(String isbn_Nummer) {
        this.isbn_Nummer = isbn_Nummer;
    }
    public String getTitel() {
        return titel;
    }
    public void setTitel(String titel) {
        this.titel = titel;
    }
    public int getUdgivelsesår() {
        return udgivelsesår;
    }
    public void setUdgivelsesår(int udgivelsesår) {
        this.udgivelsesår = udgivelsesår;
    }

    //ToString
    public String toString() {
        return "Titel: " + titel + "  -  Udgivelsesår: " + udgivelsesår + "  -  ISBN-nummer: " + isbn_Nummer;
    }

}

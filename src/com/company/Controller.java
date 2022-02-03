package com.company;
import java.util.ArrayList;
import java.util.Collections;


public class Controller {
    UserInterface ui = new UserInterface();
    private boolean run = true;

    public void runExercises() throws Exception {
        while (run) {

            ui.menuText();

            switch (ui.intInput()) {
                case 1 -> arrayListExercise();
                case 2 -> bogExercise();
                case 3 -> hvorTitSkalGræssetSlåsExercise();
                case 4 -> kvadratExercise();
                case 5 -> properCaseExercise();
                case 6 -> sorteringExercise();
                case 7 -> søgningExercise();
                case 0 -> run = false;

                default -> ui.invalidInput();

            }
        }
    }


    //-------------------------Exercises------------------------------

    public void arrayListExercise() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("yes");
        arrayList.add("food");
        ui.jumpLine();
        ui.printlnOutput(arrayList.toString());

        String string = "no";
        doesArraylistContainString(arrayList, string);

        ui.printlnOutput(arrayList.toString());
    }
    public void bogExercise() {
        Bibliotek bibliotek = new Bibliotek();
        Bog bogDoesNotExist = new Bog("829130", "Frankrig", 1900);
        Bog bogDoesExist = new Bog("001232", "Gilead", 2020);

        //Should be false
        boolean doesBookExistInLibrary = bibliotek.doesBookExistInLibrary(bogDoesNotExist);
        ui.printlnOutput(String.valueOf(doesBookExistInLibrary));
        //Should be true
        doesBookExistInLibrary = bibliotek.doesBookExistInLibrary(bogDoesExist);
        ui.printlnOutput(String.valueOf(doesBookExistInLibrary));
    }
    public void hvorTitSkalGræssetSlåsExercise() {
        ui.jumpLine();
        ui.printOutput("Gras højde: ");
        double grassHeight = ui.doubleInput();

        ui.printOutput("Maksimum gras højde: ");
        double maximumHeight = ui.doubleInput();

        double daysBeforeMaximumHeight = daysBeforeGrassHasToBeCut(grassHeight, maximumHeight);

        ui.printlnOutput("Græsset skal slås inden " + daysBeforeMaximumHeight + " dage, for ikke at overskride 'Maksimum gras højde'");

    }
    public void kvadratExercise() {
        ui.jumpLine();
        makeSquare(7,'?');

    }
    public void properCaseExercise() {
        ui.jumpLine();
        String properSentence = makeProperCases("tuborg HAR eT STort BRYGGERI hOS CarlSBERG");
        ui.printlnOutput(properSentence);
    }
    public void sorteringExercise() {
        ui.jumpLine();
        sortInputWords();
    }
    public void søgningExercise() throws Exception {
        ui.jumpLine();
        String[] words = {"jeg", "alle", "hund", "kat"};
        String word = "kat";
        int indexOfWord = findIndexOFWord(words, word);
        ui.printlnOutput("Index of 'word' in array is: " + indexOfWord);
    }

    //---------------------------------------------------------------


    public boolean doesArraylistContainString(ArrayList arrayList, String string) {
        boolean arrayContainsString = false;

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).toString().contentEquals(string)) {
                arrayContainsString = true;
            }
        }

        if (arrayContainsString == true) {
            ui.printlnOutput("The String has been found");
        } else {
            arrayList.add(string);
        }

        return arrayContainsString;
    }

    public double daysBeforeGrassHasToBeCut(double grassHeight, double maximumHeight) {
        //Inden maximumHeight opnås skal græsset slås
        double dailyGrowth = 0.8;
        double difference = maximumHeight - grassHeight;
        double daysBeforeMaximumHeight = difference/dailyGrowth;

        return daysBeforeMaximumHeight;
    }

    public void makeSquare(int lenght, char symbol) {
        for (int i = 0; i < lenght; i++) {
            for (int y = 0; y < lenght; y++) {
                ui.printOutput(symbol + "\t");
            }
            ui.jumpLine();
        }
    }

    public String makeProperCases(String sentence) {
        StringBuilder str = new StringBuilder();

        String opdel = " ";
        String[] wordsInSentence = sentence.split(opdel);

        for (int i = 0; i < wordsInSentence.length; i++) {
            String word = wordsInSentence[i];

            if (!word.contentEquals(word.toUpperCase())) {
                if (word.length() > 3) {
                    String wordCapital = word.substring(0,1).toUpperCase();
                    String wordRest = word.substring(1).toLowerCase();
                    word = wordCapital + wordRest;
                } else {
                    word = word.toLowerCase();
                }
            }
            str.append(word).append(" ");
        }

        int lastSpace = str.lastIndexOf(" ");
        str.deleteCharAt(lastSpace);

        return str.toString();
    }

    public void sortInputWords() {
        ArrayList<String> words = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            ui.printOutput("Type word " + i + "/5: ");
            String word = ui.stringInput();
            words.add(word);
        }

        Collections.sort(words);
        Collections.reverse(words);

        ui.jumpLine();
        for (String theWord : words) {
            ui.printlnOutput(theWord);
        }
    }

    public int findIndexOFWord (String[] words, String word) throws Exception {
        int index = -1;
        int count = 0;

        for(String theWord : words) {
            if (theWord.contentEquals(word)) {
                index = count;
            }
            count++;
        }

        if (index == -1) {
            throw new Exception("Word does not exist in Array");
        }

        return index;
    }

}

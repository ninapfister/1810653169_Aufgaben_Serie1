package Aufgabe3; // Package erstellt - src rechte Maustaste...

public class Aufgabe3 {

    public static void main(String[] args)
    { // es wurde eine Main-Methode gewünscht
        String name = "Nina"; // wir mussten bei Aufgabe 3 eine Variable - String - mit unserem Namen erstellen
        System.out.println(name); // das System gibt die den Namen aus, sout tap
        int alter = 21; // eine Variable - int - mit unserem Alter erstellen
        System.out.println(alter); // das System gibt das Alter aus, sout tap
        final String FH_KUFSTEIN_TIROL = "Fachhoschule Kufstein Tirol"; // rechtsklick auf Variablennamen, refactor und rename
        // final bedeutet das die ganze Zeile Final geändert wurde, es benötigt als erstes Wort in der Zeile final und dann muss der Variablenname in Grossbuchstaben geschrieben werden
        final String hallo; // Aufgabe 5, Autovervollständigung, fi strg + leertaste, mehrere Variablen wurde vorgeschlagen
        String anweisung = "JavaverwendetfürStrings\"doppelteAnführungszeichen\"undeinzelneAnführungszeichen \nwie 'c' um einzelne Zeichen zu definieren.";
        System.out.println(anweisung);
        // bei Übung 6 wurde uns der backslash vorgestellt, mit dem man Anführungszeichen bei Ausgaben sieht, und \n ist eine Zeilenumbruch
        String anweisung2 = "Durch \\ kann man auch den Backslash selbst beliebig oft ausgeben: \\\\\\\\";
        System.out.println(anweisung2);
        // macht man 2 backslash, wird uns in der Ausgabe nur noch ein backslash gezeigt, 2=1 backslash
        String anweisung3 = "Ich verwende den\\b Backspace, die Newline\\n und den \\tTabulator";
        System.out.println(anweisung3);
        // \n=nächste Zeile und \t=Tabulator
        String anweisung4 = "Durch den Wagenrücklauf wird die Zeile zurückgesetzt und der Teil nach dem \\r überschreibt\n" +
                "diebestehendeZeile.\\fistinderKonsolenichtbemerkbar,daeseinenSeitenumbruch\n" +
                "erzwingt.";
        System.out.println(anweisung4);
        // r=überschreibt die bestehende Zeile
    }
}

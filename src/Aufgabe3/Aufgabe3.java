package Aufgabe3;

public class Aufgabe3 {

    public static void main(String[] args) {
        String name = "Nina";
        System.out.println(name);
        int alter = 21;
        System.out.println(alter);
        final String FH_KUFSTEIN_TIROL = "Fachhoschule Kufstein Tirol"; // rechtsklick auf Variablennamen, refactor und rename
        // final bedeutet das die ganze Zeile Final geändert wurde, es benötigt als erstes Wort in der Zeile final und dann muss der Variablenname in Grossbuchstaben geschrieben werden
        final String hallo;
        String anweisung = "JavaverwendetfürStrings\"doppelteAnführungszeichen\"undeinzelneAnführungszeichen \nwie 'c' um einzelne Zeichen zu definieren.";
        System.out.println(anweisung);
        String anweisung2 = "Durch \\ kann man auch den Backslash selbst beliebig oft ausgeben: \\\\\\\\";
        System.out.println(anweisung2);
        String anweisung3 = "Ich verwende den\\b Backspace, die Newline\\n und den \\tTabulator";
        System.out.println(anweisung3);
        String anweisung4 = "Durch den Wagenrücklauf wird die Zeile zurückgesetzt und der Teil nach dem \\r überschreibt\n" +
                "diebestehendeZeile.\\fistinderKonsolenichtbemerkbar,daeseinenSeitenumbruch\n" +
                "erzwingt.";
        System.out.println(anweisung4);
    }
}

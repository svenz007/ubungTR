import javax.xml.transform.Result;
import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Mainclass {
    public static void main(String[] args) {

        System.out.println("Projekt Taschenrechner Teko Teil 1");
        Calculator cal1 = new Calculator();
        String text = null;
        double resultat = 0;
        boolean eingabe = true;
        while (eingabe) {
            System.out.println("Wählen Sie Ihre gewünschte Rechenfunktion aus: \n Drücken Sie 1 für Addition \n Drücken Sie 2 für Subtraktion \n Drücken Sie 3 für Multiplikation \n Drücken Sie 4 für Division");
            //Übung 01 - für Klasse
            // Scanner funktion implementieren (Bitte beachte die richtige Variable zu nutzen für den weiteren verlauf


            if (text.matches("^[1-4]|,]*$")) {

                resultat = cal1.OperatorAuswahl(text);
                System.out.println(resultat);
                eingabe = false;
            }
        }

        String userprofile = System.getenv("USERPROFILE");
        String Path = userprofile + "\\Desktop\\TekoTeil1.txt";
        Benutzereingabe filestream = new Benutzereingabe(cal1.getZahl1(), cal1.getZahl2(), cal1.getEndResult());
        filestream.funktprt(text);

        filestream.Path(Path, resultat);
    }

}

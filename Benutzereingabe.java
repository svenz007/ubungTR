import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

    public class Benutzereingabe  {

        private double zahl1;
        private double zahl2;
        private double ganzeRechnung;
        private String ganzeRechnungString;

        public Benutzereingabe(double zahl1, double zahl2, double ganzeRechnung) {
            this.zahl1  = zahl1;
            this.zahl2 = zahl2;
            this.ganzeRechnung = ganzeRechnung;
        }

        public void Path(String path , double berechnung) {
            File file1 = new File(path);
            FileWriter writer;
            //Checks if file1 exists
            if (file1.exists() && !file1.isDirectory()) {

                System.out.println(file1 + " Exists");
            } else {
                try {
                    writer = new FileWriter(file1);


                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(file1 + " Eine Datei wurde erzeugt");

            }
            try {

                String result = String.valueOf("\n"+berechnung);

                fileOutputStreamByteSequence(path, ganzeRechnungString);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }



        public static void fileOutputStreamByteSequence(String file, String ganzeRechnungString) throws IOException {
            // Übung 02 Output stream funktion implementieren welche die Variabel "ganzeRechnungString" in unsere Datei schreibt
            // bei erneutem ausführen des Programm soll die Rechnung nicht überschrieben werden


        }



    public String funktprt(String text){
        if(text.equals("1")){
            ganzeRechnungString ="\n"+zahl1+" + "+zahl2 + " = " + ganzeRechnung;

        }else if (text.equals("2")){
            ganzeRechnungString ="\n"+ zahl1+" - "+zahl2 + " = " + ganzeRechnung;

        }else if (text.equals("3")){
            ganzeRechnungString ="\n"+zahl1+" * "+zahl2 + " = " + ganzeRechnung;

        }else if (text.equals("4")){
            ganzeRechnungString ="\n"+zahl1+" / "+zahl2 + " = " + ganzeRechnung;

        }
        return ganzeRechnungString;
    }

}



import java.util.Scanner;

public class Calculator {
    //Attribute
    private double zahl1;
    private double zahl2;
    private double endResult;


    // Welche Mathematische Methode wurde ausgewählt
    public double OperatorAuswahl(String operation) {

        switch (operation) {

            case "1":
                takeZahl1();
                takeZahl2();
                endResult =  summe(zahl1, zahl2);
                setEndResult(endResult);
                break;
            case "2":
                takeZahl1();
                takeZahl2();
                endResult = minus(zahl1, zahl2);
                setEndResult(endResult);
                break;
            case "3":
                takeZahl1();
                takeZahl2();
                endResult = multiplikation(zahl1, zahl2);
                setEndResult(endResult);
                break;
            case "4":
                takeZahl1();
                takeZahl2();
                endResult = division(zahl1, zahl2);
                setEndResult(endResult);
                break;

            default:
                System.out.println("fail");
        }return endResult;
    }


    //Methoden

    public double takeZahl1() {

        try {
            System.out.println("Geben Sie die erste Zahl ein:");
            Scanner scan = new Scanner(System.in);
            zahl1 = scan.nextDouble();

            setZahl1(zahl1);



        } catch (Exception e) {
            System.out.println("invalid syntax");
            takeZahl1();



        } return zahl1;
    }


    public void setZahl1(double zahl1) {
        this.zahl1 = zahl1;
    }

    public double takeZahl2() {
        try {
            System.out.println("Geben Sie die zweite Zahl ein:");
            Scanner scan = new Scanner(System.in);
            zahl2 = scan.nextDouble();
            setZahl2(zahl2);

        }catch(Exception e) {
            System.out.println("invalid syntax");
            takeZahl2();
        }return zahl2;
    }

    public void setZahl2(double zahl2) {

        this.zahl2 = zahl2;
    }

    //Methode Summe
    public double summe(double zahl1,double zahl2){
        double result;
        result = zahl1 + zahl2;
        return result;
    }

    public double getEndResult() {
        return endResult;
    }

    public void setEndResult(double endResult) {
        this.endResult = endResult;
    }

    public double minus(double zahl1, double zahl2)
    {
        double result;
        result = zahl1 - zahl2;
        return result;
    }

    public double multiplikation(double zahl1,double zahl2)
    {
        double result;
        result = zahl1 * zahl2;
        return result;
    }

    public double division(double zahl1,double zahl2)
    {
        double result;
        result = zahl1 / zahl2;
        return result;
    }

    public double getZahl1() {
        return zahl1;
    }

    public double getZahl2() {
        return zahl2;
    }
}

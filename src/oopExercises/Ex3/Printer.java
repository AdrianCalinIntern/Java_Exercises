package oopExercises.Ex3;

public class Printer {

    private int TonerLevel = 20;
    private int pagesPrinted = 90;
    private boolean isDuplexPrinter;

    public Printer(boolean printerType)
    {
        this.isDuplexPrinter = printerType;
    }


    public void fillThePrinter(int value){
        if(TonerLevel + value > 100){
            System.out.println("The printer is full");
        }
        else{
            TonerLevel = TonerLevel + value;
        }
    }

    public void pagesToPrint(int value){
        if (value>0){
            pagesPrinted = pagesPrinted + value;
        }
    }


    @Override
    public String toString() {
        return "Toner = " + TonerLevel + "\n" +
                "Pages to print = " + pagesPrinted + "\n";
    }
}

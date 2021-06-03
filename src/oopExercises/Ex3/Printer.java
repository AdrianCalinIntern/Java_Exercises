package oopExercises.Ex3;

public class Printer {

    private int TonerLevel;
    private int pagesPrinted;
    private boolean isDuplexPrinter;

    public Printer(boolean printerType)
    {
        this.TonerLevel = 20;
        this.pagesPrinted = 1;
        this.isDuplexPrinter = printerType;
    }


    public void fillThePrinter(int value){
        if(TonerLevel  > 100){
            System.out.println("The printer is full");
        }
        else if(TonerLevel + value > 100){
            System.out.println("The printer is full");
        }
        else{
            TonerLevel = TonerLevel + value;
        }
    }

    public void pagesToPrint(int value){
            pagesPrinted = pagesPrinted + value;
    }

    @Override
    public String toString() {
        return "Toner = " + TonerLevel + "\n" +
                "Pages to print = " + pagesPrinted + "\n";
    }
}

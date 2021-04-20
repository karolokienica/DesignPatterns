public class Main {
    public static void main(String[] args) {
//        To the outside world it look like Printer is actually printing
        Printer printer = new Printer();
        printer.print();
    }
}

class RealPrinter{
    // the "delegate"
    void print(){
        System.out.println("The Delegate");
    }
}

class Printer{
    // the "delegator"
    RealPrinter p = new RealPrinter();

    // create the delegate
    void print(){
        p.print(); // delegation
    }
}
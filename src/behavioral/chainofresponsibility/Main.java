package behavioral.chainofresponsibility;

import java.util.Scanner;

public class Main {
    private DispenseChain c1;
    public Main(){
        this.c1 = new Dollar50Dispenser();
        DispenseChain c2 = new Dollar20Dispenser();
        DispenseChain c3 = new Dollar10Dispenser();

        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }
    public static void main(String[] args) {
        Main main = new Main();
        while (true){
            System.out.println("Enter amount to dispense: ");
            Scanner scanner = new Scanner(System.in);
            int amount = scanner.nextInt();
            if(amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10$");
                return;
            }
            main.c1.dispense(new Currency(amount));
        }
    }
}

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        DrugList engine = new DrugList("hi");
        System.out.println(engine);
        System.out.println();

        int i = 0;
        while (i >= 0) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Wanna buy medicine?" + "\n");
            System.out.println("----(For exiting the programme enter -1)----");
            System.out.print("Enter any digit from your keyboard to start: ");
            int input2 = scan.nextInt();
            System.out.println();
            if (input2 == -1) {
                break;
            } else i += 1;
            Scanner input = new Scanner(System.in);

            int amountOfMedicine;
            int priceOfMedicine = 0;

            System.out.println("Say Hi to me ");
            System.out.print("- ");
            String hi = input.nextLine();
            System.out.println();

            System.out.println("Option: " + "\n" + "1. Medicine" + "\n" + "2. Anti=Biotic");
            System.out.print("- ");
            int option = input.nextInt();
            engine.methodCall(option);

            if (option == 1 || option == 2) {
                System.out.println("What medicine do you need? (You can give only one medicine's number here)");
                System.out.print("- ");
                int numOfMedicine = input.nextInt();
                if (option == 1) {
                    System.out.println(engine.indexOfMedicine(numOfMedicine));

                    System.out.println("How much medicine do you need?");
                    System.out.print("- ");
                    amountOfMedicine = input.nextInt();
                    engine.looseQuantity(amountOfMedicine, numOfMedicine);
                    if (numOfMedicine == 0) {
                        priceOfMedicine = amountOfMedicine * 5;
                    } else if (numOfMedicine == 1) {
                        priceOfMedicine = amountOfMedicine * 10;
                    } else if (numOfMedicine == 2) {
                        priceOfMedicine = amountOfMedicine * 15;
                    } else if (numOfMedicine == 3) {
                        priceOfMedicine = amountOfMedicine * 5;
                    } else if (numOfMedicine == 4) {
                        priceOfMedicine = amountOfMedicine * 7;
                    }

                } else {
                    System.out.println(engine.indexOfAntiB(numOfMedicine));

                    System.out.println("How much medicine do you need?");
                    System.out.print("- ");
                    amountOfMedicine = input.nextInt();
                    engine.looseQuantityBiotic(amountOfMedicine, numOfMedicine);
                    if (numOfMedicine == 0) {
                        priceOfMedicine = amountOfMedicine * 50;
                    } else if (numOfMedicine == 1) {
                        priceOfMedicine = amountOfMedicine * 40;
                    } else if (numOfMedicine == 2) {
                        priceOfMedicine = amountOfMedicine * 30;
                    } else if (numOfMedicine == 3) {
                        priceOfMedicine = amountOfMedicine * 20;
                    } else if (numOfMedicine == 4) {
                        priceOfMedicine = amountOfMedicine * 100;
                    }
                }

                System.out.println("Please kindly pay the bill –");
                System.out.println("Name of the medicine: " + engine.indexOfMedicine(numOfMedicine));
                System.out.println("Amount of medicine you ordered: " + amountOfMedicine);
                System.out.println("Amount left for the medicine: " + engine.leftAmount);
                System.out.println("Price: " + priceOfMedicine);

                System.out.println("Thank you, Sir! If you need more, try again like before..." + "\n" + "\n");
            } else {
                System.out.println("----------------------------------------------" + "\n" + "\n");
            }
            System.out.println(engine);
        }
    }
}

import java.util.Scanner;

public class SimpleSaleTransac {
    private static Scanner input;
    public static void main(String[] args) {
        input = new Scanner(System.in);

        SimpleSaleTransac.buyProd();
    }

    public static void buyProd() {
        boolean isBuying;
        String ans = "";
        int code;
        int qty = 0;
        int prodAmnt = 0;

        do {
            System.out.println("\nCODE  DESCRIPTION  PRICE"
                    + "\n1     Pencil       20.00"
                    + "\n2     Notebook     40.00"
                    + "\n3     Eraser       10.00\n");

            System.out.print("Item code     : ");
            code = input.nextInt();

            switch (code) {
                case 1:
                    prodAmnt = 20;
                    System.out.println("Description   : Pencil = " + prodAmnt);
                    break;
                case 2:
                    prodAmnt = 40;
                    System.out.println("Description   : Notebook = " + prodAmnt);
                    break;
                case 3:
                    prodAmnt = 10;
                    System.out.println("Description   : Eraser = " + prodAmnt);
                    break;

                default:
                    System.out.println("\nEnter Valid Input!!");
                    SimpleSaleTransac.main(null);
                    break;
            }
            System.out.print("Qty           : ");
            qty = input.nextInt();
            SimpleSaleTransac.calcTotal(qty, prodAmnt);

            input.nextLine();
            System.out.print("\nBuy another item? \n[Y]es or [N]o: ");
            ans = input.nextLine();
            isBuying = SimpleSaleTransac.isBuying(ans);

        } while (isBuying);
    }

    public static void calcTotal(int qty, int prodAmnt) {
        int totalAmnt = prodAmnt * qty;

        System.out.println("Total amount : " + totalAmnt);
        System.out.print("Cash Tendered : ");
        int tendered = input.nextInt();

        if (tendered < totalAmnt) {
            System.out.println("Insufficient funds!");
        } else if (tendered >= totalAmnt) {
            int change = tendered - totalAmnt;
            System.out.println("Change : " + change);
        }
    }

    public static boolean isBuying(String ans) {
        boolean isBuying = false;

        switch (ans.toUpperCase()) {
            case "Y":
                isBuying = true;
                break;

            case "N":
                System.out.println("\nBye!!\n");
                break;

            default:
                System.out.println("\nEnter correct syntax!!!\n");
                break;
        }

        return isBuying;
    }
}

package attributes.bill;

import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in the product:");
        String product=scanner.nextLine();
        System.out.println("Type in the net price of product:");
        int price=scanner.nextInt();
        System.out.println("Type in the quantity of product:");
        int quantity=scanner.nextInt();
        System.out.println("Type in the VAT (in %) for this product:");
        double vatPercent=scanner.nextDouble();

        BillItem billItem=new BillItem(product, price,  quantity, vatPercent);
        System.out.println(billItem.getProduct()+": "+billItem.getQuantity()+" x "+billItem.getPrice()+" + "+billItem.getVatPercent()+"% VAT = "+billItem.calculateTotalPrice());

    }
}

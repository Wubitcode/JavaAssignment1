public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("A123", "Hammer", 5, 12.99);

        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per Item: $" + invoice.getPricePerItem());
        System.out.printf("Invoice Amount: $%.2f%n", invoice.getInvoiceAmount());

        invoice.setQuantity(-10);
        invoice.setPricePerItem(-5.99);
        System.out.println("\nAfter setting invalid quantity and price:");
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per Item: $" + invoice.getPricePerItem());
        System.out.printf("Invoice Amount: $%.2f%n", invoice.getInvoiceAmount());
    }
}



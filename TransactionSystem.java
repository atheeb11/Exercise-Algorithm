public class TransactionSystem {
    public static void main(String[] args) {
        int qty = 35;
        int pricePerItem = 20000;
        double totalRaw = qty * pricePerItem;
        
        int discountPercent = (qty / 10) * 5;
        if (discountPercent > 50) discountPercent = 50;
        
        double discountAmount = totalRaw * (discountPercent / 100.0);
        double finalPrice = totalRaw - discountAmount;

        System.out.println("Quantity: " + qty);
        System.out.println("Discount Applied: " + discountPercent + "%");
        System.out.println("Total Price: Rp" + finalPrice);
    }
}
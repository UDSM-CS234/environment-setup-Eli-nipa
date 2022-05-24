package Invoice;

 class Invoice {

        private String partNumber;
        private String partDescription;
        private int quantity;
        private double unitPrice;

        // constructor
        public Invoice(String partNumber, String partDescription, int quantity, double unitPrice){

            setPartNumber(partNumber);
            setDescription(partDescription);
            setQuantity(quantity);
            setUnitPrice(unitPrice);
        }
        // setters
        public void setPartNumber(String partNumber){
            this.partNumber = partNumber;
        }
        public void setDescription(String partDescription){
            this.partDescription = partDescription;
        }
        public void setQuantity(int quantity){
            this.quantity = (quantity < 0) ? 0 : quantity;
        }
        public void setUnitPrice(double unitPrice){
            this.unitPrice = (unitPrice < 0.0) ? 0.0 : unitPrice;
        }
        // getters
        public String getPartNumber(){
            return partNumber;
        }
        public String getDescription(){
            return partDescription;
        }
        public int getQuantity(){
            return quantity;
        }
        public double getUnitPrice(){
            return unitPrice;
        }
        public double getInvoiceAmount(){
            return getQuantity() * getUnitPrice();
        }
    }


public class InvoiceTest{
    public static void main(String[] args){

        // testing positive values
        Invoice spanner = new Invoice("123", "A Spanner", 15, 12.5);

        printInvoice(spanner.getPartNumber(), spanner.getDescription(),
                spanner.getQuantity(), spanner.getUnitPrice(),
                spanner.getInvoiceAmount());

        // testing negative values
        Invoice hammer = new Invoice("124", "A Hammer", -1, -15.0);

        printInvoice(hammer.getPartNumber(), hammer.getDescription(),
                hammer.getQuantity(), hammer.getUnitPrice(),
                hammer.getInvoiceAmount());

    }

    // print invoice
    private static void printInvoice(String num, String desc,int quan, double price, double total){
        System.out.printf("%s: %s - %d * %.2f = %.2f\n", num, desc, quan, price, total);
    }
}

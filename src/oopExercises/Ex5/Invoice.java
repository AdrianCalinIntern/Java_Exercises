package oopExercises.Ex5;

/*
Create a class called Invoice that a hardware store might use to represent an invoice for an item sold at the store.

An Invoice should include four pieces of information as instance variables:
-  a part number(type String),
- a part description(type String),
- a quantity of the item being purchased (type int)
- a price per item (double)

Your class should have a constructor that initializes the four instance variables.
Provide a set and a get method for each instance variable

In addition, provide a method named getInvoiceAmount that calculates the invoice amount (multiplies the quantity by the
price per item), then returns the amount as a double value.

If the quantity is not positive, it should be set to 0.
If the price per item is not positive, it should be set to 0.0.

??Write a test application named InvoiceTest that demonstrates class Invoice’s capabilities. ??
 */

public class Invoice {
    private String partNumber;
    private String description;
    private int quantity;
    private double price;

    public Invoice(String partNumber, String description, int quantity, double price){
        this.partNumber = partNumber;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getInvoiceAmount() {
        double invoiceAmount = 0.0;
        if (quantity < 0) {
            setQuantity(0);
        } else if (price < 0) {
            setPrice(0.0);
        } else {
            invoiceAmount =  quantity * price;
        }
        return invoiceAmount;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "partNumber='" + getPartNumber() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", quantity=" + getQuantity() +
                ", price=" + getPrice() +
                ", InvoiceAmount =" + getInvoiceAmount() +
                '}';
    }
}

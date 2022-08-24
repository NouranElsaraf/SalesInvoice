
package com.SalesInvoiceModel;

public class InvoiceLine {
    private String item;
    private double price;
    private int count;
    private InvoiceSalesHeader header;

    public InvoiceLine() {
    }

    public InvoiceLine(String item, double price, int count, InvoiceSalesHeader header) {
        this.item = item;
        this.price = price;
        this.count = count;
        this.header = header;
    }
     @Override
    public String toString() {
        return header.getNumber() + "," + item + "," + price + "," + count;
    }
     public double getLineTotal() {
        return price * count;
    }

   public void setCount(int count) {
        this.count = count;
    }

    public void setHeader(InvoiceSalesHeader header) {
        this.header = header;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }
     public InvoiceSalesHeader getHeader() {
        return header;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    
    
   

   

    
    
}

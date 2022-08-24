/**
 *
 * @author Mostafa
 */
package com.SalesInvoiceModel;

import com.SalesInvoiceView.InvoiceFrame;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class InvoiceTableModelHeader extends AbstractTableModel {

    private ArrayList<InvoiceSalesHeader> invoicesArray;
    private String[] column = {"Invoice Num", "Invoice Date", "Customer Name", "Invoice Total"};
    
    public InvoiceTableModelHeader(ArrayList<InvoiceSalesHeader> invoicesArray) {
        this.invoicesArray = invoicesArray;
    }

   

    @Override
    public int getColumnCount() {
        return column.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InvoiceSalesHeader inv = invoicesArray.get(rowIndex);
        switch (columnIndex) {
            case 0: return inv.getNumber();
            case 1: return InvoiceFrame.dateFormat.format(inv.getInvoiceDate());
            case 2: return inv.getCustomer();
            case 3: return inv.getInvoiceTotal();
        }
        return "";
    }

    @Override
    public String getColumnName(int column) {
        return this.column[column];
    }
     @Override
    public int getRowCount() {
        return invoicesArray.size();
    }
}

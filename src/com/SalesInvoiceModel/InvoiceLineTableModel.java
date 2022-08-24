/**
 *
 * @author Mostafa
 */
package com.SalesInvoiceModel;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class InvoiceLineTableModel extends AbstractTableModel {

    private ArrayList<InvoiceLine> linesArray;
    private String[] columne = {"Item Name", "Unit Price", "Count", "Line Total"};

    public InvoiceLineTableModel(ArrayList<InvoiceLine> linesArray) {
        this.linesArray = linesArray;
    }

    @Override
    public int getRowCount() {
        return linesArray == null ? 0 : linesArray.size();
    }

    @Override
    public int getColumnCount() {
        return columne.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (linesArray == null) {
            return "";
        } else {
            InvoiceLine involine = linesArray.get(rowIndex);
            switch (columnIndex) {
                case 0:
                    return involine.getItem();
                case 1:
                    return involine.getPrice();
                case 2:
                    return involine.getCount();
                case 3:
                    return involine.getLineTotal();
                default:
                    return "";
            }
        }
    }

    @Override
    public String getColumnName(int column) {
        return columne[column];
    }

}

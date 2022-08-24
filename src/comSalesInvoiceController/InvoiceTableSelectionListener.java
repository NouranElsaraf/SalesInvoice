
/**
 *
 * @author Mostafa
 */
package comSalesInvoiceController;

import com.SalesInvoiceModel.InvoiceSalesHeader;
import com.SalesInvoiceModel.InvoiceLine;
import com.SalesInvoiceModel.InvoiceLineTableModel;
import com.SalesInvoiceView.InvoiceFrame;
import java.util.ArrayList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class InvoiceTableSelectionListener implements ListSelectionListener {

    private InvoiceFrame frameInvo;

    public InvoiceTableSelectionListener(InvoiceFrame frame) {
        this.frameInvo = frame;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        int selectedInvIndex = frameInvo.getInvHTbl().getSelectedRow();
        System.out.println("Invoice selected: " + selectedInvIndex);
        if (selectedInvIndex != -1) {
            InvoiceSalesHeader selectedInv = frameInvo.getInvoicesArray().get(selectedInvIndex);
            ArrayList<InvoiceLine> lines = selectedInv.getLines();
            InvoiceLineTableModel lineTableModel = new InvoiceLineTableModel(lines);
            frameInvo.setLinesArray(lines);
            frameInvo.getInvLTbl().setModel(lineTableModel);
            frameInvo.getCustNameLbl().setText(selectedInv.getCustomer());
            frameInvo.getInvNumLbl().setText("" + selectedInv.getNumber());
            frameInvo.getInvTotalIbl().setText("" + selectedInv.getInvoiceTotal());
            frameInvo.getInvDateLbl().setText(InvoiceFrame.dateFormat.format(selectedInv.getInvoiceDate()));
        }
    }

}

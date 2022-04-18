
package com.SIG.InvoicesCreation;

import com.SIG.View.SIGMainUI;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
/**
 *
 * @author amirm
 */
public class NewHeaderInv extends JDialog{
    private JTextField CustomerName;
    private JTextField InvoiceDate;
    private JLabel  CustomerNameL;
    private JLabel  InvoiceDateL;
    private JButton OkBTN;
    private JButton CancelBTN;
    public NewHeaderInv(SIGMainUI mainView) {
        CustomerNameL = new JLabel("Customer name");
        InvoiceDateL = new JLabel("Date");
        
        //Set Left Margin 
        Border border= CustomerNameL.getBorder();
        Border border1= InvoiceDateL.getBorder();
        Border margin = new EmptyBorder(0,20,0,0);
        CustomerNameL.setBorder(new CompoundBorder(border, margin));
        InvoiceDateL.setBorder(new CompoundBorder(border1, margin));

        CustomerName = new JTextField(20);
        InvoiceDate = new JTextField(20);
        OkBTN = new JButton("OK");
        CancelBTN = new JButton("Cancel");
        OkBTN.setActionCommand("NewInvOkBTN");
        CancelBTN.setActionCommand("NewLineCancelBTN");
        
        OkBTN.addActionListener(mainView);
        CancelBTN.addActionListener(mainView);
        setLayout(new GridLayout(3,2));
        add(CustomerNameL);
        add(CustomerName);
        add(InvoiceDateL);
      //  InvoiceDateL.setText("Invoice Date");
        add(InvoiceDate);
        add(OkBTN);
        add(CancelBTN);
        pack();
        
    }

    public JTextField getCustomerName() {
        return CustomerName;
    }

    public JTextField getInvoiceDate() {
        return InvoiceDate;
    }

    
}
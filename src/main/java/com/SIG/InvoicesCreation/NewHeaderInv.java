/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.SIG.InvoicesCreation;

import com.SIG.View.SIGMainUI;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

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
        CustomerName = new JTextField(20);
        InvoiceDate = new JTextField(20);
        OkBTN = new JButton("OK");
        CancelBTN = new JButton("Cancel");
        OkBTN.setActionCommand("NewInvOkBTN");
        CancelBTN.setActionCommand("NewInvCancelBTN");
        
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

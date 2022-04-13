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
public class NewLineInv extends JDialog{
    private JTextField LineItemName;
    private JTextField LineItemPrice;
    private JTextField LineItemCount;
    
    private JLabel  LineItemNo;
    private JLabel  LineItemNameL;
    private JLabel  LineItemPriceL;
    private JLabel  LineItemCountL;
    
    private JButton OkBTNNewLine;
    private JButton CancelBTNNewLine;
    public NewLineInv(SIGMainUI mainView) {
        //LineItemNo = new JLabel("No.");
        LineItemNameL = new JLabel("Item Name");
        LineItemPriceL = new JLabel("Item Price");
        LineItemCountL = new JLabel("Item Count");
        
        LineItemName = new JTextField(20);
        LineItemPrice = new JTextField(20);
        LineItemCount = new JTextField(20);
        OkBTNNewLine = new JButton("OK");
        CancelBTNNewLine = new JButton("Cancel");
        OkBTNNewLine.setActionCommand("NewInvLineOkBTN");
        CancelBTNNewLine.setActionCommand("NewInvLineCancelBTN");
        
        OkBTNNewLine.addActionListener(mainView);
        CancelBTNNewLine.addActionListener(mainView);
        setLayout(new GridLayout(4,2));
        //add(CustomerNameL);
        add(LineItemNameL);
        add(LineItemName);
        
        add(LineItemPriceL);
        add(LineItemPrice);
        
        add(LineItemCountL);
        add(LineItemCount);
      
       
        add(OkBTNNewLine);
        add(CancelBTNNewLine);
        pack();
        
    }

    public JTextField getLineItemName() {
        return LineItemName;
    }

    public JTextField getLineItemPrice() {
        return LineItemPrice;
    }

    public JTextField getLineItemCount() {
        return LineItemCount;
    }

    
   

 
    
}

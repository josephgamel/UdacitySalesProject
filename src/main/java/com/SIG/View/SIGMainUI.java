/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.SIG.View;
import org.apache.commons.io.FilenameUtils;
//import java.lang.Object;
import com.SIG.InvoicesCreation.NewHeaderInv;
import com.SIG.InvoicesCreation.NewLineInv;
import com.SIG.Model.InvHeaderTable;
import com.SIG.Model.InvLineTable;
import com.SIG.Model.InvoiceHeader;
import com.SIG.Model.InvoiceLine;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author amirm
 */
public class SIGMainUI extends javax.swing.JFrame implements ActionListener , ListSelectionListener{

    /**
     * Creates new form SIGMainUI
     */
    public SIGMainUI() {
        initComponents();
        JOptionPane.showMessageDialog(this, "Welcome to 'Sales Invoice Generator' Application "
        + "\n" + "hera are Some Tips to Use your App"
        );
        
        JOptionPane.showMessageDialog(this, "First Load Invoice Header and Invoice Line Files"
        + "\n" + "from 'File' Menu"
        );
        
         JOptionPane.showMessageDialog(this, "then you Can Add and Delete Invoice."
        + "\n" + "or you Can Add and Delete Invoice Line."
         + "\n" + "Finally you Can Save the New Data to CSV Files."
        );
       
      JOptionPane.showMessageDialog(this, "Let's Go :) ");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        CreateInvoice = new javax.swing.JButton();
        CreateInvoice.addActionListener(this);
        DeleteInvoice = new javax.swing.JButton();
        DeleteInvoice.addActionListener(this);
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        HeaderInvTable = new javax.swing.JTable();
        HeaderInvTable.getSelectionModel().addListSelectionListener(this);
        LineInvNum = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        InvoicesLineTable = new javax.swing.JTable();
        LineInvDate = new javax.swing.JTextField();
        LineCusName = new javax.swing.JTextField();
        LineInvTotal = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        SaveItem = new javax.swing.JButton();
        SaveItem.addActionListener(this);
        DeleteLine = new javax.swing.JButton();
        DeleteLine.addActionListener(this);
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        LoadFile = new javax.swing.JMenuItem();
        LoadFile.addActionListener(this);
        SaveFile = new javax.swing.JMenuItem();
        SaveFile.addActionListener(this);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Invoices Table");

        CreateInvoice.setText("Create New Invoice");
        CreateInvoice.setActionCommand("CreateInvoice");
        CreateInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateInvoiceActionPerformed(evt);
            }
        });

        DeleteInvoice.setText("Delete Invoice");
        DeleteInvoice.setActionCommand("DeleteInvoice");
        DeleteInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteInvoiceActionPerformed(evt);
            }
        });

        jLabel2.setText("Invoice Number");

        jLabel3.setText("Customer Name");

        jLabel5.setText("Invoice Date");

        jLabel6.setText("Invoice Total");

        HeaderInvTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(HeaderInvTable);

        jLabel7.setText("Invoice Items");

        InvoicesLineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(InvoicesLineTable);

        LineInvDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LineInvDateActionPerformed(evt);
            }
        });

        LineCusName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LineCusNameActionPerformed(evt);
            }
        });

        SaveItem.setText("Save");
        SaveItem.setActionCommand("SaveItem");

        DeleteLine.setText("Cancel");
        DeleteLine.setActionCommand("DeleteLine");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SaveItem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addComponent(DeleteLine)
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveItem)
                    .addComponent(DeleteLine))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        LoadFile.setText("Load File");
        LoadFile.setActionCommand("LoadFile");
        LoadFile.setBorderPainted(false);
        LoadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadFileActionPerformed(evt);
            }
        });
        jMenu1.add(LoadFile);

        SaveFile.setText("Save File");
        SaveFile.setActionCommand("SaveFile");
        SaveFile.setAutoscrolls(true);
        jMenu1.add(SaveFile);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(CreateInvoice)
                        .addGap(50, 50, 50)
                        .addComponent(DeleteInvoice)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LineInvNum)
                            .addComponent(LineInvTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LineInvDate)
                            .addComponent(LineCusName, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(LineInvNum))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CreateInvoice)
                            .addComponent(DeleteInvoice)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(LineInvDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(LineCusName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(LineInvTotal))
                        .addGap(31, 31, 31)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(395, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoadFileActionPerformed

    private void LineInvDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LineInvDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LineInvDateActionPerformed

    private void LineCusNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LineCusNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LineCusNameActionPerformed

    private void CreateInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateInvoiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateInvoiceActionPerformed

    private void DeleteInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteInvoiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteInvoiceActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SIGMainUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateInvoice;
    private javax.swing.JButton DeleteInvoice;
    private javax.swing.JButton DeleteLine;
    private javax.swing.JTable HeaderInvTable;
    private javax.swing.JTable InvoicesLineTable;
    private javax.swing.JTextField LineCusName;
    private javax.swing.JTextField LineInvDate;
    private javax.swing.JLabel LineInvNum;
    private javax.swing.JLabel LineInvTotal;
    private javax.swing.JMenuItem LoadFile;
    private javax.swing.JMenuItem SaveFile;
    private javax.swing.JButton SaveItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
   private DateFormat CustomDateFormat= new SimpleDateFormat("dd-MM-yyyy");
   private List<InvoiceHeader> invHeaderList = new ArrayList<>();
   private InvHeaderTable invHTable;
   private InvLineTable  invLTable;
   private NewHeaderInv newInv;
   private NewLineInv newLineInv;
  
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand())
        {
            case "LoadFile" :
                LoadInvHeaderFile();
                break;
             case "SaveFile" :
                SaveToCSV();
                break;
             case "CreateInvoice" :
                getNewInvData();
                break;
             case "DeleteInvoice" :
                DeleteInvHeader();
                break;
            
             case "DeleteLine" :
                DeleteInvLine();
                break;
                
             case "SaveItem" :
                ShowNewLineScreen();
                break;
            
            case "NewInvOkBTN" :
                SaveNewInvData();
                break;
            case "NewInvCancelBTN" :
                CancelInvUpdates();
                break;
                
            case "NewInvLineOkBTN" :
               SaveNewLineData();
                break;
                
            case "NewInvLineCancelBTN" :
                CancelNewLineDialog();
                break;
                
               
            default:
                System.out.println("Nothing Selecteds");
        }
     }
    
    // Load Invoice Header File 
    private void LoadInvHeaderFile(){
        JFileChooser fileChoose = new JFileChooser();
        JOptionPane.showMessageDialog(this, "Select Invoice Header File");
        // Read Invoice Header File
        int choosenHeaderFile = fileChoose.showOpenDialog(this);
        if (choosenHeaderFile == JFileChooser.APPROVE_OPTION) {
                File headerFile = fileChoose.getSelectedFile();
              String headerExtensionFormat=   headerFile.getAbsolutePath();
                 boolean IsExtensionCSV=  FilenameUtils.isExtension(headerExtensionFormat, "csv");
                      
                        
                
            try {
                  if (IsExtensionCSV==true) {
                            
                        
                FileReader readHFile = new FileReader(headerFile);
                BufferedReader bfHeader = new BufferedReader(readHFile);
                String line = null;
                    try {
                        while ((line = bfHeader.readLine()) != null) {
                            String[] FileContent = line.split(",");
                            String invoiceNumValue = FileContent[0];
                            String invoiceDateValue = FileContent[1];
                            String invoiceCusName = FileContent[2];
                           
                            int invoiceHeaderNumber = Integer.parseInt(invoiceNumValue);
                           Date invoiceHeaderDate= CustomDateFormat.parse(invoiceDateValue);
   
                        // Date date = Date.valueOf(invoiceDateValue);
                            System.out.println("Content is : Inv Num - "+invoiceHeaderNumber +" , inv Date "+ invoiceDateValue+ " inv Customer "+ invoiceCusName);
                            
                          InvoiceHeader invHeader = new InvoiceHeader(invoiceHeaderNumber, invoiceHeaderDate, invoiceCusName);
                          invHeaderList.add(invHeader);
                        }  
                        readHFile.close();
                        bfHeader.close();
                    } catch (IOException ex) {
                        Logger.getLogger(SIGMainUI.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ParseException ex) {
                        Logger.getLogger(SIGMainUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                // Start Reading Line Invoice File    
       
                 JOptionPane.showMessageDialog(this, "Select Invoice Lines File");
                    
                    int choosenLineFile = fileChoose.showOpenDialog(this);
                    if (choosenLineFile == JFileChooser.APPROVE_OPTION) {
                        File headerFile1 = fileChoose.getSelectedFile();
                   String linesExtensionFormat=   headerFile.getAbsolutePath();
               
                       
                                
                    FileReader LineFile = new FileReader(headerFile1);
                    BufferedReader bfLine= new BufferedReader(LineFile);
                    String linex = null;
                    try {
                        while ((linex = bfLine.readLine()) != null) {
                            String[] LineFileContent = linex.split(",");
                            String lineInvNumValue = LineFileContent[0];
                            String lineItemName = LineFileContent[1];
                            String lineItemPriceValue= LineFileContent[2];
                            String lineItemsCountValue= LineFileContent[3];
                           
                            int invLineNumber = Integer.parseInt(lineInvNumValue);
                            double lineItemPrice = Double.parseDouble(lineItemPriceValue);
                            int    lineItemsCount = Integer.parseInt(lineItemsCountValue);
   
                            InvoiceHeader header = getInvDetailsByNum(invLineNumber);
                            InvoiceLine  invoiceL = new InvoiceLine(header, lineItemsCount, lineItemPrice, lineItemName);
                            header.getInvLines().add(invoiceL);
                            System.out.println("Line Items Data are : Inv Num - "+invLineNumber +" , item name "+ lineItemName+ " item Price "+ lineItemPrice + " Item Count "+lineItemsCount);
                        }  
                        LineFile.close();
                        bfLine.close();
                       invHTable= new InvHeaderTable(invHeaderList);
                       HeaderInvTable.setModel(invHTable);
                       HeaderInvTable.validate();
                    } catch (IOException ex) {
                        Logger.getLogger(SIGMainUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    }
                    
                  }
                  else {
               
                   JOptionPane.showMessageDialog(null, "File Extension Must be CSV !","Hey!", JOptionPane.ERROR_MESSAGE);
                  System.out.println("Not CSV");
                  }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(SIGMainUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
           
                
            }
        
    }
    
    // Get Every Invoice Data using Invoice Number
    private InvoiceHeader getInvDetailsByNum (int invoiceNum){
            InvoiceHeader header= null;
            for (InvoiceHeader invHeader : invHeaderList) {
                if (invoiceNum == invHeader.getInvoiceNumber()) {
                    header = invHeader;
                    break;
                }
        }
            return header;
        }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        SelectInvHeaderRow();
    }
    
    
    // To Display Data at Invoice Line Part
    private void SelectInvHeaderRow() {
        int selectedRow = HeaderInvTable.getSelectedRow();
        if (selectedRow >= 0) {
           InvoiceHeader row = invHTable.getInvList().get(selectedRow);
           LineInvNum.setText(""+row.getInvoiceNumber());
           LineInvDate.setText(""+CustomDateFormat.format(row.getInvoiceDate()));
           LineCusName.setText(row.getCustomerName());
           LineInvTotal.setText(""+ row.getInvHeaderTotal());
           
           ArrayList<InvoiceLine> lines = row .getInvLines();
           invLTable = new InvLineTable(lines);
           InvoicesLineTable.setModel(invLTable);
           invLTable.fireTableDataChanged();
        }
    }

     // To Create New Invoice using "Create New Invoice" Button
    private void getNewInvData() {
        
        newInv = new NewHeaderInv(this);
        newInv.setVisible(true);
        
    }
    
    // Function for "Create New Invoice" Button
    private void SaveNewInvData() {
        String newCustomerName = newInv.getCustomerName().getText();
        String newInvDateValue = newInv.getInvoiceDate().getText();
        newInv.setVisible(false);
        int newInvNum = appendInvoiceNumber();
        try {
            Date newInvDate=CustomDateFormat.parse(newInvDateValue);
            System.out.println("aaaaaaaa  :  " +newInvDate);
            InvoiceHeader newInvObj = new InvoiceHeader(newInvNum, newInvDate, newCustomerName);
            invHeaderList.add(newInvObj);
            System.out.println("Date is : "+ newInvDate +  "andNum is "+newInvNum + "and Name is : "+newCustomerName);
            newInv.setVisible(false);
            invHTable.fireTableDataChanged();
            
        } catch (ParseException ex) {
            Logger.getLogger(SIGMainUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void CancelInvUpdates() {
        newInv.setVisible(false);
    }
        
    private int appendInvoiceNumber()
    {
        int current = 0;
        for (InvoiceHeader invoiceHeader : invHeaderList) {
            if (invoiceHeader.getInvoiceNumber() > current) {
                current = invoiceHeader.getInvoiceNumber();
            }
          
        }
        return   current +1;
    }

    private void ShowNewLineScreen() {
        newLineInv = new NewLineInv(this);
        newLineInv.setVisible(true);
        
    }

    private void CancelNewLineDialog() {
        newLineInv.setVisible(false);
    }

    private void SaveNewLineData() {
        String Itemname = newLineInv.getLineItemName().getText();
        double ItemPrice =Double.parseDouble(newLineInv.getLineItemPrice().getText());
        int ItemCount =Integer.parseInt(newLineInv.getLineItemCount().getText());
        newLineInv.setVisible(false);
        System.err.println("Dataaaaaaa  name "+Itemname + " - price " + ItemPrice + " - count " +  ItemCount );
        int headerIndex =HeaderInvTable.getSelectedRow();
       //HeaderInvTable
        System.out.println("CURRREEEEEENT : " + headerIndex);
       InvoiceHeader invHead =  invHTable.getInvList().get(headerIndex);
       
        
       InvoiceLine invL = new InvoiceLine(invHead, ItemCount, ItemPrice, Itemname);
        
        invHead.addInvoiceLine(invL);
        LineInvTotal.setText(""+invHead.getInvHeaderTotal());
      invLTable.fireTableDataChanged();
        invHTable.fireTableDataChanged();

    
    }

    private void DeleteInvLine() {
        int lineIndex = InvoicesLineTable.getSelectedRow();
    InvoiceLine i =  invLTable.getInvLines().get(lineIndex);
        invLTable.getInvLines().remove(lineIndex);
        invLTable.fireTableDataChanged();
        invHTable.fireTableDataChanged();
        
        LineInvTotal.setText(""+i.getItemTotal());
    }

    private void DeleteInvHeader() {
        int invHindex = HeaderInvTable.getSelectedRow();
        InvoiceHeader invH = invHTable.getInvList().get(invHindex);
        invHTable.getInvList().remove(invH);
        invHTable.fireTableDataChanged();
     //   invLTable = new InvLineTable(new ArrayList<InvoiceLine>());
       invLTable = new InvLineTable(new ArrayList<InvoiceLine>());
       InvoicesLineTable.setModel(invLTable);
       invLTable.fireTableDataChanged();
        LineInvNum.setText("");
           LineInvDate.setText("");
           LineCusName.setText("");
           LineInvTotal.setText("");
    }
    
    // Save Data to New Invoices Header File and Invoices Line File
    private void SaveToCSV() {
        String header ="";
        String lines = "";
        for (InvoiceHeader inH : invHeaderList)
        {
            header += inH.saveInvHeaderDataToCSV();
            header += "\n";
            for (InvoiceLine invL : inH.getInvLines())
            {
                lines += invL.saveInvLineDataToCSV();
                lines += "\n";
            }
        }
        JOptionPane.showMessageDialog(this, "Select Header File to Save");
        JFileChooser filechoose = new JFileChooser();
        int selectedFile = filechoose.showSaveDialog(this);
        if (selectedFile == JFileChooser.APPROVE_OPTION) {
           File headerFile =  filechoose.getSelectedFile();
            try {
                FileWriter headerFileWrite = new FileWriter(headerFile);
                headerFileWrite.write(header);
                headerFileWrite.flush();
                headerFileWrite.close();
                  int selectedLinesFile = filechoose.showSaveDialog(this);
                if (selectedLinesFile == JFileChooser.APPROVE_OPTION) {
                     File linesFile =  filechoose.getSelectedFile();
            
                FileWriter linesFileWrite = new FileWriter(linesFile);
                linesFileWrite.write(lines);
                linesFileWrite.flush();
                linesFileWrite.close();
            }
                
            } catch (IOException ex) {
                Logger.getLogger(SIGMainUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }
}

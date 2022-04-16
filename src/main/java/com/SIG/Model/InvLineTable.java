/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.SIG.Model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author amirm
 */
public class InvLineTable extends AbstractTableModel{
    private DateFormat CustomDateFormat= new SimpleDateFormat("dd-MM-yyyy");
    private List <InvoiceLine> invLines;

    public List<InvoiceLine> getInvLines() {
        return invLines;
    }
     public InvLineTable(List <InvoiceLine> invLines) {
         this.invLines=invLines;
    }
    
    @Override
    public int getRowCount() {
       return invLines.size();
    }

   

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "No.";
                
            case 1:
                return "Invoice Name";
                
            case 2:
                return "Item Price";
               
            case 3:
                
                return "Count";
            case 4:
                
               return "Item Total";
              
            default:
                return "NA" ;
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
                   case 0:
                       return Integer.class;

                   case 1:
                       return String.class;

                   case 2:

                       return Double.class;
                               
                   case 3:

                      return Integer.class;
                    
                   case 4:

                       return Double.class;
                              

                   default:
                       return Object.class;
               }    
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InvoiceLine rowData = invLines.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return rowData.invHeader.getInvoiceNumber();
                
            case 1:
                return rowData.getItemName();
            case 2:
                
               return rowData.getItemPrice();
               
            case 3:
                
                return rowData.getItemCount();
            case 4:
                
               return rowData.getItemTotal();
               
            
              
            default:
                return "NA" ;
        }
        
    }

//    @Override
//    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

}

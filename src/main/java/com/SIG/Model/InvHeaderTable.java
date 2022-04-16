
package com.SIG.Model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author amirm
 */
public class InvHeaderTable extends AbstractTableModel{
    private DateFormat CustomDateFormat= new SimpleDateFormat("dd-MM-yyyy");
    private List <InvoiceHeader> invList;

    public InvHeaderTable() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<InvoiceHeader> getInvList() {
        return invList;
    }
     public InvHeaderTable(List <InvoiceHeader> invList) {
         this.invList=invList;
    }
    
    @Override
    public int getRowCount() {
       return invList.size();
    }

   

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Invoice Num";
                
            case 1:
                return "Customer Name";
               
            case 2:
                
                return "Invoice Date";
            case 3:
                
               return "Invoice Total";
              
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

                       return String.class;
                               
                   case 3:

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
        InvoiceHeader rowData = invList.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return rowData.getInvoiceNumber();
                
            case 1:
                return rowData.getCustomerName();
               
            case 2:
                
                return CustomDateFormat.format(rowData.getInvoiceDate());
            case 3:
                
               return rowData.getInvHeaderTotal();
              
            default:
                return "NA" ;
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

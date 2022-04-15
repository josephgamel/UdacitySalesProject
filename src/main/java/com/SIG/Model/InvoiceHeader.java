/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.SIG.Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author amirm
 */
public class InvoiceHeader {
    private int InvoiceNumber;
    private Date InvoiceDate;
    private String CustomerName;
    private ArrayList<InvoiceLine> invLine;
    public InvoiceHeader(int InvoiceNumber, Date InvoiceDate, String CustomerName) {
        this.InvoiceNumber = InvoiceNumber;
        this.InvoiceDate = InvoiceDate;
        this.CustomerName = CustomerName;
    }

    public int getInvoiceNumber() {
        return InvoiceNumber;
    }

    public void setInvoiceNumber(int InvoiceNumber) {
        this.InvoiceNumber = InvoiceNumber;
    }

    public Date getInvoiceDate() {
        return InvoiceDate;
    }

    public void setInvoiceDate(Date InvoiceDate) {
        this.InvoiceDate = InvoiceDate;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }
    
    public ArrayList<InvoiceLine> getInvLines (){
        if (invLine == null) {
            invLine= new ArrayList<>();
        }
        return invLine;
    }
    
    public void addInvoiceLine(InvoiceLine l){
        getInvLines().add(l);
    }
    
    public double getInvHeaderTotal()
    {
        double total = 0.0;
        for (InvoiceLine Line : getInvLines()) {
            total += Line.getItemPrice();
        }
        return total;
    }
    
}

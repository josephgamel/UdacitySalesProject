/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.SIG.Model;

import java.util.ArrayList;



/**
 *
 * @author amirm
 */
public class InvoiceLine {
   InvoiceHeader  invHeader ;
   private int itemCount;
   private double itemPrice;
   private String itemName;

    public InvoiceLine(InvoiceHeader invHeader, int itemCount, double itemPrice, String itemName) {
        this.invHeader = invHeader;
        this.itemCount = itemCount;
        this.itemPrice = itemPrice;
        this.itemName = itemName;
    }

    public int getItemCount() {
        return itemCount;
    }

    public InvoiceHeader getInvHeader() {
        return invHeader;
    }

    public void setInvHeader(InvoiceHeader invHeader) {
        this.invHeader = invHeader;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    
    public double getItemTotal(){
        return itemPrice * itemCount;
    }
    
 
    public String saveInvLineDataToCSV(){
            return "" + getInvHeader().getInvoiceNumber() + "," + getItemName() +"," + getItemPrice() +"," +getItemCount();
    }
    
}


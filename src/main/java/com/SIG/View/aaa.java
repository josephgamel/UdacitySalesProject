


private void LoadInvHeaderFile(){
        JFileChooser fileChoose = new JFileChooser();
        JOptionPane.showMessageDialog(this, "Select Invoice Header File");
        // Read Invoice Header File
        int choosenHeaderFile = fileChoose.showOpenDialog(this);
        if (choosenHeaderFile == JFileChooser.APPROVE_OPTION) {
                File headerFile = fileChoose.getSelectedFile();
              String headerExtensionFormat=   headerFile.getAbsolutePath();
                 boolean IsHeaderExtensionCSV=  FilenameUtils.isExtension(headerExtensionFormat, "csv");
                      
                        
                
         
                  if (IsHeaderExtensionCSV==true) {
                            
                        
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
         }  
                        LineFile.close();
                        bfLine.close();
                       invHTable= new InvHeaderTable(invHeaderList);
                       HeaderInvTable.setModel(invHTable);
                       HeaderInvTable.validate();
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
    
    
    


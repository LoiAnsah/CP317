package CP317;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;

public class Upload extends JPanel{
    //GUI Elements
    private final JButton button = new JButton("Upload File");
    public Scanner SupplierFile = null;
    public Scanner ProductFile = null;
    /*
     * Inner class that accesses button
     */
    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(final ActionEvent e) {
            if (e.getSource()==button) {
                JFileChooser fileupload = new JFileChooser();
                int response = fileupload.showOpenDialog(null);
                if (response==JFileChooser.APPROVE_OPTION) {
                    File file = new File(fileupload.getSelectedFile().getAbsolutePath());
                    try {
                        if (file.getName().equals("SupplierFile.txt")) {
                            SupplierFile = new Scanner(file);
                            System.out.println("Supplier File Successfully Received!");
                        } else if (file.getName().equals("ProductFile.txt")) {
                            ProductFile = new Scanner(file);
                            System.out.println("Product File Successfully Received!");
                        } else {
                            System.out.println("Invalid file. Files must be called 'SupplierFile.txt' and 'ProductFile.txt'.");
                        }   
                    } catch (FileNotFoundException e1) {
                        e1.printStackTrace();
                    }
                }
            } 
            if (SupplierFile!=null && ProductFile!=null) {
                System.out.println("Creating Inventory File...");
                FileWriter InventoryFile = FilesUtilites.combine(SupplierFile, ProductFile); //combine supply and product file
                System.out.println("Finished Creating Inventory File.");
            } else if (SupplierFile==null && ProductFile==null){
                System.out.println("Cannot output Inventory file due to missing/invalid file(s).");
            }
        }
    }
    
    /*
     * Panel constructor. Lays out GUI elements then applies their listeners.
     */
    public Upload() {
        this.add(this.button);
        this.button.setFocusable(false);    
        this.button.addActionListener(new ButtonListener());

    }
}
package CP317;

import javax.swing.JFrame;

import java.awt.FlowLayout;

/**
 * Accept a Supply file and Product file to output an Inventory file
 */
public class MainClass {
  public static void main(String[] args) {
    final Upload view = new Upload(); //display panel
    
    // program to frame and add panel to it
    final JFrame f = new JFrame("Uploading Files");
    f.setContentPane(view);
    f.setSize(500, 500);
    f.setLocationRelativeTo(null);
    f.setLayout(new FlowLayout());
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.pack();
    f.setVisible(true);
  }  
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarycentre_package;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author b.villarini
 */
public class ItemTableGUI extends JFrame {
    
    JTable myTable;
    ItemTableModel tableModel;
    ArrayList<Item> itemList;
    
    // contructor
    public ItemTableGUI(ArrayList<Item> itemList){
        
        //set the title
        this.setTitle("Items in Westminster Library");
        
        // initialise and instantiate the instance variable 
        this.itemList = itemList;
        tableModel = new ItemTableModel(itemList);
        myTable =  new JTable(tableModel);
        
        // set the size of the frame 
        setBounds(20,20,800,600); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
        // sorting
        myTable.setAutoCreateRowSorter(true);
      
        // add the table to the panle
        JScrollPane scrollPane = new JScrollPane(myTable); 
        scrollPane.setPreferredSize(new Dimension(380,280)); 

        // add a button on the bottom
        JButton button = new JButton("Info");

        // Add the event handler (Action Listener)
        button.addActionListener(e -> {
            int bookCount = 0;
            int dvdCount = 0;
            int magazineCount = 0;

            // Loop through the list and check the type of each item
            for (Item item : itemList) {
                if (item instanceof Book) {
                    bookCount++;
                } else if (item instanceof DVD) {
                    dvdCount++;
                }
                // Note: Ensure you have a Magazine class defined in your project
        /* else if (item instanceof Magazine) {
            magazineCount++;
        } */
            }

            // Display the results in a popup dialog
            String message = "Total Books: " + bookCount +
                    "\nTotal DVDs: " + dvdCount +
                    "\nTotal Magazines: " + magazineCount;

            javax.swing.JOptionPane.showMessageDialog(this, message, "Library Info", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        });

        // add the panel to the frame
        add(scrollPane,BorderLayout.CENTER); 
        add(button, BorderLayout.SOUTH);
    }
  
        
    
}

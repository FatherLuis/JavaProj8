/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vargas_tamayo_advjava_proj5;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;
import javax.swing.JOptionPane;


/*
Class name: StoreItemShowGUI

Class Author: Luis E. Vargas Tamayo

Purpose of the class: Displays information of the Selected LinkedList

Date: 10/1/2017

List of changes with dates: none

Special Notes: none

*/ 
public class StoreItemShowGUI extends javax.swing.JDialog 
{
    LinkedList<Book> book;
    LinkedList<Movie> movie;
    LinkedList<Painting> painting;


    /*
    Method Name: StoreItemShowGUI()
    Purpose: creates GUI
    Parameter: java.awt.Frame parent, boolean modal
    Method Input: initComponents(),PropertyTitleSelect()
    Return Value: none
    Date: 10/1/2017
    */
    public StoreItemShowGUI(java.awt.Frame parent, boolean modal) 
    {
        super(parent, modal);
        initComponents();
        PropertyTitleSelect();

        Panel2.setVisible(false);
        CountPanel.setVisible(false);
       
        

        
      
    }
    
/////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////
 
    /*
    Method Name: setBook() 
    Purpose: receives a copy of the book linkList from StoreItemGUI
    Parameter: LinkedList
    Method Input:none
    Return Value: none
    Date: 10/1/2017
    */
    public void setBook(LinkedList book){this.book = book;};

    /*
    Method Name: setMovie() 
    Purpose: receives a copy of the movie linkList from StoreItemGUI
    Parameter: LinkedList
    Method Input:none
    Return Value: none
    Date: 10/1/2017
    */   
    public void setMovie(LinkedList movie){this.movie = movie;};

    /*
    Method Name: setPainting() 
    Purpose: receives a copy of the Painting linkList from StoreItemGUI
    Parameter: LinkedList
    Method Input:none
    Return Value: none
    Date: 10/1/2017
    */  
    public void setPainting(LinkedList painting){this.painting=painting;};
    
    /*
    Method Name: setGUITitle()
    Purpose: sets the title displayed on the GUI
    Parameter:  String
    Method Input: none
    Return Value: none
    Date: 10/1/2017
    */
    public void setGUITitle(String Title){lblTitle.setText(Title);}
    
    /*
    Method Name: setBtnName()
    Purpose: sets the name of the button Name
    Parameter: String
    Method Input:none 
    Return Value: none
    Date: 10/1/2017
    */
    public void setBtnName(String btn){this.btnShowItem.setText(btn);}
 
    /*
    Method Name:getLinkBook() 
    Purpose: retrieves the Linkbook from this GUI
    Parameter: none
    Method Input:none
    Return Value: LinkedList<T>
    Date: 10/1/2017
    */   
    public LinkedList<Book> getLinkBook(){return book;}
       
    /*
    Method Name:getLinkBook() 
    Purpose: retrieves the LinkMovie from this GUI
    Parameter: none
    Method Input:none
    Return Value: LinkedList<T>
    Date: 10/1/2017
    */  
    public LinkedList<Movie> getLinkMovie(){return movie;}
    
    /*
    Method Name:getLinkBook() 
    Purpose: retrieves the LinkPainting from this GUI
    Parameter: none
    Method Input:none
    Return Value: LinkedList<T>
    Date: 10/1/2017
    */  
    public LinkedList<Painting> getLinkPainting(){return painting;}
    
    /*
    Method Name: countPanel()
    Purpose: Show count of the number of objects in each Class
    Parameter:  int,int,int
    Method Input: none
    Return Value: none
    Date: 10/1/2017
    */ 
    
    public void countPanel(int bookCount,int movieCount, int paintingCount)
    {
        CountPanel.setVisible(true);
        
        
        lblBookCount.setText("Book(s): " + book.size());
        lblMovieCount.setText("Movie(s): "+ movie.size());
        lblPaintingCount.setText("Painting(s): " + painting.size());
    }
    

////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////    
    
    /*
    Method Name: PropertyTitleSelect()
    Purpose: set up for the choiceBox, adds the needed selection
    Parameter: none
    Method Input:none
    Return Value: none
    Date: 10/1/2017
    */ 
    private void PropertyTitleSelect()
    {
        chPropertyTitle.add("Selec Property Title...");
        chPropertyTitle.add("Book");
        chPropertyTitle.add("Movie");
        chPropertyTitle.add("Painting");
    }
 
    /*
    Method Name: showSelectControl()
    Purpose: shows the titles of the StoreItems in the selected LinkedList
    Parameter: none
    Method Input:none
    Return Value: none
    Date: 10/1/2017
    */ 
    private void showSelectControl()
    {
        chItemSelect.removeAll(); // deletes anything on the checkbox on Panel2
        
        if(chPropertyTitle.getSelectedIndex()!= 0) //if the selected Class is not empty, then run code
        {
            switch(chPropertyTitle.getSelectedItem()) //depending on the type selected, Panel2 will show up with the objects of the selected Class
            {
                
                case"Book":  //iterates through the LinkedList to get all objects stored
                    
                    if(book.size() > 0)
                    
                    {
                        ListIterator<Book> temp = book.listIterator();

                        do
                        {
                            chItemSelect.add(temp.next().getTitle());
                        
                        } while(temp.hasNext());
                    
                            Panel2.setVisible(true); 

                        
                    }
                    else //if no object exist, then message will pop you
                    {
                        JOptionPane.showMessageDialog(null, "There Are No Books");
                    
                    } 
                    break;
                    
                case"Movie":    //iterates through the LinkedList to get all objects stored
                    
                    if(movie.size()>0)
                    {
                    
                        ListIterator<Movie> temp1 = movie.listIterator();
                        do
                        {
                            chItemSelect.add(temp1.next().getTitle());
                        
                        } while(temp1.hasNext());
                    
                            Panel2.setVisible(true); 
                    }
                    else //if no object exist, then message will pop you
                    {
                        JOptionPane.showMessageDialog(null, "There Are No Movies");
                    }
                    

                    break;
                    
                case"Painting":  //iterates through the LinkedList to get all objects stored
                    
                    if(painting.size() > 0)
                    {
                    
                    
                    
                    ListIterator<Painting> temp3 = painting.listIterator();
                    do
                    {
                        chItemSelect.add(temp3.next().getTitle());
                        
                    } while(temp3.hasNext());
                    
                        Panel2.setVisible(true); 
                    }
                    else//if no object exist, then message will pop you
                    {
                        JOptionPane.showMessageDialog(null, "There Are No Paintings");   
                    }
                    break;
            }
        }
        else{Panel2.setVisible(false);}
        
    }
  
    /*
    Method Name: RegSetUp
    Purpose: Opens the Info GUI from the selected choice from the choice box
    Parameter: String, StoreItem
    Method Input: none
    Return Value: none
    Date: 10/1/2017
    */ 
    private void RegSetUp(String choice, StoreItem temp)
    {
        //InfoGUI will display the information of the selected object  from the linkedlist
        InfoGUI showGUI = new InfoGUI(null,true);
                        
        showGUI.setPanel2("Author name:",temp.getAuthor());
        
        showGUI.setPanel3("Date:",temp.getDateAcquired().getMonth(),temp.getDateAcquired().getDay(),temp.getDateAcquired().getYear());              
        showGUI.setPanel4("Price Acquired:",String.valueOf(temp.getPurchasePrice()));                             
        showGUI.setPanel5("Asking Price:",String.valueOf(temp.getAskingPrice()));   
        showGUI.setBtnName("Return");
        
        switch(choice)
        {
            case"Book":
                
                Book book = (Book) temp;
                
                showGUI.setTitle("Book: "+temp.getTitle());                            
                showGUI.setPanel6("Title of Book:",temp.getTitle());
                showGUI.setPanel7("Genre:",book.getGenre());
                break;
            case"Movie":
                
                Movie movie = (Movie) temp;
                
                showGUI.setTitle("Movie: "+ movie.getTitle());
                showGUI.setPanel6("Movie Title:",movie.getTitle());
                showGUI.setPanel7("Director name:",movie.getDirector());
                showGUI.setPanel8("Actor Names:",Arrays.toString(movie.getActors()));
                showGUI.setPanel9("Actresses Name:",Arrays.toString(movie.getActresses()));
                break;
            case"Painting":
                
                Painting painting = (Painting) temp;
                
                showGUI.setTitle("Painting: "+painting.getTitle());
                showGUI.setPanel6(" Painting Title:",painting.getTitle());
                showGUI.setPanel7(" height:",String.valueOf(painting.getHeight()));
                showGUI.setPanel8(" width:",String.valueOf(painting.getWidth()));
                showGUI.setPanel9(" media:",painting.getMedia()); 
                break;
                

        }
                      
        showGUI.setVisible(true);      
        //showGUI.setModal(true);
    
        
        

    }
   
    /*
    Method Name: showItem()
    Purpose: Gathers the information to create the GUI to display the information from selection 
    Parameter: none
    Method Input: regSetUp()
    Return Value: none
    Date: 10/1/2017
    */ 
    private void showItem()
    {
        boolean key= false;
        int i = 0;
        
        if(chPropertyTitle.getSelectedIndex()!= 0)
        {
            switch(chPropertyTitle.getSelectedItem())
            {
                case"Book":
                    
                    i=0;
                    ListIterator<Book> nextBook = book.listIterator();                   
                    Book temp = book.getFirst();
                        do
                        { 
                            if(i>0)
                            {
                                temp = nextBook.next();
                            }
                            if(chItemSelect.getSelectedItem().equals(temp.getTitle())) //iterates through te LinkedList until the selected object from the choice box is matched
                            {
                                key=true;
                                RegSetUp("Book",temp);
                            }
                            else
                            {
                                i++;
                            }
                            
                        }while(!(chItemSelect.getSelectedItem().equals(temp.getTitle())) && key!=true);

                    break;
                case"Movie":   
                    
                    i=0;
                    ListIterator<Movie> nextMovie = movie.listIterator();                   
                    Movie temp1 = movie.getFirst();
                        do
                        {
                                                        
                            if(i>0)
                            {
                                temp1 = nextMovie.next();
                            }
                            
                            
                            
                            if(chItemSelect.getSelectedItem().equals(temp1.getTitle())) //iterates through te LinkedList until the selected object from the choice box is matched
                            {
                                key=true;
                                RegSetUp("Movie",temp1);
                            }
                            else
                            {
                                i++;
                            }
                            
                        }while(!(chItemSelect.getSelectedItem().equals(temp1.getTitle())) && key!=true);
 

                    break;
                case"Painting": 

                    ListIterator<Painting> nextPainting = painting.listIterator();                   
                    Painting temp3 = painting.getFirst();
                    
                        i = 0;
                        do
                        {
                            if(i>0)
                            {
                                temp3 = nextPainting.next();
                            }
                            
                            if(chItemSelect.getSelectedItem().equals(temp3.getTitle()))//iterates through te LinkedList until the selected object from the choice box is matched
                            {
                                key=true;
                                RegSetUp("Painting",temp3);
                            }
                            else
                            {
                                 i++;
                            }
                            
                        }while(!(chItemSelect.getSelectedItem().equals(temp3.getTitle())) && key!=true);
 
        }
    
    
    
    }
    }
     
    /*
    Method Name: deleteItem()
    Purpose: Deletes selected Item from the LinkedList
    Parameter: none
    Method Input:none
    Return Value: none
    Date: 10/1/2017
    */   
    private void deleteItem()
    {
        boolean key=false;
        int i = 0;
        
        switch (chPropertyTitle.getSelectedItem())
        {
            case "Book":     
                i=0;
                        
                    ListIterator<Book> nextBook = book.listIterator();                   
                    Book temp = book.getFirst();
                        do
                        { 
                            if(i>0)
                            {
                                temp = nextBook.next();
                            }
                            
                            if(chItemSelect.getSelectedItem().equals(temp.getTitle())) //iterates through te LinkedList until the selected object from the choice box is matched
                            {
                                key=true;
                                book.remove(temp); //LinkedList looks for the object and deletes it from the Linkedlist
  
                            }
                            else
                            {
                                i++;
                            }
                            
                        }while(!(chItemSelect.getSelectedItem().equals(temp.getTitle())) && key!=true);

                break;
            case "Movie":
                 i=0;
                        
                    ListIterator<Movie> nextMovie = movie.listIterator();                   
                    Movie temp1 = movie.getFirst();
                        do
                        { 
                            if(i>0)
                            {
                                temp1 = nextMovie.next();
                            }
                            
                            if(chItemSelect.getSelectedItem().equals(temp1.getTitle()))//iterates through te LinkedList until the selected object from the choice box is matched
                            {
                                key=true;
                                movie.remove(temp1);//LinkedList looks for the object and deletes it from the Linkedlist
  
                            }
                            else
                            {
                                i++;
                            }
                            
                        }while(!(chItemSelect.getSelectedItem().equals(temp1.getTitle())) && key!=true);
                
                
                
                break;
            case "Painting":
                i=0;
                        
                    ListIterator<Painting> nextPainting = painting.listIterator();                   
                    Painting temp2 = painting.getFirst();
                        do
                        { 
                            if(i>0)
                            {
                                temp2 = nextPainting.next();
                            }
                            
                            if(chItemSelect.getSelectedItem().equals(temp2.getTitle()))//iterates through te LinkedList until the selected object from the choice box is matched
                            {
                                key=true;
                                painting.remove(temp2); //LinkedList looks for the object and deletes it from the Linkedlist
  
                            }
                            else
                            {
                                i++;
                            }
                            
                        }while(!(chItemSelect.getSelectedItem().equals(temp2.getTitle())) && key!=true);                
                
                break;
            default:
                //should never come here
        }
        
        this.setVisible(false);
    
    
    
    

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
 
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1 = new javax.swing.JPanel();
        Label1 = new javax.swing.JLabel();
        chPropertyTitle = new java.awt.Choice();
        lblTitle = new javax.swing.JLabel();
        Panel2 = new javax.swing.JPanel();
        chItemSelect = new java.awt.Choice();
        btnShowItem = new javax.swing.JButton();
        CountPanel = new javax.swing.JPanel();
        lblMovieCount = new javax.swing.JLabel();
        lblPaintingCount = new javax.swing.JLabel();
        lblBookCount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 800));

        Panel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Panel1.setPreferredSize(new java.awt.Dimension(950, 100));

        Label1.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        Label1.setText("Select Inventory");

        chPropertyTitle.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        chPropertyTitle.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chPropertyTitleItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(chPropertyTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(Label1, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(chPropertyTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Show Inventory");
        lblTitle.setBorder(new javax.swing.border.MatteBorder(null));

        chItemSelect.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N

        btnShowItem.setText("Show Item");
        btnShowItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(btnShowItem, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chItemSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(chItemSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(btnShowItem, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        lblMovieCount.setText("jLabel2");

        lblPaintingCount.setText("jLabel3");

        lblBookCount.setText("jLabel1");

        javax.swing.GroupLayout CountPanelLayout = new javax.swing.GroupLayout(CountPanel);
        CountPanel.setLayout(CountPanelLayout);
        CountPanelLayout.setHorizontalGroup(
            CountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CountPanelLayout.createSequentialGroup()
                .addComponent(lblBookCount, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(lblMovieCount, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPaintingCount, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        CountPanelLayout.setVerticalGroup(
            CountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblMovieCount, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblPaintingCount, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblBookCount, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Panel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CountPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(CountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    private void chPropertyTitleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chPropertyTitleItemStateChanged
        
        showSelectControl();
        
    }//GEN-LAST:event_chPropertyTitleItemStateChanged

    private void btnShowItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowItemActionPerformed
       
        if(btnShowItem.getText().equals("Show Item"))
        {
            showItem();     
        }
        else if(btnShowItem.getText().equals("Sell"))
        {
            deleteItem();
        }
        
        
        
    }//GEN-LAST:event_btnShowItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StoreItemShowGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StoreItemShowGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StoreItemShowGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StoreItemShowGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                StoreItemShowGUI dialog = new StoreItemShowGUI(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CountPanel;
    private javax.swing.JLabel Label1;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JButton btnShowItem;
    private java.awt.Choice chItemSelect;
    private java.awt.Choice chPropertyTitle;
    private javax.swing.JLabel lblBookCount;
    private javax.swing.JLabel lblMovieCount;
    private javax.swing.JLabel lblPaintingCount;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}

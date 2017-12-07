/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vargas_tamayo_advjava_proj5;


/*
Class name: InfoGUI

Class Author: Luis E. Vargas Tamayo

Purpose of the class: Multi-functional GUI, Can display information of a particular Object or Use to Create an Object of a particular type

Date: 10/1/2017

List of changes with dates: none

Special Notes: none

*/ 
import javax.swing.JOptionPane;


public class InfoGUI extends javax.swing.JDialog 
{
    private StoreItem item;


    /*
    Method Name: infoGUI
    Purpose: constructor to create GUI
    Parameter:java.awt.Frame parent, boolean modal
    Method Input: Super(), PropertyTitleSelect(), initComponents()
    Return Value: none
    Date: 10/1/2017
    */ 
    public InfoGUI(java.awt.Frame parent, boolean modal) 
    {
        super(parent, modal);
        initComponents();
        PropertyTitleSelect();
        
        Panel1.setVisible(false);
        Panel2.setVisible(false);
        Panel3.setVisible(false);
        Panel4.setVisible(false);
        Panel5.setVisible(false);
        Panel6.setVisible(false);
        Panel7.setVisible(false);
        Panel8.setVisible(false);
        Panel9.setVisible(false);
        
    }

    
//////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////
    
    /* 
    Purpose: Makes panels visible and displays label. Used For New Items
    Parameter: String
    Method Input: none
    Return Value:  none
    Date: 10/1/2017
    */ 
    public void setPanel1(String label)
    {
        setLabel1(label);
        Panel1.setVisible(true);
    } 
    public void setPanel2(String label)
    {
        setLabel2(label);
        Panel2.setVisible(true);
    }      
    public void setPanel3(String label)
    {
        setLabel3(label);
        Panel3.setVisible(true);
    }
    public void setPanel4(String label)
    {
        setLabel4(label);
        Panel4.setVisible(true);
    }
    public void setPanel5(String label)
    {
        setLabel5(label);
        Panel5.setVisible(true);
    }
    public void setPanel6(String label)
    {
        setLabel6(label);
        Panel6.setVisible(true);
    }
    public void setPanel7(String label)
    {
        setLabel7(label);
        Panel7.setVisible(true);
    }
    public void setPanel8(String label)
    {
        setLabel8(label);
        Panel8.setVisible(true);
    }
    public void setPanel9(String label)
    {
        setLabel9(label);
        Panel9.setVisible(true);
    
    }
    
/////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////// 
    
    /*
    Purpose: Displays the selected Panel with the label and text. Used for StoreItemShowGUI
    Parameter: String, String (Panel three has String,String,String,String)
    Method Input:none
    Return Value: none
    Date: 10/1/2017
    */ 
    public void setPanel2(String label, String txt)
    {
        setLabel2(label);
        Panel2.setVisible(true);
        txt2.setText(txt);
        txt2.setEditable(false);

    } 
    public void setPanel3(String label, String txt, String txt2, String txt3)
    {
        setLabel3(label);
        Panel3.setVisible(true);
        txtMonth.setText(txt); txtMonth.setEditable(false);
        txtDay.setText(txt2);  txtDay.setEditable(false);
        txtYear.setText(txt3); txtYear.setEditable(false);

    }
    public void setPanel4(String label, String txt)
    {
        setLabel4(label);
        Panel4.setVisible(true);
        txt4.setText(txt);
        txt4.setEditable(false);

    }
    public void setPanel5(String label, String txt)
    {
        setLabel5(label);
        Panel5.setVisible(true);
        txt5.setText(txt);
        txt5.setEditable(false);

    }
    public void setPanel6(String label, String txt)
    {
        setLabel6(label);
        Panel6.setVisible(true);
        txt6.setText(txt);
        txt6.setEditable(false);

    }
    public void setPanel7(String label, String txt)
    {
        setLabel7(label);
        Panel7.setVisible(true);
        txt7.setText(txt);
        txt7.setEditable(false);

    } 
    public void setPanel8(String label, String txt)
    {
        setLabel8(label);
        Panel8.setVisible(true);
        txt8.setText(txt);
        txt8.setEditable(false);
    }
    public void setPanel9(String label, String txt)
    {
        setLabel9(label);
        Panel9.setVisible(true);
        txt9.setText(txt);
        txt9.setEditable(false);
    }
    
 //////////////////////////////////////////////////////////////////////////   
    
    /*
    Purpose: Sets Labels by the given string
    Parameter: String
    Method Input: none
    Return Value:  none
    Date: 10/1/2017
    */ 
    
    private void setLabel1(String label){this.Label1.setText(label);}
    private void setLabel2(String label){this.Label2.setText(label);}
    private void setLabel3(String label){this.Label3.setText(label);}
    private void setLabel4(String label){this.Label4.setText(label);}
    private void setLabel5(String label){this.Label5.setText(label);}
    private void setLabel6(String label){this.Label6.setText(label);}
    private void setLabel7(String label){this.Label7.setText(label);}
    private void setLabel8(String label){this.Label8.setText(label);}
    private void setLabel9(String label){this.Label9.setText(label);}
    
//////////////////////////////////////////////////////////////////////////    
    
    /*
    Method Name: isNumeric()
    Purpose: Check if string is numeric, 
    Parameter: String
    Method Input:  none
    Return Value: boolean
    Date:  9/7/2017
    */   
    private boolean isNumeric(String term)
    {
        int intInteger=0; // default value of variable
        boolean blnKey = true; // boolean controller
        
        try // will try to parse the String to an Integer
        {
            intInteger = Integer.parseInt(term);
        } 
        catch(NumberFormatException ex) // if string is not an integer, the return will be false
        {
            blnKey = false;   
        }
       
        return blnKey;
    }
    
    /*
    Method Name:  PropertyTitleSelect()
    Purpose:  SetUp for the choice Box.
    Parameter: none
    Method Input:none
    Return Value: none
    Date: 10/1/2017
    */ 
    private void PropertyTitleSelect()
    {
        chPropertyTitle.add("Select Property Title...");
        chPropertyTitle.add("Book");
        chPropertyTitle.add("Movie");
        chPropertyTitle.add("Painting");
    }
 
    /*
    Method Name: unEditable()
    Purpose: Disable the ability to write on Part I of the TextBoxes
    Parameter: none
    Method Input:none
    Return Value: none
    Date: 10/1/2017
    */ 
    private void unEditale()
    {
        chPropertyTitle.setEnabled(false);
        txt2.setEditable(false);
        txtMonth.setEditable(false);
        txtDay.setEditable(false);
        txtYear.setEditable(false);
        txt4.setEditable(false);
        txt5.setEditable(false);

        
    
    }
//////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////
    
    /*
    Method Name: getObj()
    Purpose: Allows the outside GUI to retrieve the object created in this GUI
    Parameter: none
    Method Input:none
    Return Value: StoreItem
    Date: 10/1/2017
    */ 
    public StoreItem getObj()
    { 
        return item;
    }
    
    /*
    Method Name: setTitle
    Purpose: sets GUI Title
    Parameter: String
    Method Input:none
    Return Value: none
    Date: 10/1/2017
    */ 
    public void setTitle(String title){lblTitle.setText(title);}
        
    /*
    Method Name: setBtnName
    Purpose: sets the text of the btn
    Parameter: String
    Method Input: none
    Return Value: none
    Date: 10/1/2017
    */ 
    public void setBtnName(String name){ActButton.setText(name);}
    
///////////////////////////////////////////////////////////////////////////   
//////////////////////////////////////////////////////////////////////////
 
    /*
    Method Name: ExtendInfo()
    Purpose: opens more Panels for elected StoreItem to complete the creation of the object
    Parameter: none
    Method Input: none
    Return Value: none
    Date: 10/1/2017
    */ 
    private void ExtendInfo()
    {
        switch(chPropertyTitle.getSelectedItem())
        {
            case"Book":
                unEditale();

                setPanel6("Enter Title of Book:");
                setPanel7("Enter Genre:");
                Panel6.setVisible(true);
                Panel7.setVisible(true);
                
                
                
                
                break;
            case"Movie":
                
                unEditale();
                
                setPanel6("Enter Movie Title:");
                setPanel7("Enter Director name:");
                setPanel8("Enter number of Male Actors");
                setPanel9("Enter number of Female Actresses");
                
                Panel6.setVisible(true);
                Panel7.setVisible(true);
                Panel8.setVisible(true);
                Panel9.setVisible(true);                

                break;
            case"Painting":
                
                unEditale();
                
                setPanel6("Enter Painting Title:");
                setPanel7("Enter height:");
                setPanel8("Enter width:");
                setPanel9("Enter media:");
                
                Panel6.setVisible(true);
                Panel7.setVisible(true);                
                Panel8.setVisible(true);
                Panel9.setVisible(true);
                
                break;
            default:
        
        
        
        }
        
    
    
    }
    
    /*
    Method Name: isDate()
    Purpose: verifies Panel 3 textboxes are numeric
    Parameter: none
    Method Input: none
    Return Value: boolean
    Date: 10/1/2017
    */ 
    private boolean isDate()
    {
        boolean key = false;
        
        if(isNumeric(txtMonth.getText()) && isNumeric(txtDay.getText()) & isNumeric(txtYear.getText()))
        {
                    
            Date date= new Date(txtMonth.getText(),txtDay.getText(),txtYear.getText());
        
            if(date.validateDate())
            {
                key = true;
            }
        }
        
        return key;
    }
       
    /*
    Method Name: infoCheck()
    Purpose: Verifies information in the general section is correct
    Parameter: none
    Method Input: isDate(), isNumeric(),
    Return Value: boolean
    Date: 10/1/2017
    */ 
    private boolean infoCheck()
    {
        boolean key = false;
        
        if(chPropertyTitle.getSelectedIndex() != 0)
        {
            String dia =txtMonth.getText() +"/"+txtDay.getText()+"/"+txtYear.getText();
            
            if(isDate())
            {
                if(isNumeric(txt4.getText()))
                {
                    if(isNumeric(txt5.getText()))
                    {
                        key=true;
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Only numeric inputs are allowed for Asking Price"); 
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Only numeric inputs are allowed for Price Acquired");
                }
            
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Incorrect Date Format");

            }
        }
        else
        {
            key= false;
            JOptionPane.showMessageDialog(null,"Please select the item type");  
        }

        return key;
    }
    
    /*
    Method Name: infoCheckPartII()
    Purpose: Verifies information in the extended Info section is correct
    Parameter: none
    Method Input: isNumeric()
    Return Value: boolean
    Date: 10/1/2017
    */ 
    private boolean infoCheckPartII()
    {
        boolean key = false;
        switch(chPropertyTitle.getSelectedItem())
        {
            case"Book":
                
                if(!(txt6.getText().isEmpty()))
                {
                    if(!(txt7.getText().isEmpty()))
                    {
                        key=true;
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Please enter a genre for the book");
                    }
                
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Please enter A title for the book");
                }
                
                
                break;
            case"Movie":
                              
                if(!(txt6.getText().isEmpty()))
                {
                    if(!(txt7.getText().isEmpty()))
                    {
                        if(isNumeric(txt8.getText()))
                        {                                  
                            if(isNumeric(txt9.getText()))
                            {
                                key=true;
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null,"Please enter an integer for number of actresses");
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"Please enter an integer for number of actors");
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Please enter the name of the director of the movie");
                    }
                
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Please enter a title for the movie");
                }
                
                break;
            case"Painting":
                              
                if(!(txt6.getText().isEmpty()))
                {
                    if(isNumeric(txt7.getText()))
                    {
                        if(isNumeric(txt8.getText()))
                        {
                            if(!(txt9.getText().isEmpty()))
                            {
                                key=true;
                            }
                            else
                            {   
                                JOptionPane.showMessageDialog(null,"Please enter the media of the painting");
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"Please enter an integer for the width");
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Please enter an integer for the height");
                    }
                
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Please enter A title for the Painting");
                }
                

                break;
        
        
        
        
        
        }
    
    
    
    
        return key;
    }
        
    /*
    Method Name: control()
    Purpose: Controls how the button will work depending on the textname of the Button
    Parameter: none
    Method Input: infoCheck(), infoCheckPartII,
    Return Value: none
    Date: 10/1/2017
    */ 
    private void control()
    {
        if(ActButton.getText().equals("Continue"))
        {
            if(infoCheck()==true)
            {
                ActButton.setText("Create");
                ExtendInfo();
            }
        }
        else if(ActButton.getText().equals("Create"))
        {
            if(infoCheckPartII() == true)
            {
                
                    String author = txt2.getText();  
                    
                    Date dateAcquired = new Date(txtMonth.getText(),txtDay.getText(),txtYear.getText());
                    int purchasePrice = Integer.parseInt(txt4.getText());
                    int askingPrice = Integer.parseInt(txt5.getText());
            
                switch(chPropertyTitle.getSelectedItem())
                {
                    case "Book":
                    
                       String title=txt6.getText();
                       String genre = txt7.getText();
                    
                    
                    
                       item = new Book(title,author,dateAcquired,purchasePrice,askingPrice,genre);
                    
                        break;
                    case "Movie":
                    
                        String title2 = txt6.getText();
                    
                        String director = txt7.getText();
                                    
                        String[] actors= new String[Integer.parseInt(txt8.getText())];
                    
                        String[] actresses = new String[Integer.parseInt(txt9.getText())];
                        
                        int j=1;
                    
                        for(int i=0;i<Integer.parseInt(txt8.getText());i++)
                        {
                            actors[i]= JOptionPane.showInputDialog(null,j+". Enter male actor's name");
                            j++;
                        }
                    
                        j=1;
                        for(int i=0;i<Integer.parseInt(txt9.getText());i++)
                        {
                            actresses[i]= JOptionPane.showInputDialog(null,j+". Enter female actress name");
                            j++;
                        }
                    
                        item = new Movie(title2,author,dateAcquired,purchasePrice,askingPrice,director,actors,actresses);
                    
                        break;
                    case "Painting":
                    
                        String title1 = txt6.getText();
                        int height=Integer.parseInt(txt7.getText());
                        int width = Integer.parseInt(txt8.getText());
                        String media = txt9.getText();
                    
                        item = new Painting(title1,author,dateAcquired,purchasePrice,askingPrice,height,width,media);
                    
                        break;
            
                }
                
            
        
            }
            
            this.setVisible(false);
        }
        else if(ActButton.getText().equals("Return"))
        {
            this.dispose();
        }
    }
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Panel5 = new javax.swing.JPanel();
        Label5 = new javax.swing.JLabel();
        txt5 = new javax.swing.JTextField();
        Panel8 = new javax.swing.JPanel();
        Label8 = new javax.swing.JLabel();
        txt8 = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        ActButton = new javax.swing.JButton();
        Panel1 = new javax.swing.JPanel();
        Label1 = new javax.swing.JLabel();
        chPropertyTitle = new java.awt.Choice();
        Panel3 = new javax.swing.JPanel();
        Label3 = new javax.swing.JLabel();
        txtMonth = new javax.swing.JTextField();
        txtYear = new javax.swing.JTextField();
        txtDay = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Panel6 = new javax.swing.JPanel();
        Label6 = new javax.swing.JLabel();
        txt6 = new javax.swing.JTextField();
        Panel4 = new javax.swing.JPanel();
        Label4 = new javax.swing.JLabel();
        txt4 = new javax.swing.JTextField();
        Panel2 = new javax.swing.JPanel();
        Label2 = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        Panel7 = new javax.swing.JPanel();
        Label7 = new javax.swing.JLabel();
        txt7 = new javax.swing.JTextField();
        Panel9 = new javax.swing.JPanel();
        Label9 = new javax.swing.JLabel();
        txt9 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1050, 850));
        setSize(new java.awt.Dimension(1035, 1100));

        Panel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Panel5.setPreferredSize(new java.awt.Dimension(950, 50));

        Label5.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        Label5.setText("Label5");

        txt5.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N

        javax.swing.GroupLayout Panel5Layout = new javax.swing.GroupLayout(Panel5);
        Panel5.setLayout(Panel5Layout);
        Panel5Layout.setHorizontalGroup(
            Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel5Layout.createSequentialGroup()
                .addComponent(Label5, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel5Layout.setVerticalGroup(
            Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel5Layout.createSequentialGroup()
                .addGroup(Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7))
        );

        Panel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Panel8.setPreferredSize(new java.awt.Dimension(950, 50));

        Label8.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        Label8.setText("Label8");

        txt8.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N

        javax.swing.GroupLayout Panel8Layout = new javax.swing.GroupLayout(Panel8);
        Panel8.setLayout(Panel8Layout);
        Panel8Layout.setHorizontalGroup(
            Panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel8Layout.createSequentialGroup()
                .addComponent(Label8, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        Panel8Layout.setVerticalGroup(
            Panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(Label8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Title");
        lblTitle.setBorder(new javax.swing.border.MatteBorder(null));

        ActButton.setText("Action Button");
        ActButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActButtonActionPerformed(evt);
            }
        });

        Panel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Panel1.setPreferredSize(new java.awt.Dimension(950, 50));

        Label1.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        Label1.setText("Label1");
        Label1.setMinimumSize(null);

        chPropertyTitle.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chPropertyTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Label1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chPropertyTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        Panel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Panel3.setPreferredSize(new java.awt.Dimension(950, 50));

        Label3.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        Label3.setText("Label3");

        txtMonth.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N

        txtYear.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N

        txtDay.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel1.setText("/");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel2.setText("/");

        javax.swing.GroupLayout Panel3Layout = new javax.swing.GroupLayout(Panel3);
        Panel3.setLayout(Panel3Layout);
        Panel3Layout.setHorizontalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel3Layout.createSequentialGroup()
                .addComponent(Label3, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(txtMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel3Layout.setVerticalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(Label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel1)
                .addComponent(jLabel2))
        );

        Panel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Panel6.setPreferredSize(new java.awt.Dimension(950, 50));

        Label6.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        Label6.setText("Label6");

        txt6.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N

        javax.swing.GroupLayout Panel6Layout = new javax.swing.GroupLayout(Panel6);
        Panel6.setLayout(Panel6Layout);
        Panel6Layout.setHorizontalGroup(
            Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel6Layout.createSequentialGroup()
                .addComponent(Label6, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel6Layout.setVerticalGroup(
            Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(Label6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Panel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Panel4.setPreferredSize(new java.awt.Dimension(950, 50));

        Label4.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        Label4.setText("Label4");

        txt4.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N

        javax.swing.GroupLayout Panel4Layout = new javax.swing.GroupLayout(Panel4);
        Panel4.setLayout(Panel4Layout);
        Panel4Layout.setHorizontalGroup(
            Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel4Layout.createSequentialGroup()
                .addComponent(Label4, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel4Layout.setVerticalGroup(
            Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel4Layout.createSequentialGroup()
                .addGroup(Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        Panel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Panel2.setPreferredSize(new java.awt.Dimension(950, 50));

        Label2.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        Label2.setText("Label2");

        txt2.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        txt2.setPreferredSize(new java.awt.Dimension(28, 43));

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addComponent(Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label2)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        Panel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Panel7.setPreferredSize(new java.awt.Dimension(950, 50));

        Label7.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        Label7.setText("Label7");

        txt7.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N

        javax.swing.GroupLayout Panel7Layout = new javax.swing.GroupLayout(Panel7);
        Panel7.setLayout(Panel7Layout);
        Panel7Layout.setHorizontalGroup(
            Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel7Layout.createSequentialGroup()
                .addComponent(Label7, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel7Layout.setVerticalGroup(
            Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel7Layout.createSequentialGroup()
                .addGroup(Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7))
        );

        Panel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Panel9.setPreferredSize(new java.awt.Dimension(950, 50));

        Label9.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        Label9.setText("Label9");

        txt9.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N

        javax.swing.GroupLayout Panel9Layout = new javax.swing.GroupLayout(Panel9);
        Panel9.setLayout(Panel9Layout);
        Panel9Layout.setHorizontalGroup(
            Panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel9Layout.createSequentialGroup()
                .addComponent(Label9, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel9Layout.setVerticalGroup(
            Panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(Label9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Panel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)
                            .addComponent(Panel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)
                            .addComponent(Panel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)
                            .addComponent(Panel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)
                            .addComponent(Panel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)
                            .addComponent(Panel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)
                            .addComponent(Panel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)
                            .addComponent(Panel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)
                            .addComponent(Panel9, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ActButton, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(328, 328, 328))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(Panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ActButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ActButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActButtonActionPerformed

        control();
        
    }//GEN-LAST:event_ActButtonActionPerformed

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
            java.util.logging.Logger.getLogger(InfoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InfoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InfoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InfoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InfoGUI dialog = new InfoGUI(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton ActButton;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JLabel Label4;
    private javax.swing.JLabel Label5;
    private javax.swing.JLabel Label6;
    private javax.swing.JLabel Label7;
    private javax.swing.JLabel Label8;
    private javax.swing.JLabel Label9;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel3;
    private javax.swing.JPanel Panel4;
    private javax.swing.JPanel Panel5;
    private javax.swing.JPanel Panel6;
    private javax.swing.JPanel Panel7;
    private javax.swing.JPanel Panel8;
    private javax.swing.JPanel Panel9;
    private javax.swing.ButtonGroup buttonGroup1;
    private java.awt.Choice chPropertyTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt7;
    private javax.swing.JTextField txt8;
    private javax.swing.JTextField txt9;
    private javax.swing.JTextField txtDay;
    private javax.swing.JTextField txtMonth;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}

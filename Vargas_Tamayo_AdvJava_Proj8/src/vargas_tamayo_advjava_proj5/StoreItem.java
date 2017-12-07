/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vargas_tamayo_advjava_proj5;

import java.io.Serializable;


/*
Class name: StoreItem

Class Author: Luis E. Vargas Tamayo

Purpose of the class:  Super Class contains variables and methods that Child Class Need

Date: 10/1/2017

List of changes with dates: none

Special Notes: none

*/ 
public class StoreItem implements Serializable
{
    protected static int itemCount;
    protected String title;
    protected String author;
    protected Date dateAcquired; 
    protected int purchasePrice;
    protected int askingPrice;
    
    
    
    /*
    Method Name: getTitle()
    Purpose: gets title
    Parameter: none
    Method Input: none
    Return Value: String
    Date: 10/1/2017
    */  
    public String getTitle(){return title;}

    /*
    Method Name: setTitle()
    Purpose: set title
    Parameter: String
    Method Input: none
    Return Value: none
    Date: 10/1/2017
    */     
    public void setTitle(String title){this.title=title;}

    /*
    Method Name: getAuthor
    Purpose:gets auhtor
    Parameter: none
    Method Input: none
    Return Value: String
    Date: 10/1/2017
    */     
    public String getAuthor(){return author;}

    /*
    Method Name: setAuthor()
    Purpose: set author
    Parameter: string
    Method Input: none
    Return Value:  none
    Date: 10/1/2017
    */    
    public void setAuthor(String author){this.author=author;}
    
    /*
    Method Name: getDateAcquired()
    Purpose: gets Date
    Parameter: none
    Method Input: none
    Return Value:n Date
    Date: 10/1/2017
    */ 
    public Date getDateAcquired(){return dateAcquired;}

    /*
    Method Name: setDateAcquired()
    Purpose: set DateAcquired()
    Parameter:  Date
    Method Input: none
    Return Value: none
    Date: 10/1/2017
    */   
    public void setDateAcquired(Date dateAcquired){this.dateAcquired = dateAcquired;}
    
     /*
    Method Name: getPurchasePrice()
    Purpose: get Purchase Price
    Parameter: none
    Method Input: none
    Return Value: int
    Date: 10/1/2017
    */ 
    public int getPurchasePrice(){return purchasePrice;}
 
    /*
    Method Name: setPurchasePrice()
    Purpose: sets purchase Price
    Parameter: int
    Method Input: none
    Return Value: none
    Date: 10/1/2017
    */
    public void setPurchasePrice(int purchasePrice){this.purchasePrice = purchasePrice;}
    
    /*
    Method Name: getAskingPrice()
    Purpose: get Asking Price
    Parameter: none
    Method Input: none
    Return Value: int
    Date: 10/1/2017
    */ 
    public int getAskingPrice(){return askingPrice;}
       
    /*
    Method Name: setAskingPrice
    Purpose: sets Asking Price
    Parameter: int
    Method Input: none
    Return Value: none
    Date: 10/1/2017
    */ 
    public void setAskingPrice(int askingPrice){this.askingPrice = askingPrice;}
    

 
       
    /*
    Method Name: remove()
    Purpose: none
    Parameter: none
    Method Input: none
    Return Value: none
    Date: 10/1/2017
    */       
    public void remove()
    {             
    }
    

    
    
    
    
    
    
    
    
    
}

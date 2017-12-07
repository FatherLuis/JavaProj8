/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vargas_tamayo_advjava_proj5;

import java.io.Serializable;


/*
Class name: Painting

Class Author: Luis E. Vargas Tamayo

Purpose of the class: Allows for the creation of an object Painting

Date: 10/1/2017

List of changes with dates: none

Special Notes: none

*/ 
public class Painting extends StoreItem implements Serializable
{
    protected static int paintingCount;
    private int height;
    private int width;
    private String media;
    
    /*
    Method Name: Painting()
    Purpose: Class Constructor
    Parameter: String,String,Date,int ,int , int , int , String 
    Method Input: none
    Return Value: none
    Date: 10/1/2017
    */
    public Painting(String title,String author,Date dateAcquired,int purchasePrice,int askingPrice, int height, int width, String media)
    {
        this.title = title;
        this.author = author;
        this.dateAcquired = dateAcquired;
        this.purchasePrice = purchasePrice;
        this.askingPrice = askingPrice;
        
        this.height= height;
        this.width = width;
        this.media = media;
    }

    /*
    Method Name: Painting()
    Purpose: Class Constructor
    Parameter: none
    Method Input: none
    Return Value: none
    Date: 10/1/2017
    */ 
    public Painting()
    {      
        this.title = title;
        this.author = author;
        this.dateAcquired = dateAcquired;
        this.purchasePrice = purchasePrice;
        this.askingPrice = askingPrice;
        
        this.height= height;
        this.width = width;
        this.media = media;
    }
    
    /*
    Method Name: getHeight()
    Purpose: gets height
    Parameter: none
    Method Input:none 
    Return Value: int
    Date: 10/1/2017
    */        
    public int getHeight(){return height;}
     /*
    Method Name: setheight()
    Purpose: sets height
    Parameter:  int
    Method Input: none
    Return Value: none 
    Date: 10/1/2017
    */  
    public void setHeight(int height){this.height = height;}
        
    /*
    Method Name: getWidth()
    Purpose: gets width
    Parameter: none
    Method Input: none
    Return Value: int
    Date: 10/1/2017
    */
    public int getWidth(){return width;}
        
    /*
    Method Name: setWidth() 
    Purpose: Sets width
    Parameter: int
    Method Input: none
    Return Value: none
    Date: 10/1/2017
    */
    public void setWidth(int width){this.width = width;}
       
    /*
    Method Name: getMedia()
    Purpose: gets media
    Parameter: none
    Method Input: none
    Return Value: none
    Date: 10/1/2017
    */
    public String getMedia(){return media;}
     
    /*
    Method Name: setMedia
    Purpose: sets media
    Parameter: none
    Method Input: none
    Return Value: none
    Date: 10/1/2017
    */
    public void setMedia(String media){this.media = media;}
  
    /*
    Method Name: remove()
    Purpose: none
    Parameter: none
    Method Input: none
    Return Value: none
    Date: 10/1/2017
    */   
    public void remove(){}
    
 
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vargas_tamayo_advjava_proj5;

import java.io.Serializable;


/*
Class name: Book

Class Author: Luis E. Vargas Tamayo

Purpose of the class: Allows for the creation of an object Book

Date: 10/1/2017

List of changes with dates: none

Special Notes: none

 */
public class Book extends StoreItem implements Serializable
{

    protected static int bookCount;
    private String title;
    private String genre;

    
    /*
    Method Name: Book
    Purpose: constructor
    Parameter: Strin,String,Date,int,int,String
    Method Input: 
    Return Value: 
    Date: 10/1/2017
    */   
    public Book(String title, String author, Date dateAcquired, int purchasePrice, int askingPrice, String genre) {
        //super();

        this.title = title;
        this.author = author;
        this.dateAcquired = dateAcquired;
        this.purchasePrice = purchasePrice;
        this.askingPrice = askingPrice;
        this.genre = genre;
    }

    /*
    Method Name: getBookCount()
    Purpose: get Book Count
    Parameter: none
    Method Input: none
    Return Value:  int
    Date: 10/1/2017
    */  
    public int getBookCount() {
        return bookCount;
    }
    
    /*
    Method Name: setBookCount
    Purpose: set book count
    Parameter: int
    Method Input:  none
    Return Value: none
    Date: 10/1/2017
    */  
    public void setBookCount(int BookCount) {
        this.bookCount = BookCount;
    }
   
    /*
    Method Name: getTitle()
    Purpose: gets title
    Parameter: none
    Method Input: none
    Return Value: String
    Date: 10/1/2017
    */   
    public String getTitle() {
        return title;
    }
   
    /*
    Method Name: setTitle
    Purpose:  sets title
    Parameter:  String
    Method Input: none
    Return Value:  none
    Date: 10/1/2017
    */  
    public void setTitle(String title) {
        this.title = title;
    }
    
    /*
    Method Name: getGenre()
    Purpose: gets genre
    Parameter: none
    Method Input: none
    Return Value: String
    Date: 10/1/2017
    */  
    public String getGenre() {
        return genre;
    }
    
    /*
    Method Name: setGenre
    Purpose: sets genre
    Parameter: String
    Method Input: none
    Return Value: none
    Date: 10/1/2017
    */  
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    /*
    Method Name: remove()
    Purpose: none
    Parameter: none
    Method Input: none
    Return Value: none
    Date: 10/1/2017
    */ 
    public void remove() 
    {}


}

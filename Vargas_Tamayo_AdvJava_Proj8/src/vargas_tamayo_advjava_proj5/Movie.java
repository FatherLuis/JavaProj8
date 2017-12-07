/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vargas_tamayo_advjava_proj5;

import java.io.Serializable;

/*
Class name: Movie

Class Author: Luis E. Vargas Tamayo

Purpose of the class: Allows for the creation of an object Movie

Date: 10/1/2017

List of changes with dates: none

Special Notes: none

*/ 
public class Movie extends StoreItem implements Serializable
{
    protected static int movieCount;
    private String title;
    private String director;
    private String[] actors;
    private String[] actresses;
    
    /*
    Method Name: movie()
    Purpose: constructor
    Parameter: String title,String author,Date dateAcquired,int purchasePrice,int askingPrice,String director,String[] actors,String[] actresses
    Method Input: none
    Return Value: none
    Date: 10/1/2017
    */   
    public Movie(String title,String author,Date dateAcquired,int purchasePrice,int askingPrice,String director,String[] actors,String[] actresses)
    {
        this.title = title;
        this.dateAcquired= dateAcquired;
        this.purchasePrice= purchasePrice;
        this.askingPrice = askingPrice;
        this.author = author;
        
        
        this.title = title;
        this.director=director;
        this.actors = actors;
        this.actresses=actresses;
    }
    
    
    /*
    Method Name: movie()
    Purpose: constructor
    Parameter: none
    Method Input: none
    Return Value: none
    Date: 10/1/2017
    */      
    public Movie()
    {
        this.title = title;
        this.dateAcquired= dateAcquired;
        this.purchasePrice= purchasePrice;
        this.askingPrice = askingPrice;
        
        
        this.title = title;
        this.director=director;
        this.actors = actors;
        this.actresses=actresses;
    }
    
    /*
    Method Name: getMovieCount()
    Purpose: gets movie count
    Parameter: none
    Method Input: none
    Return Value: int
    Date: 10/1/2017
    */  
    public int getMovieCount(){return movieCount;}
        
    /*
    Method Name: setMovieCount()
    Purpose: sets movie count
    Parameter: int
    Method Input: none
    Return Value: none
    Date: 10/1/2017
    */  
    public void setMovieCount(int movieCount){this.movieCount= movieCount;}
    
    
    /*
    Method Name: getTitle()
    Purpose: get title
    Parameter: none
    Method Input: none
    Return Value: String
    Date: 10/1/2017
    */  
    public String getTitle(){return title;}
    
    /*
    Method Name:  setTitle()
    Purpose: sets title
    Parameter: String
    Method Input: none
    Return Value: 
    Date: 10/1/2017
    */  
    @Override
    public void setTitle(String title){this.title=title;}
    
    /*
    Method Name: setDirector
    Purpose: gets director
    Parameter: none
    Method Input: none
    Return Value: String
    Date: 10/1/2017
    */  
    public String getDirector(){return director;}
    
    /*
    Method Name: setDirector
    Purpose: sets director
    Parameter: none
    Method Input: none
    Return Value: 
    Date: 10/1/2017
    */      
    public void setDirector(String director){this.director=director;}
  
    /*
    Method Name: getActors
    Purpose: gets actors
    Parameter: none
    Method Input: none
    Return Value: String[]
    Date: 10/1/2017
    */      
    public String[] getActors(){return actors;}
    
     /*
    Method Name: setActors
    Purpose: sets actresses
    Parameter: none
    Method Input: none
    Return Value:  String[]
    Date: 10/1/2017
    */     
    public void setActors(String[] actors){this.actors=actors;}
 
    /*
    Method Name: getAcctresses
    Purpose: gets Acresses
    Parameter: none
    Method Input: none
    Return Value:  String[]
    Date: 10/1/2017
    */     
    public String[] getActresses(){return actresses;}
    
    /*
    Method Name: setActresses 
    Purpose: setactresses
    Parameter: String[]
    Method Input: none
    Return Value: none
    Date: 10/1/2017
    */      
    public void setActresses(String[] actresses){this.actresses=actresses;}
    
    
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

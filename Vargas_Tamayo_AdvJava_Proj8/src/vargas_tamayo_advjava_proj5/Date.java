/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vargas_tamayo_advjava_proj5;

import java.io.Serializable;

/*
Class name: Date

Class Author: Luis E. Vargas Tamayo

Purpose of the class: Creates a Date Object that stores date

Date: 10/1/2017

List of changes with dates: none

Special Notes: none

*/ 
public class Date implements Serializable
{
    private String month;
    private String day;
    private String year;
    
    private int numDays;
    

    /*
    Method Name: Date
    Purpose: constructor
    Parameter: String, String, String
    Method Input:none
    Return Value: none
    Date: 10/1/2017
    */ 
    public Date(String month, String day, String year)
    {
        this.month = month.trim();
        this.day = day.trim();
        this.year = year.trim();
        
    }
    
    @Override
    public String toString()
    {
        return month + "/" + day + "/" + year;
    }
    
    /*
    Method Name: getMonth()
    Purpose: gets month
    Parameter:none
    Method Input:none
    Return Value: String
    Date: 10/1/2017
    */ 
    public String getMonth(){return month;}
   
    /*
    Method Name: getDay()
    Purpose:  gets day
    Parameter: none
    Method Input:none
    Return Value:  String
    Date: 10/1/2017
    */ 
    public String getDay(){return day;}
       
    /*
    Method Name: getYear()
    Purpose: gets year
    Parameter: none
    Method Input: none
    Return Value: String
    Date: 10/1/2017
    */ 
    public String getYear(){return year;}
    
    
//////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////
    
    /*
    Method Name: ValidateDate()
    Purpose: Validates the date of the Date object
    Parameter:none
    Method Input: changeIntMonthToString(),ValidateDayOfMonth(),changeStringMonthToInt()
    Return Value: 
    Date: 10/1/2017
    */ 
    public boolean validateDate()
    {
        boolean key = false;
        
        if(Integer.parseInt(year)>=1 && Integer.parseInt(year)<=9999)
        {
            changeIntMonthToString();
        
            if(Integer.parseInt(year)%4==0)
            {
                if(month.equals("February")){numDays++;}
            }

            if(validateDayOfMonth() == true)
            {
                key=true;
            }
        
            changeStringMonthToInt();
        }

        return key;
    }
     
    /*
    Method Name: validateDayOfMonth
    Purpose: Validates that the day is acceptable in the month selected
    Parameter: none
    Method Input: none
    Return Value: boolean 
    Date: 10/1/2017
    */ 
    private boolean validateDayOfMonth()
    {
        boolean key = false;
        
        if(Integer.parseInt(day)>=1 && Integer.parseInt(day)<=numDays)
        {
            key =true;      
        } 
        return key;      
    }
       
    /*
    Method Name: changeIntMonthToString()
    Purpose: change the numeric value of a month to a name String
    Parameter:none
    Method Input:none
    Return Value: none
    Date: 10/1/2017
    */ 
    private void changeIntMonthToString()
    {
        if(Integer.parseInt(month)==1)
        {
            this.month= "January";
            numDays =31;
        }
        else if(Integer.parseInt(month)==2)
        {
            this.month= "February";
            numDays =28;
        }
        else if(Integer.parseInt(month)==3)
        {
            this.month= "March";
            numDays =31;
        }
        else if(Integer.parseInt(month)==4)
        {
            this.month= "April";
            numDays =30;
        }
        else if(Integer.parseInt(month)==5)
        {
            this.month= "May";
            numDays =31;
            
        }
        else if(Integer.parseInt(month)==6)
        {
            this.month= "June";
            numDays =30;
            
        }
        else if(Integer.parseInt(month)==7)
        {
            this.month= "July";
            numDays =31;
        }
        else if(Integer.parseInt(month)==8)
        {
            this.month= "August";
            numDays =31;
        }
        else if(Integer.parseInt(month)==8)
        {
            this.month= "September";
            numDays =30;
        }
        else if(Integer.parseInt(month)==10)
        {
            this.month= "Octuber";
            numDays =31;
        }
        else if(Integer.parseInt(month)==11)
        {
            this.month= "November";
            numDays =30;
        }
        else if(Integer.parseInt(month)==12)
        {
            this.month= "December";
            numDays =31;
        }
        else
        {
            this.month="0";
            numDays=0;
        }
    }
      
    /*
    Method Name: changeStringMonthToInt
    Purpose: changes String month to its numeric equivalent
    Parameter:none
    Method Input:none
    Return Value: none
    Date: 10/1/2017
    */ 
    private void changeStringMonthToInt()
    {    
        switch(month)
        {
            case "January":
                month ="1";
                break;
            case "February":
                month ="2";                
                break;
            case "March":
                month ="3";                
                break;
            case "April":
                month ="4";                
                break; 
            case "May":
                month ="5";                
                break;
            case "June":
                month ="6";                
                break;
            case "July":
                month ="7";                
                break;        
            case "August":
                month ="8";                
                break;
            case "September":
                month ="9";                
                break;
            case "Octuber":
                month ="10";                
                break;            
            case "November":
                month ="11";                
                break;
            case "December":
                month ="12";   
                break;
        }
    }

}

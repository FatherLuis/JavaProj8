/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vargas_tamayo_advjava_proj5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author fathe
 */
public class mySQL 
{
    static final String DATABASE_URL = "jdbc:sqlserver://CTASV20R2DRW.tamuct.edu;databaseName=INVENTORY;user=Luisvargas;password=Tamayo005;";
    
    
    public void DelSQL(StoreItem obj)
    {
        System.out.println("I am running");
        
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //Driver d = (Driver)Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver").newInstance();
            //connection = DriverManager.getConnection(DATABASE_URL,"TestClass","Pinzgauer11");
            connection = DriverManager.getConnection(DATABASE_URL);  
            
            System.out.println("I am ready to DELETE");
            
            statement = (Statement)connection.createStatement();
            
            String deleteAllB = "DELETE FROM INVENTORY.db_owner.TableBook";
            statement.execute(deleteAllB);
            
            String deleteAllM = "DELETE FROM INVENTORY.db_owner.TableMovie";
            statement.execute(deleteAllM);
            
            String deleteAllP = "DELETE FROM INVENTORY.db_owner.TablePainting";
            statement.execute(deleteAllP);
        }
        catch(SQLException ex)
        {
            System.out.println("SQL Exception   " + ex.getMessage());
        }
       catch (ClassNotFoundException ex) {
           System.out.println("Class Not Found  "+ ex.getMessage());
       }

        finally
        {
            try
            {
                connection.close(); 
                System.out.println("Successful Deletion");
            }
            catch(Exception ex)
            {
                System.out.println("Close;");
            }
        }        
    }
    
    public void writeSQL(StoreItem obj)
    {
        System.out.println("I am running");
        
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //Driver d = (Driver)Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver").newInstance();
            //connection = DriverManager.getConnection(DATABASE_URL,"TestClass","Pinzgauer11");
            connection = DriverManager.getConnection(DATABASE_URL);  
            
            System.out.println("I am connected and Ready to Write");
            
            statement = (Statement)connection.createStatement();
                  
            String insert;
            
            switch (obj.getClass().getSimpleName()) //name  of the Obj Class will be received and compared to store the Obj in the right LinkedList
            {     
                case "Book":
                    
                    Book objBook = (Book)obj;
                    
                    String BTitle = "'" + objBook.getTitle() + "'";
                    String BAuthor = "'" + objBook.getAuthor() + "'";
                    String BDateAcquired = "'" + objBook.getDateAcquired().toString() + "'";   
                    int BPurchasePrice = objBook.getPurchasePrice();
                    int BAskingPrice = objBook.getAskingPrice();
                    String BGenre = "'" + objBook.getGenre() + "'";
                    
                    //INVENTORY IS MY DATABASE; TABLEBOOK IS MY TABLE; THE NAMES IN THE PARANTHESIS ARE THE NAME OF MY COLUMNS;
                    insert = "INSERT INTO INVENTORY.db_owner.TableBook(Title,Author,DateAcquired,PurchasePrice,AskingPrice,Genre) "
                            + "VALUES(" + BTitle + "," + BAuthor + "," + BDateAcquired + "," +BPurchasePrice + "," + BAskingPrice + "," + BGenre + ");";
                    
                    statement.executeUpdate(insert);
            
                    System.out.println("Book Sucessful");
                    break;
                    
                case "Movie":
                    
                    Movie objMovie = (Movie)obj;
                    
                    String MTitle = "'" + objMovie.getTitle() + "'";
                    String MAuthor = "'" + objMovie.getAuthor() + "'";
                    String MDateAcquired = "'" + objMovie.getDateAcquired().toString() + "'";   
                    int MPurchasePrice = objMovie.getPurchasePrice();
                    int MAskingPrice = objMovie.getAskingPrice();
                    String MDirector = "'" + objMovie.getDirector() + "'";
                    String MActor = "'" + objMovie.getActors() + "'";
                    String MActress = "'" + objMovie.getActresses() + "'";
                    
                    //INVENTORY IS MY DATABASE; TABLEBOOK IS MY TABLE; THE NAMES IN THE PARANTHESIS ARE THE NAME OF MY COLUMNS;
                    insert = "INSERT INTO INVENTORY.db_owner.TableMovie(Title,Author,DateAcquired,PurchasePrice,AskingPrice,Director,Actor,Actress) "
                            + "VALUES(" + MTitle + "," + MAuthor + "," + MDateAcquired + "," +MPurchasePrice + "," + MAskingPrice + "," + MDirector + "," + MActor + "," + MActress + ");";
                    
                    statement.executeUpdate(insert);
            
                    System.out.println("Movie Sucessful");                   
                    
                    
                    
                    
                        

                    break;
                case "Painting":
                    
                    Painting objPainting = (Painting)obj;
                    
                    String PTitle = "'" + objPainting.getTitle() + "'";
                    String PAuthor = "'" + objPainting.getAuthor() + "'";
                    String PDateAcquired = "'" + objPainting.getDateAcquired().toString() + "'";   
                    int PPurchasePrice = objPainting.getPurchasePrice();
                    int PAskingPrice = objPainting.getAskingPrice();
                    int PHeight = objPainting.getHeight();
                    int PWidth = objPainting.getWidth();
                    String PMedia = "'" + objPainting.getMedia() + "'";
                    
                    //INVENTORY IS MY DATABASE; TABLEBOOK IS MY TABLE; THE NAMES IN THE PARANTHESIS ARE THE NAME OF MY COLUMNS;
                    insert = "INSERT INTO INVENTORY.db_owner.TablePainting(Title,Author,DateAcquired,PurchasePrice,AskingPrice,Height,Width,Media) "
                            + "VALUES(" + PTitle + "," + PAuthor + "," + PDateAcquired + "," +PPurchasePrice + "," + PAskingPrice + "," + PHeight + "," +PWidth + "," + PMedia +");";
                    
                    statement.executeUpdate(insert);
            
                    System.out.println("Painting Sucessful");
                    break;                    
                    
                                       

                default:
                
            }
            
            
            
                
            
        }
        catch(SQLException ex)
        {
            System.out.println("SQL Exception   " + ex.getMessage());
        }
       catch (ClassNotFoundException ex) {
           System.out.println("Class Not Found  "+ ex.getMessage());
       }

        finally
        {
            try
            {

                connection.close();
                
                System.out.println("Successful Run");
            }
            catch(Exception ex)
            {
                System.out.println("Close;");
            }
        }
    }
    
    public ArrayList loadSQL()
    {   
        ArrayList<StoreItem> arrStore = new ArrayList();
        
        System.out.println("I am running");
        
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        ResultSetMetaData metaData = null;
        int numberOfColumns;
        StoreItem obj;
        
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(DATABASE_URL);  
            
            System.out.println("I am connected and ready to Load Data");
            statement = (Statement)connection.createStatement();
                  
            String LOADQUERY;
            
            
            ///////////////////////////////////////////////////////// ADD BOOK
            
            LOADQUERY = "SELECT Title,Author,DateAcquired,PurchasePrice,AskingPrice,Genre FROM TableBook";
            resultSet = statement.executeQuery(LOADQUERY);
            metaData = resultSet.getMetaData();
            numberOfColumns = metaData.getColumnCount();
            
            
            while(resultSet.next())
            {
                String BTitle = null;
                String BAuthor = null;
                Date BDateAcq = null;
                int BPurchasePrice = 0;
                int BAskPrice = 0;
                
                Book bObj = null;
                
                String BGenre = null;

                
                for(int i =1; i <= numberOfColumns ; i++)
                {
                    switch(i)
                    {
                        case 1: System.out.println(i+ ". " + resultSet.getObject(i).toString().trim() ); BTitle = resultSet.getObject(i).toString().trim();break;
                        case 2: System.out.println(i+ ". " + resultSet.getObject(i).toString().trim() ); BAuthor = resultSet.getObject(i).toString().trim(); break;
                        case 3: System.out.println(i+ ". " + resultSet.getObject(i).toString().trim()); BDateAcq = strToDate(resultSet.getObject(i).toString().trim());break;
                        case 4: System.out.println(i+ ". " + resultSet.getObject(i).toString().trim()); BPurchasePrice = Integer.parseInt(resultSet.getObject(i).toString().trim());break;
                        case 5: System.out.println(i+ ". " + resultSet.getObject(i).toString().trim()); BAskPrice = Integer.parseInt(resultSet.getObject(i).toString().trim()); break;
                        case 6: System.out.println(i+ ". " + resultSet.getObject(i).toString().trim()); BGenre = resultSet.getObject(i).toString().trim();break;
                    }
                    
                    bObj = new Book(BTitle,BAuthor,BDateAcq,BPurchasePrice,BAskPrice,BGenre);
     
                }
                
                arrStore.add(bObj);
                
            }
            
        
            
            
            
        }
        catch(SQLException ex)
        {
            System.out.println("SQL Exception   " + ex.getMessage());
        }
       catch (ClassNotFoundException ex) {
           System.out.println("Class Not Found  "+ ex.getMessage());
       }

        finally
        {
            try
            {

                connection.close();
                
                System.out.println("Successful Run");
            }
            catch(Exception ex)
            {
                System.out.println("Close;");
            }
        }
        
        return arrStore;
    }
    
    private Date strToDate(String date)
    
    {
        
        String temp = "";
        
        String[] laDate = new String[3];
        
        int j = 0;
        
        System.out.println("LENGTH: " + date.length());
        
        for(int i = 0; i < date.length(); i++)
        {
            System.out.println(Character.toString(date.charAt(i)));
            
            if(!Character.toString(date.charAt(i)).equals("/"))
            {
                System.out.println("Iteration : " + i);
                temp += Character.toString(date.charAt(i));
            }
            else if(Character.toString(date.charAt(i)).equals("/"))
            {
                System.out.println("EXCEPT: "+i);
                laDate[j] = temp;
                temp = "";
                j++;
            }
            
            if(i == date.length()-1)
            {
                j++;
                
                laDate[j] = temp ;
            
            }
        
        }
        
        System.out.println(laDate[0] + " " + laDate[1] +" "+ laDate[2]);
        
        Date elDate = new Date(laDate[0],laDate[1],laDate[2]);
        
        return elDate;

    }
    
    
    
    
}

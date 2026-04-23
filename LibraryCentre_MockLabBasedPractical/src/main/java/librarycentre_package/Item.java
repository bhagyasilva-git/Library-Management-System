/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarycentre_package;

public abstract class Item {
    
    //attributes - instance variables
    private String title;
    private String ISBN;
    private int publicationYear;

    // constructor
    public Item(String title, String ISBN) {
        this.title = title;
        this.ISBN = ISBN;
    }

    //get set methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    
    // description of the object
    @Override
    public String toString(){
        return "Title: " + title + ", ISBN = " + ISBN + ", publication year: " + publicationYear; 
    }
    
}

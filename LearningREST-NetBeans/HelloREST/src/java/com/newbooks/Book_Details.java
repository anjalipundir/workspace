/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newbooks;

import java.util.HashMap;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

/**
 * REST Web Service
 *
 * @author sony
 */
@Path("books")
public class Book_Details {
    HashMap<Integer, Book> hmap;
    
    public Book_Details() {
        hmap = new HashMap<Integer,Book>();
        int i = 1001;
        hmap.put(i, new Book(i, "Kite Runner", "Khaled Hosseini"));
        hmap.put(++i, new Book(i, "Alchemist", ""));
        hmap.put(++i, new Book(i, "Long Walk To Remember", "Nalson Mandela"));
    }
    
    @GET
    @Produces("text/plain")
    public String getText() {
        return "Hello";
    }
    /*
    @GET
    @Path("details")
    @Produces("text/plain")
    public String getText1(@PathParam("details") String details) {
        Book book = (Book)hmap.get(1002);
        return "Book_Details.getText1: I have read :"+book.getName();
    }
    */
    /*
    @GET
    @Path("{bookId}")
    @Produces("text/plain")
    public String getText2(@PathParam("bookId") int ID) {
        Book book = (Book)hmap.get(ID);
        return "Book_Details.getText2: I have read :"+book.getName();
    }
    */
    @GET
    @Path("{bookId}")
    @Produces("text/plain")
    public String getText3(@PathParam("bookId") int ID) { //,@QueryParam("who") String name) {
        Book book = (Book)hmap.get(ID);
        //return "Book_Details.getText2: "+ name +" has read :"+book.getName();
        return "Book_Details.getText2: has read :"+book.getName();
    }
    
    @PUT
    @Consumes("text/plain")
    public void putText(String content) {
    }
}

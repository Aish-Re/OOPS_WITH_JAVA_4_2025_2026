package com.library.service;

import com.library.books.Book;
import com.library.exception.*;
import java.io.*;

public class LibraryService {

    String file = "books.txt";

    public void addBook(Book b) {

        try {
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(b.getBookId() + "," + b.getTitle() + "," + b.getAuthor() + "," + b.getAvailableCopies());
            bw.newLine();

            bw.close();

            System.out.println("Book added successfully");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void viewBooks() {

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            String line;

            while ((line = br.readLine()) != null) {
                String data[] = line.split(",");

                System.out.println("ID: " + data[0] +
                        " Title: " + data[1] +
                        " Author: " + data[2] +
                        " Copies: " + data[3]);
            }

            br.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void issueBook(int bookId)
            throws BookNotFoundException, BookNotAvailableException {

        System.out.println("Book issued with ID: " + bookId);
    }

    public void returnBook(int bookId)
            throws BookNotFoundException {

        System.out.println("Book returned with ID: " + bookId);
    }
}
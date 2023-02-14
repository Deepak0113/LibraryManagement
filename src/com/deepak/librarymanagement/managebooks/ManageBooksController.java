package com.deepak.librarymanagement.managebooks;

public class ManageBooksController {
    private ManageBooksView manageBooksView;
    private ManageBooksModel manageBooksModel;

    ManageBooksController(ManageBooksView manageBooksView){
        this.manageBooksView = manageBooksView;
        manageBooksModel = new ManageBooksModel(this);
    }

    public void addBook(String bookName, String bookId) {
        manageBooksModel.addBook(bookName, bookId);
    }

    public void bookAlreadyExist() {
        manageBooksView.bookAlreadyExist();
    }

    public void bookSuccessfullyAdded() {
        manageBooksView.bookSuccessfullyAdded();
    }

    public void removeBook(String bookId) {
        manageBooksModel.removeBook(bookId);
    }

    public void bookSuccessfullyRemoved() {
        manageBooksView.bookSuccessfullyRemoved();
    }

    public void bookDoesNotExist() {
        manageBooksView.bookDoesNotExist();
    }
}

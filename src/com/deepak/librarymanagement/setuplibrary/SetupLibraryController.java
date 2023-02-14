package com.deepak.librarymanagement.setuplibrary;

public class SetupLibraryController {
    private SetupLibraryView setupLibraryView;
    private SetupLibraryModel setupLibraryModel;

    SetupLibraryController(SetupLibraryView setupLibraryView){
        this.setupLibraryView = setupLibraryView;
        setupLibraryModel = new SetupLibraryModel(this);
    }

    public void addLibrary(String name, String address){
        setupLibraryModel.addLibrary(name, address);
    }

    public void librarySuccessfullyAdded() {
        setupLibraryView.librarySuccessfullyAdded();
    }

    public void libraryAlreadyExist() {
        setupLibraryView.libraryAlreadyExist();
    }
}

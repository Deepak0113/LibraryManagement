package com.deepak.librarymanagement.setuplibrary;

import java.util.HashMap;

public class SetupLibraryModel {
    private SetupLibraryController setupLibraryController;
    private HashMap<String, String> libraryMap = new HashMap<>();

    SetupLibraryModel(SetupLibraryController setupLibraryController){
        this.setupLibraryController = setupLibraryController;
    }

    public void addLibrary(String name, String address){
        if(libraryMap.containsKey(name)){
            setupLibraryController.libraryAlreadyExist();
        } else{
            libraryMap.put(name, address);
            setupLibraryController.librarySuccessfullyAdded();
        }
    }

}

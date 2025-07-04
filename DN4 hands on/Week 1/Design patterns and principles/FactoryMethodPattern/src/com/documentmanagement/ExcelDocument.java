package com.documentmanagement;

public class ExcelDocument implements IDocument {
    @Override
    public void open() {
        System.out.println("Opening Excel document.");
    }

    @Override
    public void save() {
        System.out.println("Saving Excel document.");
    }

    @Override
    public void close() {
        System.out.println("Closing Excel document.");
    }
}
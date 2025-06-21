package com.documentmanagement;

public class DocumentSystemTest {
    public static void main(String[] args) {
        System.out.println("--- Document Management System ---");

        DocumentFactory wordCreator = new WordDocumentFactory();
        IDocument docWord = wordCreator.createDocument();
        System.out.println("Processing Word Document:");
        docWord.open();
        docWord.save();
        docWord.close();
        System.out.println();

        DocumentFactory pdfCreator = new PdfDocumentFactory();
        IDocument docPdf = pdfCreator.createDocument();
        System.out.println("Processing PDF Document:");
        docPdf.open();
        docPdf.save();
        docPdf.close();
        System.out.println();

        DocumentFactory excelCreator = new ExcelDocumentFactory();
        IDocument docExcel = excelCreator.createDocument();
        System.out.println("Processing Excel Document:");
        docExcel.open();
        docExcel.save();
        docExcel.close();
        System.out.println();
    }
}
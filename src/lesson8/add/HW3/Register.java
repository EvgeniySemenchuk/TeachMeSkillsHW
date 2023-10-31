package lesson8.add.HW3;

import java.util.Date;

public abstract class Register {
    private String numberOfDocument;
    private Date dateOfDocument;
    private static Register[] documents = new Register[10];

    Register(String numberOfDocument,Date dateOfDocument) {
        this.numberOfDocument = numberOfDocument;
        this.dateOfDocument =dateOfDocument;
    }

    Register(){}

    public static Register[] getDocuments() {
        return documents;
    }

    public static void setDocuments(Register[] documents) {
        Register.documents = documents;
    }

    public String getNumberOfDocument() {
        return numberOfDocument;
    }

    public void setNumberOfDocument(String numberOfDocument) {
        this.numberOfDocument = numberOfDocument;
    }

    public Date getDateOfDocument() {
        return dateOfDocument;
    }

    public void setDateOfDocument(Date dateOfDocument) {
        this.dateOfDocument = dateOfDocument;
    }

    public abstract void SaveDocument();

    public abstract void InfoAboutDocument(Register register);


}

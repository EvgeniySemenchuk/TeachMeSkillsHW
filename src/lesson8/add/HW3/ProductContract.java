package lesson8.add.HW3;

import java.util.Date;

public class ProductContract extends Register{
    private String typeOfProduct;
    private int amountOfProduct;

    public String getTypeOfProduct() {
        return typeOfProduct;
    }

    public void setTypeOfProduct(String typeOfProduct) {
        this.typeOfProduct = typeOfProduct;
    }

    public int getAmountOfProduct() {
        return amountOfProduct;
    }

    public void setAmountOfProduct(int amountOfProduct) {
        this.amountOfProduct = amountOfProduct;
    }

    ProductContract(){
        super();
    }

    public ProductContract(String numberOfDocument, Date dateOfDocument, String typeOfProduct, int amountOfProduct) {
        super(numberOfDocument, dateOfDocument);
        this.typeOfProduct = typeOfProduct;
        this.amountOfProduct = amountOfProduct;
    }

    @Override
    public void SaveDocument() {
        for (int i = 0; i < getDocuments().length; i++) {
            if (getDocuments()[i] == null) {
                getDocuments()[i] = this;
            }
        }
    }

    @Override
    public void InfoAboutDocument(Register register) {
        System.out.println("Информация о контракте продукта");
        System.out.println("Тип продукта " + getTypeOfProduct());
        System.out.println("Номер контракта " + register.getNumberOfDocument());
        System.out.println("Дата контракта " + register.getDateOfDocument());
        System.out.println("Количество продукта " + getAmountOfProduct() );
    }



}

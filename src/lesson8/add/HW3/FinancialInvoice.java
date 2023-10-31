package lesson8.add.HW3;

import java.util.Date;

public class FinancialInvoice extends Register{
    private String codeOfDepartment;
    private float monthSum;

    public String getCodeOfDepartment() {
        return codeOfDepartment;
    }

    public void setCodeOfDepartment(String codeOfDepartment) {
        this.codeOfDepartment = codeOfDepartment;
    }

    public float getMonthSum() {
        return monthSum;
    }

    public void setMonthSum(float monthSum) {
        this.monthSum = monthSum;
    }

    public FinancialInvoice(String numberOfDocument, Date dateOfDocument, String codeOfDepartment, float monthSum) {
        super(numberOfDocument, dateOfDocument);
        this.codeOfDepartment = codeOfDepartment;
        this.monthSum = monthSum;
    }

    public FinancialInvoice() {
        super();
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
        System.out.println("Информация о финансовой накладной");
        System.out.println("Итоговая сумма за месяц " + getMonthSum());
        System.out.println("Номер контракта " + register.getNumberOfDocument());
        System.out.println("Дата контракта " + register.getDateOfDocument());
        System.out.println("Код департамента " + getCodeOfDepartment());
    }


}

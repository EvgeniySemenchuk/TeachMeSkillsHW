package lesson8.add.HW3;

import java.util.Date;

public class EmployeeContract extends Register{
    private Date endDateOfContract;
    private String nameOfEmpoyee;

    public Date getEndDateOfContract() {
        return endDateOfContract;
    }

    public void setEndDateOfContract(Date endDateOfContract) {
        this.endDateOfContract = endDateOfContract;
    }

    public String getNameOfEmpoyee() {
        return nameOfEmpoyee;
    }

    public void setNameOfEmpoyee(String nameOfEmpoyee) {
        this.nameOfEmpoyee = nameOfEmpoyee;
    }

    EmployeeContract(Date dateOfContract, String numberOfContract, Date endDateOfContract, String nameOfEmpoyee) {
        super(numberOfContract,dateOfContract);
        this.endDateOfContract = endDateOfContract;
        this.nameOfEmpoyee = nameOfEmpoyee;
    }

    EmployeeContract(){
        super();
    }



    @Override
    public void InfoAboutDocument(Register register) {
        System.out.println("Информация о контракте сотрудника");
        System.out.println("Имя сотрудника " +getNameOfEmpoyee());
        System.out.println("Номер контракта " + register.getNumberOfDocument());
        System.out.println("Дата контракта " + register.getDateOfDocument());
        System.out.println("Да конца контракта " + getEndDateOfContract());

    }

    @Override
    public void SaveDocument() {
        for (int i = 0; i < getDocuments().length; i++) {
            if (getDocuments()[i]==null) {
                getDocuments()[i] = this;
            }
        }
    }
}

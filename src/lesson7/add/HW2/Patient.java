package lesson7.add.HW2;

public class Patient {
    private TreatmentPlan plan;

    public Patient(TreatmentPlan plan) {
        this.plan = plan;
    }

    public void planOfTreatmanet(int code, Therapist therapist, Surgeon surgeon, Dentist dentist) {
        if(code==1) {
            System.out.println("План лечения назначен");
            surgeon.treat();
        }
        if(code==2) {
            System.out.println("План лечения назначен");
            dentist.treat();
        }
        else {
            System.out.println("План лечения назначен");
            therapist.treat();
        }

    }

    public TreatmentPlan getPlan() {
        return plan;
    }

    public void setPlan(TreatmentPlan plan) {
        this.plan = plan;
    }
}

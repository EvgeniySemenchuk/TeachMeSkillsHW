package lesson7.add.HW2;

public class Main {
    public static void main(String[] args) {
        Surgeon surgeon = new Surgeon();
        Dentist dentist = new Dentist();
        Therapist therapist = new Therapist();
        Patient patient1 = new Patient(new TreatmentPlan(2));
        patient1.planOfTreatmanet(patient1.getPlan().getPlanCode(), therapist,surgeon,dentist);
    }
}

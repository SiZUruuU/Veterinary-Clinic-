package Src;
public class Treatment_Calc{

    double kg, MGperKG;
    double age;

    public double calculateMg(double kg, double MGperKG, double age){
        this.kg = kg;
        this.age = age;
        this.MGperKG = MGperKG;

        return kg * MGperKG / age; //incorrect calculations but filler
    }
}
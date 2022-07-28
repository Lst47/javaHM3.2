public class BmiService {
    public double calculate(int mass, int height) {
        double indexM;
        indexM = mass / ((height * height) * 0.0001);
        return indexM;


    }
}

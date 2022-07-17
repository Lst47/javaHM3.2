import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 70;
        int height = 170;
        double index = service.calculate(mass,height);
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println(df.format(index));
    }
}

public class Main {

    public static void main(String[] args) {
        double height = 1.65;
        double weight = 45.5;
        double BMI = (weight / height / height);
        double bmi = ((double)Math.round(BMI * 100))/100;

        System.out.println(bmi);    
}
}


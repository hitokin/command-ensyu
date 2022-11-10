import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        for(int i = 0; i < 2; i++){
        Scanner sc = new Scanner(System.in);
        System.out.println("身長を入力してください。");
        double height = sc.nextDouble();
        System.out.println("体重を入力してください。");
        double weight = sc.nextDouble();
        double BMI = (weight / height / height);
        double bmi = ((double)Math.round(BMI * 100))/100;

        System.out.println(bmi);   } 
}
}




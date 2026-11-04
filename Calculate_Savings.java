public class Calculate_Savings {
    static double savings(double saving_goal) {

        double monthly_saving = saving_goal / 12.0;
        return monthly_saving;
    }

    public static void main(String[] args) {
        double saving_amount = savings(1000);
        System.out.println(saving_amount);
    }
}

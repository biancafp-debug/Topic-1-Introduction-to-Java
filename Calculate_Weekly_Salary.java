public class Calculate_Weekly_Salary {
    static double weekly_salary(double hours_worked, double base_salary) {
        double extra_pay = 10 * hours_worked;
        double total_weekly_salary = base_salary + extra_pay;
        return total_weekly_salary;

    }
    public static void main(String[] args) {
        double total = weekly_salary(47.9, 500.0);
        System.out.println(total);
        
    }
}

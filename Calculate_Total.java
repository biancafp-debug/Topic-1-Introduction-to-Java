public class Calculate_Total {
    public static void main(String[] args) {
        int total_items=6;
        float cost_item=20;

        float subtotal = total_items + cost_item;
        double tax = subtotal * 0.08;
        double total_cost = subtotal + tax;

        System.out.println("The total cost after taxes is " + total_cost);
    }
    
}

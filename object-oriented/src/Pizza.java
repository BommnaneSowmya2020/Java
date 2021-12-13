import java.util.ArrayList;

public class Pizza {
	private double totalOrderCost;
	private final ArrayList<Pizza> pizzas;
	public Pizza(ArrayList<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public void calculateTotalOrderCost() {
        final double Small_Cost = 200;
        final double Medium_Cost = 150;
        final double Large_Cost = 100;
        final double COST_PER_TOPPING = 25;

        for (Pizza pizza : pizzas) {
            switch (pizza.getSize()) {
                case "Large":
                    totalOrderCost += Small_Cost;
                    break;
                case "Medium":
                    totalOrderCost += Medium_Cost;
                    break;
                case "Small":
                    totalOrderCost += Large_Cost;
                    break;
                default:
                    totalOrderCost += 0.0;
                    break;
            }

            int totalToppings = pizza.getToppings().size();
            totalOrderCost += totalToppings * COST_PER_TOPPING;
        }
    }

   
	

	public double getTotalOrderCost() {
        return totalOrderCost;
    }

    public void printOrderSummary() {
        for (Pizza pizza : pizzas) {
            System.out.println("Ordered a " + pizza.getSize() + " pizza with " +    pizza.getToppings());
        }
        System.out.println("TOTAL ORDER AMOUNT: " + getTotalOrderCost());
    }

	private String getSize() {
		
		return null;
	}
}



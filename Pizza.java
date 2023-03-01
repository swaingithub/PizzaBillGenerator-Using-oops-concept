package PizaBill;

// import java.sql.RowId;

public class Pizza {
    private int price;

    private Boolean veg;
    private int extraCheesePrice=100;
    private int extraToppingPrice=150;
    private int bagpackPrice=20;
    private int basePizzaPrice;

    private boolean isExtraCheeseAdded=false;

    private boolean isExtraToppingAdded=false;

    private boolean OptedForTakeaway=false;


    
    public Pizza(Boolean veg) {
        this.veg=veg;
        if(this.veg){
            this.price=300;
        }else{
           this.price=400;
        }
        basePizzaPrice=this.price;
    }

    public void addExtraCheese() 
    {
        isExtraCheeseAdded=true;
        System.out.println("Extra Cheese added");
        this.price+=extraCheesePrice;
    }

    public void addExtraTopping()
    {
        isExtraToppingAdded=true;
        System.out.println("Extra Topping added");
        this.price+=extraToppingPrice;
    }

    public void takeAway()
    {
        OptedForTakeaway=true;   
        System.out.println("take away Option");
        this.price+=bagpackPrice;   
    }
    public void getBill()
    {
        String bill=" ";
        System.out.println("pizza: "+basePizzaPrice);
       if (isExtraCheeseAdded) {
        bill += "Extara cheese added: " + extraCheesePrice+"\n";
       }
       if (isExtraToppingAdded) {
        bill += "Extara Topping added: " + extraToppingPrice+"\n";
       }
       if (OptedForTakeaway) {
        bill += "Take away: " +bagpackPrice+"\n";
       }
       bill+="Bill: "+this.price+"\n";
       System.out.println(bill);
    }
    
}

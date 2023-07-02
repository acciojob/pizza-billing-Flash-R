package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean extraCheese;
    private boolean extraToppings;
    private boolean takeAway;

    public void setPrice(int price) {
        this.price = price;
    }

    public Boolean getVeg() {
        return isVeg;
    }

    public void setVeg(Boolean veg) {
        isVeg = veg;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
//        a flag to track if cheese are needed
        this.extraCheese = false;
//        a flag to track if extra toppings are needed
        this.extraToppings = false;
        this.takeAway = false;
//        set prices accordingly
        if(this.isVeg){
            this.price = 300;
        }else this.price = 400;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // add extra cheese only if it is not already there
        if(!this.extraCheese){
            this.price += 80; //add the price for cheese
            this.extraCheese = true; // flag on the cheese so that they are added again
        }
    }

    public void addExtraToppings(){
        if(!this.extraToppings){
            if(this.isVeg)
                this.price += 70;
            else
                this.price += 120;
            this.extraToppings = true;
        }
    }

    public void addTakeaway(){
        if(!this.takeAway){
            this.price += 20; //add the price of paper bag
            this.takeAway = true;
        }

    }

    public String getBill(){
//        create a string builder to hold my bill
        StringBuilder bill = new StringBuilder();
        if(this.isVeg)
            bill.append("Base Price Of The Pizza: 300 \n");
        else
            bill.append("Base Price Of The Pizza: 400\n");
        if(this.extraCheese)
            bill.append("Extra Cheese Added: 80\n");
        if(this.extraCheese && this.isVeg)
            bill.append("Extra Topping Added: 70\n");
        if(this.extraCheese && !this.isVeg)
            bill.append("Extra Topping Added: 120\n");
        if(takeAway)
            bill.append("Paperbag Added: 20\n");

        bill.append("Total Price: " + this.price +"\n");
        this.bill = bill.toString();
        return this.bill;
    }
}

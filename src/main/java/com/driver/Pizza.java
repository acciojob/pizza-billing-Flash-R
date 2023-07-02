package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private Boolean extraCheese;
    private Boolean extraToppings;
    private Boolean takeAway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.extraCheese = false;
        this.extraToppings = false;
        this.takeAway = false;
        if(isVeg)
            this.price = 300;
        else
            this.price = 400;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!this.extraCheese){
            this.price += 80;
            this.extraCheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!this.extraToppings){
            if(this.isVeg)
                this.price += 70;
            else
                this.price += 120;
            this.extraToppings = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!this.takeAway)
            this.price += 20;
        this.takeAway = true;
    }

    public String getBill(){
        StringBuilder sb = new StringBuilder();

        if(this.isVeg) {
            sb.append("Base Price Of The Pizza: 300\n");
        } else {
            sb.append("Base Price Of The Pizza: 400\n");
        }

        if(this.extraCheese)
            sb.append("Extra Cheese Added: 80\n");

        if(this.extraToppings && this.isVeg)
            sb.append("Extra Toppings Added: 70\n");
        if(this.extraToppings && !this.isVeg)
            sb.append("Extra Toppings Added: 120\n");

        if(takeAway)
            sb.append("Paperbag Added: 20\n");

        sb.append("Total Price: "+this.price+"\n");
        this.bill = sb.toString();
        return this.bill;
    }
}
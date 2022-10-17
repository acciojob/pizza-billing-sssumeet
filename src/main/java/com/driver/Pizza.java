package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean extraCheese;
    private int extraCheesePrice;

    private boolean extraToppings;
    private int extraToppingsPrice;

    private boolean paperBagRequired;
    private int paperBagPrice;

    private boolean isBillCredited;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.extraCheese = false;
        this.extraToppings = false;
        this.paperBagRequired = false;
        this.isBillCredited = false;
        this.extraCheesePrice = 80;
        this.paperBagPrice = 20;

        if(isVeg){
            this.price = 300;
            this.extraToppingsPrice = 70;
        }else{
            this.price = 400;
            this.extraToppingsPrice = 120;
        }

        this.bill = "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!extraCheese){
            this.bill = this.bill + "Extra Cheese Added: "+this.extraCheesePrice+"\n";
            this.price = this.price+this.extraCheesePrice;
            this.extraCheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!extraToppings){
            this.bill = this.bill + "Extra Toppings Added: "+this.extraToppingsPrice+"\n";
            this.price = this.price+this.extraToppingsPrice;
            this.extraToppings = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!paperBagRequired){
            this.bill = this.bill + "Paperbag Added: "+this.paperBagPrice+"\n";
            this.price = this.price + this.paperBagPrice;
            this.paperBagRequired = true;

        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillCredited){
            this.bill = this.bill + "Total Price: "+this.price+"\n";
            this.isBillCredited = true;
        }
        return this.bill;
    }
}

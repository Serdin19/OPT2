package com.gamesgo;

public class Korting{

    private int klantMaanden;
    private int positieveReview;
    private int gekochteProduct;

    public Korting(int klantMaanden, int positieveReview, int gekochteProduct) {
        this.klantMaanden = klantMaanden;
        this.positieveReview = positieveReview;
        this.gekochteProduct = gekochteProduct;
    }

    @Override
    public String toString() {
        return "Klant{" +
                "klantMaanden=" + klantMaanden +
                ", positieveReview=" + positieveReview +
                ", gekochteProduct=" + gekochteProduct +
                '}';
    }

    public boolean geefKortingControle() {
        if (klantMaanden > 12 && positieveReview > 0){
            return true;
        }else
            return false;
    }

    public int korting60Maanden(){
        int price = 5;

        if(klantMaanden == 60){
            return price *5;
        }else
            return price;
    }

    public int reviewsGegeven(){
        int kortingReview = 10;

        if(positieveReview > 0){
            return kortingReview;
        }else return 0;
    }

    public double geldPerAangeschafteProduct(){
        double geldNaAanschaffing = 0.5;
        double resultaat = gekochteProduct * geldNaAanschaffing;
        return resultaat;
        }

    public  double allDiscounts() {
        return korting60Maanden() + geldPerAangeschafteProduct();
    }
    }


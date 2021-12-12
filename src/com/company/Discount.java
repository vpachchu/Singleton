package com.company;

public class Discount {
    private static Discount discount;

    private Discount() {

    }

    public static Discount getDiscount(String shop, int price) {

        if (discount == null) {
            synchronized (Discount.class) {
                if (discount == null) {
                    discount = new Discount();
                    System.out.println(" Christmas Offer at " + shop + " is LKR " + price);
                }
            }
        }
    return discount;}
}
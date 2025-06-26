package org.example.service;

import org.example.Checkout;
import org.example.data.Item;

import java.util.ArrayList;

public class CartService implements Checkout {
    ArrayList<Item> itemsList;

    public CartService() {itemsList = new ArrayList<>();}

    public void addItem(Item item) {
        itemsList.add(item);
    }

//unit test this method
    public Item removeItem(int index, int amount) {
        int newQuantity;
        newQuantity = itemsList.get(index).getQuantity() - amount;
        if (newQuantity <=0) {
            itemsList.remove(index);
            return null;
        } else {
            itemsList.get(index).setQuantity(newQuantity);
            return itemsList.get(index);
        }
    }

    public ArrayList<Item> getItemsList() {return new ArrayList<>(itemsList);}

    @Override
    public double checkOut() {
        double totalCost = 0.00;
        for (Item item : itemsList) {
            totalCost += item.getQuantity() * item.getPrice();
        }
        return totalCost;
    }

}

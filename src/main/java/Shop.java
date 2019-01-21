import behaviours.ISell;

import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<ISell> stock;
    private double till;

    public Shop(String name, double till) {
        this.name = name;
        this.stock = new ArrayList<>();
        this.till = 100;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public String getName() {
        return name;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addStockItem(ISell stockItem){
        stock.add(stockItem);
    }

    public void removeStockItem(ISell stockItem){
        stock.remove(stockItem);
        double getItemMoney =

    }

    public int countStock(){
        return stock.size();
    }

    public double getTotalProfit() {
       double totalProfit = 0;
        for (ISell item:stock) {
         totalProfit += item.calculateMarkUp();
        }
        return totalProfit;
    }
}

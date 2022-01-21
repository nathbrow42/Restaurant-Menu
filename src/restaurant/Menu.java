package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> itemList;
    private Date lastUpdatedDate = new Date();

    public ArrayList<MenuItem> getItemList() {
        return itemList;
    }
    public void setItemList(ArrayList<MenuItem> aItemList) {
        itemList = aItemList;
    }
    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }
    public void setLastUpdatedDate(Date newDate) {
        lastUpdatedDate = newDate;
    }

    public void addMenuItem (MenuItem item) {
        itemList.add(item);
    }

    public void removeMenuItem (String itemName) {
        for (int i = 0; i < itemList.size(); i++) {
            String menuItemName = itemList.get(i).getName();
            if (itemName == menuItemName) {
                itemList.remove(i);
                break;
            }
        }
        printFullMenu();
    }

    public void printFullMenu() {
        for (int i = 0; i < itemList.size(); i++) {
            printMenuItem(i);
        }
    }
    public void printMenuItem(int i) {
        System.out.println(i+1 + ". " + itemList.get(i).getName() + " - $" +itemList.get(i).getPrice() + "\n" + itemList.get(i).getDescription());
    }

}

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
}

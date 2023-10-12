package store;

import filter.SearchFilter;
import flower.Item;

import java.util.ArrayList;
import java.util.List;

public class  Store {
    private final List<Item> avaliableItems = new ArrayList<>();
    public List<Item>  search(SearchFilter filter) 
    {
        List<Item> suitableGoods = new ArrayList<>();
        for (Item goods:avaliableItems) 
            if (filter.match(goods))
                suitableGoods.add(goods);
        return suitableGoods;
    }
    public int getNumberOfItems() 
    {
        return  this.avaliableItems.size();
    }
    public void addItem(Item item) 
    {
        this.avaliableItems.add(item);
    }


}
package data;

import java.util.ArrayList;
import java.util.List;

public class DataSource {

    public static List<String> getList(){
        List<String> itemList = new ArrayList<String>();
        itemList.add("Usa");
        itemList.add("Bangladesh");
        itemList.add("Japan");
        itemList.add("China");
        return itemList;
    }
}

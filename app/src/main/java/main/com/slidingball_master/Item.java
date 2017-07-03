package main.com.slidingball_master;

/**
 * Created by Administrator on 2017/6/26 0026.
 */

public class Item {
    private String name;
    private boolean isSelected;

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
package com.codecool.dungeoncrawl.logic.items;
import com.codecool.dungeoncrawl.logic.Cell;
import com.codecool.dungeoncrawl.logic.Drawable;


public abstract class Item implements Drawable {

    private transient Cell cell;

    public Item(){}

    public Item(Cell cell) {
        this.cell = cell;
        this.cell.setItem(this);
    }

}
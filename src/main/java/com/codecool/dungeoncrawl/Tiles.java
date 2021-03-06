package com.codecool.dungeoncrawl;

import com.codecool.dungeoncrawl.logic.Drawable;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

import java.util.HashMap;
import java.util.Map;

public class Tiles {
    public static int TILE_WIDTH = 32;

    private static Image tileset = new Image("/tiles.png", 543 * 2, 543 * 2, true, false);
    private static Map<String, Tile> tileMap = new HashMap<>();
    public static class Tile {
        public final int x, y, w, h;
        Tile(int i, int j) {
            x = i * (TILE_WIDTH + 2);
            y = j * (TILE_WIDTH + 2);
            w = TILE_WIDTH;
            h = TILE_WIDTH;
        }
    }

    static {
        tileMap.put("empty", new Tile(0, 0));
        tileMap.put("wall", new Tile(10, 17));
        tileMap.put("floor", new Tile(2, 0));
        tileMap.put("player", new Tile(27, 0));
        tileMap.put("skeleton", new Tile(29, 6));
        tileMap.put("wizard", new Tile(26, 9));
        tileMap.put("thug", new Tile(25, 9));
        tileMap.put("key", new Tile(17, 23));
        tileMap.put("sword", new Tile(0, 31));
        tileMap.put("closed", new Tile(0, 10));
        tileMap.put("open", new Tile(2, 9));
        tileMap.put("tree", new Tile(1, 1));
        tileMap.put("grass", new Tile(5, 0));
        tileMap.put("bush", new Tile(1, 2));
        tileMap.put("latter", new Tile(4,6));
        tileMap.put("house", new Tile(8, 20));
        tileMap.put("closedDoor", new Tile(11, 11));
        tileMap.put("openDoor" , new Tile(10,11));
        tileMap.put("apple", new Tile(15, 29));
        tileMap.put("prize", new Tile(11,25));
        tileMap.put("inventory", new Tile(15, 26));
        tileMap.put("health", new Tile(23, 22));
        tileMap.put("healthBar", new Tile(20, 15));
    }

    public static void drawTile(GraphicsContext context, Drawable d, int x, int y) {
        Tile tile = tileMap.get(d.getTileName());
        context.drawImage(tileset, tile.x, tile.y, tile.w, tile.h,
                x * TILE_WIDTH, y * TILE_WIDTH, TILE_WIDTH, TILE_WIDTH);
    }
}

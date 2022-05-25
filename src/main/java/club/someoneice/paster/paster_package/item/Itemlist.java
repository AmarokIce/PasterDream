package club.someoneice.paster.paster_package.item;

import club.someoneice.paster.paster;
import net.minecraft.item.Item;

public class Itemlist {
    public static Item item(){
        Item.Properties Properties = new Item.Properties();
        Properties.tab(paster.MAIN_TAB);
        return new Item(Properties);
    }
}

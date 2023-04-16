package gabe.templatemod.item;

import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;

public class CitrineSword extends SwordItem {
    public CitrineSword(Item.Settings settings) {
        super(CitrineToolMaterial.INSTANCE, 0, -2.4F, settings);
    }
}

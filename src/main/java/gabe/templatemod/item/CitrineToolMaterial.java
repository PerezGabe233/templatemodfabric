package gabe.templatemod.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CitrineToolMaterial implements ToolMaterial {

    public static final CitrineToolMaterial INSTANCE = new CitrineToolMaterial();

    @Override
    public int getDurability() {
        return 500; // You can set your desired durability here.
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 7.0F; // You can set your desired mining speed multiplier here.
    }

    @Override
    public float getAttackDamage() {
        return 5.0F; // You can set your desired base attack damage here.
    }

    @Override
    public int getMiningLevel() {
        return 1; // You can set your desired mining level here.
    }

    @Override
    public int getEnchantability() {
        return 15; // You can set your desired enchantability here.
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.CITRINE); // You can set your desired repair ingredient here.
    }
}

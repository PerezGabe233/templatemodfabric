package gabe.templatemod;

import gabe.templatemod.block.ModBlocks;
import gabe.templatemod.item.ModItemGroup;
import gabe.templatemod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TemplateMod implements ModInitializer {
	public static final String MOD_ID = "template-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger("template-mod");

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.addItemsToItemGroup(); // Add this line
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}




}

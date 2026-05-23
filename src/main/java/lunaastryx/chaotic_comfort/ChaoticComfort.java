package lunaastryx.chaotic_comfort;

import lunaastryx.chaotic_comfort.block.ModBlocks;
import lunaastryx.chaotic_comfort.item.ModItemGroups;
import lunaastryx.chaotic_comfort.item.ModItems;
import lunaastryx.chaotic_comfort.painting.ModPaintings;
import lunaastryx.chaotic_comfort.sound.ModSounds;
import lunaastryx.chaotic_comfort.util.ModCustomTrades;
import lunaastryx.chaotic_comfort.util.ModLootTableModifiers;
import lunaastryx.chaotic_comfort.villager.ModVillagers;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChaoticComfort implements ModInitializer {
	public static final String MOD_ID = "chaotic_comfort";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModPaintings.registerPaintings();
		ModSounds.registerSounds();

		ModCustomTrades.registerCustomTrades();
		ModVillagers.registerVillagers();

		ModLootTableModifiers.modifyLootTables();

		StrippableBlockRegistry.register(ModBlocks.PALE_OAK_LOG, ModBlocks.STRIPPED_PALE_OAK_LOG);
		StrippableBlockRegistry.register(ModBlocks.PALE_OAK_WOOD, ModBlocks.STRIPPED_PALE_OAK_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALE_OAK_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALE_OAK_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_PALE_OAK_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_PALE_OAK_WOOD, 5, 5);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALE_OAK_LEAVES, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALE_OAK_PLANKS, 30, 60);
	}
}
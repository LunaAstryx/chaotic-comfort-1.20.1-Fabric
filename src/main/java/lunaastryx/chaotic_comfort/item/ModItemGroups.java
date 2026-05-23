package lunaastryx.chaotic_comfort.item;

import lunaastryx.chaotic_comfort.ChaoticComfort;
import lunaastryx.chaotic_comfort.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CHAOTIC_COMFORT_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ChaoticComfort.MOD_ID, "chaotic_comfort"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.chaotic_comfort"))
                    .icon(() -> new ItemStack(ModItems.ELECTRIC_GUITAR)).entries((displayContext, entries) -> {

                        entries.add(ModItems.ELECTRIC_GUITAR);
                        entries.add(ModItems.BAGUETTE);
                        entries.add(ModItems.GOLDEN_NETHER_STAR);
                        entries.add(ModItems.POMMES_ROT_WEISS_MUSIC_DISC);
                        entries.add(ModItems.PUFFER_ARMOR_TRIM);

                    }).build());


    public static void registerItemGroups() {
        ChaoticComfort.LOGGER.info("Registering Item Groups for " + ChaoticComfort.MOD_ID);
    }
}

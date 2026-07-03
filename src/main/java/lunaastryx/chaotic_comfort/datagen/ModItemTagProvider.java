package lunaastryx.chaotic_comfort.datagen;

import lunaastryx.chaotic_comfort.block.ModBlocks;
import lunaastryx.chaotic_comfort.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
                .add(ModItems.POMMES_ROT_WEISS_MUSIC_DISC);

        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.ELECTRIC_GUITAR);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.BAGUETTE);

        getOrCreateTagBuilder(ItemTags.BEACON_PAYMENT_ITEMS)
                .add(Items.COPPER_INGOT);

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.PALE_OAK_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.PALE_OAK_LOG.asItem())
                .add(ModBlocks.STRIPPED_PALE_OAK_LOG.asItem())
                .add(ModBlocks.PALE_OAK_WOOD.asItem())
                .add(ModBlocks.STRIPPED_PALE_OAK_WOOD.asItem());

    }
}

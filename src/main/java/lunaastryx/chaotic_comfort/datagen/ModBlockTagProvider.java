package lunaastryx.chaotic_comfort.datagen;

import lunaastryx.chaotic_comfort.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output,  CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.CALCITE_STAIRS)
                .add(ModBlocks.CALCITE_SLAB)
                .add(ModBlocks.CALCITE_WALL)
                .add(ModBlocks.SMOOTH_BASALT_STAIRS)
                .add(ModBlocks.SMOOTH_BASALT_WALL)
                .add(ModBlocks.SMOOTH_BASALT_SLAB)
                .add(ModBlocks.TUFF_BRICKS)
                .add(ModBlocks.TUFF_WALL)
                .add(ModBlocks.TUFF_STAIRS)
                .add(ModBlocks.TUFF_SLAB)
                .add(ModBlocks.TUFF_BRICKS)
                .add(ModBlocks.TUFF_BRICK_STAIRS)
                .add(ModBlocks.TUFF_BRICK_SLAB)
                .add(ModBlocks.TUFF_BRICK_WALL)
                .add(ModBlocks.POLISHED_TUFF)
                .add(ModBlocks.POLISHED_TUFF_SLAB)
                .add(ModBlocks.POLISHED_TUFF_WALL)
                .add(ModBlocks.POLISHED_TUFF_STAIRS)
                .add(ModBlocks.CHISELED_TUFF)
                .add(ModBlocks.CHISELED_TUFF_BRICKS);

        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS)
                .add(Blocks.COPPER_BLOCK)
                .add(Blocks.WAXED_COPPER_BLOCK)
                .add(Blocks.CUT_COPPER)
                .add(Blocks.WAXED_CUT_COPPER)
                .add(Blocks.EXPOSED_COPPER)
                .add(Blocks.WAXED_EXPOSED_COPPER)
                .add(Blocks.EXPOSED_CUT_COPPER)
                .add(Blocks.WAXED_EXPOSED_CUT_COPPER)
                .add(Blocks.WEATHERED_COPPER)
                .add(Blocks.WAXED_WEATHERED_COPPER)
                .add(Blocks.WEATHERED_CUT_COPPER)
                .add(Blocks.WAXED_WEATHERED_COPPER)
                .add(Blocks.OXIDIZED_COPPER)
                .add(Blocks.WAXED_OXIDIZED_COPPER)
                .add(Blocks.OXIDIZED_CUT_COPPER)
                .add(Blocks.WAXED_OXIDIZED_CUT_COPPER);

        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(ModBlocks.PALE_OAK_PLANKS);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.PALE_OAK_LOG)
                .add(ModBlocks.STRIPPED_PALE_OAK_LOG)
                .add(ModBlocks.PALE_OAK_WOOD)
                .add(ModBlocks.STRIPPED_PALE_OAK_WOOD);;

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.PALE_OAK_PLANKS)
                .add(ModBlocks.PALE_OAK_LOG)
                .add(ModBlocks.PALE_OAK_WOOD)
                .add(ModBlocks.STRIPPED_PALE_OAK_LOG)
                .add(ModBlocks.STRIPPED_PALE_OAK_WOOD)
                .add(ModBlocks.PALE_OAK_DOOR)
                .add(ModBlocks.PALE_OAK_TRAPDOOR)
                .add(ModBlocks.PALE_OAK_BUTTON)
                .add(ModBlocks.PALE_OAK_PRESSURE_PLATE)
                .add(ModBlocks.PALE_OAK_SLAB)
                .add(ModBlocks.PALE_OAK_STAIRS)
                .add(ModBlocks.PALE_OAK_FENCE)
                .add(ModBlocks.PALE_OAK_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(ModBlocks.PALE_OAK_LEAVES);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.SMOOTH_BASALT_WALL)
                .add(ModBlocks.CALCITE_WALL)
                .add(ModBlocks.TUFF_WALL)
                .add(ModBlocks.POLISHED_TUFF_WALL)
                .add(ModBlocks.TUFF_BRICK_WALL);

        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(ModBlocks.SMOOTH_BASALT_SLAB)
                .add(ModBlocks.CALCITE_SLAB)
                .add(ModBlocks.TUFF_SLAB)
                .add(ModBlocks.TUFF_BRICK_SLAB)
                .add(ModBlocks.POLISHED_TUFF_SLAB)
                .add(ModBlocks.PALE_OAK_SLAB);

        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(ModBlocks.SMOOTH_BASALT_STAIRS)
                .add(ModBlocks.CALCITE_STAIRS)
                .add(ModBlocks.TUFF_STAIRS)
                .add(ModBlocks.TUFF_BRICK_STAIRS)
                .add(ModBlocks.POLISHED_TUFF_STAIRS)
                .add(ModBlocks.PALE_OAK_STAIRS);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.PALE_OAK_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.PALE_OAK_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.FLOWERS)
                .add(ModBlocks.PURPLE_TULIP)
                .add(ModBlocks.YELLOW_TULIP);
        getOrCreateTagBuilder(BlockTags.SMALL_FLOWERS)
                .add(ModBlocks.YELLOW_TULIP)
                .add(ModBlocks.PURPLE_TULIP);
    }
}

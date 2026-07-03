package lunaastryx.chaotic_comfort.datagen;

import lunaastryx.chaotic_comfort.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.CALCITE_STAIRS);
        addDrop(ModBlocks.CALCITE_SLAB, slabDrops(ModBlocks.CALCITE_SLAB));
        addDrop(ModBlocks.CALCITE_WALL);

        addDrop(ModBlocks.SMOOTH_BASALT_STAIRS);
        addDrop(ModBlocks.SMOOTH_BASALT_WALL);
        addDrop(ModBlocks.SMOOTH_BASALT_SLAB, slabDrops(ModBlocks.SMOOTH_BASALT_SLAB));

        addDrop(ModBlocks.TUFF_STAIRS);
        addDrop(ModBlocks.TUFF_SLAB, slabDrops(ModBlocks.TUFF_SLAB));
        addDrop(ModBlocks.TUFF_WALL);

        addDrop(ModBlocks.TUFF_BRICKS);
        addDrop(ModBlocks.TUFF_BRICK_SLAB, slabDrops(ModBlocks.TUFF_BRICK_SLAB));
        addDrop(ModBlocks.TUFF_BRICK_STAIRS);
        addDrop(ModBlocks.TUFF_BRICK_WALL);

        addDrop(ModBlocks.POLISHED_TUFF);
        addDrop(ModBlocks.POLISHED_TUFF_WALL);
        addDrop(ModBlocks.POLISHED_TUFF_STAIRS);
        addDrop(ModBlocks.POLISHED_TUFF_SLAB, slabDrops(ModBlocks.POLISHED_TUFF_SLAB));

        addDrop(ModBlocks.CHISELED_TUFF);
        addDrop(ModBlocks.CHISELED_TUFF_BRICKS);

        addDrop(ModBlocks.PALE_MOSS_BLOCK);
        addDrop(ModBlocks.PALE_MOSS_CARPET);

        addDrop(ModBlocks.PALE_OAK_PLANKS);
        addDrop(ModBlocks.PALE_OAK_LOG);
        addDrop(ModBlocks.STRIPPED_PALE_OAK_LOG);
        addDrop(ModBlocks.PALE_OAK_WOOD);
        addDrop(ModBlocks.STRIPPED_PALE_OAK_WOOD);
        addDrop(ModBlocks.PALE_OAK_FENCE);
        addDrop(ModBlocks.PALE_OAK_FENCE_GATE);
        addDrop(ModBlocks.PALE_OAK_BUTTON);
        addDrop(ModBlocks.PALE_OAK_PRESSURE_PLATE);
        addDrop(ModBlocks.PALE_OAK_STAIRS);
        addDrop(ModBlocks.PALE_OAK_TRAPDOOR);

        addDrop(ModBlocks.PALE_OAK_DOOR, doorDrops(ModBlocks.PALE_OAK_DOOR));
        addDrop(ModBlocks.PALE_OAK_SLAB, slabDrops(ModBlocks.PALE_OAK_SLAB));

        addDrop(ModBlocks.PALE_OAK_LEAVES, leavesDrops(ModBlocks.PALE_OAK_LEAVES, ModBlocks.PALE_OAK_SAPLING, 0.025f));
        addDrop(ModBlocks.PALE_OAK_SAPLING);

        addDrop(ModBlocks.PURPLE_TULIP);
        addPottedPlantDrops(ModBlocks.POTTED_PURPLE_TULIP);
        addDrop(ModBlocks.YELLOW_TULIP);
        addPottedPlantDrops(ModBlocks.POTTED_YELLOW_TULIP);
    }
}

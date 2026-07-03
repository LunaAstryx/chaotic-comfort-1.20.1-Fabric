package lunaastryx.chaotic_comfort.datagen;

import lunaastryx.chaotic_comfort.block.ModBlocks;
import lunaastryx.chaotic_comfort.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool calcitepool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CALCITE);

        calcitepool.stairs(ModBlocks.CALCITE_STAIRS);
        calcitepool.slab(ModBlocks.CALCITE_SLAB);
        calcitepool.wall(ModBlocks.CALCITE_WALL);

        BlockStateModelGenerator.BlockTexturePool smoothbasaltpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_BASALT);

        smoothbasaltpool.stairs(ModBlocks.SMOOTH_BASALT_STAIRS);
        smoothbasaltpool.slab(ModBlocks.SMOOTH_BASALT_SLAB);
        smoothbasaltpool.wall(ModBlocks.SMOOTH_BASALT_WALL);

        BlockStateModelGenerator.BlockTexturePool tuffpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.TUFF);

        tuffpool.stairs(ModBlocks.TUFF_STAIRS);
        tuffpool.slab(ModBlocks.TUFF_SLAB);
        tuffpool.wall(ModBlocks.TUFF_WALL);

        BlockStateModelGenerator.BlockTexturePool tuffbrickpool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TUFF_BRICKS);

        tuffbrickpool.stairs(ModBlocks.TUFF_BRICK_STAIRS);
        tuffbrickpool.slab(ModBlocks.TUFF_BRICK_SLAB);
        tuffbrickpool.wall(ModBlocks.TUFF_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool polishedtuffpool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_TUFF);

        polishedtuffpool.slab(ModBlocks.POLISHED_TUFF_SLAB);
        polishedtuffpool.stairs(ModBlocks.POLISHED_TUFF_STAIRS);
        polishedtuffpool.wall(ModBlocks.POLISHED_TUFF_WALL);

        blockStateModelGenerator.registerLog(ModBlocks.CHISELED_TUFF).log(ModBlocks.CHISELED_TUFF);
        blockStateModelGenerator.registerLog(ModBlocks.CHISELED_TUFF_BRICKS).log(ModBlocks.CHISELED_TUFF_BRICKS);

        BlockStateModelGenerator.BlockTexturePool palepool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PALE_OAK_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PALE_OAK_LEAVES);
        blockStateModelGenerator.registerLog(ModBlocks.PALE_OAK_LOG).log(ModBlocks.PALE_OAK_LOG).wood(ModBlocks.PALE_OAK_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_PALE_OAK_LOG).log(ModBlocks.STRIPPED_PALE_OAK_LOG).wood(ModBlocks.STRIPPED_PALE_OAK_WOOD);

        blockStateModelGenerator.registerTintableCross(ModBlocks.PALE_OAK_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        palepool.stairs(ModBlocks.PALE_OAK_STAIRS);
        palepool.button(ModBlocks.PALE_OAK_BUTTON);
        palepool.pressurePlate(ModBlocks.PALE_OAK_PRESSURE_PLATE);
        palepool.fenceGate(ModBlocks.PALE_OAK_FENCE_GATE);
        palepool.fence(ModBlocks.PALE_OAK_FENCE);
        palepool.slab(ModBlocks.PALE_OAK_SLAB);

        blockStateModelGenerator.registerDoor(ModBlocks.PALE_OAK_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.PALE_OAK_TRAPDOOR);

        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.PALE_MOSS_BLOCK, ModBlocks.PALE_MOSS_CARPET);

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PURPLE_TULIP, ModBlocks.POTTED_PURPLE_TULIP, BlockStateModelGenerator.TintType.NOT_TINTED );
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.YELLOW_TULIP, ModBlocks.POTTED_YELLOW_TULIP, BlockStateModelGenerator.TintType.NOT_TINTED );
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ELECTRIC_GUITAR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BAGUETTE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLDEN_NETHER_STAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.PUFFER_ARMOR_TRIM, Models.GENERATED);
        itemModelGenerator.register(ModItems.POMMES_ROT_WEISS_MUSIC_DISC, Models.GENERATED);
    }
}

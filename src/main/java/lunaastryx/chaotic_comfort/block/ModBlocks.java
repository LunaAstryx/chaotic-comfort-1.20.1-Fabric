package lunaastryx.chaotic_comfort.block;

import lunaastryx.chaotic_comfort.ChaoticComfort;
import lunaastryx.chaotic_comfort.world.tree.PaleOakSaplingGenerator;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block CALCITE_STAIRS = registerBlock("calcite_stairs",
            new StairsBlock(Blocks.CALCITE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CALCITE)));
    public static final Block CALCITE_SLAB = registerBlock("calcite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CALCITE)));
    public static final Block CALCITE_WALL = registerBlock("calcite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CALCITE)));

    public static final Block TUFF_STAIRS = registerBlock("tuff_stairs",
            new StairsBlock(Blocks.TUFF.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TUFF)));
    public static final Block TUFF_SLAB = registerBlock("tuff_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TUFF)));
    public static final Block TUFF_WALL = registerBlock("tuff_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TUFF)));

    public static final Block TUFF_BRICKS = registerBlock("tuff_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.TUFF)));

    public static final Block TUFF_BRICK_STAIRS = registerBlock("tuff_brick_stairs",
            new StairsBlock(ModBlocks.TUFF_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TUFF)));
    public static final Block TUFF_BRICK_SLAB = registerBlock("tuff_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TUFF)));
    public static final Block TUFF_BRICK_WALL = registerBlock("tuff_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TUFF)));

    public static final Block POLISHED_TUFF = registerBlock("polished_tuff",
            new Block(FabricBlockSettings.copyOf(Blocks.TUFF)));

    public static final Block POLISHED_TUFF_STAIRS = registerBlock("polished_tuff_stairs",
            new StairsBlock(ModBlocks.TUFF_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TUFF)));
    public static final Block POLISHED_TUFF_SLAB = registerBlock("polished_tuff_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TUFF)));
    public static final Block POLISHED_TUFF_WALL = registerBlock("polished_tuff_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TUFF)));

    public static final Block CHISELED_TUFF = registerBlock("chiseled_tuff",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.TUFF)));
    public static final Block CHISELED_TUFF_BRICKS = registerBlock("chiseled_tuff_bricks",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.TUFF)));

    public static final Block DRIPSTONE_STAIRS = registerBlock("dripstone_stairs",
            new StairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_SLAB = registerBlock("dripstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_WALL = registerBlock("dripstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));

    public static final Block SMOOTH_BASALT_STAIRS = registerBlock("smooth_basalt_stairs",
            new StairsBlock(Blocks.SMOOTH_BASALT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SMOOTH_BASALT)));
    public static final Block SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_BASALT)));
    public static final Block SMOOTH_BASALT_WALL = registerBlock("smooth_basalt_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_BASALT)));

    public static final Block PALE_MOSS_BLOCK = registerBlock("pale_moss_block",
            new Block(FabricBlockSettings.copyOf(Blocks.MOSS_BLOCK)));
    public static final Block PALE_MOSS_CARPET = registerBlock("pale_moss_carpet",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.MOSS_CARPET)));

    public static final Block PALE_OAK_PLANKS = registerBlock("pale_oak_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));

    public static final Block PALE_OAK_STAIRS = registerBlock("pale_oak_stairs",
            new StairsBlock(ModBlocks.PALE_OAK_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CHERRY_STAIRS)));
    public static final Block PALE_OAK_SLAB = registerBlock("pale_oak_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_SLAB)));

    public static final Block PALE_OAK_BUTTON = registerBlock("pale_oak_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block PALE_OAK_PRESSURE_PLATE = registerBlock("pale_oak_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.CHERRY_PRESSURE_PLATE), BlockSetType.CHERRY));

    public static final Block PALE_OAK_FENCE = registerBlock("pale_oak_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_FENCE)));
    public static final Block PALE_OAK_FENCE_GATE = registerBlock("pale_oak_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_FENCE_GATE), WoodType.CHERRY));

    public static final Block PALE_OAK_DOOR = registerBlock("pale_oak_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_DOOR).nonOpaque(), BlockSetType.CHERRY));
    public static final Block PALE_OAK_TRAPDOOR = registerBlock("pale_oak_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_TRAPDOOR).nonOpaque(), BlockSetType.CHERRY));

    public static final Block PALE_OAK_LOG = registerBlock("pale_oak_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block PALE_OAK_WOOD = registerBlock("pale_oak_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_PALE_OAK_LOG = registerBlock("stripped_pale_oak_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_PALE_OAK_WOOD = registerBlock("stripped_pale_oak_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block PALE_OAK_LEAVES = registerBlock("pale_oak_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_LEAVES).nonOpaque()));

    public static final Block PALE_OAK_SAPLING = registerBlock("pale_oak_sapling",
            new SaplingBlock(new PaleOakSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.DARK_OAK_SAPLING)));

    public static final Block PURPLE_TULIP = registerBlock("purple_tulip",
            new FlowerBlock(StatusEffects.RESISTANCE, 7, FabricBlockSettings.copyOf(Blocks.WHITE_TULIP).nonOpaque()));
    public static final Block POTTED_PURPLE_TULIP = Registry.register(Registries.BLOCK, new Identifier(ChaoticComfort.MOD_ID, "potted_purple_tulip"),
            new FlowerPotBlock(PURPLE_TULIP, FabricBlockSettings.copyOf(Blocks.POTTED_WHITE_TULIP).nonOpaque()));

    public static final Block YELLOW_TULIP = registerBlock("yellow_tulip",
            new FlowerBlock(StatusEffects.HASTE, 6, FabricBlockSettings.copyOf(Blocks.WHITE_TULIP).nonOpaque()));
    public static final Block POTTED_YELLOW_TULIP = Registry.register(Registries.BLOCK, new Identifier(ChaoticComfort.MOD_ID, "potted_yellow_tulip"),
            new FlowerPotBlock(YELLOW_TULIP, FabricBlockSettings.copyOf(Blocks.POTTED_WHITE_TULIP).nonOpaque()));

    private static void addBlocksToNaturalTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.PALE_OAK_SAPLING);
        entries.add(ModBlocks.PALE_OAK_LEAVES);
        entries.add(ModBlocks.PALE_MOSS_BLOCK);
        entries.add(ModBlocks.PALE_MOSS_CARPET);
        entries.add(ModBlocks.PURPLE_TULIP);
        entries.add(ModBlocks.YELLOW_TULIP);
    }
    private static void addBlocksToBuildingBlocksTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.PALE_OAK_LOG);
        entries.add(ModBlocks.PALE_OAK_WOOD);
        entries.add(ModBlocks.STRIPPED_PALE_OAK_LOG);
        entries.add(ModBlocks.STRIPPED_PALE_OAK_WOOD);
        entries.add(ModBlocks.PALE_OAK_STAIRS);
        entries.add(ModBlocks.PALE_OAK_SLAB);
        entries.add(ModBlocks.PALE_OAK_FENCE);
        entries.add(ModBlocks.PALE_OAK_FENCE_GATE);
        entries.add(ModBlocks.PALE_OAK_DOOR);
        entries.add(ModBlocks.PALE_OAK_TRAPDOOR);
        entries.add(ModBlocks.PALE_OAK_PRESSURE_PLATE);
        entries.add(ModBlocks.PALE_OAK_BUTTON);

        entries.add(Blocks.CALCITE);
        entries.add(ModBlocks.CALCITE_STAIRS);
        entries.add(ModBlocks.CALCITE_SLAB);
        entries.add(ModBlocks.CALCITE_WALL);

        entries.add(Blocks.DRIPSTONE_BLOCK);
        entries.add(ModBlocks.DRIPSTONE_STAIRS);
        entries.add(ModBlocks.DRIPSTONE_SLAB);
        entries.add(ModBlocks.DRIPSTONE_WALL);

        entries.add(Blocks.TUFF);
        entries.add(ModBlocks.TUFF_STAIRS);
        entries.add(ModBlocks.TUFF_SLAB);
        entries.add(ModBlocks.TUFF_WALL);
        entries.add(ModBlocks.CHISELED_TUFF);

        entries.add(ModBlocks.TUFF_BRICKS);
        entries.add(ModBlocks.TUFF_BRICK_STAIRS);
        entries.add(ModBlocks.TUFF_BRICK_SLAB);
        entries.add(ModBlocks.TUFF_BRICK_WALL);
        entries.add(ModBlocks.CHISELED_TUFF_BRICKS);

        entries.add(ModBlocks.POLISHED_TUFF);
        entries.add(ModBlocks.POLISHED_TUFF_STAIRS);
        entries.add(ModBlocks.POLISHED_TUFF_SLAB);
        entries.add(ModBlocks.POLISHED_TUFF_WALL);

        entries.add(Blocks.SMOOTH_BASALT);
        entries.add(ModBlocks.SMOOTH_BASALT_STAIRS);
        entries.add(ModBlocks.SMOOTH_BASALT_SLAB);
        entries.add(ModBlocks.SMOOTH_BASALT_WALL);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(ChaoticComfort.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(ChaoticComfort.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        ChaoticComfort.LOGGER.info("Registering Mod Blocks for " + ChaoticComfort.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModBlocks::addBlocksToNaturalTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModBlocks::addBlocksToBuildingBlocksTabItemGroup);
    }
}

package lunaastryx.chaotic_comfort.item;

import lunaastryx.chaotic_comfort.ChaoticComfort;
import lunaastryx.chaotic_comfort.sound.ModSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModItems {
    public static final Item GOLDEN_NETHER_STAR = registerItem("golden_nether_star",
            new Item(new FabricItemSettings().fireproof()));

    public static final Item PUFFER_ARMOR_TRIM = registerItem("puffer_item_trim",
            SmithingTemplateItem.of(new Identifier("chaotic_comfort", "puffer_armor_trim")));

    public static final Item POMMES_ROT_WEISS_MUSIC_DISC = registerItem("pommes_rot_weiss_music_disc",
            new MusicDiscItem(7, ModSounds.POMMES_ROT_WEISS, new FabricItemSettings().maxCount(1), 61));

    public static final Item ELECTRIC_GUITAR = registerItem("electric_guitar",
            new AxeItem(ModToolMaterial.ELECTRIC_GUITAR, 0, -2.67f, new FabricItemSettings().maxCount(1).fireproof()));

    public static final Item BAGUETTE = registerItem("baguette",
            new SwordItem(ModToolMaterial.BAGUETTE, 0, -2.4f, new FabricItemSettings().maxCount(1)) {
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.chaotic_comfort.baguette.tooltip"));
                    super.appendTooltip(stack, world, tooltip, context);
                }
            });

    //make it a Ego exclusive Pale Bone Alloy Saber Skin fr fr

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(ModItems.GOLDEN_NETHER_STAR);
        entries.add(ModItems.PUFFER_ARMOR_TRIM);
    }

    private static void addItemsToCombatTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(ModItems.ELECTRIC_GUITAR);
        entries.add(ModItems.BAGUETTE);
    }

    private static void addItemsToToolsTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(ModItems.POMMES_ROT_WEISS_MUSIC_DISC);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ChaoticComfort.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ChaoticComfort.LOGGER.info("Registering Mod Items for " + ChaoticComfort.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolsTabItemGroup);
    }
}
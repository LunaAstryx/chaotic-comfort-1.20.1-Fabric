package lunaastryx.chaotic_comfort.util;

import lunaastryx.chaotic_comfort.block.ModBlocks;
import lunaastryx.chaotic_comfort.item.ModItems;
import lunaastryx.chaotic_comfort.villager.ModVillagers;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class ModCustomTrades {
    public static void registerCustomTrades() {

        //Guy Trades
        TradeOfferHelper.registerVillagerOffers(ModVillagers.GUY, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(Items.RED_TERRACOTTA, 24),
                            5, 3, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(Items.GREEN_TERRACOTTA, 24),
                            5, 3, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(Items.YELLOW_TERRACOTTA, 24),
                            5, 3, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(Items.BLUE_TERRACOTTA, 24),
                            5, 3, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(Items.LIGHT_BLUE_TERRACOTTA, 24),
                            5, 3, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(Items.TERRACOTTA, 24),
                            5, 3, 0.075f));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.GUY, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(Items.BRICKS, 24),
                            6, 7, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(Items.TUFF, 24),
                            4, 7, 0.075f));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.GUY, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(Items.STONE, 24),
                            7, 7, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 4),
                            new ItemStack(Items.COBBLED_DEEPSLATE, 24),
                            5, 7, 0.075f));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.GUY, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.NETHERITE_INGOT, 2),
                            new ItemStack(ModItems.ELECTRIC_GUITAR, 1),
                            1, 67, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.NETHERITE_SWORD, 1),
                            new ItemStack(ModItems.BAGUETTE, 1),
                            1, 67, 0.075f));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.GUY, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 67),
                            new ItemStack(ModItems.POMMES_ROT_WEISS_MUSIC_DISC, 1),
                            1, 67, 0.075f));
                });

        //Florist Trades
        TradeOfferHelper.registerVillagerOffers(ModVillagers.FLORIST, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(Items.ORANGE_TULIP, 8),
                            5, 3, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(Items.PINK_TULIP, 8),
                            5, 3, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(Items.WHITE_TULIP, 8),
                            5, 3, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(Items.RED_TULIP, 8),
                            5, 3, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(ModBlocks.PURPLE_TULIP, 8),
                            5, 3, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(ModBlocks.YELLOW_TULIP, 8),
                            5, 3, 0.075f));
                });
    }
}

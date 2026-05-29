package lunaastryx.chaotic_comfort.item.itemClasses;

import lunaastryx.chaotic_comfort.sound.ModSounds;
import lunaastryx.chaotic_comfort.util.ModCustomHitSounds;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class BaguetteItem extends SwordItem implements ModCustomHitSounds {
    public BaguetteItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public void playHitSound(PlayerEntity player) {
        player.getWorld().playSound(
                null,
                player.getX(),
                player.getY(),
                player.getZ(),
                ModSounds.BAGUETTE_HIT,
                player.getSoundCategory(),
                0.7f,
                (float) (1.0f + player.getRandom().nextGaussian() / 10f)
        );
    }
}

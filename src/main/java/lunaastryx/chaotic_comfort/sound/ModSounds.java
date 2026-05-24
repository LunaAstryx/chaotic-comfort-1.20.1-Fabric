package lunaastryx.chaotic_comfort.sound;

import lunaastryx.chaotic_comfort.ChaoticComfort;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent POMMES_ROT_WEISS = registerSoundEvent("pommes_rot_weiss");

    public static final SoundEvent ELEVENTH_HOUR = registerSoundEvent("eleventh_hour");
    public static final SoundEvent SOLSTICE = registerSoundEvent("solstice");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(ChaoticComfort.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {ChaoticComfort.LOGGER.info("Registering Sounds for " + ChaoticComfort.MOD_ID);}
}


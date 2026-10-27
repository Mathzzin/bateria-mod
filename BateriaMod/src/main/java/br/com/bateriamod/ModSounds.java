package br.com.bateriamod;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, BateriaMod.MOD_ID);
    public static final RegistryObject<SoundEvent> KICK = register("kick");
    public static final RegistryObject<SoundEvent> SNARE = register("snare");
    public static final RegistryObject<SoundEvent> HIHAT = register("hihat");
    public static final RegistryObject<SoundEvent> TOM = register("tom");
    public static final RegistryObject<SoundEvent> CRASH = register("crash");
    private static RegistryObject<SoundEvent> register(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(BateriaMod.MOD_ID, name)));
    }
}

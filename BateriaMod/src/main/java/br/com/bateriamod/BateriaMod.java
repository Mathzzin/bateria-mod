package br.com.bateriamod;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BateriaMod.MOD_ID)
public class BateriaMod {
    public static final String MOD_ID = "bateriamod";
    public BateriaMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.ITEMS.register(bus);
        ModBlocks.BLOCKS.register(bus);
        ModSounds.SOUND_EVENTS.register(bus);
    }
}

package br.com.bateriamod;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BateriaMod.MOD_ID);
    public static final RegistryObject<Item> BAQUETAS = ITEMS.register("baquetas", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BATERIA = ITEMS.register("bateria", () -> new BlockItem(ModBlocks.BATERIA.get(), new Item.Properties()));
}

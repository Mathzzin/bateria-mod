package br.com.bateriamod;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BateriaMod.MOD_ID);
    public static final RegistryObject<Block> BATERIA = BLOCKS.register("bateria", () -> new BateriaBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).strength(1.5F).sound(SoundType.WOOD).noOcclusion()));
}

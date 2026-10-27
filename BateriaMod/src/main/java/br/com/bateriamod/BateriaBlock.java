package br.com.bateriamod;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class BateriaBlock extends Block {
    public BateriaBlock(Properties properties) { super(properties); }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        ItemStack held = player.getItemInHand(hand);
        if (!held.is(ModItems.BAQUETAS.get())) return InteractionResult.PASS;
        if (!level.isClientSide) {
            double x = hit.getLocation().x - pos.getX();
            double z = hit.getLocation().z - pos.getZ();
            // Cada região da bateria toca uma peça diferente. O botão direito com baquetas toca; agachar dá uma batida mais forte.
            if (x < 0.30) level.playSound(null, pos, ModSounds.KICK.get(), SoundSource.RECORDS, 1.0F, player.isCrouching() ? 0.82F : 1.0F);
            else if (x > 0.72) level.playSound(null, pos, ModSounds.CRASH.get(), SoundSource.RECORDS, 0.9F, player.isCrouching() ? 0.85F : 1.0F);
            else if (z < 0.32) level.playSound(null, pos, ModSounds.HIHAT.get(), SoundSource.RECORDS, 0.85F, player.isCrouching() ? 0.8F : 1.0F);
            else if (z > 0.70) level.playSound(null, pos, ModSounds.TOM.get(), SoundSource.RECORDS, 1.0F, player.isCrouching() ? 0.8F : 1.0F);
            else level.playSound(null, pos, ModSounds.SNARE.get(), SoundSource.RECORDS, 1.0F, player.isCrouching() ? 0.82F : 1.0F);
            if (!player.getAbilities().instabuild) held.hurtAndBreak(0, player, p -> p.broadcastBreakEvent(hand));
        }
        return InteractionResult.sidedSuccess(level.isClientSide);
    }
}

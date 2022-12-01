package turniplabs.onepunch.mixin;

import net.minecraft.src.BlockFenceGate;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = BlockFenceGate.class, remap = false)
public class BlockFenceGateMixin {

    public void onBlockClicked(World world, int i, int j, int k, EntityPlayer entityplayer) {
        ((BlockFenceGate) (Object) this).blockActivated(world, i, j, k, entityplayer);
    }
}

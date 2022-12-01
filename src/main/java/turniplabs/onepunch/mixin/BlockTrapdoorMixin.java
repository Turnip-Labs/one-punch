package turniplabs.onepunch.mixin;

import net.minecraft.src.BlockTrapDoor;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = BlockTrapDoor.class, remap = false)
public class BlockTrapdoorMixin {

    public void onBlockClicked(World world, int i, int j, int k, EntityPlayer entityplayer) {
        ((BlockTrapDoor) (Object) this).blockActivated(world, i, j, k, entityplayer);
    }
}

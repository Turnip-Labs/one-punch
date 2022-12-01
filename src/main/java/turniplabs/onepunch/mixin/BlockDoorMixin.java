package turniplabs.onepunch.mixin;

import net.minecraft.src.BlockDoor;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = BlockDoor.class, remap = false)
public class BlockDoorMixin {

    public void onBlockClicked(World world, int i, int j, int k, EntityPlayer entityplayer) {
        ((BlockDoor) (Object) this).blockActivated(world, i, j, k, entityplayer);
    }
}

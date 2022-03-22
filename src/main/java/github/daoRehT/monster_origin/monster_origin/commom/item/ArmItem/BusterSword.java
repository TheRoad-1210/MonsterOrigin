package github.daoRehT.monster_origin.monster_origin.commom.item.ArmItem;

import github.daoRehT.monster_origin.monster_origin.core.util.ModItemTier;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

public class BusterSword extends SwordItem {

    public BusterSword() {
        super(ModItemTier.ORIGIN,13,-3.4F, new Item.Properties().group(ItemGroup.COMBAT));
    }

    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerentity, Hand handIn) {

        ItemStack itemstack = playerentity.getHeldItem(handIn);


        float f7 = playerentity.rotationYaw;
        float f = playerentity.rotationPitch;
        float f1 = -MathHelper.sin(f7 * ((float)Math.PI / 180F)) * MathHelper.cos(f * ((float)Math.PI / 180F));
        float f2 = -MathHelper.sin(f * ((float)Math.PI / 180F));
        float f3 = MathHelper.cos(f7 * ((float)Math.PI / 180F)) * MathHelper.cos(f * ((float)Math.PI / 180F));
        float f4 = MathHelper.sqrt(f1 * f1 + f2 * f2 + f3 * f3);
        float f5 = 3.0F * (1.0F  / 4.0F);
        f1 = f1 * (f5 / f4);
        f2 = f2 * (f5 / f4);
        f3 = f3 * (f5 / f4);


        if (playerentity.isOnGround()) {
            playerentity.addVelocity((double)f1, (double)f2, (double)f3);
            playerentity.startSpinAttack(20);
            playerentity.move(MoverType.SELF, new Vector3d(0.0D, (double)1.1999999F, 0.0D));
        }
        return ActionResult.resultConsume(itemstack);

    }
}

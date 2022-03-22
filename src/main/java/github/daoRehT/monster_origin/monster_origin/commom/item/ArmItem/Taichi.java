package github.daoRehT.monster_origin.monster_origin.commom.item.ArmItem;

import github.daoRehT.monster_origin.monster_origin.core.util.ModItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;

public class Taichi extends SwordItem {

    public Taichi() {
        super(ModItemTier.ORIGIN, 8, -2.4F, new Item.Properties().group(ItemGroup.COMBAT));
    }
}

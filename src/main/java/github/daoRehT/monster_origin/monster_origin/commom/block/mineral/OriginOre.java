package github.daoRehT.monster_origin.monster_origin.commom.block.mineral;

import github.daoRehT.monster_origin.monster_origin.core.init.BlockRegistry;
import net.minecraft.block.OreBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;

public class OriginOre extends OreBlock {
    public OriginOre() {
        super(Properties.create(Material.ROCK).setRequiresTool().hardnessAndResistance(3.0F, 3.0F));
    }
}

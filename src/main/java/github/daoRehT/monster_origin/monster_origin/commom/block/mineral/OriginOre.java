package github.daoRehT.monster_origin.monster_origin.commom.block.mineral;

import net.minecraft.block.OreBlock;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class OriginOre extends OreBlock {
    public OriginOre() {
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(3.0F, 3.0F)
                .harvestTool(ToolType.get("pickaxe"))
                .harvestLevel(2)
                .setRequiresTool()
        );
    }

//    @Override
//    protected int getExperience(Random rand){
//        return MathHelper.nextInt(rand, 5, 8);
//    }
//
//    @Override
//    public int getExpDrop(BlockState state, net.minecraft.world.IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
//        return silktouch == 0 ? this.getExperience(RANDOM) : 0;
//    }
}

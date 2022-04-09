package github.daoRehT.monster_origin.monster_origin.core.registry;

import github.daoRehT.monster_origin.monster_origin.Monster_origin;
import github.daoRehT.monster_origin.monster_origin.commom.block.BlockList;
import github.daoRehT.monster_origin.monster_origin.commom.block.mineral.OriginOre;
import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)

public class BlockRegistry {
    public static final String MOD_ID = Monster_origin.MOD_ID;

    @SubscribeEvent
    public static void registerItem(final RegistryEvent.Register<Block> event){
        event.getRegistry().registerAll(
                BlockList.origin_ore = new OriginOre().setRegistryName(location("origin_ore"))
        );
    }

    private static ResourceLocation location(String name) {
        return new ResourceLocation(MOD_ID,name);
    }
}

package github.daoRehT.monster_origin.monster_origin.core.registry.event;

import github.daoRehT.monster_origin.monster_origin.commom.entity.render.TaiChiRender;
import github.daoRehT.monster_origin.monster_origin.core.registry.EntityRegistry;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEvent {
    @SubscribeEvent
    public static void onClientSetUpEvent(FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(EntityRegistry.TAICHI_ENTITY.get(), (EntityRendererManager manager) -> {
            return new TaiChiRender(manager);
        });
    }
}

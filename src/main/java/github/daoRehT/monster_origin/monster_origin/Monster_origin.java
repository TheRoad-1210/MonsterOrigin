package github.daoRehT.monster_origin.monster_origin;

import github.daoRehT.monster_origin.monster_origin.core.registry.EntityRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("monster_origin")
public class Monster_origin {

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "monster_origin";

    public Monster_origin() {

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
        EntityRegistry.ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

}

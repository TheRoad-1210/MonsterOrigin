package github.daoRehT.monster_origin.monster_origin;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("monster_origin")
public class Monster_origin {

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "monster_origin";

    public Monster_origin() {

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

}

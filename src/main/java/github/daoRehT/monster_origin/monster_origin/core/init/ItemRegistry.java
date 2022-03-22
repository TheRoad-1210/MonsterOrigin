package github.daoRehT.monster_origin.monster_origin.core.init;

import github.daoRehT.monster_origin.monster_origin.Monster_origin;
import github.daoRehT.monster_origin.monster_origin.commom.item.ArmItem.BusterSword;
import github.daoRehT.monster_origin.monster_origin.commom.item.ArmItem.Taichi;
import github.daoRehT.monster_origin.monster_origin.commom.item.ItemList;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.Logger;


@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)

public class ItemRegistry {
    public static final Logger LOGGER = Monster_origin.LOGGER;
    public static final String MOD_ID = Monster_origin.MOD_ID;


        @SubscribeEvent
        public static void registerItem(final RegistryEvent.Register<Item> event){

            event.getRegistry().registerAll(

                    ItemList.surprisebox = new Item(new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName(location("surprisebox")),
                    ItemList.taichi = new Taichi().setRegistryName(location("taichi")),
                    ItemList.origin_mineral = new Item(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName(location("origin_mineral")),
                    ItemList.buster_sword = new BusterSword().setRegistryName(location("buster_sword"))

            );

        }

        private static ResourceLocation location(String name) {
            return new ResourceLocation(MOD_ID,name);
        }
    }

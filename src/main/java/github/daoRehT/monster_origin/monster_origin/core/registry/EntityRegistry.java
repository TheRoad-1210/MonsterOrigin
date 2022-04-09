package github.daoRehT.monster_origin.monster_origin.core.registry;

import github.daoRehT.monster_origin.monster_origin.Monster_origin;
import github.daoRehT.monster_origin.monster_origin.commom.entity.TaiChiEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityRegistry {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, Monster_origin.MOD_ID);
    public static final RegistryObject<EntityType<TaiChiEntity>> TAICHI_ENTITY = ENTITY_TYPES
            .register("taichientity", () -> EntityType.Builder.create(TaiChiEntity::new, EntityClassification.MISC).size(3, 0.5F).build("taichientity"));
}

package top.srcres.mods.palmc;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class PalMCRegistries {
    public static DeferredRegister<EntityType<?>> ENTITIES;
    public static DeferredRegister.Items ITEMS;

    public static void init(IEventBus eventBus) {
        ENTITIES = DeferredRegister.create(Registries.ENTITY_TYPE, PalMC.MODID);
        ITEMS = DeferredRegister.createItems(PalMC.MODID);

        ENTITIES.register(eventBus);
        ITEMS.register(eventBus);
    }
}

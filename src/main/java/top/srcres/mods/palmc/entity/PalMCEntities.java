package top.srcres.mods.palmc.entity;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import top.srcres.mods.palmc.PalMCRegistries;

import java.util.function.Supplier;

public class PalMCEntities {
    public static DeferredHolder<EntityType<? extends Entity>, EntityType<EntityHorus>> HORUS;

    // Has to be called manually to ensure the loading order is correct
    // to shed unexpected loading exceptions.
    public static void init(IEventBus eventBus) {
        eventBus.addListener(PalMCEntities::onEntityAttributeCreation);

        HORUS = register("horus", EntityType.Builder.of(EntityHorus::new, MobCategory.CREATURE)
                .sized(0.78F, 1.2F)
                .fireImmune()
                .setTrackingRange(256)
                .clientTrackingRange(10));
    }

    private static <T extends Entity> DeferredHolder<EntityType<? extends Entity>, EntityType<T>> register(String name, Supplier<EntityType<T>> typeSup) {
        // Forced type cast is added due to the compiler bug reporting type errors unexpectedly.
        return (DeferredHolder<EntityType<? extends Entity>, EntityType<T>>) PalMCRegistries.ENTITIES.register(name, typeSup);
    }

    private static <T extends Entity> DeferredHolder<EntityType<? extends Entity>, EntityType<T>> register(String name, EntityType.Builder<T> builder) {
        // *NOTE* that only one supplier can be given instead of a direct value,
        // for instantiating registry objects here will lead to exceptions to be thrown
        // because the registry is still frozen by vanilla and has not been unfrozen by NeoForge yet.
        return register(name, () -> builder.build(name));
    }

    private static void onEntityAttributeCreation(EntityAttributeCreationEvent event) {
        event.put(HORUS.get(), EntityHorus.createAttributes().build());
    }
}

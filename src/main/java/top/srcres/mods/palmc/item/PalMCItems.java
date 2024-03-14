package top.srcres.mods.palmc.item;

import net.minecraft.core.Registry;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import top.srcres.mods.palmc.PalMCRegistries;
import top.srcres.mods.palmc.entity.PalMCEntities;

import java.util.function.Supplier;

public class PalMCItems {
    public static DeferredHolder<Item, SpawnEggItem> HORUS_SPAWN_EGG;
    public static DeferredHolder<Item, Item> TEST;

    // Has to be called manually to ensure the loading order is correct
    // to shed unexpected loading exceptions.
    public static void init() {
        TEST = register("test", () -> new Item(new Item.Properties().stacksTo(64).setNoRepair()));
        HORUS_SPAWN_EGG = register("horus_spawn_egg", () -> new SpawnEggItem(PalMCEntities.HORUS.get(), 10592673, 16711680, new Item.Properties()));
    }

    private static <T extends Item> DeferredHolder<Item, T> register(String name, Supplier<T> itemSup) {
        return PalMCRegistries.ITEMS.register(name, itemSup);
    }
}

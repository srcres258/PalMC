package top.srcres.mods.palmc;

import net.neoforged.bus.api.IEventBus;
import top.srcres.mods.palmc.entity.PalMCEntities;
import top.srcres.mods.palmc.item.PalMCItems;

public class CommonProxy {
    /**
     * Called directly from the mod constructor right behind the instantiation of the proxy object.
     * @param eventBus The mod event bus.
     */
    public void setup(IEventBus eventBus) {
        PalMCRegistries.init(eventBus);

        PalMCEntities.init(eventBus);
        PalMCItems.init();
    }
}

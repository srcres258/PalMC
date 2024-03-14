package top.srcres.mods.palmc;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import top.srcres.mods.palmc.entity.PalMCEntities;
import top.srcres.mods.palmc.item.PalMCItems;

@Mod(PalMC.MODID)
public class PalMC {
    public static final String MODID = "palmc";

    public PalMC(IEventBus eventBus) {
        PalMCRegistries.init(eventBus);

        PalMCEntities.init();
        PalMCItems.init();
    }
}

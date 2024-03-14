package top.srcres.mods.palmc;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.DistExecutor;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.loading.FMLEnvironment;
import top.srcres.mods.palmc.client.ClientProxy;
import top.srcres.mods.palmc.entity.PalMCEntities;
import top.srcres.mods.palmc.item.PalMCItems;

@Mod(PalMC.MODID)
public class PalMC {
    public static final String MODID = "palmc";

    private CommonProxy proxy;

    public PalMC(IEventBus eventBus) {
        if (FMLEnvironment.dist.isClient())
            proxy = new ClientProxy();
        else
            proxy = new CommonProxy();

        proxy.setup(eventBus);
    }
}

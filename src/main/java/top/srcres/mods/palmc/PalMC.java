package top.srcres.mods.palmc;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.DistExecutor;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.loading.FMLEnvironment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.srcres.mods.palmc.client.ClientProxy;
import top.srcres.mods.palmc.entity.PalMCEntities;
import top.srcres.mods.palmc.item.PalMCItems;

@Mod(PalMC.MODID)
public class PalMC {
    public static final String MODID = "palmc";

    private static PalMC instance;

    private CommonProxy proxy;
    private Logger modLogger;

    public PalMC(IEventBus eventBus) {
        instance = this;

        modLogger = LoggerFactory.getLogger(PalMC.MODID);

        if (FMLEnvironment.dist.isClient())
            proxy = new ClientProxy();
        else
            proxy = new CommonProxy();

        proxy.setup(eventBus);
    }

    public static PalMC getInstance() {
        // Prevent null value from being returned to avoid potential NullPointerException.
        if (instance == null)
            throw new IllegalStateException("Attempting to obtain PalMC mod instance before it's constructed.");
        return instance;
    }

    public Logger getModLogger() {
        return modLogger;
    }
}

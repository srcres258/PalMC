package top.srcres.mods.palmc.client;

import net.neoforged.bus.api.IEventBus;
import top.srcres.mods.palmc.CommonProxy;

public class ClientProxy extends CommonProxy {
    @Override
    public void setup(IEventBus eventBus) {
        // The super method *must* be called to accomplish basic settings
        // such as initialization of items, blocks, etc.
        super.setup(eventBus);
    }
}

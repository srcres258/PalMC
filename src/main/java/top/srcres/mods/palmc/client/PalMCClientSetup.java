package top.srcres.mods.palmc.client;

import net.minecraft.client.renderer.entity.EntityRenderers;
import top.srcres.mods.palmc.client.model.EntityHorusModel;
import top.srcres.mods.palmc.client.renderer.HorusRenderer;
import top.srcres.mods.palmc.entity.PalMCEntities;

public class PalMCClientSetup {
    public static EntityHorusModel HORUS_MODEL;

    public static void setupRenderers() {
        EntityRenderers.register(PalMCEntities.HORUS.get(), context -> new HorusRenderer(context, HORUS_MODEL, 1));
    }

    public static void setupModels() {
        HORUS_MODEL = new EntityHorusModel();
    }
}

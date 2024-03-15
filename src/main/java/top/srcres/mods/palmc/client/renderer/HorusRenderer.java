package top.srcres.mods.palmc.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import top.srcres.mods.palmc.client.model.EntityHorusModel;
import top.srcres.mods.palmc.entity.EntityHorus;
import top.srcres.mods.palmc.util.LogHelper;

public class HorusRenderer extends MobRenderer<EntityHorus, EntityHorusModel> {
    public HorusRenderer(EntityRendererProvider.Context pContext, EntityHorusModel pModel, float pShadowRadius) {
        super(pContext, pModel, pShadowRadius);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityHorus entityHorus) {
        return null;//TODO
    }

    @Override
    public void render(EntityHorus pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
        LogHelper.d("rendering");//TODO
    }
}

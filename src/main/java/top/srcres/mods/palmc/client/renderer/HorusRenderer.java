package top.srcres.mods.palmc.client.renderer;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.Resource;
import net.neoforged.neoforge.client.model.geometry.GeometryLoaderManager;
import net.neoforged.neoforge.client.model.geometry.StandaloneGeometryBakingContext;
import net.neoforged.neoforge.client.model.obj.ObjLoader;
import net.neoforged.neoforge.client.model.obj.ObjModel;
import net.neoforged.neoforge.client.model.renderable.CompositeRenderable;
import top.srcres.mods.palmc.client.model.EntityHorusModel;
import top.srcres.mods.palmc.entity.EntityHorus;
import top.srcres.mods.palmc.util.LogHelper;

import java.io.BufferedReader;
import java.io.IOException;

public class HorusRenderer extends MobRenderer<EntityHorus, EntityHorusModel> {
    private CompositeRenderable renderable;

    public HorusRenderer(EntityRendererProvider.Context pContext, EntityHorusModel pModel, float pShadowRadius) {
        super(pContext, pModel, pShadowRadius);

        ResourceLocation location = new ResourceLocation("palmc", "models/entity/horus.json");
        Resource resource = Minecraft.getInstance().getResourceManager().getResource(location).get();
        try (BufferedReader reader = resource.openAsReader()) {
            JsonObject object = JsonParser.parseReader(reader).getAsJsonObject();
            ObjLoader loader = (ObjLoader) GeometryLoaderManager.get(new ResourceLocation("neoforge:obj"));
            ObjModel model = loader.read(object, null);
            StandaloneGeometryBakingContext context = StandaloneGeometryBakingContext.builder().build(new ResourceLocation("palmc", "horus"));
            renderable = model.bakeRenderable(context);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ResourceLocation getTextureLocation(EntityHorus entityHorus) {
        return null;//TODO
    }

    @Override
    public void render(EntityHorus pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
        LogHelper.d("rendering");//TODO
        renderable.render(pPoseStack, pBuffer, (name) -> RenderType.solid(), pPackedLight, 0, pPartialTicks, CompositeRenderable.Transforms.EMPTY);
    }
}

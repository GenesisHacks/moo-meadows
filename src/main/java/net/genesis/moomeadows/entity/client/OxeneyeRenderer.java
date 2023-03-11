package net.genesis.entity.client;

import net.genesis.entity.Custom.OxeneyeEntity;
import net.genesis.mmInit;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.renderer.DynamicGeoEntityRenderer;

import javax.annotation.Nullable;

public class OxeneyeRenderer extends DynamicGeoEntityRenderer<OxeneyeEntity> {

    public OxeneyeRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new OxeneyeModel());
        this.shadowRadius = 0.5f;
    }

    @Override
    public Identifier getTextureLocation(OxeneyeEntity instance){
        return new Identifier(mmInit.MOD_ID, "textures/entity/oxeneye.png");
    }



    @Override
    public RenderLayer getRenderType(OxeneyeEntity animatable, Identifier texture, @Nullable VertexConsumerProvider bufferSource, float partialTick){
        return super.getRenderType(animatable, texture, bufferSource, partialTick);
    }

}

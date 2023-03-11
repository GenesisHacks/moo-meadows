package net.genesis.entity.client;

import net.genesis.entity.Custom.BushybovidaeEntity;
import net.genesis.mmInit;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.renderer.DynamicGeoEntityRenderer;

import javax.annotation.Nullable;

public class BushybovidaeRenderer extends DynamicGeoEntityRenderer<BushybovidaeEntity> {

    public BushybovidaeRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new BushybovidaeModel());
        this.shadowRadius = 0.5f;
    }

    @Override
    public Identifier getTextureLocation(BushybovidaeEntity instance){
        return new Identifier(mmInit.MOD_ID, "textures/entity/bushybovidae.png");
    }



    @Override
    public RenderLayer getRenderType(BushybovidaeEntity animatable, Identifier texture, @Nullable VertexConsumerProvider bufferSource, float partialTick){
        return super.getRenderType(animatable, texture, bufferSource, partialTick);
    }
}

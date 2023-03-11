package net.genesis.entity.client;

import net.genesis.entity.Custom.LilycowEntity;
import net.genesis.mmInit;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.renderer.DynamicGeoEntityRenderer;

import javax.annotation.Nullable;

public class LilycowRenderer extends DynamicGeoEntityRenderer<LilycowEntity> {

    public LilycowRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new LilycowModel());
        this.shadowRadius = 0.5f;
    }

    @Override
    public Identifier getTextureLocation(LilycowEntity instance){
        return new Identifier(mmInit.MOD_ID, "textures/entity/lilythecow.png");
    }



    @Override
    public RenderLayer getRenderType(LilycowEntity animatable, Identifier texture, @Nullable VertexConsumerProvider bufferSource, float partialTick){
        return super.getRenderType(animatable, texture, bufferSource, partialTick);
    }

}

package net.genesis.entity.client;

import net.genesis.entity.Custom.BloocowEntity;
import net.genesis.mmInit;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.renderer.DynamicGeoEntityRenderer;

import javax.annotation.Nullable;

public class BloocowRenderer extends DynamicGeoEntityRenderer<BloocowEntity>{

    public BloocowRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new BloocowModel());
        this.shadowRadius = 0.5f;
    }

    @Override
    public Identifier getTextureLocation(BloocowEntity instance){
        return new Identifier(mmInit.MOD_ID, "textures/entity/bloocow.png");
    }



    @Override
    public RenderLayer getRenderType(BloocowEntity animatable, Identifier texture, @Nullable VertexConsumerProvider bufferSource, float partialTick){
        return super.getRenderType(animatable, texture, bufferSource, partialTick);
    }
    
}

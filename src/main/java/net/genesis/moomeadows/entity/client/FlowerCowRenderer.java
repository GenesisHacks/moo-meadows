package net.genesis.entity.client;

import net.genesis.entity.Custom.FlowerCowEntity;
import net.genesis.mmInit;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.renderer.DynamicGeoEntityRenderer;

import javax.annotation.Nullable;

public class FlowerCowRenderer extends DynamicGeoEntityRenderer<FlowerCowEntity> {


    public FlowerCowRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new FlowerCowModel());
        this.shadowRadius = 0.5f;
    }

    @Override
    public Identifier getTextureLocation(FlowerCowEntity instance){
        return new Identifier(mmInit.MOD_ID, "textures/entity/aromaticalliumbovine.png");
    }



    @Override
    public RenderLayer getRenderType(FlowerCowEntity animatable, Identifier texture, @Nullable VertexConsumerProvider bufferSource, float partialTick){
        return super.getRenderType(animatable, texture, bufferSource, partialTick);
    }


}

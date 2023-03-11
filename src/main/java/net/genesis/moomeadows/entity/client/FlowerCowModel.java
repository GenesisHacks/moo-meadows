package net.genesis.entity.client;

import net.genesis.entity.Custom.FlowerCowEntity;
import net.genesis.mmInit;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class FlowerCowModel  extends GeoModel<FlowerCowEntity> {

    @Override
    public Identifier getModelResource(FlowerCowEntity animatable) {
        return new Identifier(mmInit.MOD_ID, "geo/moomeadows.geo.json");
    }

    @Override
    public Identifier getTextureResource(FlowerCowEntity animatable) {
        return new Identifier(mmInit.MOD_ID, "textures/entity/aromaticalliumbovine.png");
    }

    @Override
    public Identifier getAnimationResource(FlowerCowEntity animatable) {
        return new Identifier(mmInit.MOD_ID, "animations/moomeadows.animation.json");
    }

}

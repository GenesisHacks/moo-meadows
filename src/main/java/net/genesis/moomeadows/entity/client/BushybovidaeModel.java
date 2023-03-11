package net.genesis.entity.client;

import net.genesis.entity.Custom.BloocowEntity;
import net.genesis.entity.Custom.BushybovidaeEntity;
import net.genesis.mmInit;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class BushybovidaeModel extends GeoModel<BushybovidaeEntity> {

    @Override
    public Identifier getModelResource(BushybovidaeEntity animatable) {
        return new Identifier(mmInit.MOD_ID, "geo/moomeadows.geo.json");
    }

    @Override
    public Identifier getTextureResource(BushybovidaeEntity animatable) {
        return new Identifier(mmInit.MOD_ID, "textures/entity/bushybovidae.png");
    }

    @Override
    public Identifier getAnimationResource(BushybovidaeEntity animatable) {
        return new Identifier(mmInit.MOD_ID, "animations/moomeadows.animation.json");
    }
}

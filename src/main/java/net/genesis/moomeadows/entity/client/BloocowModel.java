package net.genesis.entity.client;

import net.genesis.entity.Custom.BloocowEntity;
import net.genesis.mmInit;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class BloocowModel extends GeoModel<BloocowEntity>{

    @Override
    public Identifier getModelResource(BloocowEntity animatable) {
        return new Identifier(mmInit.MOD_ID, "geo/moomeadows.geo.json");
    }

    @Override
    public Identifier getTextureResource(BloocowEntity animatable) {
        return new Identifier(mmInit.MOD_ID, "textures/entity/bloocow.png");
    }

    @Override
    public Identifier getAnimationResource(BloocowEntity animatable) {
        return new Identifier(mmInit.MOD_ID, "animations/moomeadows.animation.json");
    }
}

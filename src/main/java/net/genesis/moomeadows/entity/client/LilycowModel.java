package net.genesis.entity.client;

import net.genesis.entity.Custom.LilycowEntity;
import net.genesis.mmInit;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class LilycowModel extends GeoModel<LilycowEntity> {

    @Override
    public Identifier getModelResource(LilycowEntity animatable) {
        return new Identifier(mmInit.MOD_ID, "geo/moomeadows.geo.json");
    }

    @Override
    public Identifier getTextureResource(LilycowEntity animatable) {
        return new Identifier(mmInit.MOD_ID, "textures/entity/lilythecow.png");
    }

    @Override
    public Identifier getAnimationResource(LilycowEntity animatable) {
        return new Identifier(mmInit.MOD_ID, "animations/moomeadows.animation.json");
    }
}

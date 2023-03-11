package net.genesis.entity.client;

import net.genesis.entity.Custom.OxeneyeEntity;
import net.genesis.mmInit;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class OxeneyeModel extends GeoModel<OxeneyeEntity> {

    @Override
    public Identifier getModelResource(OxeneyeEntity animatable) {
        return new Identifier(mmInit.MOD_ID, "geo/moomeadows.geo.json");
    }

    @Override
    public Identifier getTextureResource(OxeneyeEntity animatable) {
        return new Identifier(mmInit.MOD_ID, "textures/entity/oxeneye.png");
    }

    @Override
    public Identifier getAnimationResource(OxeneyeEntity animatable) {
        return new Identifier(mmInit.MOD_ID, "animations/moomeadows.animation.json");
    }
}

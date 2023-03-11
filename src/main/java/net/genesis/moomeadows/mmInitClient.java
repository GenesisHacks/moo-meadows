package net.genesis;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.genesis.entity.mmModEntities;
import net.genesis.entity.client.*;

public class mmInitClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(mmModEntities.BLOO, BloocowRenderer::new);
        EntityRendererRegistry.register(mmModEntities.ALLI, FlowerCowRenderer::new);
        EntityRendererRegistry.register(mmModEntities.LILY, LilycowRenderer::new);
        EntityRendererRegistry.register(mmModEntities.OXEN, OxeneyeRenderer::new);
        EntityRendererRegistry.register(mmModEntities.BUSH, BushybovidaeRenderer::new);
    }
}

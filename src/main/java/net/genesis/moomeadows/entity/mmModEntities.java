package net.genesis.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.genesis.entity.Custom.*;
import net.genesis.mmInit;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class mmModEntities {
    //ALLIUM
    public static final EntityType<FlowerCowEntity> ALLI = Registry.register(Registries.ENTITY_TYPE, new Identifier(mmInit.MOD_ID, "aromatic_allium_bovine"),
            FabricEntityTypeBuilder.create(SpawnGroup.AMBIENT, FlowerCowEntity::new)

                    .dimensions(EntityDimensions.fixed(1.4f,1.4f))
                    .build());
    //BLOOCOW
    public static final EntityType<BloocowEntity> BLOO = Registry.register(Registries.ENTITY_TYPE, new Identifier(mmInit.MOD_ID, "bloocow"),
            FabricEntityTypeBuilder.create(SpawnGroup.AMBIENT, BloocowEntity::new)

                    .dimensions(EntityDimensions.fixed(1.4f,1.4f))
                    .build());
    //LILYTHECOW
    public static final EntityType<LilycowEntity> LILY = Registry.register(Registries.ENTITY_TYPE, new Identifier(mmInit.MOD_ID, "lily_the_cow"),
            FabricEntityTypeBuilder.create(SpawnGroup.AMBIENT, LilycowEntity::new)

                    .dimensions(EntityDimensions.fixed(1.4f,1.4f))
                    .build());

    //OXENEYE
    public static final EntityType<OxeneyeEntity> OXEN = Registry.register(Registries.ENTITY_TYPE, new Identifier(mmInit.MOD_ID, "oxeneye"),
            FabricEntityTypeBuilder.create(SpawnGroup.AMBIENT, OxeneyeEntity::new)

                    .dimensions(EntityDimensions.fixed(1.4f,1.4f))
                    .build());

    //BUSHY
    public static final EntityType<BushybovidaeEntity> BUSH = Registry.register(Registries.ENTITY_TYPE, new Identifier(mmInit.MOD_ID, "bushy_bovidae"),
            FabricEntityTypeBuilder.create(SpawnGroup.AMBIENT, BushybovidaeEntity::new)

                    .dimensions(EntityDimensions.fixed(1.4f,1.4f))
                    .build());

}

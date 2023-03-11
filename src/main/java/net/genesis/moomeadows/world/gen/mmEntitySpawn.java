package net.genesis.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.genesis.entity.mmModEntities;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.world.Heightmap;
import net.minecraft.world.biome.BiomeKeys;

public class mmEntitySpawn {

    public static void mmaddEntitySpawn(){
        // BLOOCOW
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.MEADOW, BiomeKeys.FLOWER_FOREST, BiomeKeys.SUNFLOWER_PLAINS), SpawnGroup.AMBIENT, mmModEntities.BLOO, 10, 1, 10);
        SpawnRestriction.register(mmModEntities.BLOO, SpawnRestriction.Location.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, PassiveEntity::canMobSpawn);
        //ALLIUM
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.MEADOW, BiomeKeys.FLOWER_FOREST, BiomeKeys.SUNFLOWER_PLAINS), SpawnGroup.AMBIENT, mmModEntities.ALLI, 10, 1, 10);
        SpawnRestriction.register(mmModEntities.ALLI, SpawnRestriction.Location.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, PassiveEntity::canMobSpawn);
        //LILY
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.MEADOW, BiomeKeys.FLOWER_FOREST, BiomeKeys.SUNFLOWER_PLAINS), SpawnGroup.AMBIENT, mmModEntities.LILY, 10, 1, 10);
        SpawnRestriction.register(mmModEntities.LILY, SpawnRestriction.Location.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, PassiveEntity::canMobSpawn);
        //OXENEYE
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.MEADOW, BiomeKeys.FLOWER_FOREST, BiomeKeys.SUNFLOWER_PLAINS), SpawnGroup.AMBIENT, mmModEntities.OXEN, 10, 1, 10);
        SpawnRestriction.register(mmModEntities.OXEN, SpawnRestriction.Location.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, PassiveEntity::canMobSpawn);
        //BUSHY
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.MEADOW, BiomeKeys.SWAMP, BiomeKeys.MANGROVE_SWAMP), SpawnGroup.AMBIENT, mmModEntities.BUSH, 10, 1, 10);
        SpawnRestriction.register(mmModEntities.BUSH, SpawnRestriction.Location.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, PassiveEntity::canMobSpawn);
    }

}

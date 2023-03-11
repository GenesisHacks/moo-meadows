package net.genesis.entity;

import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.animation.RawAnimation;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.util.GeckoLibUtil;

public class animation {
    public static final RawAnimation walking_ani = RawAnimation.begin().thenLoop("animation.walk");
    public static final RawAnimation idle_ani = RawAnimation.begin().thenLoop("animation.idle");
    }

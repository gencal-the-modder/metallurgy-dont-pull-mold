package com.gencal.metallurgy_dont_pull_mold.mixin;

import fr.lucreeper74.createmetallurgy.content.casting.CastingBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CastingBlockEntity.class)
public abstract class CastingTableBlockEntityMixin {
    @Inject(
            method = "<init>",
            at = @At("TAIL")
    )
    private void modifyMoldInventoryBehavior(CallbackInfo ci) {
        ((CastingBlockEntity) (Object) this).moldInv.forbidExtraction();
    }
}
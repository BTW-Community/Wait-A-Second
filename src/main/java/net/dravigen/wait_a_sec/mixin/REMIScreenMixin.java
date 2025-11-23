package net.dravigen.wait_a_sec.mixin;

import emi.shims.java.com.unascribed.retroemi.REMIScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(REMIScreen.class)
public abstract class REMIScreenMixin {
	@Inject(method = "doesGuiPauseGame", at = @At("RETURN"), cancellable = true)
	private void pauseTheGame(CallbackInfoReturnable<Boolean> cir) {
		cir.setReturnValue(true);
	}
}

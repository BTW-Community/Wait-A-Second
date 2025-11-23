package net.dravigen.wait_a_sec.mixin;

import net.minecraft.src.GuiContainer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(GuiContainer.class)
public abstract class GuiContainerMixin {
	
	@Inject(method = "doesGuiPauseGame", at = @At("RETURN"), cancellable = true)
	private void pauseTheGame(CallbackInfoReturnable<Boolean> cir) {
		cir.setReturnValue(true);
	}
}


package me.alpha432.oyvey.features.modules.player;

import me.alpha432.oyvey.features.modules.Module;
import net.minecraft.item.Items;

public class FastThrow extends Module {
    public FastThrow() {
        super("FastThrow", "Makes you throw exp faster", Category.PLAYER, true, false, false);
    }

    @Override
    public void onUpdate() {
        if (nullCheck()) return;

        if (mc.player.isHolding(Items.EXPERIENCE_BOTTLE)) {
            mc.itemUseCooldown = 0;
        }
    }
}

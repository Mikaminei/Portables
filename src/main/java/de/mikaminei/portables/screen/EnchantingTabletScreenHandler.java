package de.mikaminei.portables.screen;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.*;

public class EnchantingTabletScreenHandler extends EnchantmentScreenHandler {

    public EnchantingTabletScreenHandler(int syncId, PlayerInventory inventory) {
        this(syncId, inventory, ScreenHandlerContext.EMPTY);
    }

    public EnchantingTabletScreenHandler(int syncId, PlayerInventory inventory, ScreenHandlerContext context) {
        super(syncId, inventory, context);
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return true;
    }
}

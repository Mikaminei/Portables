package de.mikaminei.portables.screen;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.text.Text;
import org.jetbrains.annotations.Nullable;

public class CraftingTabletScreenHandlerFactory implements NamedScreenHandlerFactory {

    private final Text title;

    public CraftingTabletScreenHandlerFactory(Text title) {
        this.title = title;
    }

    @Override
    public Text getDisplayName() {
        return title;
    }

    @Override
    public @Nullable ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
        return new CraftingTabletScreenHandler(syncId, playerInventory, ScreenHandlerContext.create(player.getWorld(), player.getBlockPos()));
    }
}

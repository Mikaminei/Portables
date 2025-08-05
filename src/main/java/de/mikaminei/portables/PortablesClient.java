package de.mikaminei.portables;

import de.mikaminei.portables.screen.ModScreenHandlerTypes;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.EnchantmentScreen;
import net.minecraft.client.gui.screen.ingame.HandledScreens;

public class PortablesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(ModScreenHandlerTypes.ENCHANTING_TABLET_SCREEN_HANDLER, EnchantmentScreen::new);
    }
}

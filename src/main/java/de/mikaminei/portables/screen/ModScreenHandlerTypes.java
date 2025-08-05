package de.mikaminei.portables.screen;

import de.mikaminei.portables.Portables;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlerTypes {

    public static final ScreenHandlerType<EnchantingTabletScreenHandler> ENCHANTING_TABLET_SCREEN_HANDLER =
            register("enchanting_tablet", EnchantingTabletScreenHandler::new);

    private static <T extends ScreenHandler> ScreenHandlerType<T> register(String id, ScreenHandlerType.Factory<T> factory) {
        return Registry.register(
                Registries.SCREEN_HANDLER,
                Identifier.of(Portables.MOD_ID, id),
                new ScreenHandlerType<>(factory, FeatureSet.empty())
        );
    }

    public static void initialize() {
        Portables.LOGGER.info("Registering {} Mod Screen Handler Types", Portables.MOD_ID);
    }
}

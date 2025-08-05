package de.mikaminei.portables;

import de.mikaminei.portables.item.ModItems;
import de.mikaminei.portables.screen.ModScreenHandlerTypes;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Portables implements ModInitializer {
	public static final String MOD_ID = "portables";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.initialize();
		ModScreenHandlerTypes.initialize();
	}
}
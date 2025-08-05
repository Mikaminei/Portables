package de.mikaminei.portables.item;

import de.mikaminei.portables.Portables;
import de.mikaminei.portables.item.custom.CraftingTabletItem;
import de.mikaminei.portables.item.custom.EnchantingTabletItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {
    public static final Item CRAFTING_TABLET =
            register("crafting_tablet", CraftingTabletItem::new, new Item.Settings());
    public static final Item ENCHANTING_TABLET =
            register("enchanting_tablet", EnchantingTabletItem::new, new Item.Settings());

    private ModItems() {}

    public static Item register(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Portables.MOD_ID, name));
        Item item = itemFactory.apply(settings.registryKey(itemKey));

        Registry.register(Registries.ITEM, itemKey, item);

        return item;
    }

    public static void initialize() {
        Portables.LOGGER.info("Registering {} Mod Items", Portables.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(itemGroup -> {
            itemGroup.add(CRAFTING_TABLET);
            itemGroup.add(ENCHANTING_TABLET);
        });
    }
}

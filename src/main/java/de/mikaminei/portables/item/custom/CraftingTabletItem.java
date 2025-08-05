package de.mikaminei.portables.item.custom;

import de.mikaminei.portables.screen.CraftingTabletScreenHandlerFactory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class CraftingTabletItem extends Item {

    public CraftingTabletItem(Settings settings) {
        super(settings.maxCount(1));
    }

    @Override
    public ActionResult use(World world, PlayerEntity user, Hand hand) {
        if (world.isClient) return ActionResult.SUCCESS;

        ServerPlayerEntity player = (ServerPlayerEntity) user;

        player.openHandledScreen(new CraftingTabletScreenHandlerFactory(
                Text.translatable("item.pocket-storage.crafting_tablet.title")));
        player.incrementStat(Stats.INTERACT_WITH_CRAFTING_TABLE);

        return ActionResult.SUCCESS;
    }
}

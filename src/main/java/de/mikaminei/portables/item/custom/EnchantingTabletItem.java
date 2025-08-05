package de.mikaminei.portables.item.custom;

import de.mikaminei.portables.screen.EnchantingTabletScreenHandlerFactory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class EnchantingTabletItem extends Item {

    public EnchantingTabletItem(Settings settings) {
        super(settings.maxCount(1));
    }

    @Override
    public ActionResult use(World world, PlayerEntity user, Hand hand) {
        if (world.isClient) return ActionResult.SUCCESS;

        ServerPlayerEntity player = (ServerPlayerEntity) user;

        player.openHandledScreen(new EnchantingTabletScreenHandlerFactory(
                Text.translatable("item.portables.enchanting_tablet.title")));

        return ActionResult.SUCCESS;
    }
}

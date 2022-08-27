
package net.texstudio.memesprojectdisc.item;

import net.minecraft.util.Identifier;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

public final class MPDItemGroup {
	public static ItemGroup get() {
		return ITEM_GROUP;
	}
	private static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(new Identifier("memesprojectdisc", "mpd")).icon(() -> {
		return new ItemStack(Items.MUSIC_DISC_WAIT);
	}).build();
}

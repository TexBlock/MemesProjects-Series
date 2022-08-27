
package net.texstudio.memesprojectredisc.itemgroup;

import net.texstudio.memesprojectredisc.item.DREAMERItem;
import net.texstudio.memesprojectredisc.MemesprojectRediscModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@MemesprojectRediscModElements.ModElement.Tag
public class MiscItemGroup extends MemesprojectRediscModElements.ModElement {
	public MiscItemGroup(MemesprojectRediscModElements instance) {
		super(instance, 18);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmisc") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(DREAMERItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}

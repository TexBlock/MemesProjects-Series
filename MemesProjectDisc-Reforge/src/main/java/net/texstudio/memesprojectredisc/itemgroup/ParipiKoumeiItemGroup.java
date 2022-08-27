
package net.texstudio.memesprojectredisc.itemgroup;

import net.texstudio.memesprojectredisc.item.BeCrazyForMeItem;
import net.texstudio.memesprojectredisc.MemesprojectRediscModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@MemesprojectRediscModElements.ModElement.Tag
public class ParipiKoumeiItemGroup extends MemesprojectRediscModElements.ModElement {
	public ParipiKoumeiItemGroup(MemesprojectRediscModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabparipi_koumei") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(BeCrazyForMeItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}

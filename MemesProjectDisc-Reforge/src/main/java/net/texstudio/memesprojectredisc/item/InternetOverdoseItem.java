
package net.texstudio.memesprojectredisc.item;

import net.texstudio.memesprojectredisc.itemgroup.MiscItemGroup;
import net.texstudio.memesprojectredisc.MemesprojectRediscModElements;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;

@MemesprojectRediscModElements.ModElement.Tag
public class InternetOverdoseItem extends MemesprojectRediscModElements.ModElement {
	@ObjectHolder("memesproject_redisc:internet_overdose")
	public static final Item block = null;

	public InternetOverdoseItem(MemesprojectRediscModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, MemesprojectRediscModElements.sounds.get(new ResourceLocation("memesproject_redisc:internet_overdose")),
					new Item.Properties().group(MiscItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("internet_overdose");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}

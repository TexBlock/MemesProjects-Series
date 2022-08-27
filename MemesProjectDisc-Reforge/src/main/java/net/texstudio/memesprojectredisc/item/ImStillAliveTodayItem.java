
package net.texstudio.memesprojectredisc.item;

import net.texstudio.memesprojectredisc.itemgroup.ParipiKoumeiItemGroup;
import net.texstudio.memesprojectredisc.MemesprojectRediscModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

@MemesprojectRediscModElements.ModElement.Tag
public class ImStillAliveTodayItem extends MemesprojectRediscModElements.ModElement {
	@ObjectHolder("memesproject_redisc:im_still_alive_today")
	public static final Item block = null;

	public ImStillAliveTodayItem(MemesprojectRediscModElements instance) {
		super(instance, 22);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, MemesprojectRediscModElements.sounds.get(new ResourceLocation("memesproject_redisc:im_still_alive_today")),
					new Item.Properties().group(ParipiKoumeiItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("im_still_alive_today");
		}
	}
}

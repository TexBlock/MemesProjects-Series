
package net.texstudio.memesprojectredisc.item;

import net.minecraft.util.Rarity;
import net.minecraft.util.Identifier;
import net.minecraft.sound.SoundEvent;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemGroup;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

public class ParipiKoumeiOPFullMusicDisc extends MusicDiscItem {
	public ParipiKoumeiOPFullMusicDisc() {
		super(0, new SoundEvent(new Identifier("memesproject_redisc:chikichikibanban_full")),
				new FabricItemSettings().group(ItemGroup.MISC).maxCount(1).rarity(Rarity.RARE));
	}
}

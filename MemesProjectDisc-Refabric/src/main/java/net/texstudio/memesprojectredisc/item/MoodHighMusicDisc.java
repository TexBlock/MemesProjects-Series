
package net.texstudio.memesprojectredisc.item;

import net.minecraft.util.Rarity;
import net.minecraft.util.Identifier;
import net.minecraft.sound.SoundEvent;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemGroup;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

public class MoodHighMusicDisc extends MusicDiscItem {
	public MoodHighMusicDisc() {
		super(0, new SoundEvent(new Identifier("memesproject_redisc:moodhigh_original")),
				new FabricItemSettings().group(ItemGroup.MISC).maxCount(1).rarity(Rarity.RARE));
	}
}

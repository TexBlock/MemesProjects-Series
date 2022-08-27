/*
 *    MCreator note:
 *
 *    If you lock base mod element files, you can edit this file and the proxy files
 *    and they won't get overwritten. If you change your mod package or modid, you
 *    need to apply these changes to this file MANUALLY.
 *
 *
 *    If you do not lock base mod element files in Workspace settings, this file
 *    will be REGENERATED on each build.
 *
 */
package net.texstudio.memesprojectredisc;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.texstudio.memesprojectredisc.item.PartypiKongEDMusicDisc;
import net.texstudio.memesprojectredisc.item.ParipiKoumeiOPMusicDisc;
import net.texstudio.memesprojectredisc.item.ParipiKoumeiOPFullMusicDisc;
import net.texstudio.memesprojectredisc.item.ParipiKoumeiEDFullMusicDisc;
import net.texstudio.memesprojectredisc.item.ParipiKoumeiED2ndMusicDisc;
import net.texstudio.memesprojectredisc.item.OnlyMyRailgunMusicDisc;
import net.texstudio.memesprojectredisc.item.MoodHighMusicDisc;
import net.texstudio.memesprojectredisc.item.InternetoverdoseMusicDisc;

import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.sound.SoundEvent;
import net.minecraft.item.Item;

import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.fabricmc.api.ModInitializer;

public class MemesprojectRediscMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final Identifier chikichikibanban_tv_ver_ID = id("chikichikibanban_tv_ver");
	public static final SoundEvent chikichikibanban_tv_verEvent = new SoundEvent(chikichikibanban_tv_ver_ID);
	public static final Identifier internet_overdose_ID = id("internet_overdose");
	public static final SoundEvent internet_overdoseEvent = new SoundEvent(internet_overdose_ID);
	public static final Identifier moodhigh_1st_ID = id("moodhigh_1st");
	public static final SoundEvent moodhigh_1stEvent = new SoundEvent(moodhigh_1st_ID);
	public static final Identifier moodhigh_2nd_ID = id("moodhigh_2nd");
	public static final SoundEvent moodhigh_2ndEvent = new SoundEvent(moodhigh_2nd_ID);
	public static final Identifier only_my_railgun_ID = id("only_my_railgun");
	public static final SoundEvent only_my_railgunEvent = new SoundEvent(only_my_railgun_ID);
	public static final Identifier moodhigh_full_ver_ID = id("moodhigh_full_ver");
	public static final SoundEvent moodhigh_full_verEvent = new SoundEvent(moodhigh_full_ver_ID);
	public static final Identifier moodhigh_original_ID = id("moodhigh_original");
	public static final SoundEvent moodhigh_originalEvent = new SoundEvent(moodhigh_original_ID);
	public static final Identifier chikichikibanban_full_ID = id("chikichikibanban_full");
	public static final SoundEvent chikichikibanban_fullEvent = new SoundEvent(chikichikibanban_full_ID);
	public static final Item OnlyMyRailgun_ITEM = Registry.register(Registry.ITEM, id("only_my_railgun"), new OnlyMyRailgunMusicDisc());
	public static final Item Internetoverdose_ITEM = Registry.register(Registry.ITEM, id("internet_overdose"), new InternetoverdoseMusicDisc());
	public static final Item PartypiKongED_ITEM = Registry.register(Registry.ITEM, id("paripi_koumei_ed"), new PartypiKongEDMusicDisc());
	public static final Item ParipiKoumeiED2nd_ITEM = Registry.register(Registry.ITEM, id("paripi_koumei_ed_2nd"), new ParipiKoumeiED2ndMusicDisc());
	public static final Item ParipiKoumeiEDFull_ITEM = Registry.register(Registry.ITEM, id("paripi_koumei_ed_full"),
			new ParipiKoumeiEDFullMusicDisc());
	public static final Item MoodHigh_ITEM = Registry.register(Registry.ITEM, id("mood_high"), new MoodHighMusicDisc());
	public static final Item ParipiKoumeiOP_ITEM = Registry.register(Registry.ITEM, id("paripi_koumei_op"), new ParipiKoumeiOPMusicDisc());
	public static final Item ParipiKoumeiOPFull_ITEM = Registry.register(Registry.ITEM, id("paripi_koumei_op_full"),
			new ParipiKoumeiOPFullMusicDisc());

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing MemesprojectRediscMod");
		Registry.register(Registry.SOUND_EVENT, MemesprojectRediscMod.chikichikibanban_tv_ver_ID, MemesprojectRediscMod.chikichikibanban_tv_verEvent);
		Registry.register(Registry.SOUND_EVENT, MemesprojectRediscMod.internet_overdose_ID, MemesprojectRediscMod.internet_overdoseEvent);
		Registry.register(Registry.SOUND_EVENT, MemesprojectRediscMod.moodhigh_1st_ID, MemesprojectRediscMod.moodhigh_1stEvent);
		Registry.register(Registry.SOUND_EVENT, MemesprojectRediscMod.moodhigh_2nd_ID, MemesprojectRediscMod.moodhigh_2ndEvent);
		Registry.register(Registry.SOUND_EVENT, MemesprojectRediscMod.only_my_railgun_ID, MemesprojectRediscMod.only_my_railgunEvent);
		Registry.register(Registry.SOUND_EVENT, MemesprojectRediscMod.moodhigh_full_ver_ID, MemesprojectRediscMod.moodhigh_full_verEvent);
		Registry.register(Registry.SOUND_EVENT, MemesprojectRediscMod.moodhigh_original_ID, MemesprojectRediscMod.moodhigh_originalEvent);
		Registry.register(Registry.SOUND_EVENT, MemesprojectRediscMod.chikichikibanban_full_ID, MemesprojectRediscMod.chikichikibanban_fullEvent);
		CommandRegistrationCallback.EVENT.register((dispatcher, dedicated) -> {
		});
	}

	public static final Identifier id(String s) {
		return new Identifier("memesproject_redisc", s);
	}
}

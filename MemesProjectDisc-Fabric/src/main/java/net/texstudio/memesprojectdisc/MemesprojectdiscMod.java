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
package net.texstudio.memesprojectdisc;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.texstudio.memesprojectdisc.item.ShootingStarsMusicDisc;
import net.texstudio.memesprojectdisc.item.NightVoyagerMusicDisc;
import net.texstudio.memesprojectdisc.item.NeverGonnaGiveYouUpMusicDisc;
import net.texstudio.memesprojectdisc.item.MPDItemGroup;
import net.texstudio.memesprojectdisc.item.GoyangUburUburRemixedMusicDisc;
import net.texstudio.memesprojectdisc.item.BadAppleMusicDisc;
import net.texstudio.memesprojectdisc.item.BadApple2MusicDisc;

import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.sound.SoundEvent;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.fabricmc.api.ModInitializer;

public class MemesprojectdiscMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final Identifier bad_apple_ID = id("bad_apple");
	public static final SoundEvent bad_appleEvent = new SoundEvent(bad_apple_ID);
	public static final Identifier bad_apple2_ID = id("bad_apple2");
	public static final SoundEvent bad_apple2Event = new SoundEvent(bad_apple2_ID);
	public static final Identifier goyang_ubur_ubur_remixed_ID = id("goyang_ubur_ubur_remixed");
	public static final SoundEvent goyang_ubur_ubur_remixedEvent = new SoundEvent(goyang_ubur_ubur_remixed_ID);
	public static final Identifier never_gonna_give_you_up_ID = id("never_gonna_give_you_up");
	public static final SoundEvent never_gonna_give_you_upEvent = new SoundEvent(never_gonna_give_you_up_ID);
	public static final Identifier night_voyager_ID = id("night_voyager");
	public static final SoundEvent night_voyagerEvent = new SoundEvent(night_voyager_ID);
	public static final Identifier shooting_stars_ID = id("shooting_stars");
	public static final SoundEvent shooting_starsEvent = new SoundEvent(shooting_stars_ID);
	public static final Identifier freesia_ID = id("freesia");
	public static final SoundEvent freesiaEvent = new SoundEvent(freesia_ID);
	public static final Item BadApple_ITEM = Registry.register(Registry.ITEM, id("bad_apple"), new BadAppleMusicDisc());
	public static final Item BadApple2_ITEM = Registry.register(Registry.ITEM, id("bad_apple_2"), new BadApple2MusicDisc());
	public static final Item ShootingStars_ITEM = Registry.register(Registry.ITEM, id("shooting_stars"), new ShootingStarsMusicDisc());
	public static final Item NightVoyager_ITEM = Registry.register(Registry.ITEM, id("night_voyager"), new NightVoyagerMusicDisc());
	public static final Item NeverGonnaGiveYouUp_ITEM = Registry.register(Registry.ITEM, id("never_gonna_give_you_up"),
			new NeverGonnaGiveYouUpMusicDisc());
	public static final Item GoyangUburUburRemixed_ITEM = Registry.register(Registry.ITEM, id("goyang_ubur_ubur_remixed"),
			new GoyangUburUburRemixedMusicDisc());
	public static final ItemGroup MPD = MPDItemGroup.get();
	@Override
	public void onInitialize() {
		LOGGER.info("Initializing MemesprojectdiscMod");
		Registry.register(Registry.SOUND_EVENT, MemesprojectdiscMod.bad_apple_ID, MemesprojectdiscMod.bad_appleEvent);
		Registry.register(Registry.SOUND_EVENT, MemesprojectdiscMod.bad_apple2_ID, MemesprojectdiscMod.bad_apple2Event);
		Registry.register(Registry.SOUND_EVENT, MemesprojectdiscMod.goyang_ubur_ubur_remixed_ID, MemesprojectdiscMod.goyang_ubur_ubur_remixedEvent);
		Registry.register(Registry.SOUND_EVENT, MemesprojectdiscMod.never_gonna_give_you_up_ID, MemesprojectdiscMod.never_gonna_give_you_upEvent);
		Registry.register(Registry.SOUND_EVENT, MemesprojectdiscMod.night_voyager_ID, MemesprojectdiscMod.night_voyagerEvent);
		Registry.register(Registry.SOUND_EVENT, MemesprojectdiscMod.shooting_stars_ID, MemesprojectdiscMod.shooting_starsEvent);
		Registry.register(Registry.SOUND_EVENT, MemesprojectdiscMod.freesia_ID, MemesprojectdiscMod.freesiaEvent);
		CommandRegistrationCallback.EVENT.register((dispatcher, dedicated) -> {
		});
	}

	public static final Identifier id(String s) {
		return new Identifier("memesprojectdisc", s);
	}
}

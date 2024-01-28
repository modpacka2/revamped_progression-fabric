package net.switchot.revamped_progression;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Revamped_progression implements ModInitializer {
	public static final String MOD_ID = "revamped_progression_fabric";
    public static final Logger LOGGER = LoggerFactory.getLogger("revamped_progression");

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}
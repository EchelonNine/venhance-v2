package net.echelon.venhance;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VEnhance implements ModInitializer {
    public static final String MOD_ID = "venhance";
	public static final Logger LOGGER = LoggerFactory.getLogger("venhance");

	@Override
	public void onInitialize() {


		LOGGER.info("Hello Fabric world!");
	}
}
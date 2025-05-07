package com.gencal.metallurgy_dont_pull_mold;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(MetallurgyDontPullMold.MODID)
public class MetallurgyDontPullMold {
    public static final String MODID = "metallurgy_dont_pull_mold";
    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public MetallurgyDontPullMold() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("Setup completed for Metallurgy: Don't Pull Mold!");
    }
}
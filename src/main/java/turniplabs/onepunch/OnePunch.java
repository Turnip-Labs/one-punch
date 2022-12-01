package turniplabs.onepunch;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class OnePunch implements ModInitializer {
    public static final String MOD_ID = "onepunch";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static String name(String name) {
        return OnePunch.MOD_ID + "." + name;
    }

    @Override
    public void onInitialize() {
        LOGGER.info("All it takes is One Punch!");
    }
}

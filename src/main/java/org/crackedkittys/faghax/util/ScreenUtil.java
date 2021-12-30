package org.crackedkittys.faghax.util;

import static org.crackedkittys.faghax.Main.log;
import static org.crackedkittys.faghax.Main.mc;

public class ScreenUtil {

    public static boolean isValidScreen() {
        log.info("Screen is:" + mc.currentScreen);
        // Checking to make sure the clickgui screen is not interrupting something else.
        return (mc.currentScreen == null);
    }
}

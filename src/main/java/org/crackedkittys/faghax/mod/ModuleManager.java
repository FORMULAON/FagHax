package org.crackedkittys.faghax.mod;

import org.crackedkittys.faghax.mod.client.ClickGuiModule;
import org.crackedkittys.faghax.mod.client.HudModule;
import org.crackedkittys.faghax.mod.movement.AutoSprint;
import org.crackedkittys.faghax.mod.pvp.BedAura;
import org.crackedkittys.faghax.mod.pvp.CrystalAura;
import org.crackedkittys.faghax.mod.pvp.KillAura;
import org.crackedkittys.faghax.mod.render.Xray;

import java.util.ArrayList;

public class ModuleManager {
    public boolean isMouseClicked;

    public ArrayList<Module> mods;

    public ModuleManager() { // Registering modules
        mods = new ArrayList<>();
        // COMBAT
        mods.add(new CrystalAura());
        mods.add(new BedAura());
        mods.add(new KillAura());
        // CLIENT
        mods.add(new ClickGuiModule());
        mods.add(new HudModule());
        // RENDER
        mods.add(new Xray());
        // MOVEMENT
        mods.add(new AutoSprint());
    }

    public ArrayList<Module> getMods() {
        return mods;
    }


}

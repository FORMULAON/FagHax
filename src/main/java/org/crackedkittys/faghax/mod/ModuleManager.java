package org.crackedkittys.faghax.mod;

import org.crackedkittys.faghax.mod.client.ClickGuiModule;
import org.crackedkittys.faghax.mod.pvp.BedAura;
import org.crackedkittys.faghax.mod.pvp.CrystalAura;
import org.crackedkittys.faghax.mod.render.Xray;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class ModuleManager {

    public ArrayList<Module> mods;

    public ModuleManager() { // Registering modules
        mods = new ArrayList<>();
        // COMBAT
        mods.add(new CrystalAura());
        mods.add(new BedAura());
        // CLIENT
        mods.add(new ClickGuiModule());
        // RENDER
        mods.add(new Xray());
    }
}

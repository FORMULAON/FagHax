package org.crackedkittys.faghax.mod;

import org.crackedkittys.faghax.mod.pvp.BedAura;
import org.crackedkittys.faghax.mod.pvp.CrystalAura;
import org.crackedkittys.faghax.mod.render.Xray;

import java.util.ArrayList;

public class ModuleManager {

    public static ArrayList<Module> mods;

    public ModuleManager() {
        mods = new ArrayList<>();
        // COMBAT
        mods.add(new CrystalAura());
        mods.add(new BedAura());

        // RENDERl
        mods.add(new Xray());
    }
}

package net.dravigen.wait_a_sec;

import btw.AddonHandler;
import btw.BTWAddon;

public class WaitASecAddon extends BTWAddon {
    private static WaitASecAddon instance;

    public WaitASecAddon() {
        super();
    }

    @Override
    public void initialize() {
        AddonHandler.logMessage(this.getName() + " Version " + this.getVersionString() + " Initializing...");
    }
}
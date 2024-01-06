package win.implied.hypixelprofileswitcher.command;

import win.implied.hypixelprofileswitcher.HypixelProfileSwitcher;
import cc.polyfrost.oneconfig.utils.commands.annotations.Command;
import cc.polyfrost.oneconfig.utils.commands.annotations.Main;

/**
 * An example command implementing the Command api of OneConfig.
 * Registered in ExampleMod.java with `CommandManager.INSTANCE.registerCommand(new ExampleCommand());`
 *
 * @see Command
 * @see Main
 * @see HypixelProfileSwitcher
 */
@Command(value = HypixelProfileSwitcher.MODID, description = "Access the " + HypixelProfileSwitcher.NAME + " GUI.")
public class ConfigCommand {
    @Main
    private void handle() {
        HypixelProfileSwitcher.config.openGui();
    }
}
package win.implied.hypixelprofileswitcher;

import win.implied.hypixelprofileswitcher.command.ConfigCommand;
import win.implied.hypixelprofileswitcher.config.ProfileSwitcherConfig;
import cc.polyfrost.oneconfig.events.event.LocrawEvent;
import cc.polyfrost.oneconfig.libs.eventbus.Subscribe;
import cc.polyfrost.oneconfig.events.EventManager;
import cc.polyfrost.oneconfig.utils.hypixel.LocrawInfo;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.fml.common.Mod;
import cc.polyfrost.oneconfig.utils.commands.CommandManager;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = HypixelProfileSwitcher.MODID, name = HypixelProfileSwitcher.NAME, version = HypixelProfileSwitcher.VERSION)
public class HypixelProfileSwitcher {
    public static final String MODID = "@ID@";
    public static final String NAME = "@NAME@";
    public static final String VERSION = "@VER@";
    // Sets the variables from `gradle.properties`. See the `blossom` config in
    // `build.gradle.kts`.
    @Mod.Instance(MODID)
    public static HypixelProfileSwitcher INSTANCE; // Adds the instance of the mod, so we can access other variables.
    public static ProfileSwitcherConfig config;

    // Register the config and commands.
    @Mod.EventHandler
    public void onInit(FMLInitializationEvent event) {
        config = new ProfileSwitcherConfig();
        CommandManager.INSTANCE.registerCommand(new ConfigCommand());
    }

    public HypixelProfileSwitcher() {
        EventManager.INSTANCE.register(this);
    }

    public static LocrawInfo.GameType lastKnownMode = LocrawInfo.GameType.UNKNOWN;
    public static String lastSetProfile = "";

    public static void profileSwitch(String profileNameFromConfig, LocrawInfo.GameType mode) {
        if (profileNameFromConfig == "") {
            return;
        }
        HypixelProfileSwitcher.lastKnownMode = mode; // set it here to ingore non-changes (ie limbo to lobby)
        if (HypixelProfileSwitcher.lastSetProfile == profileNameFromConfig) {
            return;
        }
        HypixelProfileSwitcher.lastSetProfile = profileNameFromConfig;
        ClientCommandHandler.instance.executeCommand(Minecraft.getMinecraft().thePlayer,
                "/oneconfig profile switch " + profileNameFromConfig);
    }

    @Subscribe
    public void onLocraw(LocrawEvent event) {
        LocrawInfo.GameType currentGameType = event.info.getGameType();
        if (currentGameType == HypixelProfileSwitcher.lastKnownMode) {
            return;
        }
        switch (currentGameType) {
            case ARCADE_GAMES:
                HypixelProfileSwitcher.profileSwitch(ProfileSwitcherConfig.arcade_games_profile_name, currentGameType);
                break;
            case ARENA:
                HypixelProfileSwitcher.profileSwitch(ProfileSwitcherConfig.arena_profile_name, currentGameType);
                break;
            case BEDWARS:
                HypixelProfileSwitcher.profileSwitch(ProfileSwitcherConfig.bedwars_profile_name, currentGameType);
                break;
            case BUILD_BATTLE:
                HypixelProfileSwitcher.profileSwitch(ProfileSwitcherConfig.build_battle_profile_name, currentGameType);
                break;
            case BLITZ_SG:
                HypixelProfileSwitcher.profileSwitch(ProfileSwitcherConfig.blitz_sg_profile_name, currentGameType);
                break;
            case CLASSIC_GAMES:
                HypixelProfileSwitcher.profileSwitch(ProfileSwitcherConfig.classic_games_profile_name, currentGameType);
                break;
            case COPS_AND_CRIMS:
                HypixelProfileSwitcher.profileSwitch(ProfileSwitcherConfig.cops_n_crims_profile_name, currentGameType);
                break;
            case DUELS:
                HypixelProfileSwitcher.profileSwitch(ProfileSwitcherConfig.duels_profile_name, currentGameType);
                break;
            case HOUSING:
                HypixelProfileSwitcher.profileSwitch(ProfileSwitcherConfig.housing_profile_name, currentGameType);
                break;
            case MAIN:
                HypixelProfileSwitcher.profileSwitch(ProfileSwitcherConfig.main_profile_name, currentGameType);
                break;
            case MEGA_WALLS:
                HypixelProfileSwitcher.profileSwitch(ProfileSwitcherConfig.mega_walls_profile_name, currentGameType);
                break;
            case MURDER_MYSTERY:
                HypixelProfileSwitcher.profileSwitch(ProfileSwitcherConfig.murder_mystery_profile_name,
                        currentGameType);
                break;
            case PAINTBALL:
                HypixelProfileSwitcher.profileSwitch(ProfileSwitcherConfig.paintball_profile_name, currentGameType);
                break;
            case PIT:
                HypixelProfileSwitcher.profileSwitch(ProfileSwitcherConfig.pit_profile_name, currentGameType);
                break;
            case PROTOTYPE:
                HypixelProfileSwitcher.profileSwitch(ProfileSwitcherConfig.prototype_profile_name, currentGameType);
                break;
            case QUAKE:
                HypixelProfileSwitcher.profileSwitch(ProfileSwitcherConfig.quakecraft_profile_name, currentGameType);
                break;
            case REPLAY:
                HypixelProfileSwitcher.profileSwitch(ProfileSwitcherConfig.replay_profile_name, currentGameType);
                break;
            case SKYBLOCK:
                HypixelProfileSwitcher.profileSwitch(ProfileSwitcherConfig.skyblock_profile_name, currentGameType);
                break;
            case SKYWARS:
                HypixelProfileSwitcher.profileSwitch(ProfileSwitcherConfig.skywars_profile_name, currentGameType);
                break;
            case SMASH_HEROES:
                HypixelProfileSwitcher.profileSwitch(ProfileSwitcherConfig.smash_heroes_profile_name, currentGameType);
                break;
            case SPEED_UHC:
                HypixelProfileSwitcher.profileSwitch(ProfileSwitcherConfig.speed_uhc_profile_name, currentGameType);
                break;
            case TNT_GAMES:
                HypixelProfileSwitcher.profileSwitch(ProfileSwitcherConfig.tnt_games_profile_name, currentGameType);
                break;
            case TURBO_KART_RACERS:
                HypixelProfileSwitcher.profileSwitch(ProfileSwitcherConfig.turbo_kart_racers_profile_name,
                        currentGameType);
                break;
            case UHC_CHAMPIONS:
                HypixelProfileSwitcher.profileSwitch(ProfileSwitcherConfig.uhc_champions_profile_name, currentGameType);
                break;
            case VAMPIREZ:
                HypixelProfileSwitcher.profileSwitch(ProfileSwitcherConfig.vampirez_profile_name, currentGameType);
                break;
            default:
                break;
        }
    }
}

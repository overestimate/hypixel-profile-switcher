package win.implied.hypixelprofileswitcher.config;

import win.implied.hypixelprofileswitcher.HypixelProfileSwitcher;
import cc.polyfrost.oneconfig.config.Config;
import cc.polyfrost.oneconfig.config.annotations.Text;
import cc.polyfrost.oneconfig.config.data.Mod;
import cc.polyfrost.oneconfig.config.data.ModType;
import cc.polyfrost.oneconfig.config.data.OptionSize;

/**
 * The main Config entrypoint that extends the Config type and inits the config
 * options.
 * See <a href="https://docs.polyfrost.cc/oneconfig/config/adding-options">this
 * link</a> for more config Options
 */
public class ProfileSwitcherConfig extends Config {

    @Text(size = OptionSize.DUAL, name = "Arcade Games Lobby")
    public static String arcade_games_profile_name = "";

    @Text(size = OptionSize.DUAL, name = "Arena")
    public static String arena_profile_name = "";

    @Text(size = OptionSize.DUAL, name = "Bedwars")

    public static String bedwars_profile_name = "";

    @Text(size = OptionSize.DUAL, name = "Build Battle")
    public static String build_battle_profile_name = "";

    @Text(size = OptionSize.DUAL, name = "Blitz SG")
    public static String blitz_sg_profile_name = "";

    @Text(size = OptionSize.DUAL, name = "Classic Games Lobby")
    public static String classic_games_profile_name = "";

    @Text(size = OptionSize.DUAL, name = "Cops 'n' Crims")
    public static String cops_n_crims_profile_name = "";

    @Text(size = OptionSize.DUAL, name = "Duels")
    public static String duels_profile_name = "";

    @Text(size = OptionSize.DUAL, name = "Housing")
    public static String housing_profile_name = "";

    @Text(size = OptionSize.DUAL, name = "Main Lobby")
    public static String main_profile_name = "";

    @Text(size = OptionSize.DUAL, name = "Mega Walls")
    public static String mega_walls_profile_name = "";

    @Text(size = OptionSize.DUAL, name = "Murder Mystery")
    public static String murder_mystery_profile_name = "";

    @Text(size = OptionSize.DUAL, name = "Paintball")
    public static String paintball_profile_name = "";

    @Text(size = OptionSize.DUAL, name = "Pit")
    public static String pit_profile_name = "";

    @Text(size = OptionSize.DUAL, name = "Prototype Games (PTL, Dropper)")
    public static String prototype_profile_name = "";

    @Text(size = OptionSize.DUAL, name = "Quakecraft")
    public static String quakecraft_profile_name = "";

    @Text(size = OptionSize.DUAL, name = "Replay")
    public static String replay_profile_name = "";

    @Text(size = OptionSize.DUAL, name = "Skyblock")
    public static String skyblock_profile_name = "";

    @Text(size = OptionSize.DUAL, name = "Skywars")
    public static String skywars_profile_name = "";

    @Text(size = OptionSize.DUAL, name = "Smash Heroes")
    public static String smash_heroes_profile_name = "";

    @Text(size = OptionSize.DUAL, name = "Speed UHC")
    public static String speed_uhc_profile_name = "";

    @Text(size = OptionSize.DUAL, name = "TNT Games")
    public static String tnt_games_profile_name = "";

    @Text(size = OptionSize.DUAL, name = "Turbo Kart Racers")
    public static String turbo_kart_racers_profile_name = "";

    @Text(size = OptionSize.DUAL, name = "UHC Champions")
    public static String uhc_champions_profile_name = "";

    @Text(size = OptionSize.DUAL, name = "VampireZ")
    public static String vampirez_profile_name = "";

    @Text(size = OptionSize.DUAL, name = "Walls")
    public static String walls_profile_name = "";

    @Text(size = OptionSize.DUAL, name = "Warlords")
    public static String warlords_profile_name = "";

    @Text(size = OptionSize.DUAL, name = "Wool Wars")
    public static String wool_wars_profile_name = "";

    public ProfileSwitcherConfig() {
        super(new Mod(HypixelProfileSwitcher.NAME, ModType.UTIL_QOL), HypixelProfileSwitcher.MODID + ".json");
        initialize();
    }
}

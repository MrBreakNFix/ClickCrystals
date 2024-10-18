
# ClickCrystals (CC)

---------------------------------------------------------------

![Modrinth Downloads](https://img.shields.io/modrinth/dt/clickcrystals?label=Modrinth&color=04b54b)
![CurseForge Downloads](https://img.shields.io/curseforge/dt/946253?label=CurseForge&color=orange)
![GitHub Downloads (all assets, all releases)](https://img.shields.io/github/downloads/itzispyder/clickcrystals/total?label=GitHub&color=blue)
![PlanetMinecraft Downloads](https://img.shields.io/badge/PlanetMC-8.2k-brightgreen)
![Discord](https://img.shields.io/discord/1095079504516493404?label=Discord&color=b434eb)

## Scripting Now Has a Wiki!

Want to script custom modules but don't know how to script?
Don't worry, there's a full guide on how to create your own custom scripts and modules!

ClickCrystals script is an interrupted scripting language that allows you to scripts and macros
without any knowledge of coding. It contains no variables and mostly are just command lines that
are very similar to Minecraft.

The full documentation can be found [here](https://bit.ly/ccs-wiki)

Happy coding and cpvping!

\- ClickCrystal dev team

---------------------------------------------------------------

## What Version Should I Get?

| What You Have | What to get                       |
|:--------------|:----------------------------------|
| higher..      | how is that even possible?        |
| 1.21.1        | 1.21-(latestVersion) *recommended |
| 1.21          | 1.21-(latestVersion) *recommended |
| 1.20.6        | 1.20.6-(latestVersion)            |
| 1.20.5        | not supported                     |
| 1.20.4        | 1.20.4-(latestVersion)            |
| 1.20.3        | 1.20.4-(latestVersion)            |
| 1.20.2        | 1.20.2-(latestVersion)            |
| 1.20.1        | 1.20.1-(latestVersion)            |
| 1.20          | 1.20.1-(latestVersion)            |
| ..lower       | cry                               |

## Newest Changes
```yml
Version: 1.2.9

Scripted With Packets:
  - cancel_packet c2s <packetName>
  - cancel_packet s2c <packetName>
  - uncancel_packet c2s <packetName>
  - uncancel_packet s2c <packetName>

Scripting:
  - if hovering_over (ID)
  - if dead # will need to remove the original check for entity selection loop
  - switch **n
  - if item_count #ID
  - if item_count holding
  - if item_count off_holding
  - if item_durability #ID
  - if item_durability holding
  - if item_durability off_holding
  - removed the need to specifically format >,<,>=,<=, etc.. without spaces. (>= 3 is now possible, you wont be required to use >=3 without spaces anymore)
  - prevented adding insane amount of whitespaces in script strings

Add:
  - command to toggle on or all for all modules
  - add more animations to the configuration screens
  - add module auto replenish
  - add module death particles # i-no-one

Tweaks:
  - merge roles owner and dev, give i-no-one and josh (if pr passes) dev broadcasts

Patches:
  - fix online configs downtime
  - fix online scripts
  - fix possible bug with notification toast sound where it throws ConcurrentModificationException
  - fix reloading custom scripted modules resetting their keybinds
```

![demo](https://cdn.modrinth.com/data/YDYPZdGj/images/d4ad4320aaf5d8589829e3d1691ec5755422a778.png)

### Keybindings

-----------------------------------------

| **Keybinding** | **Key Name** | **Description**             |
|----------------|--------------|:----------------------------|
| APOSTROPHE     | `'`          | Open module settings screen |
| COMMA          | `,`          | Custom commands prefix      |
| COLON          | `;`          | Open hud editor screen      |

### Modules

-----------------------------------------

|    **Module**    |                                                **Description**                                                |
|:----------------:|:-------------------------------------------------------------------------------------------------------------:|
|     AxeSwap      |                          Switch to axe if hitting a shielding opponent with a sword                           |
|     BowSwap      |         Hotkey flame bow after placing cart. Requires TntSwap and its "instant" setting to be active          |
|   ElytraSwitch   |                       Swap to elytra from your hotbar when ever you are double jumping                        |
|     GapSwap      |                                 Swaps to gap when you right click with sword                                  |
|     RailSwap     |                                       Swaps to rails after shooting bow                                       |
|   ShieldSwitch   |                                     Hotkey to shield after clicking sword                                     |
|    SwordSwap     |                        Switch to sword after hitting a shielding opponent with an axe                         |
|     TntSwap      |                                       Swaps to tnt after placing rails                                        |
|  AutoDisconnect  |                         Disconnect you from the world when a certain condition is met                         |
|  EntityStatuses  |                               DEBUG: Sends received EntityStatusPackets in chat                               |
|    GuiBorders    |                         DEBUG: Renders borders around all ClickCrystals GUI elements                          |
|    HealthTags    |                               Renders a health tag card above selected entities                               |
|    InGameHuds    |                               Manager of all custom ClickCrystals in-game huds                                |
| InvPacketSniffer |                            Observe inventory packets you are sending to the server                            |
|     SelfGlow     |                                                 Am I Glowing?                                                 |
|    SilkTouch     |                               "Is there a silk touch module?" - I_Got_You_Dead                                |
|   AnchorSwitch   |             Whenever you place an anchor, switch to glowstone then back after it has been charged             |
|  AutoReplenish   |                     Automatically replenishes items from your inventory into your hotbar                      |
|   ClickCrystal   |                                     Binds end crystal place to left click                                     |
|  ClientCrystals  |                            Removes crystals client-side the moment you punch them                             |
|  CrystalAnchor   |                    Right click the ground with a crystal to switch to your respawn anchor                     |
|  CrystalSwitch   |               Whenever you punch bedrock or obsidian with a sword, it will switch to a crystal                |
|  ObsidianSwitch  |                            Punch the ground with your sword to switch to obsidian                             |
|   PearlSwitch    |                         Right click your sword or totem to switch to your pearl slot                          |
|    ArrayList     |                                      Shows the enabled modules on screen                                      |
|      AutoGg      |                                     Sends a message upon killing a player                                     |
|   AutoRespawn    |                                       Clicks the respawn button for you                                       |
|     AutoWalk     |                            Presses the walk key for you (only useful in survival)                             |
|    ChatPrefix    |                                      Chat tweaks and additional features                                      |
|    GuiCursor     |                            What to do with your cursor when you open inventory gui                            |
|    MouseTaper    | "I taped a piece of tape on my mouse button, now I cannot use that button anymore but it is still taped down" |
|  MessageResend   |                                Press up arrow key to resend your last message                                 |
|    NextBlock     |              Targets next same block that you're mining. (for farming, not pvp, useless in pvp)               |
|   NoBreakDelay   |                                    No block break delay [flags-anticheat]                                     |
|  NoInteractions  |                           Prevents opening certain containers(e-chests,chests,etc)                            |
|   SoundOnDeath   |                                      Plays a sound upon killing a player                                      |
|   TeamDetector   |                               Finding teams and disable attacking your own team                               |
|   ToolSwitcher   |                                 Switches to the right tool for mining a block                                 |
|    TotemPops     |                                 Send messages when a player pops their totem                                  |
|    AntiCrash     | Prevents various ways servers can crash your client. Be sure to report new crashes to us so we can add more!  |
| ExplodeParticles |                            Turns off explosion particles for smoother crystal pvp!                            |
|    FullBright    |                             Increases your gamma so you can actually see in caves                             |
|   NoItemBounce   |          Prevents the item sprites from playing the bounce animation in your inventory when updated           |
|   NoLoadScreen   |                                 Prevents some loading screens from rendering                                  |
|  NoServerPacks   |                     Prevents servers from forcing you to download their bad resource pack                     |
|   TimeChanger    |                                           Changes client world time                                           |
|   BlockOutline   |                                     Change the color of the block outline                                     |
|    CameraClip    |                    Change the camera distance and the camera behavior when encounter walls                    |
|   CrystalSpeed   |                                          Crystals per second counter                                          |
|  DeathParticles  |                                       Spawn particles upon entity death                                       |
| EntityIndicator  |                              Indicates entities around you. Players are excluded                              |
|     FreeLook     |                                         lock your camera perspective                                          |
|    GhostTotem    |               Renders a totem in your hand upon dying. Will not work if AutoRespawn is enabled!               |
| GlowingEntities  |                                  Having trouble seeing entities in the dark?                                  |
|   HealthAsBar    |               Renders your health bar as a singular bar to prevent lag. Recommended for NBT pvp               |
|  NoArmorRender   |                        Make armor invisible,try to use the enemy hud with this module!                        |
| NoGuiBackground  |                                 disable the black effect when opening the GUI                                 |
|    NoHurtCam     |                            Removes the annoying screen shake when you take damage                             |
|  NoGameOverlay   |                                     Stops various overlays from rendering                                     |
|   NoScoreboard   |                                Disables the scoreboard sidebar display render                                 |
|    NoViewBob     |                                              Turns off view bob                                               |
|  RenderOwnName   |                                             Renders your own name                                             |
|  SlowHandSwing   |                              Makes your hand swing as if you had mining fatigue                               |
|  SpectatorSight  |      Renders invisible entities the way you see them in spectator mode. Never get sneak attacked again!       |
|   TotemOverlay   |                                  Renders red overlay when not holding totem                                   |
|    TotemScale    |                                      Changes the scale of the totem pop                                       |
|    ViewModel     |                            Changes your view model in your first person hand view                             |
|       Zoom       |                                               Changes your FOV                                                |


## But isn't this cheating?
It is not a cheat. It does not automate any task, for every action the mod preforms, you have to click.
- This mod is not a macro, it does not click for you. It functions as a hotkey for slots.

| Server                  | Flags | Bannable |
|:------------------------|:------|:---------|
| `mcpvp`.club            | no    | yes      |
| west.`uspvp`.org        | no    | yes      |
| east.`uspvp`.org        | no    | yes      |
| `ogredupe`.minehut.gg   | no    | no       |
| `ipearlpvp`.minehut.gg  | no    | no       |
| play.`pvplegacy`.net    | no    | yes      |
| `donut`.net             | no    | yes      |
| `hypixel`.net           | no    | pending  |
| `cubecraft`.net         | no    | pending  |
| `firevanilla`.net       | no    | yes      |
| `shatteredvanilla`.net  | no    | no       |
| `pvphub`.me             | no    | yes      |
| `europemc`.org          | no    | pending  |
| play.`jackpot`.org      | no    | pending  |
| `kingsmp`.net           | no    | pending  |
| `l1festee1`.net         | no    | no       |
| `ironcadia`.minehut.gg  | no    | no       |
| `apollocpvp`.minehut.gg | no    | yes      |


## For this Mod You Will Need
```yml
Minecraft Java Edition: 1.20.1
Fabric Loader: 0.14.21 or higher
Fabric API: 1.20.1
To stop: complaining it is a cheat/macro.
```

## Have A Good One!
- Thanks for downloading ClickCrystals!
- Make sure to give it a star on my [GitHub](https://github.com/itzispyder/clickcrystals)
- Feeling generous today? [Help support our project!](https://paypal.com/paypalme/thetrouper)

## SPECIAL THANKS AND SHOUTOUT TO
```yml
OgreNetworks: For their wonderful mod showcase! https://www.youtube.com/watch?v=M95TDqW2p2k
TheTrouper: For documenting the mod, and giving me ideas!
breadandcarrots: For being a wonderful mod tester!
ClickCrystals (bro really changed his name to this): For creating ClickCrystals' TikTok account
Tesla Tower: Best NBT Creator frfr
I No One: Bro is fr my infinite ideas source + \#1 Bug Spotter
TaxEvasion: Thank you for your changes to AntiCrash and addition of no explosion particles!
```
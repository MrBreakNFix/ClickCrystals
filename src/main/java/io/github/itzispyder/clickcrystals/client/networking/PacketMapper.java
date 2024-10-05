package io.github.itzispyder.clickcrystals.client.networking;

import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.*;
import net.minecraft.network.packet.s2c.play.*;

import java.util.HashMap;
import java.util.Map;

public class PacketMapper {

    public static final Map<Class<? extends Packet<?>>, Info> C2S = new HashMap<>() {{
        this.put(AcknowledgeChunksC2SPacket.class, new Info("acknowledgeChunks", "AcknowledgeChunksC2SPacket"));
        this.put(AcknowledgeReconfigurationC2SPacket.class, new Info("acknowledgeReconfiguration", "AcknowledgeReconfigurationC2SPacket"));
        this.put(AdvancementTabC2SPacket.class, new Info("advancementTab", "AdvancementTabC2SPacket"));
        this.put(BoatPaddleStateC2SPacket.class, new Info("boatPaddleState", "BoatPaddleStateC2SPacket"));
        this.put(BookUpdateC2SPacket.class, new Info("bookUpdate", "BookUpdateC2SPacket"));
        this.put(ButtonClickC2SPacket.class, new Info("buttonClick", "ButtonClickC2SPacket"));
        this.put(ChatCommandSignedC2SPacket.class, new Info("chatCommandSigned", "ChatCommandSignedC2SPacket"));
        this.put(ChatMessageC2SPacket.class, new Info("chatMessage", "ChatMessageC2SPacket"));
        this.put(ClickSlotC2SPacket.class, new Info("clickSlot", "ClickSlotC2SPacket"));
        this.put(ClientCommandC2SPacket.class, new Info("clientCommand", "ClientCommandC2SPacket"));
        this.put(ClientStatusC2SPacket.class, new Info("clientStatus", "ClientStatusC2SPacket"));
        this.put(CloseHandledScreenC2SPacket.class, new Info("closeHandledScreen", "CloseHandledScreenC2SPacket"));
        this.put(CommandExecutionC2SPacket.class, new Info("commandExecution", "CommandExecutionC2SPacket"));
        this.put(CraftRequestC2SPacket.class, new Info("craftRequest", "CraftRequestC2SPacket"));
        this.put(CreativeInventoryActionC2SPacket.class, new Info("creativeInventoryAction", "CreativeInventoryActionC2SPacket"));
        this.put(DebugSampleSubscriptionC2SPacket.class, new Info("debugSampleSubscription", "DebugSampleSubscriptionC2SPacket"));
        this.put(HandSwingC2SPacket.class, new Info("handSwing", "HandSwingC2SPacket"));
        this.put(JigsawGeneratingC2SPacket.class, new Info("jigsawGenerating", "JigsawGeneratingC2SPacket"));
        this.put(MessageAcknowledgmentC2SPacket.class, new Info("messageAcknowledgment", "MessageAcknowledgmentC2SPacket"));
        this.put(PickFromInventoryC2SPacket.class, new Info("pickFromInventory", "PickFromInventoryC2SPacket"));
        this.put(PlayerActionC2SPacket.class, new Info("playerAction", "PlayerActionC2SPacket"));
        this.put(PlayerInputC2SPacket.class, new Info("playerInput", "PlayerInputC2SPacket"));
        this.put(PlayerInteractBlockC2SPacket.class, new Info("playerInteractBlock", "PlayerInteractBlockC2SPacket"));
        this.put(PlayerInteractEntityC2SPacket.class, new Info("playerInteractEntity", "PlayerInteractEntityC2SPacket"));
        this.put(PlayerInteractItemC2SPacket.class, new Info("playerInteractItem", "PlayerInteractItemC2SPacket"));
        this.put(PlayerMoveC2SPacket.class, new Info("playerMove", "PlayerMoveC2SPacket"));
        this.put(PlayerSessionC2SPacket.class, new Info("playerSession", "PlayerSessionC2SPacket"));
        this.put(QueryBlockNbtC2SPacket.class, new Info("queryBlockNbt", "QueryBlockNbtC2SPacket"));
        this.put(QueryEntityNbtC2SPacket.class, new Info("queryEntityNbt", "QueryEntityNbtC2SPacket"));
        this.put(RecipeBookDataC2SPacket.class, new Info("recipeBookData", "RecipeBookDataC2SPacket"));
        this.put(RecipeCategoryOptionsC2SPacket.class, new Info("recipeCategoryOptions", "RecipeCategoryOptionsC2SPacket"));
        this.put(RenameItemC2SPacket.class, new Info("renameItem", "RenameItemC2SPacket"));
        this.put(RequestCommandCompletionsC2SPacket.class, new Info("requestCommandCompletions", "RequestCommandCompletionsC2SPacket"));
        this.put(SelectMerchantTradeC2SPacket.class, new Info("selectMerchantTrade", "SelectMerchantTradeC2SPacket"));
        this.put(SlotChangedStateC2SPacket.class, new Info("slotChangedState", "SlotChangedStateC2SPacket"));
        this.put(SpectatorTeleportC2SPacket.class, new Info("spectatorTeleport", "SpectatorTeleportC2SPacket"));
        this.put(TeleportConfirmC2SPacket.class, new Info("teleportConfirm", "TeleportConfirmC2SPacket"));
        this.put(UpdateBeaconC2SPacket.class, new Info("updateBeacon", "UpdateBeaconC2SPacket"));
        this.put(UpdateCommandBlockC2SPacket.class, new Info("updateCommandBlock", "UpdateCommandBlockC2SPacket"));
        this.put(UpdateCommandBlockMinecartC2SPacket.class, new Info("updateCommandBlockMinecart", "UpdateCommandBlockMinecartC2SPacket"));
        this.put(UpdateDifficultyC2SPacket.class, new Info("updateDifficulty", "UpdateDifficultyC2SPacket"));
        this.put(UpdateDifficultyLockC2SPacket.class, new Info("updateDifficultyLock", "UpdateDifficultyLockC2SPacket"));
        this.put(UpdateJigsawC2SPacket.class, new Info("updateJigsaw", "UpdateJigsawC2SPacket"));
        this.put(UpdatePlayerAbilitiesC2SPacket.class, new Info("updatePlayerAbilities", "UpdatePlayerAbilitiesC2SPacket"));
        this.put(UpdateSelectedSlotC2SPacket.class, new Info("updateSelectedSlot", "UpdateSelectedSlotC2SPacket"));
        this.put(UpdateSignC2SPacket.class, new Info("updateSign", "UpdateSignC2SPacket"));
        this.put(UpdateStructureBlockC2SPacket.class, new Info("updateStructureBlock", "UpdateStructureBlockC2SPacket"));
        this.put(VehicleMoveC2SPacket.class, new Info("vehicleMove", "VehicleMoveC2SPacket"));
    }};

    public static final Map<Class<? extends Packet<?>>, Info> S2C = new HashMap<>() {{
        this.put(AdvancementUpdateS2CPacket.class, new Info("advancementUpdate", "AdvancementUpdateS2CPacket"));
        this.put(BlockBreakingProgressS2CPacket.class, new Info("blockBreakingProgress", "BlockBreakingProgressS2CPacket"));
        this.put(BlockEntityUpdateS2CPacket.class, new Info("blockEntityUpdate", "BlockEntityUpdateS2CPacket"));
        this.put(BlockEventS2CPacket.class, new Info("blockEvent", "BlockEventS2CPacket"));
        this.put(BlockUpdateS2CPacket.class, new Info("blockUpdate", "BlockUpdateS2CPacket"));
        this.put(BossBarS2CPacket.class, new Info("bossBar", "BossBarS2CPacket"));
        this.put(BundleDelimiterS2CPacket.class, new Info("bundleDelimiter", "BundleDelimiterS2CPacket"));
        this.put(BundleS2CPacket.class, new Info("bundle", "BundleS2CPacket"));
        this.put(ChangeUnlockedRecipesS2CPacket.class, new Info("changeUnlockedRecipes", "ChangeUnlockedRecipesS2CPacket"));
        this.put(ChatMessageS2CPacket.class, new Info("chatMessage", "ChatMessageS2CPacket"));
        this.put(ChatSuggestionsS2CPacket.class, new Info("chatSuggestions", "ChatSuggestionsS2CPacket"));
        this.put(ChunkBiomeDataS2CPacket.class, new Info("chunkBiomeData", "ChunkBiomeDataS2CPacket"));
        this.put(ChunkDataS2CPacket.class, new Info("chunkData", "ChunkDataS2CPacket"));
        this.put(ChunkDeltaUpdateS2CPacket.class, new Info("chunkDeltaUpdate", "ChunkDeltaUpdateS2CPacket"));
        this.put(ChunkLoadDistanceS2CPacket.class, new Info("chunkLoadDistance", "ChunkLoadDistanceS2CPacket"));
        this.put(ChunkRenderDistanceCenterS2CPacket.class, new Info("chunkRenderDistanceCenter", "ChunkRenderDistanceCenterS2CPacket"));
        this.put(ChunkSentS2CPacket.class, new Info("chunkSent", "ChunkSentS2CPacket"));
        this.put(ClearTitleS2CPacket.class, new Info("clearTitle", "ClearTitleS2CPacket"));
        this.put(CloseScreenS2CPacket.class, new Info("closeScreen", "CloseScreenS2CPacket"));
        this.put(CommandSuggestionsS2CPacket.class, new Info("commandSuggestions", "CommandSuggestionsS2CPacket"));
        this.put(CommandTreeS2CPacket.class, new Info("commandTree", "CommandTreeS2CPacket"));
        this.put(CooldownUpdateS2CPacket.class, new Info("cooldownUpdate", "CooldownUpdateS2CPacket"));
        this.put(CraftFailedResponseS2CPacket.class, new Info("craftFailedResponse", "CraftFailedResponseS2CPacket"));
        this.put(DamageTiltS2CPacket.class, new Info("damageTilt", "DamageTiltS2CPacket"));
        this.put(DeathMessageS2CPacket.class, new Info("deathMessage", "DeathMessageS2CPacket"));
        this.put(DebugSampleS2CPacket.class, new Info("debugSample", "DebugSampleS2CPacket"));
        this.put(DifficultyS2CPacket.class, new Info("difficulty", "DifficultyS2CPacket"));
        this.put(EndCombatS2CPacket.class, new Info("endCombat", "EndCombatS2CPacket"));
        this.put(EnterCombatS2CPacket.class, new Info("enterCombat", "EnterCombatS2CPacket"));
        this.put(EnterReconfigurationS2CPacket.class, new Info("enterReconfiguration", "EnterReconfigurationS2CPacket"));
        this.put(EntitiesDestroyS2CPacket.class, new Info("entitiesDestroy", "EntitiesDestroyS2CPacket"));
        this.put(EntityAnimationS2CPacket.class, new Info("entityAnimation", "EntityAnimationS2CPacket"));
        this.put(EntityAttachS2CPacket.class, new Info("entityAttach", "EntityAttachS2CPacket"));
        this.put(EntityAttributesS2CPacket.class, new Info("entityAttributes", "EntityAttributesS2CPacket"));
        this.put(EntityDamageS2CPacket.class, new Info("entityDamage", "EntityDamageS2CPacket"));
        this.put(EntityEquipmentUpdateS2CPacket.class, new Info("entityEquipmentUpdate", "EntityEquipmentUpdateS2CPacket"));
        this.put(EntityPassengersSetS2CPacket.class, new Info("entityPassengersSet", "EntityPassengersSetS2CPacket"));
        this.put(EntityPositionS2CPacket.class, new Info("entityPosition", "EntityPositionS2CPacket"));
        this.put(EntityS2CPacket.class, new Info("entity", "EntityS2CPacket"));
        this.put(EntitySetHeadYawS2CPacket.class, new Info("entitySetHeadYaw", "EntitySetHeadYawS2CPacket"));
        this.put(EntitySpawnS2CPacket.class, new Info("entitySpawn", "EntitySpawnS2CPacket"));
        this.put(EntityStatusEffectS2CPacket.class, new Info("entityStatusEffect", "EntityStatusEffectS2CPacket"));
        this.put(EntityStatusS2CPacket.class, new Info("entityStatus", "EntityStatusS2CPacket"));
        this.put(EntityTrackerUpdateS2CPacket.class, new Info("entityTrackerUpdate", "EntityTrackerUpdateS2CPacket"));
        this.put(EntityVelocityUpdateS2CPacket.class, new Info("entityVelocityUpdate", "EntityVelocityUpdateS2CPacket"));
        this.put(ExperienceBarUpdateS2CPacket.class, new Info("experienceBarUpdate", "ExperienceBarUpdateS2CPacket"));
        this.put(ExperienceOrbSpawnS2CPacket.class, new Info("experienceOrbSpawn", "ExperienceOrbSpawnS2CPacket"));
        this.put(ExplosionS2CPacket.class, new Info("explosion", "ExplosionS2CPacket"));
        this.put(GameJoinS2CPacket.class, new Info("gameJoin", "GameJoinS2CPacket"));
        this.put(GameMessageS2CPacket.class, new Info("gameMessage", "GameMessageS2CPacket"));
        this.put(GameStateChangeS2CPacket.class, new Info("gameStateChange", "GameStateChangeS2CPacket"));
        this.put(HealthUpdateS2CPacket.class, new Info("healthUpdate", "HealthUpdateS2CPacket"));
        this.put(InventoryS2CPacket.class, new Info("inventory", "InventoryS2CPacket"));
        this.put(ItemPickupAnimationS2CPacket.class, new Info("itemPickupAnimation", "ItemPickupAnimationS2CPacket"));
        this.put(LightUpdateS2CPacket.class, new Info("lightUpdate", "LightUpdateS2CPacket"));
        this.put(LookAtS2CPacket.class, new Info("lookAt", "LookAtS2CPacket"));
        this.put(MapUpdateS2CPacket.class, new Info("mapUpdate", "MapUpdateS2CPacket"));
        this.put(NbtQueryResponseS2CPacket.class, new Info("nbtQueryResponse", "NbtQueryResponseS2CPacket"));
        this.put(OpenHorseScreenS2CPacket.class, new Info("openHorseScreen", "OpenHorseScreenS2CPacket"));
        this.put(OpenScreenS2CPacket.class, new Info("openScreen", "OpenScreenS2CPacket"));
        this.put(OpenWrittenBookS2CPacket.class, new Info("openWrittenBook", "OpenWrittenBookS2CPacket"));
        this.put(OverlayMessageS2CPacket.class, new Info("overlayMessage", "OverlayMessageS2CPacket"));
        this.put(ParticleS2CPacket.class, new Info("particle", "ParticleS2CPacket"));
        this.put(PlayerAbilitiesS2CPacket.class, new Info("playerAbilities", "PlayerAbilitiesS2CPacket"));
        this.put(PlayerActionResponseS2CPacket.class, new Info("playerActionResponse", "PlayerActionResponseS2CPacket"));
        this.put(PlayerListHeaderS2CPacket.class, new Info("playerListHeader", "PlayerListHeaderS2CPacket"));
        this.put(PlayerListS2CPacket.class, new Info("playerList", "PlayerListS2CPacket"));
        this.put(PlayerPositionLookS2CPacket.class, new Info("playerPositionLook", "PlayerPositionLookS2CPacket"));
        this.put(PlayerRemoveS2CPacket.class, new Info("playerRemove", "PlayerRemoveS2CPacket"));
        this.put(PlayerRespawnS2CPacket.class, new Info("playerRespawn", "PlayerRespawnS2CPacket"));
        this.put(PlayerSpawnPositionS2CPacket.class, new Info("playerSpawnPosition", "PlayerSpawnPositionS2CPacket"));
        this.put(PlaySoundFromEntityS2CPacket.class, new Info("playSoundFromEntity", "PlaySoundFromEntityS2CPacket"));
        this.put(PlaySoundS2CPacket.class, new Info("playSound", "PlaySoundS2CPacket"));
        this.put(ProfilelessChatMessageS2CPacket.class, new Info("profilelessChatMessage", "ProfilelessChatMessageS2CPacket"));
        this.put(ProjectilePowerS2CPacket.class, new Info("projectilePower", "ProjectilePowerS2CPacket"));
        this.put(RemoveEntityStatusEffectS2CPacket.class, new Info("removeEntityStatusEffect", "RemoveEntityStatusEffectS2CPacket"));
        this.put(RemoveMessageS2CPacket.class, new Info("removeMessage", "RemoveMessageS2CPacket"));
        this.put(ScoreboardDisplayS2CPacket.class, new Info("scoreboardDisplay", "ScoreboardDisplayS2CPacket"));
        this.put(ScoreboardObjectiveUpdateS2CPacket.class, new Info("scoreboardObjectiveUpdate", "ScoreboardObjectiveUpdateS2CPacket"));
        this.put(ScoreboardScoreResetS2CPacket.class, new Info("scoreboardScoreReset", "ScoreboardScoreResetS2CPacket"));
        this.put(ScoreboardScoreUpdateS2CPacket.class, new Info("scoreboardScoreUpdate", "ScoreboardScoreUpdateS2CPacket"));
        this.put(ScreenHandlerPropertyUpdateS2CPacket.class, new Info("screenHandlerPropertyUpdate", "ScreenHandlerPropertyUpdateS2CPacket"));
        this.put(ScreenHandlerSlotUpdateS2CPacket.class, new Info("screenHandlerSlotUpdate", "ScreenHandlerSlotUpdateS2CPacket"));
        this.put(SelectAdvancementTabS2CPacket.class, new Info("selectAdvancementTab", "SelectAdvancementTabS2CPacket"));
        this.put(ServerMetadataS2CPacket.class, new Info("serverMetadata", "ServerMetadataS2CPacket"));
        this.put(SetCameraEntityS2CPacket.class, new Info("setCameraEntity", "SetCameraEntityS2CPacket"));
        this.put(SetTradeOffersS2CPacket.class, new Info("setTradeOffers", "SetTradeOffersS2CPacket"));
        this.put(SignEditorOpenS2CPacket.class, new Info("signEditorOpen", "SignEditorOpenS2CPacket"));
        this.put(SimulationDistanceS2CPacket.class, new Info("simulationDistance", "SimulationDistanceS2CPacket"));
        this.put(StartChunkSendS2CPacket.class, new Info("startChunkSend", "StartChunkSendS2CPacket"));
        this.put(StatisticsS2CPacket.class, new Info("statistics", "StatisticsS2CPacket"));
        this.put(StopSoundS2CPacket.class, new Info("stopSound", "StopSoundS2CPacket"));
        this.put(SubtitleS2CPacket.class, new Info("subtitle", "SubtitleS2CPacket"));
        this.put(SynchronizeRecipesS2CPacket.class, new Info("synchronizeRecipes", "SynchronizeRecipesS2CPacket"));
        this.put(TeamS2CPacket.class, new Info("team", "TeamS2CPacket"));
        this.put(TickStepS2CPacket.class, new Info("tickStep", "TickStepS2CPacket"));
        this.put(TitleFadeS2CPacket.class, new Info("titleFade", "TitleFadeS2CPacket"));
        this.put(TitleS2CPacket.class, new Info("title", "TitleS2CPacket"));
        this.put(UnloadChunkS2CPacket.class, new Info("unloadChunk", "UnloadChunkS2CPacket"));
        this.put(UpdateSelectedSlotS2CPacket.class, new Info("updateSelectedSlot", "UpdateSelectedSlotS2CPacket"));
        this.put(UpdateTickRateS2CPacket.class, new Info("updateTickRate", "UpdateTickRateS2CPacket"));
        this.put(VehicleMoveS2CPacket.class, new Info("vehicleMove", "VehicleMoveS2CPacket"));
        this.put(WorldBorderCenterChangedS2CPacket.class, new Info("worldBorderCenterChanged", "WorldBorderCenterChangedS2CPacket"));
        this.put(WorldBorderInitializeS2CPacket.class, new Info("worldBorderInitialize", "WorldBorderInitializeS2CPacket"));
        this.put(WorldBorderInterpolateSizeS2CPacket.class, new Info("worldBorderInterpolateSize", "WorldBorderInterpolateSizeS2CPacket"));
        this.put(WorldBorderSizeChangedS2CPacket.class, new Info("worldBorderSizeChanged", "WorldBorderSizeChangedS2CPacket"));
        this.put(WorldBorderWarningBlocksChangedS2CPacket.class, new Info("worldBorderWarningBlocksChanged", "WorldBorderWarningBlocksChangedS2CPacket"));
        this.put(WorldBorderWarningTimeChangedS2CPacket.class, new Info("worldBorderWarningTimeChanged", "WorldBorderWarningTimeChangedS2CPacket"));
        this.put(WorldEventS2CPacket.class, new Info("worldEvent", "WorldEventS2CPacket"));
        this.put(WorldTimeUpdateS2CPacket.class, new Info("worldTimeUpdate", "WorldTimeUpdateS2CPacket"));
    }};

    public record Info(String id, String className) {}
}

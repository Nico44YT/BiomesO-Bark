package nazario.biomesobark.mixin;

import nazario.biomesobark.Biomesobark;
import nazario.treebark.item.BarkReference;
import nazario.treebark.registry.BarkRegistry;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.HashMap;
import java.util.List;

@Mixin(BarkRegistry.class)
public class BarkRegistryMixin {

    @Shadow(remap = false) public static List<BarkReference> references;

    @Inject(method = "register", at = @At("TAIL"), remap = false)
    private static void biomesobark$register(CallbackInfo ci) {
        HashMap<Identifier, Identifier> DEAD_BLOCKS = new HashMap<>();
        HashMap<Identifier, Identifier> EMPYREAL_BLOCKS = new HashMap<>();
        HashMap<Identifier, Identifier> FIR_BLOCKS = new HashMap<>();
        HashMap<Identifier, Identifier> HELLBARK_BLOCKS = new HashMap<>();
        HashMap<Identifier, Identifier> JACARANDA_BLOCKS = new HashMap<>();
        HashMap<Identifier, Identifier> MAGIC_BLOCKS = new HashMap<>();
        HashMap<Identifier, Identifier> MAHOGANY_BLOCKS = new HashMap<>();
        HashMap<Identifier, Identifier> MAPLE_BLOCKS = new HashMap<>();
        HashMap<Identifier, Identifier> PALM_BLOCKS = new HashMap<>();
        HashMap<Identifier, Identifier> PINE_BLOCKS = new HashMap<>();
        HashMap<Identifier, Identifier> REDWOOD_BLOCKS = new HashMap<>();
        HashMap<Identifier, Identifier> UMBRAN_BLOCKS = new HashMap<>();
        HashMap<Identifier, Identifier> WILLOW_BLOCKS = new HashMap<>();

        // Dead blocks
        DEAD_BLOCKS.put(biomesobark$id("stripped_dead_log"), biomesobark$id("dead_log"));
        DEAD_BLOCKS.put(biomesobark$id("stripped_dead_wood"), biomesobark$id("dead_wood"));

        // Empyreal blocks
        EMPYREAL_BLOCKS.put(biomesobark$id("stripped_empyreal_log"), biomesobark$id("empyreal_log"));
        EMPYREAL_BLOCKS.put(biomesobark$id("stripped_empyreal_wood"), biomesobark$id("empyreal_wood"));

        // Fir blocks
        FIR_BLOCKS.put(biomesobark$id("stripped_fir_log"), biomesobark$id("fir_log"));
        FIR_BLOCKS.put(biomesobark$id("stripped_fir_wood"), biomesobark$id("fir_wood"));

        // Hellbark blocks
        HELLBARK_BLOCKS.put(biomesobark$id("stripped_hellbark_log"), biomesobark$id("hellbark_log"));
        HELLBARK_BLOCKS.put(biomesobark$id("stripped_hellbark_wood"), biomesobark$id("hellbark_wood"));

        // Jacaranda blocks
        JACARANDA_BLOCKS.put(biomesobark$id("stripped_jacaranda_log"), biomesobark$id("jacaranda_log"));
        JACARANDA_BLOCKS.put(biomesobark$id("stripped_jacaranda_wood"), biomesobark$id("jacaranda_wood"));

        // Magic blocks
        MAGIC_BLOCKS.put(biomesobark$id("stripped_magic_log"), biomesobark$id("magic_log"));
        MAGIC_BLOCKS.put(biomesobark$id("stripped_magic_wood"), biomesobark$id("magic_wood"));

        // Mahogany blocks
        MAHOGANY_BLOCKS.put(biomesobark$id("stripped_mahogany_log"), biomesobark$id("mahogany_log"));
        MAHOGANY_BLOCKS.put(biomesobark$id("stripped_mahogany_wood"), biomesobark$id("mahogany_wood"));

        // Maple blocks
        MAPLE_BLOCKS.put(biomesobark$id("stripped_maple_log"), biomesobark$id("maple_log"));
        MAPLE_BLOCKS.put(biomesobark$id("stripped_maple_wood"), biomesobark$id("maple_wood"));

        // Palm blocks
        PALM_BLOCKS.put(biomesobark$id("stripped_palm_log"), biomesobark$id("palm_log"));
        PALM_BLOCKS.put(biomesobark$id("stripped_palm_wood"), biomesobark$id("palm_wood"));

        // Pine blocks
        PINE_BLOCKS.put(biomesobark$id("stripped_pine_log"), biomesobark$id("pine_log"));
        PINE_BLOCKS.put(biomesobark$id("stripped_pine_wood"), biomesobark$id("pine_wood"));

        // Redwood blocks
        REDWOOD_BLOCKS.put(biomesobark$id("stripped_redwood_log"), biomesobark$id("redwood_log"));
        REDWOOD_BLOCKS.put(biomesobark$id("stripped_redwood_wood"), biomesobark$id("redwood_wood"));

        // Umbran blocks
        UMBRAN_BLOCKS.put(biomesobark$id("stripped_umbran_log"), biomesobark$id("umbran_log"));
        UMBRAN_BLOCKS.put(biomesobark$id("stripped_umbran_wood"), biomesobark$id("umbran_wood"));

        // Willow blocks
        WILLOW_BLOCKS.put(biomesobark$id("stripped_willow_log"), biomesobark$id("willow_log"));
        WILLOW_BLOCKS.put(biomesobark$id("stripped_willow_wood"), biomesobark$id("willow_wood"));

        references.addAll(List.of(
                new BarkReference(DEAD_BLOCKS, Identifier.of(Biomesobark.MOD_ID, "dead_bark")),
                new BarkReference(EMPYREAL_BLOCKS, Identifier.of(Biomesobark.MOD_ID, "empyreal_bark")),
                new BarkReference(FIR_BLOCKS, Identifier.of(Biomesobark.MOD_ID, "fir_bark")),
                new BarkReference(HELLBARK_BLOCKS, Identifier.of(Biomesobark.MOD_ID, "hellbark_bark")),
                new BarkReference(JACARANDA_BLOCKS, Identifier.of(Biomesobark.MOD_ID, "jacaranda_bark")),
                new BarkReference(MAGIC_BLOCKS, Identifier.of(Biomesobark.MOD_ID, "magic_bark")),
                new BarkReference(MAHOGANY_BLOCKS, Identifier.of(Biomesobark.MOD_ID, "mahogany_bark")),
                new BarkReference(MAPLE_BLOCKS, Identifier.of(Biomesobark.MOD_ID, "maple_bark")),
                new BarkReference(PALM_BLOCKS, Identifier.of(Biomesobark.MOD_ID, "palm_bark")),
                new BarkReference(PINE_BLOCKS, Identifier.of(Biomesobark.MOD_ID, "pine_bark")),
                new BarkReference(REDWOOD_BLOCKS, Identifier.of(Biomesobark.MOD_ID, "redwood_bark")),
                new BarkReference(UMBRAN_BLOCKS, Identifier.of(Biomesobark.MOD_ID, "umbran_bark")),
                new BarkReference(WILLOW_BLOCKS, Identifier.of(Biomesobark.MOD_ID, "willow_bark"))
        ));
    }

    private static Identifier biomesobark$id(String id) {
        return Identifier.of("biomesoplenty", id);
    }
}

package net.echelon.venhance.block;
import net.echelon.venhance.VEnhance;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block RUSTIC_OAK_PLANKS = registerBlock("rustic_oak_planks", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(VEnhance.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(VEnhance.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

        public static void registerModBlocks() {
            VEnhance.LOGGER.info("Registering ModBlocks for" + VEnhance.MOD_ID);
        }
}

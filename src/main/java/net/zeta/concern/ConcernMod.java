package net.zeta.concern;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ConcernMod implements ModInitializer {
	public final String modid = "concernmod";
	public static final Block CONCERN_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(4.0f));
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		System.out.println("Hello Fabric world!");
		Registry.register(Registry.BLOCK, new Identifier(modid, "concern_block"), CONCERN_BLOCK);
		Registry.register(Registry.ITEM, new Identifier(modid, "concern_block"), new BlockItem(CONCERN_BLOCK, new Item.Settings().group(ItemGroup.MISC)));
	}
}

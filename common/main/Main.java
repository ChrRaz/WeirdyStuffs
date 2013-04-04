/**
 * @author ChrRaz
 * Created: 07/03/2013; 21.38.53
 */
package main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IPlayerTracker;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 *
 */
@Mod(modid = "WierdStuffs")
public class Main {

	public static IPlayerTracker	tracker				= new Tracker();
	public static BlockLookAt		blockLookAt			= new BlockLookAt(500, Material.cactus);
	public static BlockEnderControl	blockEnderControl	= new BlockEnderControl(501, Material.cake);
	public static ArmorStandard		armor				= new ArmorStandard(5001, EnumArmorMaterial.CHAIN, 1, 1);
	public static EventStuffs		eventHandler		= new EventStuffs();

	@Init
	public void Load(FMLInitializationEvent e) {
		ItemStack dirtStack = new ItemStack(Block.dirt);
		GameRegistry.registerPlayerTracker(tracker);
		GameRegistry.registerBlock(blockLookAt, "BlockLookAt");
		GameRegistry.registerBlock(blockEnderControl, "blockEnderControl");
		GameRegistry.addShapelessRecipe(new ItemStack(armor), dirtStack);
		GameRegistry.addShapelessRecipe(new ItemStack(blockLookAt), dirtStack, dirtStack);
		GameRegistry.addShapedRecipe(new ItemStack(blockEnderControl), new Object[] { "#", "#", "#", '#', new ItemStack(Block.dirt) });
	}
}

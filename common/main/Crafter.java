/**
 * @author ChrRaz
 * Created: 08/03/2013; 11.03.18
 */
package main;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.ICraftingHandler;

/**
 *
 */
public class Crafter implements ICraftingHandler {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cpw.mods.fml.common.ICraftingHandler#onCrafting(net.minecraft.entity.
	 * player .EntityPlayer, net.minecraft.item.ItemStack,
	 * net.minecraft.inventory.IInventory)
	 */
	@Override
	public void onCrafting(EntityPlayer player, ItemStack item, IInventory craftMatrix) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cpw.mods.fml.common.ICraftingHandler#onSmelting(net.minecraft.entity.
	 * player .EntityPlayer, net.minecraft.item.ItemStack)
	 */
	@Override
	public void onSmelting(EntityPlayer player, ItemStack item) {
		// TODO Auto-generated method stub

	}

}

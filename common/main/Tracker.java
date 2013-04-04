/**
 * @author ChrRaz
 * Created: 07/03/2013; 21.59.34
 */
package main;

import net.minecraft.entity.player.EntityPlayer;
import cpw.mods.fml.common.IPlayerTracker;

/**
 *
 */
public class Tracker implements IPlayerTracker {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cpw.mods.fml.common.IPlayerTracker#onPlayerLogin(net.minecraft.entity
	 * .player .EntityPlayer)
	 */
	@Override
	public void onPlayerLogin(EntityPlayer player) {
		// TODO Auto-generated method stub
		player.addChatMessage("Hello " + player.username);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cpw.mods.fml.common.IPlayerTracker#onPlayerLogout(net.minecraft.entity
	 * .player .EntityPlayer)
	 */
	@Override
	public void onPlayerLogout(EntityPlayer player) {
		// TODO Auto-generated method stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cpw.mods.fml.common.IPlayerTracker#onPlayerChangedDimension(net.minecraft
	 * .entity.player.EntityPlayer)
	 */
	@Override
	public void onPlayerChangedDimension(EntityPlayer player) {
		// TODO Auto-generated method
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cpw.mods.fml.common.IPlayerTracker#onPlayerRespawn(net.minecraft.entity.
	 * player.EntityPlayer)
	 */
	@Override
	public void onPlayerRespawn(EntityPlayer player) {
		// TODO Auto-generated method stub

	}

}

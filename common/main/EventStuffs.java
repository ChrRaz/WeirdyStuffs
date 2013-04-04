/**
 * @author ChrRaz
 * Created: 15/03/2013; 11.10.56
 */
package main;

import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.EnderTeleportEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

/**
 *
 */
public class EventStuffs {

	/**
	 * 
	 */
	public EventStuffs() {
		// TODO Auto-generated constructor stub
		MinecraftForge.EVENT_BUS.register(this);
	}

	@ForgeSubscribe
	public void onTeleport(EnderTeleportEvent e) {
		if (e.entity instanceof EntityEnderman)
			e.setCanceled(BlockEnderControl.EnderKill);
		else
			e.attackDamage = 0;
	}

	@ForgeSubscribe
	public void onDamage(LivingHurtEvent e) {
		if (!(e.entity instanceof EntityPlayer)) return;
		EntityPlayer player = (EntityPlayer) e.entity;
		if (player.inventory.armorItemInSlot(2) == null) return;
		e.setCanceled(player.inventory.armorItemInSlot(2).itemID == Main.armor.itemID);
	}
}

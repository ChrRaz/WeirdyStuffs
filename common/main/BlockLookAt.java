/**
 * @author ChrRaz
 * Created: 03/04/2013; 12.05.09
 */
package main;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/**
 *
 */
public class BlockLookAt extends Block {

	/**
	 * @param par1
	 * @param par2Material
	 */
	public BlockLookAt(int par1, Material par2Material) {
		super(par1, par2Material);
	}

	private int	light	= 0;

	public int getLightValue(World world, int x, int y, int z) {
		return light;
	}

	@Override
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {
		lightValue[this.blockID] = ++lightValue[this.blockID] % 16;
		return true;
	}

	@Override
	public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random) {
		
	}
}

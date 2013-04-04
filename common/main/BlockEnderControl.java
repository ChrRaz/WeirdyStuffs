/**
 * @author ChrRaz
 * Created: 04/04/2013; 15.30.40
 */
package main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 *
 */
public class BlockEnderControl extends Block {

	/**
	 * @param par1
	 * @param par2Material
	 */
	public BlockEnderControl(int par1, Material par2Material) {
		super(par1, par2Material);

		// TODO Auto-generated constructor stub
	}

	public static boolean	EnderKill	= false;

	@Override
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {
		EnderKill = !EnderKill;

		return true;
	}

	@Override
	@SideOnly(Side.CLIENT)
	/**
	 * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
	 */
	public Icon getBlockTextureFromSideAndMetadata(int par1, int par2) {
		return EnderKill ? Block.redstoneLampActive.getBlockTextureFromSideAndMetadata(par1, par2) : Block.redstoneLampIdle.getBlockTextureFromSideAndMetadata(par1, par2);
	}
}

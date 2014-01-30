package rubberWorks.items;

import java.util.List;






import ic2.api.item.Items;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import rubberWorks.RWCore;
import rubberWorks.lib.Ids;
import rubberWorks.lib.Names;
import rubberWorks.lib.global;


public class permTap 
	extends Item
{

    public permTap(int par1)
	{
	    super(par1);
	    this.setCreativeTab(CreativeTabs.tabTools);
	    this.setUnlocalizedName(Names.permTap_unlocalizedName);
	}

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister icon) {
	itemIcon = icon.registerIcon(global.ID.toLowerCase() + ":" + "permTap");
    }

    public boolean onItemUse(ItemStack itemstack, EntityPlayer entityplayer, World world, int x, int y, int z, int side, float xOffset, float yOffset, float zOffset){
	int blockId = world.getBlockId(x, y, z);
	if ((Items.getItem("rubberWood") != null) && (blockId == Items.getItem("rubberWood").itemID)) {
	    attemptPlacement(itemstack, entityplayer, world, x, y, z, side);

	    return true;
	}
	return false;
    }


    public static boolean attemptPlacement(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int x, int y, int z, int side)
	{
	    int meta = par3World.getBlockMetadata(x, y, z);
	    if ((meta < 2) || (meta % 6 != side)) {
		return false;
	    }
	    if (meta < 6)
		{
			{
			    if (side == 0)
				{
				    --y;
				}

			    if (side == 1)
				{
				    ++y;
				}

			    if (side == 2)
				{
				    --z;
				}

			    if (side == 3)
				{
				    ++z;
				}

			    if (side == 4)
				{
				    --x;
				}

			    if (side == 5)
				{
				    ++x;
				}

			    if (!par3World.isAirBlock(x, y, z))
				{
				    return false;
				}
			}

			if (!par2EntityPlayer.canPlayerEdit(x, y, z, side, par1ItemStack))
			    {
				return false;
			    }
			else
			    {
				if (Block.blocksList[Ids.BlockPermTap_actual].canPlaceBlockAt(par3World, x, y, z))
				    {
					--par1ItemStack.stackSize;
					par3World.setBlock(x, y, z, Ids.BlockPermTap_actual);
				    }

			    }
		}
	    return false;


	}
}
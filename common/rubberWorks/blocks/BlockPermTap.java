package rubberWorks.blocks;

import codechicken.lib.data.MCDataInput;
import codechicken.lib.data.MCDataOutput;
import codechicken.lib.vec.Cuboid6;
import codechicken.lib.vec.Transformation;
import codechicken.lib.vec.Vector3;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagInt;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import rubberWorks.lib.Names;
import rubberWorks.lib.global;
import rubberWorks.tileentity.TileEntityBlockPermTap;


public class BlockPermTap extends BlockContainer {
	
	    public BlockPermTap(int id)	{ 
		    super(id, Material.rock);
		    this.setUnlocalizedName(Names.BlockPermTap_unlocalizedName);
		    this.setHardness(2F);
		    this.setResistance(5F);
		    this.setLightValue(0.1F);
		    this.setBlockBounds(0.25F, 0.25F, 0.0F,0.75F, 0.80F, 0.25F);
		    //width, height, length, width2, height2, length2
	    }
		
	    
	    public int getRenderType() {
		
		return -1;
		
	    }
	    
	    
	    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase player){
		int dir = MathHelper.floor_double((double)((player.rotationYaw * 4F) / 360F) + 0.5D) & 3;
	        world.setBlockMetadataWithNotify(x, y, z, dir, 0);
	    }
	    

	    
	    /**
	     * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
	     * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
	     */
	    public boolean isOpaqueCube(){
		    return false;
		}

	    /**
	     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
	     */
	    public boolean renderAsNormalBlock(){
		    return false;
		}

	    @Override
	    public TileEntity createNewTileEntity(World world){
		    return new TileEntityBlockPermTap();
		}
	    
	    @SideOnly(Side.CLIENT)
	    public void registerIcons(IconRegister icon){
		this.blockIcon = icon.registerIcon(global.ID.toLowerCase() + ":" + Names.BlockPermTap_unlocalizedName + "_icon");
		
	    }

    }

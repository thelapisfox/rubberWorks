package rubberWorks.render;

import org.lwjgl.opengl.GL11;




















import rubberWorks.blocks.Blocks;
import rubberWorks.blocks.ModelBlockPermTap;
import rubberWorks.lib.Names;
import rubberWorks.lib.global;
import rubberWorks.tileentity.TileEntityBlockPermTap;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;


public class RenderBlockPermTap
	extends TileEntitySpecialRenderer
    {
	
	private ModelBlockPermTap model;
	private static final ResourceLocation texture = new ResourceLocation(global.ID.toLowerCase() + ":" + "textures/models/" + Names.BlockPermTap_unlocalizedName + "_model.png"); 
	
	public RenderBlockPermTap() {
	    this.model = new ModelBlockPermTap();
	}
	
	
	    public void renderTileEntityAt(TileEntity tileEntity, double d, double d1, double d2, float f) {
	        GL11.glPushMatrix();
	         GL11.glTranslatef((float)d, (float)d1, (float)d2);
	         TileEntityBlockPermTap TileEntityBlockPermTap = (TileEntityBlockPermTap)tileEntity;
	         renderBlockPermTap(TileEntityBlockPermTap, tileEntity.worldObj, tileEntity.xCoord, tileEntity.yCoord, tileEntity.zCoord, Blocks.BlockPermTap);
	        GL11.glPopMatrix();
	    }
	    public void renderBlockPermTap(TileEntityBlockPermTap tl, World world, int i, int j, int k, Block block) {
	        Tessellator tessellator = Tessellator.instance;
	        float f = block.getBlockBrightness(world, i, j, k);
	        int l = world.getLightBrightnessForSkyBlocks(i, j, k, 0);
	        int l1 = l % 65536;
	        int l2 = l / 65536;
	        tessellator.setColorOpaque_F(f, f, f);
	        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)l1, (float)l2); 
	        int dir = world.getBlockMetadata(i, j, k);	        
	        GL11.glPushMatrix();
	         GL11.glTranslatef(0.50F, -0.5F, -0.3125F);
	         GL11.glRotatef(dir * (-180F), 0F, 0F, 1F);
	         GL11.glTranslatef(0F, 0F, 0.8125F);
	         this.bindTexture(texture);
	         this.model.renderModel(0.0625F);
	        GL11.glPopMatrix();
	    }

    }

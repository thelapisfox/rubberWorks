package rubberWorks.tileentity;

import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import rubberWorks.blocks.BlockPermTap;
import rubberWorks.lib.Ids;
import rubberWorks.lib.Names;
import rubberWorks.render.RenderBlockPermTap;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


public class TileEntities
    {
	



	    public static void init() {
		GameRegistry.registerTileEntity(TileEntityBlockPermTap.class, "BlockPermTap");
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBlockPermTap.class, new RenderBlockPermTap());
	    }



	    public static void addNames() {
		
	    }
	}

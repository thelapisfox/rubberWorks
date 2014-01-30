package rubberWorks.blocks;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import rubberWorks.lib.Ids;
import rubberWorks.lib.Names;
import net.minecraft.block.Block;


public class Blocks {
    public static Block BlockPermTap;




    public static void init() {
	BlockPermTap = new BlockPermTap(Ids.BlockPermTap_actual);
	GameRegistry.registerBlock(BlockPermTap, Names.BlockPermTap_name);
    }



    public static void addNames() {
	LanguageRegistry.addName(BlockPermTap, Names.BlockPermTap_name);
    }
}

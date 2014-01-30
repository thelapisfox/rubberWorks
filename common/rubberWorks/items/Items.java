package rubberWorks.items;

import rubberWorks.lib.Ids;
import rubberWorks.lib.Names;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;


public class Items
    {
	public static Item permTap;
	
	public static void init() {
	    
	    permTap = new permTap(Ids.permTap_actual); 
	}
	
	public static void addNames() {
	    
	    LanguageRegistry.addName(permTap, Names.permTap_name);
	}
	
    }

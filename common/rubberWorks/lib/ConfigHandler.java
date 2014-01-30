package rubberWorks.lib;

import java.io.File;


import net.minecraftforge.common.Configuration;


public class ConfigHandler
    {
	
	public static void init(File configFile) {
	    
	    Configuration config = new Configuration(configFile);
	    
	    config.load();
	    
	    Ids.BlockPermTap_actual = config.getBlock(Configuration.CATEGORY_BLOCK, Names.BlockPermTap_name, Ids.BlockPermTap_default).getInt();
	    Ids.permTap_actual = config.getItem(Configuration.CATEGORY_ITEM, Names.permTap_name, Ids.permTap_default).getInt();

	    config.save();
	}

    }

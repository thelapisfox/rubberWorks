package rubberWorks.lib;

import net.minecraft.item.ItemStack;
import rubberWorks.RWCore;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ic2.api.item.Items;


public class global
    {
	public static final String ID = "rubberWorks";
	public static final String NAME = "Rubber Works";
	public static final String VERSION = "1.0a";
	public static final String CHANNEL = ID;
	public static final String PROXY_LOCATION = ID + ".proxies";
	public static ItemStack resin = Items.getItem("woodRubber");

    }

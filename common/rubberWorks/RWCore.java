package rubberWorks;

import rubberWorks.blocks.Blocks;
import rubberWorks.items.Items;
import rubberWorks.lib.ConfigHandler;
import rubberWorks.lib.Recipes;
import rubberWorks.lib.global;
import rubberWorks.proxies.CommonProxy;
import rubberWorks.tileentity.TileEntities;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;


@Mod(
		modid=global.ID,
		name=global.NAME,
		version=global.VERSION,
		acceptedMinecraftVersions = "[1.6.4,1.7)", 
		dependencies = "required-after:Forge@[9.11.1.965,);required-after:IC2"
		)

@NetworkMod(
		channels = global.CHANNEL,
		clientSideRequired=true,
		serverSideRequired=false
		// packetHandler = RLPacketHandler.class
		)


public class RWCore
{

    @SidedProxy( clientSide = global.PROXY_LOCATION + ".ClientProxy", serverSide = global.PROXY_LOCATION + ".CommonProxy" )
    public static CommonProxy proxy;


    @EventHandler
    public static void preInit( FMLPreInitializationEvent event ) {
	ConfigHandler.init(event.getSuggestedConfigurationFile());
	proxy.initRenderers();
	proxy.initSounds();
	Items.init();
	Blocks.init();
	Blocks.addNames();
	TileEntities.init();
	Recipes.init();
	}

    @EventHandler
    public static void init( FMLInitializationEvent event ) {
	Items.addNames();
    }

    @EventHandler
    public static void postInit( FMLPostInitializationEvent event ) {

    }
}

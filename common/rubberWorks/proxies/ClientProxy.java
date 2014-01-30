package rubberWorks.proxies;

import java.util.Iterator;








import net.minecraft.client.Minecraft;
import rubberWorks.lib.Ids;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.ModContainer;



public class ClientProxy extends CommonProxy
    {
	@Override
	public void initRenderers() {

	}
	
	@Override
	public void initSounds() {

	}
	
	public void doNEICheck(int id) {
	    
		if (Minecraft.getMinecraft().thePlayer != null ) {
	            Iterator modsIT = Loader.instance().getModList().iterator();
	            ModContainer modc;
	            while (modsIT.hasNext()) {
	                modc = (ModContainer) modsIT.next();
	                if ("Not Enough Items".equals(modc.getName().trim())) {
	                    codechicken.nei.api.API.hideItem(Ids.BlockPermTap_actual);
	                    return;   
                }
            }
        }
    }
}
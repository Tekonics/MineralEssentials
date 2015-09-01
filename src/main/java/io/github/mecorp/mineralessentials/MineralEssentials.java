package io.github.mecorp.mineralessentials;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import io.github.mecorp.mineralessentials.cobalt.Cobalt;
import io.github.mecorp.mineralessentials.copper.Copper;
import io.github.mecorp.mineralessentials.creative.Creative;
import io.github.mecorp.mineralessentials.crystal.Crystal;
import io.github.mecorp.mineralessentials.fakediamond.FakeDiamond;
import io.github.mecorp.mineralessentials.food.Food;
import io.github.mecorp.mineralessentials.generation.ModGeneration;
import io.github.mecorp.mineralessentials.glass.Glass;
import io.github.mecorp.mineralessentials.handler.ConfigHandler;
import io.github.mecorp.mineralessentials.client.gui.GuiHandeler;
import io.github.mecorp.mineralessentials.iridium.Iridium;
import io.github.mecorp.mineralessentials.machines.Machines;
import io.github.mecorp.mineralessentials.proxy.CommonProxy;
import io.github.mecorp.mineralessentials.random.Random;
import io.github.mecorp.mineralessentials.reference.Reference;
import io.github.mecorp.mineralessentials.steel.Steel;
import io.github.mecorp.mineralessentials.helper.LogHelper;
import io.github.mecorp.mineralessentials.tin.Tin;
import org.apache.logging.log4j.LogManager;

/**
 * Created by untamemadman on 8/25/2014.
 */

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class MineralEssentials
{
    @Mod.Instance(Reference.MOD_ID)
    public static MineralEssentials instances;

    @SidedProxy(clientSide = Reference.ClientProxyClass, serverSide = Reference.ServerProxyClass)
    public static CommonProxy proxy;

    public MineralEssentials()
    {
        if (Loader.isModLoaded("SolderCraft"))
        {
            LogHelper.info("SolderCraft, Are you ready to create some awesome machines?");
            LogManager.getLogger("SolderCraft").info("MineralEssentials, Lets do this!");
        }
        else
        {
            LogHelper.info("SolderCraft not found...");
            LogHelper.info("Preparing to take over the world");
        }
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigHandler());
        Copper.RegisterCopper();
        Tin.RegisterTin();
        Cobalt.RegisterCobalt();
        Iridium.RegisterIridium();
        Crystal.RegisterCrystal();
        Steel.RegisterSteel();
        Glass.RegisterGlass();
        Food.RegisterFood();
        Random.RegisterRandom();
        Creative.RegisterCreative();
        if (Loader.isModLoaded("SolderCraft"))
        {

        }
        else
        {
            FakeDiamond.RegisterDiamond();
        }
        //Machines.RegisterMachines();
        ModGeneration.loadGeneration();
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {
        //proxy.registerTileEntities();
        //NetworkRegistry.INSTANCE.registerGuiHandler(instances, new GuiHandeler());
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
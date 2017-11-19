package net.insane96mcp.naturalbabyanimals;

import java.util.Random;

import net.insane96mcp.naturalbabyanimals.proxies.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = NaturalBabyAnimals.MOD_ID, name = NaturalBabyAnimals.MOD_NAME, version = NaturalBabyAnimals.VERSION, acceptableRemoteVersions = "*", acceptedMinecraftVersions = NaturalBabyAnimals.MINECRAFT_VERSIONS)
public class NaturalBabyAnimals {
	
	public static final String MOD_ID = "naturalbabyanimals";
	public static final String MOD_NAME = "Natural Baby Animals";
	public static final String VERSION = "1.1.3";
	public static final String RESOURCE_PREFIX = MOD_ID.toLowerCase() + ":";
	public static final String MINECRAFT_VERSIONS = "[1.11,1.11.2]";
	
	@Instance(MOD_ID)
	public static NaturalBabyAnimals instance;
	
	@SidedProxy(clientSide = "net.insane96mcp.naturalbabyanimals.proxies.ClientProxy", serverSide = "net.insane96mcp.naturalbabyanimals.proxies.ServerProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void PreInit(FMLPreInitializationEvent event) {
		proxy.PreInit(event);
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		proxy.Init(event);
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event) {
		proxy.PostInit(event);
	}
}

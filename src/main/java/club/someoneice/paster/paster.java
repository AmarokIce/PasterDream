package club.someoneice.paster;

import club.someoneice.paster.init.ItemRegister;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nonnull;

@Mod("pasterdream")
public class paster {
    public static final String MODID = "pasterdream";
    public static final String Version = "dream_1";
    public static final Logger LOGGER = LogManager.getLogger("[pasterdream]");

    public static final ItemGroup MAIN_TAB = new ItemGroup("paster_main") {
        @Nonnull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemRegister.SANDMAN_PASTER_MAIN.get());
        }
    };

    public static final ItemGroup OTHER_TAB = new ItemGroup("paster_other") {
        @Nonnull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemRegister.SANDMAN_PASTER_OTHER.get());
        }
    };

    public static final ItemGroup GP_TAB = new ItemGroup("paster_gp") {
        @Nonnull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemRegister.SANDMAN_PASTER_GP.get());
        }
    };

    public paster() {
        MinecraftForge.EVENT_BUS.register(this);

         ItemRegister.ItemList.register(FMLJavaModLoadingContext.get().getModEventBus());
        // MinecraftForge.EVENT_BUS.register(new ModEvent());

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
    }


    private void setup(final FMLCommonSetupEvent event) {

    }

    private void doClientStuff(final FMLClientSetupEvent event) {

    }

    public static Logger getLogger() {

        return LOGGER;

    }
}

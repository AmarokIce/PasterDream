package club.someoneice.paster.init;

import club.someoneice.paster.paster;
import club.someoneice.paster.paster_package.item.Itemlist;
import club.someoneice.paster.paster_package.missing_no.test.SandMan;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;

import javax.annotation.Nonnull;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = paster.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class ItemRegister {
    public static final DeferredRegister<Item> ItemList = DeferredRegister.create(Item.class, paster.MODID);

    // Get Sandman Icon for Tab.
    public static RegistryObject<Item> SANDMAN_PASTER_MAIN = register(SandMan::SandManItem , "sandman_paster_main");
    public static RegistryObject<Item> SANDMAN_PASTER_OTHER = register(SandMan::SandManItem , "sandman_paster_other");
    public static RegistryObject<Item> SANDMAN_PASTER_GP = register(SandMan::SandManItem , "sandman_paster_gp");

    // Start Register Item.
    public static RegistryObject<Item> DREAMLET_CRYSTAL = register(Itemlist::item , "dreamlet_crystal");
    public static RegistryObject<Item> DREAMLET_CRYSTAL_SHARD = register(Itemlist::item , "dreamlet_crystal_shard");
    public static RegistryObject<Item> DREAMLET_ALLOY = register(Itemlist::item , "dreamlet_alloy");
    public static RegistryObject<Item> DREAMLET_ALLOY_NUGGET = register(Itemlist::item , "dreamlet_alloy_nugget");
    public static RegistryObject<Item> MANA_DUSH = register(Itemlist::item , "mana_dush");
    public static RegistryObject<Item> MANA_DUSH2 = register(Itemlist::item , "mana_dush2");
    public static RegistryObject<Item> MANA_DUSH3 = register(Itemlist::item , "mana_dush3");
    public static RegistryObject<Item> Mana_CRYSTAL = register(Itemlist::item , "mana_crystal");
    public static RegistryObject<Item> GREASE = register(Itemlist::item , "grease");
    public static RegistryObject<Item> GREASE_INGOT = register(Itemlist::item , "grease_ingot");
    public static RegistryObject<Item> PALLID_WERATH = register(Itemlist::item , "pallid_wreath");
    public static RegistryObject<Item> DREAMT_WREATH = register(Itemlist::item , "dreamy_reath");
    public static RegistryObject<Item> NETHERITE_SCRAP = register(Itemlist::item , "netherite_scrap");
    public static RegistryObject<Item> NETHERITE_INGOT = register(Itemlist::item , "netherite_ingot");
    public static RegistryObject<Item> RAINBOW_BLADE = register(Itemlist::item , "rainbow_blade");
    public static RegistryObject<Item> RAINBOW_KNIFE = register(Itemlist::item , "rainbow_knife");
    public static RegistryObject<Item> SALT = register(Itemlist::item , "salt");

    public static RegistryObject<Item> register(@Nonnull Supplier<Item> initializer, @Nonnull String name) {
        return ItemList.register(name, initializer);
    }
}

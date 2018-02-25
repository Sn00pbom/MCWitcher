package com.sn00pbom.mcwitcher;

import com.sn00pbom.mcwitcher.item.ItemModItem;
import com.sn00pbom.mcwitcher.item.ItemSilverSword;
import com.sn00pbom.mcwitcher.item.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by Zach on 2/24/2018.
 */
@Mod.EventBusSubscriber
public class EventListener {

//    @SubscribeEvent
//    public void entityDamage(LivingDamageEvent event){
//        if(event.getSource().getTrueSource() instanceof EntityPlayer){
//            EntityPlayer player = (EntityPlayer) event.getSource().getTrueSource();
//            if(player.getHeldItemMainhand().getItem().getM){
//                event.setAmount(20);
//            }
//        }
//    }
}

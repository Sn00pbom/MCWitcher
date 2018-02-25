package com.sn00pbom.mcwitcher.item;

import com.sn00pbom.mcwitcher.MCWitcher;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by Zach on 2/24/2018.
 */
public class ItemSilverSword extends ItemModItemSword{

    private final float DAMAGETOMONSTER;
    private final float DAMAGETOBOSS;

    public ItemSilverSword(String name, float damageToMonsters, float damageToBosses) {
        super(name,WToolMaterial.SILVER);
        this.DAMAGETOMONSTER = damageToMonsters;
        this.DAMAGETOBOSS = damageToBosses;

    }



    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        worldIn.createExplosion(playerIn,0,10,0,4F,true);
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }


    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {

        if(attacker instanceof EntityPlayer){
            EntityPlayer player = (EntityPlayer) attacker;


            if(target.isCreatureType(EnumCreatureType.MONSTER,false)){//checks if victim entity is monster
                target.attackEntityFrom(DamageSource.causePlayerDamage(player),DAMAGETOMONSTER);
            }
        }

        return super.hitEntity(stack, target, attacker);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add("A basic Silver Sword...");
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }

    @Override
    public EnumRarity getRarity(ItemStack stack) {
        return EnumRarity.UNCOMMON;
    }
}

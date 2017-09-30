package com.knoxhack.betteragriculture.entities.cow;

import javax.annotation.Nullable;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.LootTableList;



public class EntityMobCow2 extends EntityCow
{

	public EntityMobCow2(World worldIn) {
		super(worldIn);
	}

	@Override
    public EntityMobCow2 createChild(EntityAgeable ageable)
    {
        return new EntityMobCow2(this.world);
    }
	


    @Nullable
    protected ResourceLocation getLootTable()
    {
        return LootTableList.ENTITIES_COW;
    }


	
}
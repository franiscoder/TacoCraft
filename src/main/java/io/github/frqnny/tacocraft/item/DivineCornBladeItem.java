package io.github.frqnny.tacocraft.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import java.util.Random;

public class DivineCornBladeItem extends SwordItem {
    public DivineCornBladeItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }


    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        Random random = target.getRandom();
        if (random.nextBoolean()) {
            target.addStatusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 5));
        }
        return super.postHit(stack, target, attacker);
    }
}

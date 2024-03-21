package kono.ceu.mop.api.recipes;

import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.recipes.builders.PrimitiveRecipeBuilder;
import gregtech.core.sound.GTSoundEvents;

import crafttweaker.annotations.ZenRegister;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenProperty;

@ZenClass("mods.gregtech.recipe.RecipeMaps")
@ZenRegister
public class MOPRecipeMaps {

    @ZenProperty
    public static final RecipeMap<PrimitiveRecipeBuilder> BRONZE_PLATED_BLAST_FURNACE_RECIPES = new RecipeMap<>(
            "bronze_plated_blast_furnace", 3, 3, 0, 0, new PrimitiveRecipeBuilder(), false)
                    .setSound(GTSoundEvents.FIRE)
                    .setSmallRecipeMap(RecipeMaps.PRIMITIVE_BLAST_FURNACE_RECIPES);
}

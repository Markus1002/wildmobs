package com.wildmobsmod.main;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.wildmobsmod.blocks.WildMobsModBlocks;
import com.wildmobsmod.items.WildMobsModItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingManager
{
	
	public static void mainRegistry(){
		addSmeltingRecipes();
		addRecipes();
	}
	
    public static void addRecipes()
    {
    	GameRegistry.addRecipe(new ItemStack(WildMobsModItems.helmetFur), "III", "I I", 'I', WildMobsModItems.fur);
    	GameRegistry.addRecipe(new ItemStack(WildMobsModItems.chestplateFur), "I I", "III", "III", 'I', WildMobsModItems.fur);
    	GameRegistry.addRecipe(new ItemStack(WildMobsModItems.legsFur), "III", "I I", "I I", 'I', WildMobsModItems.fur);
    	GameRegistry.addRecipe(new ItemStack(WildMobsModItems.bootsFur), "I I", "I I", 'I', WildMobsModItems.fur);
    	if (MainRegistry.enableFur)
    	{
         	GameRegistry.addRecipe(new ItemStack(WildMobsModItems.fur, 4), "I", 'I', WildMobsModItems.cougarHide);
    	}
    	else
    	{
         	GameRegistry.addRecipe(new ItemStack(Items.leather, 4), "I", 'I', WildMobsModItems.cougarHide);
    	}
    	GameRegistry.addRecipe(new ItemStack(Items.item_frame, 1), new Object[] {"###", "#X#", "###", '#', Items.stick, 'X', WildMobsModItems.fur});
    	GameRegistry.addShapelessRecipe(new ItemStack(Items.book, 1), new Object[] {Items.paper, Items.paper, Items.paper, WildMobsModItems.fur});
    	GameRegistry.addRecipe(new ItemStack(Items.item_frame, 1), new Object[] {"###", "#X#", "###", '#', Items.stick, 'X', WildMobsModItems.bisonLeather});
    	GameRegistry.addShapelessRecipe(new ItemStack(Items.book, 1), new Object[] {Items.paper, Items.paper, Items.paper, WildMobsModItems.bisonLeather});
    	GameRegistry.addRecipe(new ItemStack(WildMobsModBlocks.bisonBlock), "II", "II", 'I', WildMobsModItems.bisonLeather);
    	GameRegistry.addRecipe(new ItemStack(WildMobsModBlocks.bisonCarpet, 3), "II", 'I', WildMobsModItems.bisonLeather);
    	GameRegistry.addRecipe(new ItemStack(WildMobsModItems.bisonLeather, 4), "I", 'I', WildMobsModBlocks.bisonBlock);
    	GameRegistry.addRecipe(new ItemStack(WildMobsModBlocks.furBlock), "II", "II", 'I', WildMobsModItems.fur);
    	GameRegistry.addRecipe(new ItemStack(WildMobsModItems.fur, 4), "I", 'I', WildMobsModBlocks.furBlock);
    	GameRegistry.addRecipe(new ItemStack(WildMobsModBlocks.furCarpet, 3), "II", 'I', WildMobsModItems.fur);
    	GameRegistry.addRecipe(new ItemStack(WildMobsModBlocks.leatherBlock), "II", "II", 'I', Items.leather);
    	GameRegistry.addRecipe(new ItemStack(WildMobsModBlocks.leatherCarpet, 3), "II", 'I', Items.leather);
    	GameRegistry.addRecipe(new ItemStack(Items.leather, 4), "I", 'I', WildMobsModBlocks.leatherBlock);
    	GameRegistry.addRecipe(new ItemStack(Items.dye, 6, 15), "I", 'I', WildMobsModItems.thickBone);
    	GameRegistry.addShapelessRecipe(new ItemStack(WildMobsModBlocks.bladderBlockStage0, 1), new Object[] {WildMobsModBlocks.bladderBlockStage1, WildMobsModBlocks.bladderBlockStage1});
    	GameRegistry.addShapelessRecipe(new ItemStack(WildMobsModBlocks.bladderBlockStage1, 1), new Object[] {WildMobsModBlocks.bladderBlockStage2, WildMobsModBlocks.bladderBlockStage2});
    	GameRegistry.addRecipe(new ItemStack(WildMobsModItems.helmetBison), "III", "I I", 'I', WildMobsModItems.bisonLeather);
    	GameRegistry.addRecipe(new ItemStack(WildMobsModItems.chestplateBison), "I I", "III", "III", 'I', WildMobsModItems.bisonLeather);
    	GameRegistry.addRecipe(new ItemStack(WildMobsModItems.legsBison), "III", "I I", "I I", 'I', WildMobsModItems.bisonLeather);
    	GameRegistry.addRecipe(new ItemStack(WildMobsModItems.bootsBison), "I I", "I I", 'I', WildMobsModItems.bisonLeather);
    	GameRegistry.addRecipe(new ItemStack(WildMobsModItems.bugNet), "  X", " I#", "I  ", 'I', Items.stick, '#', Blocks.web, 'X', Items.iron_ingot);
    	GameRegistry.addRecipe(new ItemStack(WildMobsModBlocks.armadilloShellBlock, 2), "II", "II", 'I', WildMobsModItems.armadilloShell);
    	GameRegistry.addRecipe(new ItemStack(WildMobsModItems.armadilloShell, 2), "I", 'I', WildMobsModBlocks.armadilloShellBlock);
    	GameRegistry.addRecipe(new ItemStack(Items.dye, 1, 15), "I", 'I', WildMobsModItems.armadilloShell);
    	GameRegistry.addShapelessRecipe(new ItemStack(Items.slime_ball, 1), new Object[] {WildMobsModItems.slimeDrop, WildMobsModItems.slimeDrop});
    	GameRegistry.addShapelessRecipe(new ItemStack(Items.magma_cream, 1), new Object[] {WildMobsModItems.magmaCreamDrop, WildMobsModItems.magmaCreamDrop});
    	GameRegistry.addRecipe(new ItemStack(WildMobsModBlocks.armadilloShellBlockStairs, 4), "  I", " II", "III", 'I', WildMobsModBlocks.armadilloShellBlock);
    	GameRegistry.addRecipe(new ItemStack(WildMobsModBlocks.armadilloShellBlockStairs, 4), "I  ", "II ", "III", 'I', WildMobsModBlocks.armadilloShellBlock);
    	GameRegistry.addRecipe(new ItemStack(WildMobsModBlocks.armadilloShellBlockStairs, 4), "III", "II ", "I  ", 'I', WildMobsModBlocks.armadilloShellBlock);
    	GameRegistry.addRecipe(new ItemStack(WildMobsModBlocks.armadilloShellBlockStairs, 4), "III", " II", "  I", 'I', WildMobsModBlocks.armadilloShellBlock);
    	GameRegistry.addRecipe(new ItemStack(WildMobsModBlocks.armadilloShellBlockSlabSingle, 6), "III", 'I', WildMobsModBlocks.armadilloShellBlock);
    	GameRegistry.addRecipe(new ItemStack(WildMobsModBlocks.armadilloShellBlockPatterned), "I", "I", 'I', WildMobsModBlocks.armadilloShellBlockSlabSingle);
    	GameRegistry.addRecipe(new ItemStack(WildMobsModItems.goldenSeaEgg), "III", "IXI", "III", 'I', Items.gold_ingot, 'X', WildMobsModItems.seaScorpionEgg);
    	GameRegistry.addShapelessRecipe(new ItemStack(Items.rotten_flesh, 1), new Object[] {WildMobsModItems.infectedFlesh, Items.water_bucket});
    }
    
	public static void addSmeltingRecipes(){
		GameRegistry.addSmelting(WildMobsModItems.rawVenison, new ItemStack(WildMobsModItems.cookedVenison), 0.35F);
		GameRegistry.addSmelting(WildMobsModItems.rawBisonMeat, new ItemStack(WildMobsModItems.cookedBisonMeat), 0.35F);
		GameRegistry.addSmelting(WildMobsModItems.rawMouse, new ItemStack(WildMobsModItems.cookedMouse), 0.35F);
		GameRegistry.addSmelting(WildMobsModItems.rawChevon, new ItemStack(WildMobsModItems.cookedChevon), 0.35F);
		GameRegistry.addSmelting(WildMobsModItems.rawCalamari, new ItemStack(WildMobsModItems.cookedCalamari), 0.35F);
		GameRegistry.addSmelting(WildMobsModItems.rawGoose, new ItemStack(WildMobsModItems.cookedGoose), 0.35F);
		GameRegistry.addSmelting(WildMobsModItems.magmaPlantSeed, new ItemStack(WildMobsModItems.roastedMagmaPlantSeed), 0.35F);
		GameRegistry.addSmelting(WildMobsModBlocks.armadilloShellBlock, new ItemStack(WildMobsModBlocks.armadilloShellBlockCracked), 0.1F);
	}
}
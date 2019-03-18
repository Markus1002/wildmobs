// Date: 15.4.2017 11.00.04
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package com.wildmobsmod.entity.passive.dragonfly;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelDragonfly extends ModelBase
{
	// fields
	ModelRenderer wing1;
	ModelRenderer wing2;
	ModelRenderer wing3;
	ModelRenderer wing4;
	ModelRenderer abdomen;
	ModelRenderer thorax;
	ModelRenderer head;

	public ModelDragonfly()
	{
		textureWidth = 64;
		textureHeight = 32;

		wing1 = new ModelRenderer(this, 0, 0);
		wing1.addBox(-6F, 0F, -5F, 6, 0, 10);
		wing1.setRotationPoint(-0.5F, 21.5F, 0F);
		wing1.setTextureSize(64, 32);
		setRotation(wing1, 0F, 0F, 0F);
		wing2 = new ModelRenderer(this, 0, 0);
		wing2.mirror = true;
		wing2.addBox(0F, 0F, -5F, 6, 0, 10);
		wing2.setRotationPoint(0.5F, 21.5F, 0F);
		wing2.setTextureSize(64, 32);
		setRotation(wing2, 0F, 0F, 0F);
		wing3 = new ModelRenderer(this, 0, 0);
		wing3.addBox(-6F, 0F, -5F, 6, 0, 10);
		wing3.setRotationPoint(-0.5F, 21.5F, 0F);
		wing3.setTextureSize(64, 32);
		setRotation(wing3, 0F, 0F, 0F);
		wing4 = new ModelRenderer(this, 0, 0);
		wing4.mirror = true;
		wing4.addBox(0F, 0F, -5F, 6, 0, 10);
		wing4.setRotationPoint(0.5F, 21.5F, 0F);
		wing4.setTextureSize(64, 32);
		setRotation(wing4, 0F, 0F, 0F);
		abdomen = new ModelRenderer(this, 0, 6);
		abdomen.addBox(-0.5F, -0.5F, 0F, 1, 1, 4);
		abdomen.setRotationPoint(0F, 21.5F, -0.5F);
		abdomen.setTextureSize(64, 32);
		setRotation(abdomen, 0F, 0F, 0F);
		thorax = new ModelRenderer(this, 0, 2);
		thorax.addBox(-0.5F, -0.5F, -1.5F, 1, 1, 3);
		thorax.setRotationPoint(0F, 21.5F, -2F);
		thorax.setTextureSize(64, 32);
		setRotation(thorax, 0F, 0F, 0F);
		head = new ModelRenderer(this, 0, 0);
		head.addBox(-0.5F, -0.5F, -1F, 1, 1, 1);
		head.setRotationPoint(0F, 21.5F, -3.5F);
		head.setTextureSize(64, 32);
		setRotation(head, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		float f6 = 2.0F;
		GL11.glPushMatrix();
		GL11.glScalef(2.2F / f6, 2.2F / f6, 2.2F / f6);
		GL11.glTranslatef(0.0F, -0.12F, 0.0F);
		thorax.render(f5);
		GL11.glPopMatrix();
		wing1.render(f5);
		wing2.render(f5);
		abdomen.render(f5);
		head.render(f5);
		this.wing1.rotateAngleZ = MathHelper.cos(f2 * 2.5F) * (float) Math.PI * 0.2F;
		this.wing2.rotateAngleZ = -this.wing1.rotateAngleZ;
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

}

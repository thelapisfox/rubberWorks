package rubberWorks.blocks;

import java.util.List;
import java.util.Random;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBlockPermTap extends ModelBase
{
    //fields
    ModelRenderer Back;
    ModelRenderer OuterRegionDown;
    ModelRenderer InnerRegionDown;
    ModelRenderer InnerRegionRight;
    ModelRenderer OuterRegionRight;
    ModelRenderer OuterRegionUp;
    ModelRenderer InnerRegionUp;
    ModelRenderer OuterRegionLeft;
    ModelRenderer InnerRegionLeft;
    ModelRenderer PipeConnector;

    public ModelBlockPermTap()
	{
	    textureWidth = 64;
	    textureHeight = 64;

	    Back = new ModelRenderer(this, 29, 26);
	    Back.addBox(0F, 0F, 0F, 10, 11, 1);
	    Back.setRotationPoint(-5F, 10F, 7F);
	    Back.setTextureSize(64, 64);
	    Back.mirror = true;
	    setRotation(Back, 0F, 0F, 0F);
	    OuterRegionDown = new ModelRenderer(this, 0, 17);
	    OuterRegionDown.addBox(0F, 0F, 0F, 8, 1, 1);
	    OuterRegionDown.setRotationPoint(-4F, 19F, 6F);
	    OuterRegionDown.setTextureSize(64, 64);
	    OuterRegionDown.mirror = true;
	    setRotation(OuterRegionDown, 0F, 0F, 0F);
	    InnerRegionDown = new ModelRenderer(this, 0, 29);
	    InnerRegionDown.addBox(0F, 0F, 0F, 6, 1, 1);
	    InnerRegionDown.setRotationPoint(-3F, 18F, 6F);
	    InnerRegionDown.setTextureSize(64, 64);
	    InnerRegionDown.mirror = true;
	    setRotation(InnerRegionDown, 0F, 0F, 0F);
	    InnerRegionRight = new ModelRenderer(this, 0, 31);
	    InnerRegionRight.addBox(0F, 0F, 0F, 1, 5, 1);
	    InnerRegionRight.setRotationPoint(2F, 13F, 6F);
	    InnerRegionRight.setTextureSize(64, 64);
	    InnerRegionRight.mirror = true;
	    setRotation(InnerRegionRight, 0F, 0F, 0F);
	    OuterRegionRight = new ModelRenderer(this, 0, 19);
	    OuterRegionRight.addBox(0F, 0F, 0F, 1, 7, 1);
	    OuterRegionRight.setRotationPoint(3F, 12F, 6F);
	    OuterRegionRight.setTextureSize(64, 64);
	    OuterRegionRight.mirror = true;
	    setRotation(OuterRegionRight, 0F, 0F, 0F);
	    OuterRegionUp = new ModelRenderer(this, 0, 17);
	    OuterRegionUp.addBox(0F, 0F, 0F, 8, 1, 1);
	    OuterRegionUp.setRotationPoint(-4F, 11F, 6F);
	    OuterRegionUp.setTextureSize(64, 64);
	    OuterRegionUp.mirror = true;
	    setRotation(OuterRegionUp, 0F, 0F, 0F);
	    InnerRegionUp = new ModelRenderer(this, 0, 29);
	    InnerRegionUp.addBox(0F, 0F, 0F, 6, 1, 1);
	    InnerRegionUp.setRotationPoint(-3F, 12F, 6F);
	    InnerRegionUp.setTextureSize(64, 64);
	    InnerRegionUp.mirror = true;
	    setRotation(InnerRegionUp, 0F, 0F, 0F);
	    OuterRegionLeft = new ModelRenderer(this, 0, 19);
	    OuterRegionLeft.addBox(0F, 0F, 0F, 1, 7, 1);
	    OuterRegionLeft.setRotationPoint(-4F, 12F, 6F);
	    OuterRegionLeft.setTextureSize(64, 64);
	    OuterRegionLeft.mirror = true;
	    setRotation(OuterRegionLeft, 0F, 0F, 0F);
	    InnerRegionLeft = new ModelRenderer(this, 0, 31);
	    InnerRegionLeft.addBox(0F, 0F, 0F, 1, 5, 1);
	    InnerRegionLeft.setRotationPoint(-3F, 13F, 6F);
	    InnerRegionLeft.setTextureSize(64, 64);
	    InnerRegionLeft.mirror = true;
	    setRotation(InnerRegionLeft, 0F, 0F, 0F);
	    PipeConnector = new ModelRenderer(this, 33, 7);
	    PipeConnector.addBox(0F, 0F, 0F, 4, 5, 2);
	    PipeConnector.setRotationPoint(-2F, 13F, 5F);
	    PipeConnector.setTextureSize(64, 64);
	    PipeConnector.mirror = true;
	    setRotation(PipeConnector, 0F, 0F, 0F);
	}

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
	    super.render(entity, f, f1, f2, f3, f4, f5);
	    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	    Back.render(f5);
	    OuterRegionDown.render(f5);
	    InnerRegionDown.render(f5);
	    InnerRegionRight.render(f5);
	    OuterRegionRight.render(f5);
	    OuterRegionUp.render(f5);
	    InnerRegionUp.render(f5);
	    OuterRegionLeft.render(f5);
	    InnerRegionLeft.render(f5);
	    PipeConnector.render(f5);
	}

    public void renderModel(float f5) {
	Back.render(f5);
	OuterRegionDown.render(f5);
	InnerRegionDown.render(f5);
	InnerRegionRight.render(f5);
	OuterRegionRight.render(f5);
	OuterRegionUp.render(f5);
	InnerRegionUp.render(f5);
	OuterRegionLeft.render(f5);
	InnerRegionLeft.render(f5);
	PipeConnector.render(f5);
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

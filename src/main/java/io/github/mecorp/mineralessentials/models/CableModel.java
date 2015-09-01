// Date: 01/09/2015 20:19:13
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package net.minecraft.src;

public class ModelNew extends ModelBase
{
  //fields
    ModelRenderer leg3;
  
  public ModelNew()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      leg3 = new ModelRenderer(this, 0, 16);
      leg3.addBox(-3F, 0F, -3F, 16, 3, 3);
      leg3.setRotationPoint(0F, 9.466666F, 0F);
      leg3.setTextureSize(64, 32);
      leg3.mirror = true;
      setRotation(leg3, 0.9294653F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    leg3.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5);
  }

}

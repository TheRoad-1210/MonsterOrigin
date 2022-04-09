package github.daoRehT.monster_origin.monster_origin.commom.entity.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import github.daoRehT.monster_origin.monster_origin.commom.entity.TaiChiEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class TaiChiModel extends EntityModel<TaiChiEntity> {
        private final ModelRenderer bone;
        private final ModelRenderer cube_r1;

        public TaiChiModel() {
            textureWidth = 16;
            textureHeight = 16;

            bone = new ModelRenderer(this);
            bone.setRotationPoint(0.0F, 24.0F, 0.0F);


            cube_r1 = new ModelRenderer(this);
            cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
            bone.addChild(cube_r1);
            setRotationAngle(cube_r1, 3.0281F, -0.0653F, -0.5199F);
            cube_r1.setTextureOffset(0, 0).addBox(-5.0F, -2.0F, -0.2F, 15.0F, 15.0F, 1.0F, 0.0F, false);
            cube_r1.setTextureOffset(0, 0).addBox(-5.0F, -2.0F, -0.19F, 15.0F, 15.0F, 1.0F, 0.0F, false);
            cube_r1.setTextureOffset(0, 0).addBox(-5.0F, -2.0F, -0.18F, 15.0F, 15.0F, 1.0F, 0.0F, false);
            cube_r1.setTextureOffset(0, 0).addBox(-5.0F, -2.0F, -0.17F, 15.0F, 15.0F, 1.0F, 0.0F, false);
            cube_r1.setTextureOffset(0, 0).addBox(-5.0F, -2.0F, -0.16F, 15.0F, 15.0F, 1.0F, 0.0F, false);
            cube_r1.setTextureOffset(0, 0).addBox(-5.0F, -2.0F, -0.15F, 15.0F, 15.0F, 1.0F, 0.0F, false);
            cube_r1.setTextureOffset(0, 0).addBox(-5.0F, -2.0F, -0.14F, 15.0F, 15.0F, 1.0F, 0.0F, false);
            cube_r1.setTextureOffset(0, 0).addBox(-5.0F, -2.0F, -0.13F, 15.0F, 15.0F, 1.0F, 0.0F, false);
            cube_r1.setTextureOffset(0, 0).addBox(-5.0F, -2.0F, -0.12F, 15.0F, 15.0F, 1.0F, 0.0F, false);
            cube_r1.setTextureOffset(0, 0).addBox(-5.0F, -2.0F, -0.11F, 15.0F, 15.0F, 1.0F, 0.0F, false);
            cube_r1.setTextureOffset(0, 0).addBox(-5.0F, -2.0F, -0.1F, 15.0F, 15.0F, 1.0F, 0.0F, false);
            cube_r1.setTextureOffset(0, 0).addBox(-5.0F, -2.0F, -0.09F, 15.0F, 15.0F, 1.0F, 0.0F, false);
            cube_r1.setTextureOffset(0, 0).addBox(-5.0F, -2.0F, -0.08F, 15.0F, 15.0F, 1.0F, 0.0F, false);
            cube_r1.setTextureOffset(0, 0).addBox(-5.0F, -2.0F, -0.07F, 15.0F, 15.0F, 1.0F, 0.0F, false);
            cube_r1.setTextureOffset(0, 0).addBox(-5.0F, -2.0F, -0.06F, 15.0F, 15.0F, 1.0F, 0.0F, false);
            cube_r1.setTextureOffset(0, 0).addBox(-5.0F, -2.0F, -0.05F, 15.0F, 15.0F, 1.0F, 0.0F, false);
            cube_r1.setTextureOffset(0, 0).addBox(-5.0F, -2.0F, -0.04F, 15.0F, 15.0F, 1.0F, 0.0F, false);
            cube_r1.setTextureOffset(0, 0).addBox(-5.0F, -2.0F, -0.03F, 15.0F, 15.0F, 1.0F, 0.0F, false);
            cube_r1.setTextureOffset(0, 0).addBox(-5.0F, -2.0F, -0.02F, 15.0F, 15.0F, 1.0F, 0.0F, false);
            cube_r1.setTextureOffset(0, 0).addBox(-5.0F, -2.0F, -0.01F, 15.0F, 15.0F, 1.0F, 0.0F, false);
        }

      @Override
      public void setRotationAngles(TaiChiEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

         }



        @Override
        public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
            bone.render(matrixStack, buffer, packedLight, packedOverlay);
        }

        public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
            modelRenderer.rotateAngleX = x;
            modelRenderer.rotateAngleY = y;
            modelRenderer.rotateAngleZ = z;

    }
}

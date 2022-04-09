package github.daoRehT.monster_origin.monster_origin.commom.entity.render;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import github.daoRehT.monster_origin.monster_origin.Monster_origin;
import github.daoRehT.monster_origin.monster_origin.commom.entity.TaiChiEntity;
import github.daoRehT.monster_origin.monster_origin.commom.entity.model.TaiChiModel;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;

public class TaiChiRender extends EntityRenderer<TaiChiEntity> {
    private EntityModel<TaiChiEntity> TaiChiModel;

    public TaiChiRender(EntityRendererManager renderManager) {
        super(renderManager);
        TaiChiModel = new TaiChiModel();
    }

    @Override
    public ResourceLocation getEntityTexture(TaiChiEntity entity) {
        return new ResourceLocation(Monster_origin.MOD_ID, "textures/entity/taichientity.png");
    }

    @Override
    public void render(TaiChiEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
        super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
        matrixStackIn.push();
        matrixStackIn.rotate(Vector3f.YN.rotationDegrees(30));
        IVertexBuilder ivertexbuilder = bufferIn.getBuffer(this.TaiChiModel.getRenderType(this.getEntityTexture(entityIn)));
        this.TaiChiModel.render(matrixStackIn, ivertexbuilder, packedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        matrixStackIn.pop();
    }
}

package net.pokefood.client.gui;

import net.pokefood.world.inventory.MixingGUIMenu;
import net.pokefood.procedures.Frosting9Procedure;
import net.pokefood.procedures.Frosting8Procedure;
import net.pokefood.procedures.Frosting7Procedure;
import net.pokefood.procedures.Frosting6Procedure;
import net.pokefood.procedures.Frosting5Procedure;
import net.pokefood.procedures.Frosting4Procedure;
import net.pokefood.procedures.Frosting3Procedure;
import net.pokefood.procedures.Frosting36Procedure;
import net.pokefood.procedures.Frosting35Procedure;
import net.pokefood.procedures.Frosting34Procedure;
import net.pokefood.procedures.Frosting33Procedure;
import net.pokefood.procedures.Frosting32Procedure;
import net.pokefood.procedures.Frosting31Procedure;
import net.pokefood.procedures.Frosting30Procedure;
import net.pokefood.procedures.Frosting2Procedure;
import net.pokefood.procedures.Frosting29Procedure;
import net.pokefood.procedures.Frosting28Procedure;
import net.pokefood.procedures.Frosting27Procedure;
import net.pokefood.procedures.Frosting26Procedure;
import net.pokefood.procedures.Frosting25Procedure;
import net.pokefood.procedures.Frosting24Procedure;
import net.pokefood.procedures.Frosting23Procedure;
import net.pokefood.procedures.Frosting22Procedure;
import net.pokefood.procedures.Frosting21Procedure;
import net.pokefood.procedures.Frosting20Procedure;
import net.pokefood.procedures.Frosting1Procedure;
import net.pokefood.procedures.Frosting19Procedure;
import net.pokefood.procedures.Frosting18Procedure;
import net.pokefood.procedures.Frosting17Procedure;
import net.pokefood.procedures.Frosting16Procedure;
import net.pokefood.procedures.Frosting15Procedure;
import net.pokefood.procedures.Frosting14Procedure;
import net.pokefood.procedures.Frosting13Procedure;
import net.pokefood.procedures.Frosting12Procedure;
import net.pokefood.procedures.Frosting11Procedure;
import net.pokefood.procedures.Frosting10Procedure;
import net.pokefood.procedures.Blending9Procedure;
import net.pokefood.procedures.Blending8Procedure;
import net.pokefood.procedures.Blending7Procedure;
import net.pokefood.procedures.Blending6Procedure;
import net.pokefood.procedures.Blending5Procedure;
import net.pokefood.procedures.Blending4Procedure;
import net.pokefood.procedures.Blending3Procedure;
import net.pokefood.procedures.Blending36Procedure;
import net.pokefood.procedures.Blending35Procedure;
import net.pokefood.procedures.Blending34Procedure;
import net.pokefood.procedures.Blending33Procedure;
import net.pokefood.procedures.Blending32Procedure;
import net.pokefood.procedures.Blending31Procedure;
import net.pokefood.procedures.Blending30Procedure;
import net.pokefood.procedures.Blending2Procedure;
import net.pokefood.procedures.Blending29Procedure;
import net.pokefood.procedures.Blending28Procedure;
import net.pokefood.procedures.Blending27Procedure;
import net.pokefood.procedures.Blending26Procedure;
import net.pokefood.procedures.Blending25Procedure;
import net.pokefood.procedures.Blending24Procedure;
import net.pokefood.procedures.Blending23Procedure;
import net.pokefood.procedures.Blending22Procedure;
import net.pokefood.procedures.Blending21Procedure;
import net.pokefood.procedures.Blending20Procedure;
import net.pokefood.procedures.Blending1Procedure;
import net.pokefood.procedures.Blending19Procedure;
import net.pokefood.procedures.Blending18Procedure;
import net.pokefood.procedures.Blending17Procedure;
import net.pokefood.procedures.Blending16Procedure;
import net.pokefood.procedures.Blending15Procedure;
import net.pokefood.procedures.Blending14Procedure;
import net.pokefood.procedures.Blending13Procedure;
import net.pokefood.procedures.Blending12Procedure;
import net.pokefood.procedures.Blending11Procedure;
import net.pokefood.procedures.Blending10Procedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class MixingGUIScreen extends AbstractContainerScreen<MixingGUIMenu> {
	private final static HashMap<String, Object> guistate = MixingGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public MixingGUIScreen(MixingGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("pokefood:textures/screens/mixing_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_0.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);

		if (Blending1Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_blending_1.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Blending2Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_blending_2.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Blending3Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_blending_3.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Blending4Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_blending_4.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Blending5Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_blending_5.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Blending6Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_blending_6.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Blending7Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_blending_7.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Blending8Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_blending_8.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Blending9Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_blending_9.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Blending10Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_blending_10.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Blending11Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_blending_11.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Blending12Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_blending_12.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Blending13Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_blending_13.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Blending14Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_blending_14.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Blending15Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_blending_15.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Blending16Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_blending_16.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Blending17Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_blending_17.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Blending18Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_blending_18.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Blending19Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_blending_19.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Blending20Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_blending_20.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Blending21Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_blending_21.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Blending22Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_blending_22.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Blending23Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_blending_23.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Blending24Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_blending_24.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Blending25Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_blending_25.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Blending26Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_blending_26.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Blending27Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_blending_27.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Blending28Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_blending_28.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Blending29Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_blending_29.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Blending30Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_blending_30.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Blending31Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_blending_31.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Blending32Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_blending_32.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Blending33Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_blending_33.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Blending34Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_blending_34.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Blending35Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_blending_35.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Blending36Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_blending_36.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Frosting1Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_frosting_1.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Frosting2Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_frosting_2.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Frosting3Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_frosting_3.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Frosting4Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_frosting_4.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Frosting5Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_frosting_5.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Frosting6Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_frosting_6.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Frosting7Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_frosting_7.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Frosting8Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_frosting_8.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Frosting9Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_frosting_9.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Frosting10Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_frosting_10.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Frosting11Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_frosting_11.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Frosting12Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_frosting_12.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Frosting13Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_frosting_13.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Frosting14Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_frosting_14.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Frosting15Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_frosting_15.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Frosting16Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_frosting_16.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Frosting17Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_frosting_17.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Frosting18Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_frosting_18.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Frosting19Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_frosting_19.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Frosting20Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_frosting_20.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Frosting21Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_frosting_21.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Frosting22Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_frosting_22.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Frosting23Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_frosting_23.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Frosting24Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_frosting_24.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Frosting25Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_frosting_25.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Frosting26Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_frosting_26.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Frosting27Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_frosting_27.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Frosting28Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_frosting_28.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Frosting29Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_frosting_29.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Frosting30Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_frosting_30.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Frosting31Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_frosting_31.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Frosting32Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_frosting_32.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Frosting33Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_frosting_33.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Frosting34Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_frosting_34.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Frosting35Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_frosting_35.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Frosting36Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/mixing_frosting_36.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
	}
}

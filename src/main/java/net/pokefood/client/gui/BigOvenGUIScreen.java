package net.pokefood.client.gui;

import net.pokefood.world.inventory.BigOvenGUIMenu;
import net.pokefood.procedures.Oven9Procedure;
import net.pokefood.procedures.Oven8Procedure;
import net.pokefood.procedures.Oven7Procedure;
import net.pokefood.procedures.Oven6Procedure;
import net.pokefood.procedures.Oven5Procedure;
import net.pokefood.procedures.Oven4Procedure;
import net.pokefood.procedures.Oven3Procedure;
import net.pokefood.procedures.Oven2Procedure;
import net.pokefood.procedures.Oven20Procedure;
import net.pokefood.procedures.Oven1Procedure;
import net.pokefood.procedures.Oven19Procedure;
import net.pokefood.procedures.Oven18Procedure;
import net.pokefood.procedures.Oven17Procedure;
import net.pokefood.procedures.Oven16Procedure;
import net.pokefood.procedures.Oven15Procedure;
import net.pokefood.procedures.Oven14Procedure;
import net.pokefood.procedures.Oven13Procedure;
import net.pokefood.procedures.Oven12Procedure;
import net.pokefood.procedures.Oven11Procedure;
import net.pokefood.procedures.Oven10Procedure;

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

public class BigOvenGUIScreen extends AbstractContainerScreen<BigOvenGUIMenu> {
	private final static HashMap<String, Object> guistate = BigOvenGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public BigOvenGUIScreen(BigOvenGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("pokefood:textures/screens/big_oven_gui.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/oven_0.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);

		if (Oven1Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/oven_1.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Oven2Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/oven_2.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Oven3Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/oven_3.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Oven4Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/oven_4.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Oven5Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/oven_5.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Oven6Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/oven_6.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Oven7Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/oven_7.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Oven8Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/oven_8.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Oven9Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/oven_9.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Oven10Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/oven_10.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Oven11Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/oven_11.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Oven12Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/oven_12.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Oven13Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/oven_13.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Oven14Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/oven_14.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Oven15Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/oven_15.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Oven16Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/oven_16.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Oven17Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/oven_17.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Oven18Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/oven_18.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Oven19Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/oven_19.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Oven20Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/oven_20.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
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

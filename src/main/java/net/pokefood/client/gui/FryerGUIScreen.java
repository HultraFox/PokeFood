
package net.pokefood.client.gui;

import net.pokefood.world.inventory.FryerGUIMenu;
import net.pokefood.procedures.Frying9Procedure;
import net.pokefood.procedures.Frying8Procedure;
import net.pokefood.procedures.Frying7Procedure;
import net.pokefood.procedures.Frying6Procedure;
import net.pokefood.procedures.Frying5Procedure;
import net.pokefood.procedures.Frying4Procedure;
import net.pokefood.procedures.Frying3Procedure;
import net.pokefood.procedures.Frying2Procedure;
import net.pokefood.procedures.Frying1Procedure;
import net.pokefood.procedures.Frying11Procedure;
import net.pokefood.procedures.Frying10Procedure;

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

public class FryerGUIScreen extends AbstractContainerScreen<FryerGUIMenu> {
	private final static HashMap<String, Object> guistate = FryerGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public FryerGUIScreen(FryerGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("pokefood:textures/screens/fryer_gui.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/fryer_0.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);

		if (Frying1Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/fryer_1.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Frying2Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/fryer_2.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Frying3Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/fryer_3.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Frying4Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/fryer_4.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Frying5Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/fryer_5.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Frying6Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/fryer_6.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Frying7Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/fryer_7.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Frying8Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/fryer_8.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Frying9Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/fryer_9.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Frying10Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/fryer_10.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		}
		if (Frying11Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/fryer_11.png"));
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

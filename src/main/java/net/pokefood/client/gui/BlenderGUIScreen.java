package net.pokefood.client.gui;

import net.pokefood.world.inventory.BlenderGUIMenu;
import net.pokefood.procedures.Blender7Procedure;
import net.pokefood.procedures.Blender6Procedure;
import net.pokefood.procedures.Blender5Procedure;
import net.pokefood.procedures.Blender4Procedure;
import net.pokefood.procedures.Blender3Procedure;
import net.pokefood.procedures.Blender2Procedure;
import net.pokefood.procedures.Blender1Procedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class BlenderGUIScreen extends AbstractContainerScreen<BlenderGUIMenu> {
	private final static HashMap<String, Object> guistate = BlenderGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public BlenderGUIScreen(BlenderGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("pokefood:textures/screens/blender_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/blender_0.png"), this.leftPos + 104, this.topPos + 20, 0, 0, 6, 10, 6, 10);

		if (Blender1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/blender_1.png"), this.leftPos + 104, this.topPos + 20, 0, 0, 6, 10, 6, 10);
		}
		if (Blender2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/blender_2.png"), this.leftPos + 104, this.topPos + 20, 0, 0, 6, 10, 6, 10);
		}

		guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/blender_0.png"), this.leftPos + 114, this.topPos + 20, 0, 0, 6, 10, 6, 10);

		if (Blender2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/blender_1.png"), this.leftPos + 114, this.topPos + 20, 0, 0, 6, 10, 6, 10);
		}
		if (Blender3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/blender_2.png"), this.leftPos + 114, this.topPos + 20, 0, 0, 6, 10, 6, 10);
		}

		guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/blender_0.png"), this.leftPos + 124, this.topPos + 20, 0, 0, 6, 10, 6, 10);

		if (Blender3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/blender_1.png"), this.leftPos + 124, this.topPos + 20, 0, 0, 6, 10, 6, 10);
		}
		if (Blender4Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/blender_2.png"), this.leftPos + 124, this.topPos + 20, 0, 0, 6, 10, 6, 10);
		}

		guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/blender_0.png"), this.leftPos + 134, this.topPos + 20, 0, 0, 6, 10, 6, 10);

		if (Blender4Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/blender_1.png"), this.leftPos + 134, this.topPos + 20, 0, 0, 6, 10, 6, 10);
		}
		if (Blender5Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/blender_2.png"), this.leftPos + 134, this.topPos + 20, 0, 0, 6, 10, 6, 10);
		}

		guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/blender_0.png"), this.leftPos + 144, this.topPos + 20, 0, 0, 6, 10, 6, 10);

		if (Blender5Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/blender_1.png"), this.leftPos + 144, this.topPos + 20, 0, 0, 6, 10, 6, 10);
		}
		if (Blender6Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/blender_2.png"), this.leftPos + 144, this.topPos + 20, 0, 0, 6, 10, 6, 10);
		}

		guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/blender_0.png"), this.leftPos + 154, this.topPos + 20, 0, 0, 6, 10, 6, 10);

		if (Blender6Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/blender_1.png"), this.leftPos + 154, this.topPos + 20, 0, 0, 6, 10, 6, 10);
		}
		if (Blender7Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/blender_2.png"), this.leftPos + 154, this.topPos + 20, 0, 0, 6, 10, 6, 10);
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
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
	}
}

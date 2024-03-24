package net.pokefood.client.gui;

import net.pokefood.world.inventory.BigOvenGUIMenu;
import net.pokefood.procedures.Oven9Procedure;
import net.pokefood.procedures.Oven8Progress3Procedure;
import net.pokefood.procedures.Oven8Progress2Procedure;
import net.pokefood.procedures.Oven8Progress1Procedure;
import net.pokefood.procedures.Oven8Procedure;
import net.pokefood.procedures.Oven7Progress3Procedure;
import net.pokefood.procedures.Oven7Progress2Procedure;
import net.pokefood.procedures.Oven7Progress1Procedure;
import net.pokefood.procedures.Oven7Procedure;
import net.pokefood.procedures.Oven6Progress3Procedure;
import net.pokefood.procedures.Oven6Progress2Procedure;
import net.pokefood.procedures.Oven6Progress1Procedure;
import net.pokefood.procedures.Oven6Procedure;
import net.pokefood.procedures.Oven5Progress3Procedure;
import net.pokefood.procedures.Oven5Progress2Procedure;
import net.pokefood.procedures.Oven5Progress1Procedure;
import net.pokefood.procedures.Oven5Procedure;
import net.pokefood.procedures.Oven4Progress3Procedure;
import net.pokefood.procedures.Oven4Progress2Procedure;
import net.pokefood.procedures.Oven4Progress1Procedure;
import net.pokefood.procedures.Oven4Procedure;
import net.pokefood.procedures.Oven3Progress3Procedure;
import net.pokefood.procedures.Oven3Progress2Procedure;
import net.pokefood.procedures.Oven3Progress1Procedure;
import net.pokefood.procedures.Oven3Procedure;
import net.pokefood.procedures.Oven2Progress3Procedure;
import net.pokefood.procedures.Oven2Progress2Procedure;
import net.pokefood.procedures.Oven2Progress1Procedure;
import net.pokefood.procedures.Oven2Procedure;
import net.pokefood.procedures.Oven1Progress3Procedure;
import net.pokefood.procedures.Oven1Progress2Procedure;
import net.pokefood.procedures.Oven1Progress1Procedure;
import net.pokefood.procedures.Oven1Procedure;
import net.pokefood.procedures.Oven14Procedure;
import net.pokefood.procedures.Oven13Procedure;
import net.pokefood.procedures.Oven12Procedure;
import net.pokefood.procedures.Oven11Procedure;
import net.pokefood.procedures.Oven10Procedure;
import net.pokefood.procedures.Oven0Progress3Procedure;
import net.pokefood.procedures.Oven0Progress2Procedure;
import net.pokefood.procedures.Oven0Progress1Procedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

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

		guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_fire_0.png"), this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);

		if (Oven1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_fire_1.png"), this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Oven2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_fire_2.png"), this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Oven3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_fire_3.png"), this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Oven4Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_fire_4.png"), this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Oven5Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_fire_5.png"), this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Oven6Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_fire_6.png"), this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Oven7Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_fire_7.png"), this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Oven8Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_fire_8.png"), this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Oven9Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_fire_9.png"), this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Oven10Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_fire_10.png"), this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Oven11Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_fire_11.png"), this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Oven12Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_fire_12.png"), this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Oven13Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_fire_13.png"), this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Oven14Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_fire_14.png"), this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}

		guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_process_0.png"), this.leftPos + 33, this.topPos + 7, 0, 0, 28, 22, 28, 22);

		if (Oven0Progress1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_process_1.png"), this.leftPos + 33, this.topPos + 7, 0, 0, 28, 22, 28, 22);
		}
		if (Oven0Progress2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_process_2.png"), this.leftPos + 33, this.topPos + 7, 0, 0, 28, 22, 28, 22);
		}
		if (Oven0Progress3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_process_3.png"), this.leftPos + 33, this.topPos + 7, 0, 0, 28, 22, 28, 22);
		}

		guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_process_0.png"), this.leftPos + 78, this.topPos + 7, 0, 0, 28, 22, 28, 22);

		if (Oven1Progress1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_process_1.png"), this.leftPos + 78, this.topPos + 7, 0, 0, 28, 22, 28, 22);
		}
		if (Oven1Progress2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_process_2.png"), this.leftPos + 78, this.topPos + 7, 0, 0, 28, 22, 28, 22);
		}
		if (Oven1Progress3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_process_3.png"), this.leftPos + 78, this.topPos + 7, 0, 0, 28, 22, 28, 22);
		}

		guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_process_0.png"), this.leftPos + 123, this.topPos + 7, 0, 0, 28, 22, 28, 22);

		if (Oven2Progress1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_process_1.png"), this.leftPos + 123, this.topPos + 7, 0, 0, 28, 22, 28, 22);
		}
		if (Oven2Progress2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_process_2.png"), this.leftPos + 123, this.topPos + 7, 0, 0, 28, 22, 28, 22);
		}
		if (Oven2Progress3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_process_3.png"), this.leftPos + 123, this.topPos + 7, 0, 0, 28, 22, 28, 22);
		}

		guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_process_0.png"), this.leftPos + 33, this.topPos + 34, 0, 0, 28, 22, 28, 22);

		if (Oven3Progress1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_process_1.png"), this.leftPos + 33, this.topPos + 34, 0, 0, 28, 22, 28, 22);
		}
		if (Oven3Progress2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_process_2.png"), this.leftPos + 33, this.topPos + 34, 0, 0, 28, 22, 28, 22);
		}
		if (Oven3Progress3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_process_3.png"), this.leftPos + 33, this.topPos + 34, 0, 0, 28, 22, 28, 22);
		}

		guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_process_0.png"), this.leftPos + 78, this.topPos + 34, 0, 0, 28, 22, 28, 22);

		if (Oven4Progress1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_process_1.png"), this.leftPos + 78, this.topPos + 34, 0, 0, 28, 22, 28, 22);
		}
		if (Oven4Progress2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_process_2.png"), this.leftPos + 78, this.topPos + 34, 0, 0, 28, 22, 28, 22);
		}
		if (Oven4Progress3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_process_3.png"), this.leftPos + 78, this.topPos + 34, 0, 0, 28, 22, 28, 22);
		}

		guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_process_0.png"), this.leftPos + 123, this.topPos + 34, 0, 0, 28, 22, 28, 22);

		if (Oven5Progress1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_process_1.png"), this.leftPos + 123, this.topPos + 34, 0, 0, 28, 22, 28, 22);
		}
		if (Oven5Progress2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_process_2.png"), this.leftPos + 123, this.topPos + 34, 0, 0, 28, 22, 28, 22);
		}
		if (Oven5Progress3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_process_3.png"), this.leftPos + 123, this.topPos + 34, 0, 0, 28, 22, 28, 22);
		}

		guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_process_0.png"), this.leftPos + 33, this.topPos + 61, 0, 0, 28, 22, 28, 22);

		if (Oven6Progress1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_process_1.png"), this.leftPos + 33, this.topPos + 61, 0, 0, 28, 22, 28, 22);
		}
		if (Oven6Progress2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_process_2.png"), this.leftPos + 33, this.topPos + 61, 0, 0, 28, 22, 28, 22);
		}
		if (Oven6Progress3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_process_3.png"), this.leftPos + 33, this.topPos + 61, 0, 0, 28, 22, 28, 22);
		}

		guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_process_0.png"), this.leftPos + 78, this.topPos + 61, 0, 0, 28, 22, 28, 22);

		if (Oven7Progress1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_process_1.png"), this.leftPos + 78, this.topPos + 61, 0, 0, 28, 22, 28, 22);
		}
		if (Oven7Progress2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_process_2.png"), this.leftPos + 78, this.topPos + 61, 0, 0, 28, 22, 28, 22);
		}
		if (Oven7Progress3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_process_3.png"), this.leftPos + 78, this.topPos + 61, 0, 0, 28, 22, 28, 22);
		}

		guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_process_0.png"), this.leftPos + 123, this.topPos + 61, 0, 0, 28, 22, 28, 22);

		if (Oven8Progress1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_process_1.png"), this.leftPos + 123, this.topPos + 61, 0, 0, 28, 22, 28, 22);
		}
		if (Oven8Progress2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_process_2.png"), this.leftPos + 123, this.topPos + 61, 0, 0, 28, 22, 28, 22);
		}
		if (Oven8Progress3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("pokefood:textures/screens/oven_process_3.png"), this.leftPos + 123, this.topPos + 61, 0, 0, 28, 22, 28, 22);
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

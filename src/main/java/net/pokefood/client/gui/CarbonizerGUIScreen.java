package net.pokefood.client.gui;

import net.pokefood.world.inventory.CarbonizerGUIMenu;
import net.pokefood.procedures.Carbonizer9Procedure;
import net.pokefood.procedures.Carbonizer8Procedure;
import net.pokefood.procedures.Carbonizer7Procedure;
import net.pokefood.procedures.Carbonizer6Procedure;
import net.pokefood.procedures.Carbonizer5Procedure;
import net.pokefood.procedures.Carbonizer50Procedure;
import net.pokefood.procedures.Carbonizer4Procedure;
import net.pokefood.procedures.Carbonizer49Procedure;
import net.pokefood.procedures.Carbonizer48Procedure;
import net.pokefood.procedures.Carbonizer47Procedure;
import net.pokefood.procedures.Carbonizer46Procedure;
import net.pokefood.procedures.Carbonizer45Procedure;
import net.pokefood.procedures.Carbonizer44Procedure;
import net.pokefood.procedures.Carbonizer43Procedure;
import net.pokefood.procedures.Carbonizer42Procedure;
import net.pokefood.procedures.Carbonizer41Procedure;
import net.pokefood.procedures.Carbonizer40Procedure;
import net.pokefood.procedures.Carbonizer3Procedure;
import net.pokefood.procedures.Carbonizer39Procedure;
import net.pokefood.procedures.Carbonizer38Procedure;
import net.pokefood.procedures.Carbonizer37Procedure;
import net.pokefood.procedures.Carbonizer36Procedure;
import net.pokefood.procedures.Carbonizer35Procedure;
import net.pokefood.procedures.Carbonizer34Procedure;
import net.pokefood.procedures.Carbonizer33Procedure;
import net.pokefood.procedures.Carbonizer32Procedure;
import net.pokefood.procedures.Carbonizer31Procedure;
import net.pokefood.procedures.Carbonizer30Procedure;
import net.pokefood.procedures.Carbonizer2Procedure;
import net.pokefood.procedures.Carbonizer29Procedure;
import net.pokefood.procedures.Carbonizer28Procedure;
import net.pokefood.procedures.Carbonizer27Procedure;
import net.pokefood.procedures.Carbonizer26Procedure;
import net.pokefood.procedures.Carbonizer25Procedure;
import net.pokefood.procedures.Carbonizer24Procedure;
import net.pokefood.procedures.Carbonizer23Procedure;
import net.pokefood.procedures.Carbonizer22Procedure;
import net.pokefood.procedures.Carbonizer21Procedure;
import net.pokefood.procedures.Carbonizer20Procedure;
import net.pokefood.procedures.Carbonizer1Procedure;
import net.pokefood.procedures.Carbonizer19Procedure;
import net.pokefood.procedures.Carbonizer18Procedure;
import net.pokefood.procedures.Carbonizer17Procedure;
import net.pokefood.procedures.Carbonizer16Procedure;
import net.pokefood.procedures.Carbonizer15Procedure;
import net.pokefood.procedures.Carbonizer14Procedure;
import net.pokefood.procedures.Carbonizer13Procedure;
import net.pokefood.procedures.Carbonizer12Procedure;
import net.pokefood.procedures.Carbonizer11Procedure;
import net.pokefood.procedures.Carbonizer10Procedure;

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

public class CarbonizerGUIScreen extends AbstractContainerScreen<CarbonizerGUIMenu> {
	private final static HashMap<String, Object> guistate = CarbonizerGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public CarbonizerGUIScreen(CarbonizerGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("pokefood:textures/screens/carbonizer_gui.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_0.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);

		if (Carbonizer1Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_1.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer2Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_2.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer3Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_3.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer4Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_4.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer5Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_5.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer6Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_6.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer7Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_7.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer8Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_8.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer9Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_9.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer10Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_10.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer11Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_11.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer12Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_12.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer13Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_13.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer14Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_14.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer15Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_15.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer16Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_16.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer17Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_17.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer18Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_18.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer19Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_19.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer20Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_20.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer21Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_21.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer22Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_22.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer23Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_23.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer24Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_24.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer25Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_25.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer26Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_26.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer27Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_27.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer28Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_28.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer29Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_29.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer30Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_30.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer31Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_31.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer32Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_32.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer33Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_33.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer34Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_34.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer35Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_35.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer36Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_36.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer37Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_37.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer38Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_38.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer39Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_39.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer40Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_40.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer41Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_41.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer42Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_42.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer43Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_43.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer44Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_44.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer45Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_45.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer46Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_46.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer47Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_47.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer48Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_48.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer49Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_49.png"));
			this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);
		}
		if (Carbonizer50Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("pokefood:textures/screens/carbonizer_progress_50.png"));
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

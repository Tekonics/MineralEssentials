package io.github.mecorp.mineralessentials.client.gui;

import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

/**
 * Created by untamemadman on 06/12/2014.
 */

public class GuiMultiSmelter extends GuiScreen
{
    private int x, y, z;
    private EntityPlayer player;
    private World world;
    private int xSize, ySize;
    private ResourceLocation backgroundImage = new ResourceLocation(Reference.MOD_ID.toLowerCase() + ":" + "textures/client/gui/MultiFurnace.png");
    private ResourceLocation Inventory = new ResourceLocation("textures/gui/container/inventory.png");

    protected void drawContainerForegroundLayer(int param1, int param2)
    {
        fontRendererObj.drawString("Smelter", 8, 6, 4210752);
        fontRendererObj.drawString(StatCollector.translateToLocal("container.inventory"), 8, ySize - 96 + 2, 4210752);
    }

    public GuiMultiSmelter(EntityPlayer player, World world, int x, int y, int z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
        this.player = player;
        this.world = world;
        xSize = 176;
        ySize = 166;
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float renderPartialTicks)
    {
        this.mc.getTextureManager().bindTexture(backgroundImage);
        int x = (this.width - xSize) / 2;
        int y = (this.height - ySize) / 2;
        drawTexturedModalRect(x, y, 0, 0, xSize,  ySize);
    }

    @Override
    public boolean doesGuiPauseGame()
    {
        return false;
    }
}
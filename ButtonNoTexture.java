fr.tonpackage;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Resource;
import java.awt.*;

public class ButtonNoTexture extends GuiButton {

    public ButtonNoTexture(int buttonId, int x, int y, int widthIn, int heightIn, String buttonText) {
        super(buttonId, x, y, widthIn, heightIn, buttonText);
    }

    @Override
    public void drawButton(Minecraft mc, int mouseX, int mouseY) {
        FontRenderer var6 = mc.fontRendererObj;
        drawCenteredString(var6, this.displayString, this.xPosition + this.width / 2, this.yPosition + (this.height - 8) / 2, Color.white.getRGB());
    }

}

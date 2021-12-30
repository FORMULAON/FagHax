package org.crackedkittys.faghax.ui;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;
import org.crackedkittys.faghax.ui.component.Component;
import org.crackedkittys.faghax.ui.component.NewFrame;
import org.crackedkittys.faghax.util.RenderUtil;

public class ClickGui extends Screen {
    public static ClickGui INSTANCE = new ClickGui(Text.of("ClickGui Screen"));
    NewFrame nf = new NewFrame();
    FagInterface interf;

    protected ClickGui(Text title) {
        super(title);
    }

    public interface FagInterface {

        public void callback();
    }

    @Override
    public void init(MinecraftClient client, int width, int height) {
        super.init(client, width, height);
    }

    @Override
    public boolean isPauseScreen() {
        return false;
    }

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        super.render(matrices, mouseX, mouseY, delta);
        this.renderBackground(matrices);

        for (Component c : nf.getComponents()) { // rendering all components
            c.renderComponent(matrices);
        }

        matrices.pop();
    }

    @Override
    public void onClose() {
        super.onClose();
        interf.callback();
    }

    public void registerClose(FagInterface newInterf) {
        interf = newInterf;
    }
}

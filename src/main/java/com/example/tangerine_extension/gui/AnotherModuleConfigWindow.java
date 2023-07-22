package com.example.tangerine_extension.gui;

import imgui.ImGui;
import org.jetbrains.annotations.NotNull;
import pm.n2.tangerine.gui.renderables.ConfigWindow;
import pm.n2.tangerine.modules.Module;

public class AnotherModuleConfigWindow extends ConfigWindow {
    public AnotherModuleConfigWindow(@NotNull Module module) {
        super(module);
    }

    @Override
    public void drawConfig() {
        ImGui.text(":3");
    }
}

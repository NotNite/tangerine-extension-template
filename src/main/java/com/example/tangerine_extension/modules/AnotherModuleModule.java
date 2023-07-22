package com.example.tangerine_extension.modules;

import com.example.tangerine_extension.ExampleModModuleCategory;
import com.example.tangerine_extension.gui.AnotherModuleConfigWindow;
import org.jetbrains.annotations.NotNull;
import pm.n2.tangerine.gui.renderables.ConfigWindow;
import pm.n2.tangerine.modules.Module;

public class AnotherModuleModule extends Module {
    private final AnotherModuleConfigWindow configWindow;

    public AnotherModuleModule() {
        super("another_module", ExampleModModuleCategory.MY_CATEGORY);
        this.configWindow = new AnotherModuleConfigWindow(this);
    }

    @NotNull
    @Override
    public ConfigWindow getConfigWindow() {
        return this.configWindow;
    }
}

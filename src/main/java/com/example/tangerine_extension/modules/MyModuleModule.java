package com.example.tangerine_extension.modules;

import com.example.tangerine_extension.ExampleExtension;
import com.example.tangerine_extension.ExampleModModuleCategory;
import org.jetbrains.annotations.NotNull;
import pm.n2.hajlib.event.EventHandler;
import pm.n2.tangerine.config.ConfigOption;
import pm.n2.tangerine.config.DoubleConfigOption;
import pm.n2.tangerine.core.TangerineEvent;
import pm.n2.tangerine.modules.Module;

import java.util.List;

public class MyModuleModule extends Module {
    public final DoubleConfigOption fanciness = new DoubleConfigOption("my_module", "fanciness", 0.5, 0.0, 1.0);

    public MyModuleModule() {
        super("my_module", ExampleModModuleCategory.MY_CATEGORY);
    }

    @NotNull
    @Override
    public List<ConfigOption<?>> getConfigOptions() {
        return List.of(fanciness);
    }

    @Override
    public void init() {
        // This method is called when the module is initialized, after the
        // config is loaded. Unlike onEnabled and onDisabled, this is always
        // called on startup.
        ExampleExtension.LOGGER.info("Module initialized!");
    }

    @Override
    public void onEnabled() {
        // This method is called when the module is enabled in the GUI.
        ExampleExtension.LOGGER.info("Module enabled!");
    }

    @Override
    public void onDisabled() {
        // This method is called when the module is disabled in the GUI.
        ExampleExtension.LOGGER.info("Module disabled!");
    }

    @EventHandler
    public void onPreTick(TangerineEvent.PreTick event) {
        // This method is called at the start of every tick.
        // See the TangerineEvent class for more events.
    }
}

package com.example.tangerine_extension;

import com.example.tangerine_extension.commands.MyCommandCommand;
import com.example.tangerine_extension.modules.AnotherModuleModule;
import com.example.tangerine_extension.modules.MyModuleModule;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pm.n2.tangerine.commands.TangerineCommand;
import pm.n2.tangerine.extension.TangerineEntrypoint;
import pm.n2.tangerine.modules.Module;
import pm.n2.tangerine.modules.ModuleCategory;

import java.util.List;

public class ExampleExtension extends TangerineEntrypoint {
    public static final Logger LOGGER = LoggerFactory.getLogger("tangerine-extension");

    @Override
    public void onInitialize() {
        LOGGER.info("Hello Tangerine world!");
    }

    // Instead of initializing modules here, you may want to move to a singleton pattern.
    // Since Tangerine is in Kotlin, most modules use the `object` keyword.
    @NotNull
    @Override
    public List<Module> getModules() {
        return List.of(
                new MyModuleModule(),
                new AnotherModuleModule()
        );
    }

    @NotNull
    @Override
    public List<TangerineCommand> getCommands() {
        return List.of(new MyCommandCommand());
    }

    @NotNull
    @Override
    public List<ModuleCategory> getCategories() {
        return List.of(ExampleModModuleCategory.MY_CATEGORY);
    }
}
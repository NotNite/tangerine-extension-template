package com.example.tangerine_extension.commands;

import com.adryd.cauldron.api.command.CauldronClientCommandSource;
import com.adryd.cauldron.api.command.ClientCommandManager;
import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.text.Text;
import org.jetbrains.annotations.NotNull;
import pm.n2.tangerine.commands.TangerineCommand;

public class MyCommandCommand implements TangerineCommand {
    @Override
    public void register(@NotNull CommandDispatcher<CauldronClientCommandSource> dispatcher) {
        var command = ClientCommandManager.literal("mycommand")
                .executes(context -> {
                    context.getSource().sendFeedback(Text.literal("Hello, world!"));
                    return 1;
                });

        dispatcher.register(command);
    }
}

package vn.hellomod;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;
public class HelloMod implements ModInitializer {
      @Override
    public void onInitialize() {
              CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
                            dispatcher.register(
                                              Commands.literal("test")
                                                  .executes(context -> {
                                                                            context.getSource().sendSuccess(() -> Component.literal("Hello"), false);
                                                                            return 1;
                                                                        })
            );
        });
    }
}

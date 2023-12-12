package top.mcxiafeng.fallen;

import net.mamoe.mirai.console.plugin.jvm.JavaPlugin;
import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescriptionBuilder;

public class Fallen extends JavaPlugin {

    public static final Fallen INSTANCE = new Fallen();

    public Fallen() {
        super(new JvmPluginDescriptionBuilder("top.mcxiafeng.fallen", "0.1.0")
                .name("Fallen")
                .author("MC_xiafeng_233")
                .build());
    }

    @Override
    public void onEnable() {
        if (getLogger().isInfoEnabled()) {
            getLogger().info("Fallen Bot 加载完成"); // 当日志被用户启用时才会执行
        }
    }
}

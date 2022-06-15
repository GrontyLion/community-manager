package com.peaceforest.communitymanager.app;

import com.peaceforest.communitymanager.common.ThemeManager;
import com.peaceforest.communitymanager.view.Index;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.security.auth.login.Configuration;
import javax.swing.*;

@Component
public class Application {

    @Autowired
    private ThemeManager themeManager;

    @Autowired
    private Index index;

    // 懒汉模式 + 静态内部类持有单例对象
    private static final class SingletonHolder {
        private static final Application INSTANCE = new Application();
    }

    // 禁止外部实例化
    private Application() {
    }

    // 获取单例对象
    public static Application getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void run() {
        // 初始化程序
        init();
        // 启动程序
        launch();
    }

    private void launch() {
        // 启动程序
        SwingUtilities.invokeLater(() -> index.setVisible(true));
    }

    private void init() {
        themeManager.use();

    }


}

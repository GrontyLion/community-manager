package com.peaceforest.communitymanager.common;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import com.peaceforest.communitymanager.config.SwingConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@Component
@Slf4j
public class ThemeManager {
    private final SwingConfig swingConfig;

    @Autowired
    public ThemeManager(SwingConfig swingConfig) {
        this.swingConfig = swingConfig;
    }

    public void use() {
        use(swingConfig.getDefaultTheme());
    }

    public void use(String uiName) {
        String uiRef = swingConfig.getThemes().get(uiName);
        boolean success = false;
        FlatAnimatedLafChange.showSnapshot();
        try {
            LookAndFeel uiObject = loadUIObject(uiRef);
            Method setup = uiObject.getClass().getDeclaredMethod("setup");
            success = (boolean) setup.invoke(uiObject);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            log.error("主题对象加载失败", e);
            e.printStackTrace();
        }
        FlatLaf.updateUI();
        FlatAnimatedLafChange.hideSnapshotWithAnimation();
        if (success) {
            log.info("主题初始化成功");
        } else {
            log.error("主题初始化失败");
        }
    }

    /**
     * 获取所有合法的主题名称
     *
     * @return 主题名称列表
     */
    public List<String> getThemeNames() {
        ArrayList<String> list = new ArrayList<>();
        // 获取主题配置文件中的所有主题名称
        for (Object key : swingConfig.getThemes().keySet()) {
            list.add(key.toString());
        }
        return list;
    }

    /**
     * 加载主题对象
     *
     * @param ref 主题类名
     * @return 主题对象
     */
    private LookAndFeel loadUIObject(String ref) {
        Object uiObj;
        try {
            uiObj = Class.forName(ref).getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException |
                 ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        if (uiObj instanceof LookAndFeel) {
            return (LookAndFeel) uiObj;
        } else {
            throw new RuntimeException("非法的主题类: " + ref + " 不是LookAndFeel类型");
        }
    }
}

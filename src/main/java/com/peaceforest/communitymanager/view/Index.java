/*
 * Created by JFormDesigner on Wed Jun 15 20:23:55 CST 2022
 */

package com.peaceforest.communitymanager.view;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.swing.*;

/**
 * @author Brainrain
 */
@Component
public class Index extends JFrame {
    public Index() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents

        //======== this ========
        setTitle("\u9996\u9875");
        var contentPane = getContentPane();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
        setSize(400, 300);
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}

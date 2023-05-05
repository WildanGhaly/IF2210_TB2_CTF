/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.featureGUI.Util.customcombobox;

import java.awt.Color;
import java.awt.Component;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.geom.Rectangle2D;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.BasicComboPopup;
import javax.swing.plaf.basic.ComboPopup;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class Combobox<E> extends JComboBox<E> {

    private @Getter @Setter String labelText = " ";
    private boolean mouseOver;

    public Combobox() {
        setBackground(new Color(40, 41, 61));
        setBorder(new EmptyBorder(7, 3, 7, 0));
        setUI(new ComboUI(this));
        setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object o, int i, boolean isSelected, boolean cellHasFocus) {
                Component popupList = super.getListCellRendererComponent(list, o, i, isSelected, cellHasFocus);
                if (isSelected) {
                    popupList.setBackground(new Color(217, 217, 217));
                    popupList.setForeground(new Color(40, 41, 61));
                } else {
                    popupList.setForeground(new Color(217, 217, 217));
                }
                return popupList;
            }
        });
    }

    public class ComboUI extends BasicComboBoxUI {

        private float location;
        private Combobox<E> combo;
        private String labelContainer;

        public ComboUI(Combobox<E> combo) {
            this.combo = combo;
            addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent fe) {
                    labelContainer = getLabelText();
                    setLabelText("");
                }

                @Override
                public void focusLost(FocusEvent fe) {
                    if (getSelectedIndex() == -1){
                        setLabelText(labelContainer);
                    }
                }
            });
        }

        @Override
        public void paintCurrentValueBackground(Graphics g, Rectangle rec, boolean isSelected) {

        }

        @Override
        protected ComboPopup createPopup() {
            BasicComboPopup pop = new BasicComboPopup(comboBox) {
                @Override
                protected JScrollPane createScroller() {
                    list.setFixedCellHeight(30);
                    JScrollPane scroll = new JScrollPane(list);
                    scroll.setBackground(new Color(62, 231, 188));
                    ScrollBarCustom sb = new ScrollBarCustom();
                    sb.setUnitIncrement(30);
                    sb.setForeground(new Color(217, 217, 217));
                    scroll.setVerticalScrollBar(sb);
                    return scroll;
                }
            };
            pop.setBorder(new LineBorder(new Color(200, 200, 200), 1));
            return pop;
        }

        @Override
        public void paint(Graphics g, JComponent c) {
            super.paint(g, c);
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
            createHintText(g2);
            g2.dispose();
        }

        private void createHintText(Graphics2D g2) {
            Insets in = getInsets();
            g2.setColor(new Color(217,217,217));
            FontMetrics ft = g2.getFontMetrics();
            Rectangle2D r2 = ft.getStringBounds(combo.getLabelText(), g2);
            double height = getHeight() - in.top - in.bottom;
            double textY = (height - r2.getHeight()) / 2;
            double size = 18 * location;;
            g2.drawString(combo.getLabelText(), in.right, (int) (in.top + textY + ft.getAscent() - size));
        }


    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.featureGUI.Util.customtabbedpane;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.BufferedImage;

public class ShadowRenderer {

    private int size = 5;
    private float opacity = 0.5f;
    private Color color = Color.BLACK;

    public ShadowRenderer() {
        this(5, 0.5f, Color.BLACK);
    }

    public ShadowRenderer(final int size, final float opacity, final Color color) {
        this.size = size;
        this.opacity = opacity;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public float getOpacity() {
        return opacity;
    }

    public int getSize() {
        return size;
    }

    public BufferedImage createShadow(Shape shape) {
        Rectangle rec = shape.getBounds();
        BufferedImage img = new BufferedImage(rec.width, rec.height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        g2.setColor(Color.BLACK);
        g2.translate(-rec.x, -rec.y);
        g2.fill(shape);
        g2.dispose();
        return img;
    }

    

}

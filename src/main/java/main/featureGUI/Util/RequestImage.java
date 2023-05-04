/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.featureGUI.Util;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class RequestImage {

    public static Image requestImage(String images) {
        Image image = null;

        try {
            image = ImageIO.read(new File("src/main/java/img/" + images));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return image;
    }



}

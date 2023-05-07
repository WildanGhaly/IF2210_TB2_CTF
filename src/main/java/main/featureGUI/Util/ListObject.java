/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.featureGUI.Util;

import java.awt.Component;

import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

import sistemusahabarang.Barang;

/**
 *
 * @author user
 */
public class ListObject<E extends Object> extends JList<E>  {

    private final DefaultListModel<E> model;

    public ListObject(){
        model = new DefaultListModel<>();
        setModel(model);
    }

    @Override
    public ListCellRenderer<? super E> getCellRenderer(){
        return new DefaultListCellRenderer(){
            @Override
            public Component getListCellRendererComponent(JList<?> jList, Object o, int i, boolean isSelected, boolean cellHasFocus){
                Barang data;
                if (o instanceof Barang){
                    data = (Barang) o;
                } else {
                    data = new Barang();
                }
                BarangUI item = new BarangUI(data);
                return item;

            }
        };
    }
    
    public void addItem(E data){
        model.addElement(data);
    }
}

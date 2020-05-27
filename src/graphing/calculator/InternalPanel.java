/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphing.calculator;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import javax.swing.JPanel;

/**
 *
 * @author ahmed_kamal
 */
public class InternalPanel extends JPanel{

    
    public InternalPanel() {
        super();
       
    }
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        g.drawLine(200, 0, 200, 400);
        g.drawLine(0, 200, 400, 200);
    }

    
}

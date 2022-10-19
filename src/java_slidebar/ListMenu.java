
package java_slidebar;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;


public class ListMenu extends javax.swing.JPanel {

   private final MigLayout layout;
     JPanel panel = new JPanel();
 
           
    public ListMenu(Font font, String text) {
        initComponents();
        layout = new MigLayout("fillx", "0[fill]0", "0[]0");
        panel.setLayout(new MigLayout("fillx, filly"));
        setLayout(layout);
        JLabel lb = new JLabel(text);
        lb.setFont(font);
        lb.setForeground(new Color(60,60,60));
        panel.setBackground(Color.white);
        panel.add(lb);
        this.add(panel, "h 40%, w 100%");
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

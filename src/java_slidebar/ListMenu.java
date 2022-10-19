
package java_slidebar;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;


public class ListMenu extends javax.swing.JPanel {

   private final MigLayout layout;
   private final JPanel panel;
   private JLabel label;
           
    public ListMenu(Font font, String text) {
        initComponents();
        layout = new MigLayout("fliix", "0[fill]0", "0[]0");
        setLayout(layout);
        panel = new JPanel();
        panel.setLayout(new MigLayout("fillx, filly"));
        label = new JLabel("enter ur details");
        label.setFont(new Font("sansseri", 1,12));
        label.setForeground(new Color(60,60,60));
        panel.setBackground(new Color(255,255,255));
        panel.add(label);
        this.add(panel, "w 100%, 40%"); 
        
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

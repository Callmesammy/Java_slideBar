
package java_slidebar;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author user
 */
public class ListSlider extends javax.swing.JPanel {

    private MigLayout mig;
    private JPanel panel = new JPanel();
    public ListSlider(Font font, String strng) {
        initComponents();
        mig = new MigLayout("fillx","0[fill]0","[]");
        setLayout(mig);
        panel.setLayout(new MigLayout("fillx, filly"));
        JLabel label = new JLabel(strng);
        label.setFont(font);
        label.setForeground(new Color(44,44,44));
        panel.setBackground(new Color(210,210,210));
        panel.add(label);
        this.add(panel, " w 100%, h 40%");
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

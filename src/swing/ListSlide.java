
package swing;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;


public class ListSlide extends javax.swing.JPanel {

   // adding of Miglayout in other to set the dimensions 
    
    private MigLayout layout;
    private JPanel panel = new JPanel();
    
    public ListSlide(Font font, String str) {
        initComponents();
        layout = new MigLayout("fillx", "0[fill]0", "0[]0");
        setLayout(layout);
        panel.setLayout(new MigLayout("fillx, filly"));
        JLabel label = new JLabel(str);
        label.setFont(font);
        label.setForeground(new Color(210,110,115));
        panel.add(label);
        panel.setBackground(new Color(255,255,255));
        this.add(panel, "w 100%, h 40");
    }

    public void addColor (Color colex){
        panel.setBackground(colex);
    }
   
    public void moveX(int x){
        layout.setComponentConstraints(panel, "x " +x+ ", w 100%, h 40");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

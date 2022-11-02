
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
        this.add(panel, "h 40, w 100%");
    }

    public void addColor (Color colex){
        panel.setBackground(colex);
    }
   
    public void moveX(int x){
        layout.setComponentConstraints(panel, "x " +x+ ", h 40, w 100%");
        if (x < 0) {
            setBackground(new Color(246, 23, 23));
        }else{
              setBackground(new Color(65, 6, 75));
        }
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

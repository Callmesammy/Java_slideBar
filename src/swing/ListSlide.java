
package swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;


public class ListSlide extends javax.swing.JPanel {

    /**
     * @return the deleted
     */
   
   // adding of Miglayout in other to set the dimensions 
    
    private MigLayout layout;
    private JPanel panel = new JPanel();
    private boolean deleted;
    
    private Image image;
    private Image imagee;
    private Image image1;
    private Image image2;
    
    public ListSlide(Font font, String str) {
        image = new ImageIcon(getClass().getResource("/image/pic/icont.png")).getImage();
        image1 = new ImageIcon(getClass().getResource("/image/pic/tanku.png")).getImage();
        image2 = new ImageIcon(getClass().getResource("/image/pic/tanky.png")).getImage();
        imagee = new ImageIcon(getClass().getResource("/image/pic/name.png")).getImage();
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
    
     public boolean isDeleted() {
        return deleted;
    }

    /**
     * @param deleted the deleted to set
     */
    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
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

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        Graphics2D g2 = (Graphics2D)g;
        // for smoot image for the graphics to be added
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        if (isDeleted()) {
        g2.drawImage(image, getWidth() -33,7,25,25, this);
        g2.setColor(Color.white);
        g2.setFont(new Font("sansserif", 1,9));
        g2.drawString("Boxer", getWidth() -36, 36);
        }else{
        g2.drawImage(imagee, getWidth() -33,7,25,25, this);
        g2.setColor(Color.gray);
        g2.setFont(new Font("sansserif", 1,9));
        g2.drawString("Boxer", getWidth() -36, 36);
        }
        g2.setColor(new Color(0, 146, 205));
        g2.fillRect(0, 0, 40, getHeight());
        g2.drawImage(image1, 7,7,25,20, null);
        g2.setColor(Color.white);
        g2.drawString("Details", 50, getHeight()-15,22,10,15);
       
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

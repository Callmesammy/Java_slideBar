
package swing;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.ListModel;

/**
 *
 * @author user
 */
public class ListItems<E extends Object> extends JList<E>{


    private int selectedIndex = -1; 
    private int x;
    private int mx;
    private Color clx;
    private final int sanTex = -50;
    private final DefaultListModel model;
    private final int intext = 80;
    
 
    
    public ListItems() {
        model = new DefaultListModel();
        super.setModel(model);
    clx = new Color(130,225,131);
        addMouseListener(new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent e) {
           x =e.getX();
           int index = locationToIndex(e.getPoint());
            if (index != selectedIndex) {
                selectedIndex = index;
            }
            repaint();
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            if (mx<=sanTex) {
                model.removeElementAt(selectedIndex);
                
            }
           selectedIndex = -1;
           mx = 0;
           repaint();
        }
        
        });
        addMouseMotionListener(new MouseMotionAdapter() {
        @Override
        public void mouseDragged(MouseEvent e) {
            if (selectedIndex != -1) {
                mx = e.getX()-x;
                repaint();
                
            }
        }
        
        });
    }

    @Override
    public ListCellRenderer<? super E> getCellRenderer() {
        return new DefaultListCellRenderer(){
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                ListSlide slide = new ListSlide(ListItems.this.getFont(),isSelected+ "");
                if (selectedIndex == index) {
                    if (mx<=sanTex) {
                        mx = sanTex;
                        
                    }
                    if (mx>= intext) {
                        mx = intext;
                    }
                    slide.addColor(getClx());
                    slide.moveX(mx);
                    slide.setDeleted(mx<=sanTex);
                }
                return slide;
            }
        
        };
    }
    
        /**
     * @return the clx
     */
    public Color getClx() {
        return clx;
    }

    /**
     * @param clx the clx to set
     */
    public void setClx(Color clx) {
        this.clx = clx;
    }

    @Override
    public void setModel(ListModel<E> lmk) {
       for(int i =0; i<lmk.getSize(); i++){
          model.addElement(lmk.getElementAt(i));
       }
    }
    
    
   private final Image img = new ImageIcon(getClass().getResource("/image/pic/icon.png")).getImage();
   
    @Override
    public void paint(Graphics g) {
        super.paint(g); 
        if (model.isEmpty()) {
            Graphics2D g2 = (Graphics2D)g;
            g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g2.drawImage(img, getWidth()/2 -35, getHeight()/2 -35,50,40, null);
            g2.setColor(Color.blue);
            g2.drawString("User Mode", getWidth()/2-35, getHeight()/2+15);
            
            
        }
    }

    
}

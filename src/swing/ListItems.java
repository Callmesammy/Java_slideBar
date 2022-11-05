
package swing;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author user
 */
public class ListItems<E extends Object> extends JList<E>{


    private int selectedIndex = -1; 
    private int x;
    private int mx;
    private Color clx;
    private final int sanTex =-50;
    
    public ListItems() {
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
    public ListCellRenderer getCellRenderer() {
        return new DefaultListCellRenderer(){
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                ListSlide slide = new ListSlide(ListItems.this.getFont(),isSelected+ "");
                if (selectedIndex == index) {
                    if (mx<=sanTex) {
                         mx = sanTex;
                        
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

}

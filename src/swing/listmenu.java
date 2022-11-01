
package swing;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author user
 */
public class listmenu <E extends Object> extends JList<E>{

    /**
     * @return the colex
     */
    public Color getColex() {
        return colex;
    }

    /**
     * @param colex the colex to set
     */
    public void setColex(Color colex) {
        this.colex = colex;
    }
    
    private int x;
    private int mx; 
    private  int selectedIndex = -1;
    
    private Color colex;
    

    public listmenu() {
        colex = new Color(110,210,130);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
             x = e.getX();
             int index = locationToIndex(e.getPoint());
                if (index != selectedIndex) {
                    selectedIndex = index;
                    
                }
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
               selectedIndex = -1;
                mx =0;
               repaint();
            }
        
        });
    }

    @Override
    public ListCellRenderer getCellRenderer() {
        return new DefaultListCellRenderer(){
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                Header head = new Header(listmenu.this.getFont(), value+ "");
                if (selectedIndex == index) {
                    head.getColor(colex);
                }
                return head;
            }
            
        };
    }
    
    
    
}

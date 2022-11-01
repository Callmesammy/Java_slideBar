
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
    private int x;
    private int me; 
    private final Color colors;
    private final int selectedIndex = -1;

    public listmenu() {
        colors = new Color(130,250,110);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
               
            }

            @Override
            public void mouseReleased(MouseEvent e) {
           
            }
        
        });
        
    }

    @Override
    public ListCellRenderer getCellRenderer() {
        return new DefaultListCellRenderer(){
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                Header head = new Header(listmenu.this.getFont(), value+ "");
                
                return head;
            }
            
        };
    }
    
    
    
}

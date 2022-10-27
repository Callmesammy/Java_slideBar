
package java_slidebar;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author user
 */
public class ListMenu <E extends Object> extends JList<E>{

    public ListMenu() {
    }

    @Override
    public ListCellRenderer getCellRenderer() {
        return new DefaultListCellRenderer(){
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
             ListSlider slider = new ListSlider(ListMenu.this.getFont(), index+ "");
             
              
              return slider;
            }
            
        };
    }

   
    
}

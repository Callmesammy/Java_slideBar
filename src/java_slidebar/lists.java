
package java_slidebar;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
  
public class lists <E extends Object> extends JList<E>{

    public lists() {
    }

    @Override
    public ListCellRenderer  getCellRenderer() {
        return new DefaultListCellRenderer(){
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object o, int index, boolean isSelected, boolean cellHasFocus) {
                ListMenu menu = new ListMenu(lists.this.getFont(), o+ "");
                
                return menu;
            }
        }; 
    }
    
    
}


package java_slidebar;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class MyLIST <E extends Object> extends JList<E>{

    public MyLIST() {
    }

    @Override
    public ListCellRenderer  getCellRenderer() {
        return new DefaultListCellRenderer(){
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
              ListMenu men = new ListMenu(MyLIST.this.getFont(), value+ "");
              
              return men;
            }
        }; 
    }
    
    
}

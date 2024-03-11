import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class BtnPanel extends JPanel{

    private JButton addtask;
    private JButton clear;

    Border emptyborder = BorderFactory.createEmptyBorder();

    public BtnPanel (){
        this.setPreferredSize(new Dimension(400, 80));
        this.setBackground(Color.YELLOW);


        addtask = new JButton("Add Task");
        addtask.setBorder(emptyborder);
        addtask.setFont(new Font("Sans-serif", Font.PLAIN, 20));
        this.add(addtask);

        this.add(Box.createHorizontalStrut(20));

        clear = new JButton("Clear All Task");
        clear.setBorder(emptyborder);
        clear.setFont(new Font("Sans-serif", Font.PLAIN, 20));
        this.add(clear);
        
    }
    public JButton getaddtaskbtn(){
        return addtask;
    }
    public JButton getclearbtn(){
        return clear;
    }
     
}

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;


public class Task extends JPanel {
    private JLabel index;
    private JTextField taskname;
    private JButton done;
    private JButton remove;

    public Task(){

        GridLayout Layouttask = new GridLayout (1,4);
        Layouttask.setHgap(5);
        this.setPreferredSize(new Dimension (400, 200));
        this.setBackground(new Color(255, 234, 17));
        this.setLayout(Layouttask);



        index = new JLabel("");
        index.setPreferredSize(new Dimension(10,20));
        index.setHorizontalAlignment(JLabel.LEFT);
        index.setBackground(new Color(255,234,17));
        this.add(this.index);

        taskname = new JTextField("enter task");
        taskname.setPreferredSize(new Dimension(10,20));
        taskname.setBorder(BorderFactory.createEmptyBorder());
        taskname.setBackground(new Color(255,234,17));
        this.add(taskname);

        done = new JButton("Done");

        done.setPreferredSize(new Dimension (10,20));
        this.add(this.done);

        remove = new JButton("remove");

        remove.setPreferredSize(new Dimension(10,20));
        this.add(this.remove);

    }
    public void writeindexjl(int n){
        this.index.setText(String.valueOf(n));
        this.revalidate();
    }

    public  JButton getdonej (){
        return this.done;
    }
    public  JButton getremovej (){
        return this.remove;
    }
    public void donestatus(){
        this.taskname.setBackground(Color.green);
        this.index.setBackground(Color.green);
        this.remove.setBackground(Color.green);
        this.done.setBackground(Color.green);
        this.setBackground(Color.green);
        revalidate();
    }
    
}

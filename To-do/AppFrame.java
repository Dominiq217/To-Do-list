import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AppFrame extends JFrame {

    private JButton addtask;
    private JButton clear;

    List list = new List();

    TittleBar tittle = new TittleBar();

    BtnPanel btnpanel = new BtnPanel();

    public AppFrame() {

        this.setSize(400, 700);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(this.tittle, BorderLayout.NORTH);
        this.add(this.btnpanel, BorderLayout.SOUTH);
        this.add(this.list, BorderLayout.CENTER);

        addtask = btnpanel.getaddtaskbtn();
        clear = btnpanel.getclearbtn();

        addlistener();
    }

    public void addlistener(){

        addtask.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed (MouseEvent e){
                Task task = new Task();
                list.add(task);
                list.indexnum();
                revalidate();

                JButton done= task.getdonej();
                done.addMouseListener(new MouseAdapter(){
                    public void mousePressed(MouseEvent e) {
                        task.donestatus();
                        revalidate();
                    }
                });


        JButton remove= task.getdonej();
        remove.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e) {
                list.remove(task);
                list.indexnum();
                revalidate();
                repaint();

            }

        });

        

            }});
    }
}

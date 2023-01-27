import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
   int count=0;
   JLabel label;
    public GUI(){
        JFrame frame = new JFrame();
        label= new JLabel("Number of clicks ! : 0  ");
        JTextField textField= new JTextField();
        JButton button= new JButton("Click Me!");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count ++;
               label.setText("Number of clicks: "+count);
            }
        });
        frame.setBounds(100,100,1200,1000);
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(10,10,100,100));
        panel.setLayout(new GridLayout(6,3));

        frame.add(panel,BorderLayout.CENTER);
        panel.add(label);
        panel.add(textField);
        panel.add(button);

      //  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("GUI");
        frame.pack();
        frame.setVisible(true);

    }
    public static void main(String[] args) {
           GUI gui=  new GUI();
           gui.notify();
    }
}
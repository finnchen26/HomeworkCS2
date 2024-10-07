import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridLayoutExample implements ActionListener {
    //declaration section
    private JFrame mainFrame; // mainFrame is an object, JFrame is a class
    private JPanel panel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;

    public static void main(String[] args) {
        GridLayoutExample myCode = new GridLayoutExample();
    }

    public GridLayoutExample(){
        mainFrame = new JFrame("Title");
        mainFrame.setSize(400, 300);

        panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));
        mainFrame.add(panel);

        button1 = new JButton("button 1");
        panel.add(button1);
        button1.addActionListener(this);

        button2 = new JButton("button 2");
        panel.add(button2);
        button2.addActionListener(this);

        button3 = new JButton("button 3");
        panel.add(button3);
        button2.addActionListener(this);

        button4 = new JButton("button 4");
        panel.add(button4);
        button2.addActionListener(this);

        button5 = new JButton("button 5");
        panel.add(button5);
        button2.addActionListener(this);

        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // stops running the code when frame is closed
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}

// steps to make a frame show up: 1) declare 2) construct 3) use


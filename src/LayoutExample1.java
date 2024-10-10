import javax.swing.*;
import java.awt.*;

public class LayoutExample1 {
    private JFrame mainFrame;
    private JPanel borderPanel, gridPanel;
    private JButton button1, button2, button3, button4, button5;


    public static void main(String[] args) {
        LayoutExample1 myCode = new LayoutExample1();
    }

    public LayoutExample1(){
        mainFrame = new JFrame("Layout Example 1");
        mainFrame.setSize(400, 300);

        borderPanel = new JPanel();
        borderPanel.setLayout(new BorderLayout());
        mainFrame.add(borderPanel);

        button1 = new JButton("button 1");
        button2 = new JButton("button 2");
        button3 = new JButton("button 3");
        button4 = new JButton("button 4");
        button5 = new JButton("button 5");


        borderPanel.add(button1, BorderLayout.NORTH);
        borderPanel.add(button3, BorderLayout.SOUTH);
        borderPanel.add(button4, BorderLayout.WEST);
        borderPanel.add(button2, BorderLayout.EAST);
        borderPanel.add(button5, BorderLayout.CENTER);


        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }



}


import javax.swing.*;
import java.awt.*;


public class LayoutExample2 {
    //declaration section
    private JFrame mainFrame; // mainFrame is an object, JFrame is a class
    private JPanel panel, borderPanel;
    private JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button10;
    private JLabel label;

    public static void main(String[] args) {
        LayoutExample2 myCode = new LayoutExample2();
    }

    public LayoutExample2(){
        mainFrame = new JFrame("Title");
        mainFrame.setSize(400, 400);

        panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));
        mainFrame.add(panel);


        button1 = new JButton("button 1");
        button2 = new JButton("button 2");
        button3 = new JButton("button 3");
        button4 = new JButton("button 4");
        button5 = new JButton("button 5");
        button6 = new JButton("button 6");
        button7 = new JButton("button 7");
        button8 = new JButton("button 8");
        button9 = new JButton("button 9");
        button10 = new JButton("button 10");
        label = new JLabel("label");

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);

        borderPanel = new JPanel();
        borderPanel.setLayout(new BorderLayout());
        panel.add(borderPanel, BorderLayout.CENTER);

        borderPanel.add(label, BorderLayout.CENTER);
        borderPanel.add(button9, BorderLayout.EAST);
        borderPanel.add(button10, BorderLayout.SOUTH);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);




        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // stops running the code when frame is closed
    }

}




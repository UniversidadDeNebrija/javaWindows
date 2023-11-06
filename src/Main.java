import javax.swing.*;

public class Main {
    public static void main(String[] args)
    {
        int xSize = 20;
        int ySize = 100;


        JFrame myFrame = new JFrame();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setBounds(xSize, ySize,xSize * 8,ySize * 4);

        JPanel myPanel = new JPanel();
        myFrame.setContentPane(myPanel);
        myPanel.setLayout(null);

        JLabel myLabel = new JLabel();
        myLabel.setText("My JLabel");
        myLabel.setBounds(xSize, 0, xSize , ySize / 4);

        JTextField myTextField = new JTextField();
        myTextField.setText("My Text Field");
        myTextField.setBounds(xSize, ySize, xSize , ySize * 2);

        JButton myButton = new JButton();
        myButton.setBounds(xSize ,ySize * 2,xSize ,ySize * 2);

        myFrame.add(myButton);
        myFrame.add(myTextField);
        myFrame.add(myLabel);
        myFrame.setVisible(true);

    }

}

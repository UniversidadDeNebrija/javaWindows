import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int xSize = 32;
        int ySize = 20;

        JFrame myFrame = new JFrame();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setBounds(xSize, ySize, xSize * 8, ySize * 20);

        JPanel myPanel = new JPanel();
        myFrame.setContentPane(myPanel);
        myPanel.setLayout(null);

        JLabel myLabel = new JLabel();
        myLabel.setText("My JLabel");
        myLabel.setBounds(xSize, 0, xSize * 4, ySize);

        JTextField myTextField = new JTextField();
        myTextField.setText("My Text Field");
        myTextField.setBounds(xSize, ySize, xSize * 4, ySize * 2);

        JButton myButton = new JButton();
        myButton.setBounds(xSize, ySize * 3, xSize * 4, ySize * 2);

        myFrame.add(myButton);
        myFrame.add(myTextField);
        myFrame.add(myLabel);
        myFrame.setVisible(true);

    }

}

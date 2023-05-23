import javax.swing.*;

public class SimpleFormExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        frame.add(panel);

        panel.setLayout(null);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(10, 20, 80, 25);
        panel.add(nameLabel);

        JTextField nameText = new JTextField(20);
        nameText.setBounds(100, 20, 165, 25);
        panel.add(nameText);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(10, 50, 80, 25);
        panel.add(emailLabel);

        JTextField emailText = new JTextField(20);
        emailText.setBounds(100, 50, 165, 25);
        panel.add(emailText);

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(100, 80, 80, 25);
        panel.add(submitButton);

        frame.setVisible(true);
    }
}

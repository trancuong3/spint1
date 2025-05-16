package phepchia;
import javax.swing.*;
import java.awt.event.*;

public class DivideChecker extends JFrame {
    private JTextField txtA, txtB;
    private JButton btnCheck;
    private JLabel lblResult;

    public DivideChecker() {
        setTitle("Kiểm tra chia hết");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel lblA = new JLabel("Nhập a:");
        lblA.setBounds(30, 20, 60, 25);
        add(lblA);

        txtA = new JTextField();
        txtA.setBounds(100, 20, 150, 25);
        add(txtA);

        JLabel lblB = new JLabel("Nhập b:");
        lblB.setBounds(30, 60, 60, 25);
        add(lblB);

        txtB = new JTextField();
        txtB.setBounds(100, 60, 150, 25);
        add(txtB);

        btnCheck = new JButton("Kiểm tra");
        btnCheck.setBounds(90, 100, 100, 30);
        add(btnCheck);

        lblResult = new JLabel("");
        lblResult.setBounds(30, 140, 250, 25);
        add(lblResult);

        btnCheck.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(txtA.getText());
                    int b = Integer.parseInt(txtB.getText());

                    if (b == 0) {
                        lblResult.setText("Không thể chia cho 0");
                    } else if (a % b == 0) {
                        lblResult.setText(a + " chia hết cho " + b);
                    } else {
                        lblResult.setText(a + " không chia hết cho " + b);
                    }
                } catch (NumberFormatException ex) {
                    lblResult.setText("Vui lòng nhập số nguyên hợp lệ!");
                }
            }
        });
    }

    public static void main(String[] args) {
        new DivideChecker().setVisible(true);
    }
}

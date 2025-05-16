package Calculator;

import javax.swing.*;
import java.awt.event.*;

public class CongHaiSo extends JFrame {
    private JTextField txtSo1, txtSo2, txtKetQua;
    private JButton btnCong;

    public CongHaiSo() {
        setTitle("Cộng Hai Số");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // canh giữa màn hình

        JLabel lblSo1 = new JLabel("Số 1:");
        JLabel lblSo2 = new JLabel("Số 2:");
        JLabel lblKetQua = new JLabel("Kết quả:");

        txtSo1 = new JTextField(10);
        txtSo2 = new JTextField(10);
        txtKetQua = new JTextField(10);
        txtKetQua.setEditable(false);

        btnCong = new JButton("Cộng");

        // Gắn sự kiện khi nhấn nút "Cộng"
        btnCong.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double so1 = Double.parseDouble(txtSo1.getText());
                    double so2 = Double.parseDouble(txtSo2.getText());
                    double tong = so1 + so2;
                    txtKetQua.setText(String.valueOf(tong));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Layout đơn giản
        JPanel panel = new JPanel();
        panel.add(lblSo1);
        panel.add(txtSo1);
        panel.add(lblSo2);
        panel.add(txtSo2);
        panel.add(btnCong);
        panel.add(lblKetQua);
        panel.add(txtKetQua);

        add(panel);
    }

    public static void main(String[] args) {
        new CongHaiSo().setVisible(true);
    }
}


package thuchanh;

import javax.swing.*;
import java.awt.event.*;

public class NhanHaiSo extends JFrame {
    private JTextField txtSo1, txtSo2, txtKetQua;
    private JButton btnNhan;

    public NhanHaiSo() {
        setTitle("Nhân 2 Số");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblSo1 = new JLabel("Số 1:");
        lblSo1.setBounds(20, 20, 80, 25);
        add(lblSo1);

        txtSo1 = new JTextField();
        txtSo1.setBounds(100, 20, 150, 25);
        add(txtSo1);

        JLabel lblSo2 = new JLabel("Số 2:");
        lblSo2.setBounds(20, 60, 80, 25);
        add(lblSo2);

        txtSo2 = new JTextField();
        txtSo2.setBounds(100, 60, 150, 25);
        add(txtSo2);

        btnNhan = new JButton("Nhân");
        btnNhan.setBounds(100, 100, 80, 25);
        add(btnNhan);

        txtKetQua = new JTextField();
        txtKetQua.setBounds(100, 140, 150, 25);
        txtKetQua.setEditable(false);
        add(txtKetQua);

        btnNhan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double so1 = Double.parseDouble(txtSo1.getText());
                    double so2 = Double.parseDouble(txtSo2.getText());
                    double ketQua = so1 * so2;
                    txtKetQua.setText(String.valueOf(ketQua));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập đúng số!");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new NhanHaiSo();
    }
}

package tinhtien;

import javax.swing.*;
import java.awt.event.*;

public class TinhDienTichHinhTron {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tính diện tích hình tròn");
        frame.setSize(320, 220);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel labelBanKinh = new JLabel("Bán kính (r):");
        labelBanKinh.setBounds(30, 30, 100, 25);
        frame.add(labelBanKinh);

        JTextField txtBanKinh = new JTextField();
        txtBanKinh.setBounds(120, 30, 150, 25);
        frame.add(txtBanKinh);

        JButton btnTinh = new JButton("Tính diện tích");
        btnTinh.setBounds(90, 70, 130, 30);
        frame.add(btnTinh);

        JLabel labelKetQua = new JLabel("Diện tích: ");
        labelKetQua.setBounds(30, 120, 250, 25);
        frame.add(labelKetQua);

        btnTinh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double banKinh = Double.parseDouble(txtBanKinh.getText());

                    if (banKinh < 0) {
                        JOptionPane.showMessageDialog(frame, "Bán kính phải >= 0!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    double dienTich = Math.PI * banKinh * banKinh;
                    labelKetQua.setText(String.format("Diện tích: %.2f", dienTich));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Vui lòng nhập số hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.setVisible(true);
    }
}

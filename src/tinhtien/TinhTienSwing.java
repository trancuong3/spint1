package hung;

import javax.swing.*;
import java.awt.event.*;

public class TinhThanhTien {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tính thành tiền");
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel labelSoLuong = new JLabel("Số lượng:");
        labelSoLuong.setBounds(30, 30, 80, 25);
        frame.add(labelSoLuong);

        JTextField txtSoLuong = new JTextField();
        txtSoLuong.setBounds(110, 30, 130, 25);
        frame.add(txtSoLuong);

        JLabel labelDonGia = new JLabel("Đơn giá:");
        labelDonGia.setBounds(30, 70, 80, 25);
        frame.add(labelDonGia);

        JTextField txtDonGia = new JTextField();
        txtDonGia.setBounds(110, 70, 130, 25);
        frame.add(txtDonGia);

        JButton btnTinh = new JButton("Tính tiền");
        btnTinh.setBounds(90, 110, 120, 30);
        frame.add(btnTinh);

        JLabel labelKetQua = new JLabel("Thành tiền: ");
        labelKetQua.setBounds(30, 160, 250, 25);
        frame.add(labelKetQua);

        btnTinh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int soLuong = Integer.parseInt(txtSoLuong.getText());
                    int donGia = Integer.parseInt(txtDonGia.getText());

                    if (soLuong < 0 || donGia < 0) {
                        JOptionPane.showMessageDialog(frame, "Số lượng và đơn giá phải >= 0!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    int thanhTien = soLuong * donGia;
                    labelKetQua.setText("Thành tiền: " + thanhTien + " VND");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Vui lòng nhập số hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.setVisible(true);
    }
}

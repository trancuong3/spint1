package tinhtien;

import javax.swing.*;
import java.awt.event.*;

public class TinhTienNuoc {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tính tiền nước");
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel labelSoDau = new JLabel("Số đầu:");
        labelSoDau.setBounds(30, 30, 80, 25);
        frame.add(labelSoDau);

        JTextField txtSoDau = new JTextField();
        txtSoDau.setBounds(100, 30, 150, 25);
        frame.add(txtSoDau);

        JLabel labelSoCuoi = new JLabel("Số cuối:");
        labelSoCuoi.setBounds(30, 70, 80, 25);
        frame.add(labelSoCuoi);

        JTextField txtSoCuoi = new JTextField();
        txtSoCuoi.setBounds(100, 70, 150, 25);
        frame.add(txtSoCuoi);

        JButton btnTinh = new JButton("Tính tiền");
        btnTinh.setBounds(90, 110, 120, 30);
        frame.add(btnTinh);

        JLabel labelKetQua = new JLabel("Thành tiền: ");
        labelKetQua.setBounds(30, 160, 250, 25);
        frame.add(labelKetQua);

        btnTinh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int soDau = Integer.parseInt(txtSoDau.getText());
                    int soCuoi = Integer.parseInt(txtSoCuoi.getText());

                    if (soCuoi < soDau) {
                        JOptionPane.showMessageDialog(frame, "Số cuối phải lớn hơn hoặc bằng số đầu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    int thanhTien = (soCuoi - soDau) * 10000;
                    labelKetQua.setText("Thành tiền: " + thanhTien + " VND");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Vui lòng nhập số hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.setVisible(true);
    }
}

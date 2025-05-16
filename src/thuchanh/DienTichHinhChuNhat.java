package thuchanh;

import javax.swing.*;
import java.awt.event.*;

public class DienTichHinhChuNhat extends JFrame {
    private JTextField txtChieuDai, txtChieuRong, txtDienTich;
    private JButton btnTinh;

    public DienTichHinhChuNhat() {
        setTitle("Tính Diện Tích HCN");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblChieuDai = new JLabel("Chiều dài:");
        lblChieuDai.setBounds(30, 30, 100, 25);
        add(lblChieuDai);

        txtChieuDai = new JTextField();
        txtChieuDai.setBounds(130, 30, 150, 25);
        add(txtChieuDai);

        JLabel lblChieuRong = new JLabel("Chiều rộng:");
        lblChieuRong.setBounds(30, 70, 100, 25);
        add(lblChieuRong);

        txtChieuRong = new JTextField();
        txtChieuRong.setBounds(130, 70, 150, 25);
        add(txtChieuRong);

        btnTinh = new JButton("Tính");
        btnTinh.setBounds(130, 110, 80, 30);
        add(btnTinh);

        JLabel lblDienTich = new JLabel("Diện tích:");
        lblDienTich.setBounds(30, 160, 100, 25);
        add(lblDienTich);

        txtDienTich = new JTextField();
        txtDienTich.setBounds(130, 160, 150, 25);
        txtDienTich.setEditable(false);
        add(txtDienTich);

        // Xử lý khi nhấn nút "Tính"
        btnTinh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double dai = Double.parseDouble(txtChieuDai.getText());
                    double rong = Double.parseDouble(txtChieuRong.getText());
                    double dientich = dai * rong;
                    txtDienTich.setText(String.valueOf(dientich));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số hợp lệ.");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new DienTichHinhChuNhat();
    }
}

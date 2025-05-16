package nhattien;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PhepChiaHaiSo extends JFrame {
    private JTextField txtSoThuNhat;
    private JTextField txtSoThuHai;
    private JButton btnChia;
    private JLabel lblKetQua;

    public PhepChiaHaiSo() {
        setTitle("Phép chia hai số");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // canh giữa cửa sổ

        // Tạo giao diện
        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));

        panel.add(new JLabel("Số thứ nhất:"));
        txtSoThuNhat = new JTextField();
        panel.add(txtSoThuNhat);

        panel.add(new JLabel("Số thứ hai:"));
        txtSoThuHai = new JTextField();
        panel.add(txtSoThuHai);

        btnChia = new JButton("Chia");
        panel.add(btnChia);

        lblKetQua = new JLabel("");
        panel.add(lblKetQua);

        add(panel);

        // Xử lý sự kiện khi nhấn nút Chia
        btnChia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double so1 = Double.parseDouble(txtSoThuNhat.getText());
                    double so2 = Double.parseDouble(txtSoThuHai.getText());

                    if (so2 == 0) {
                        lblKetQua.setText("Không thể chia cho 0");
                    } else {
                        double ketQua = so1 / so2;
                        lblKetQua.setText("Kết quả: " + ketQua);
                    }
                } catch (NumberFormatException ex) {
                    lblKetQua.setText("Vui lòng nhập số hợp lệ");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new PhepChiaHaiSo().setVisible(true);
        });
    }
}


package phepchia;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class PhepChia extends JFrame {
    private JTextField txtSo1, txtSo2, txtKetQua;
    private JButton btnChia;
    public PhepChia() {
        setTitle("Phép Chia Hai Số");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Căn giữa cửa sổ
        setLayout(new GridLayout(4, 2, 10, 10)); // 4 hàng, 2 cột, khoảng cách 10px

        // Tạo các thành phần
        JLabel lblSo1 = new JLabel("Số thứ nhất:");
        txtSo1 = new JTextField();

        JLabel lblSo2 = new JLabel("Số thứ hai:");
        txtSo2 = new JTextField();

        JLabel lblKetQua = new JLabel("Kết quả:");
        txtKetQua = new JTextField();
        txtKetQua.setEditable(false); // Không cho người dùng chỉnh sửa

        btnChia = new JButton("Chia");

        // Xử lý sự kiện nút chia
        btnChia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chiaHaiSo();
            }
        });

        // Thêm thành phần vào cửa sổ
        add(lblSo1); add(txtSo1);
        add(lblSo2); add(txtSo2);
        add(lblKetQua); add(txtKetQua);
        add(new JLabel()); // ô trống
        add(btnChia);
    }

    private void chiaHaiSo() {
        try {
            double so1 = Double.parseDouble(txtSo1.getText());
            double so2 = Double.parseDouble(txtSo2.getText());

            if (so2 == 0) {
                JOptionPane.showMessageDialog(this, "Không thể chia cho 0!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            double ketQua = so1 / so2;
            txtKetQua.setText(String.valueOf(ketQua));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng định dạng số!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }
 
    public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> {
            new PhepChia().setVisible(true);
        });
    }
    
}
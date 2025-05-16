package nhattien;
package Calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PhepChiaHaiSo extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField number1Field;
    private JTextField number2Field;
    private JButton divideButton;
    private JLabel resultLabel;

    public PhepChiaHaiSo() {
        setTitle("Phép Chia Hai Số");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Canh giữa màn hình

        // Panel giao diện
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10));

        panel.add(new JLabel("Số bị chia:"));
        number1Field = new JTextField();
        panel.add(number1Field);

        panel.add(new JLabel("Số chia:"));
        number2Field = new JTextField();
        panel.add(number2Field);

        divideButton = new JButton("Chia");
        panel.add(divideButton);

        resultLabel = new JLabel("Kết quả: ");
        panel.add(resultLabel);

        // Sự kiện khi nhấn nút "Chia"
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(number1Field.getText());
                    double num2 = Double.parseDouble(number2Field.getText());

                    if (num2 == 0) {
                        JOptionPane.showMessageDialog(null, "Không thể chia cho 0!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    } else {
                        double result = num1 / num2;
                        resultLabel.setText("Kết quả: " + result);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        add(panel);
        setVisible(true);
    }
 public static void main(String[] args) {
        // Đảm bảo chạy trong luồng giao diện Swing
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PhepChiaHaiSo();
            }
        });
    }
}

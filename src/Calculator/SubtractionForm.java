package Calculator;

import javax.swing.*;

public class SubtractionForm extends javax.swing.JFrame {

    public SubtractionForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new JLabel("Số thứ nhất:");
        jLabel2 = new JLabel("Số thứ hai:");
        jLabel3 = new JLabel("Kết quả:");
        txtSo1 = new JTextField();
        txtSo2 = new JTextField();
        lblKetQua = new JLabel("...");
        btnTru = new JButton("Trừ");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trừ Hai Số");

        btnTru.addActionListener(evt -> btnTruActionPerformed(evt));

        // Sử dụng GroupLayout để sắp xếp giao diện
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel1)
                    .addComponent(txtSo1))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel2)
                    .addComponent(txtSo2))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(btnTru)
                    .addGap(30)
                    .addComponent(jLabel3)
                    .addComponent(lblKetQua))
        );

        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSo1))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSo2))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTru)
                    .addComponent(jLabel3)
                    .addComponent(lblKetQua))
        );

        pack();
        setLocationRelativeTo(null); // Đưa cửa sổ ra giữa màn hình
    }

    private void btnTruActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            double so1 = Double.parseDouble(txtSo1.getText());
            double so2 = Double.parseDouble(txtSo2.getText());
            double ketQua = so1 - so2;
            lblKetQua.setText(String.valueOf(ketQua));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng định dạng số!");
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new SubtractionForm().setVisible(true);
        });
    }

    // Khai báo biến
    private JButton btnTru;
    private JLabel jLabel1, jLabel2, jLabel3, lblKetQua;
    private JTextField txtSo1, txtSo2;
}

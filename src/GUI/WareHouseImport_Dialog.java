/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package GUI;

import MyDesign.ScrollBar;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author QUANG DIEN
 */
public class WareHouseImport_Dialog extends javax.swing.JDialog {

    /**
     * Creates new form WareHouseImport_Dialog
     */
    public WareHouseImport_Dialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        spTable.setVerticalScrollBar(new ScrollBar());
        spTable.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        spTable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder_Statistic_Blue1 = new MyDesign.PanelBorder_Statistic_Blue();
        panelBorder_Basic1 = new MyDesign.PanelBorder_Basic();
        panelBorder2 = new MyDesign.PanelBorder();
        pnImageBook = new MyDesign.PanelBorder_Basic();
        lbImageBook = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLuuThongTin = new MyDesign.MyButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtGia = new MyDesign.MyTextField_Basic();
        txtSoLuong = new MyDesign.MyTextField_Basic();
        cbTacGia = new javax.swing.JComboBox<>();
        lbThemTacGia = new javax.swing.JLabel();
        cbNXB = new javax.swing.JComboBox<>();
        lbThemNXB = new javax.swing.JLabel();
        cbTheLoai = new javax.swing.JComboBox<>();
        lbThemTheLoai = new javax.swing.JLabel();
        cbTenSach = new javax.swing.JComboBox<>();
        lbThemSach = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtISBN = new MyDesign.MyTextField_Basic();
        jLabel13 = new javax.swing.JLabel();
        txtLanXuatBan = new MyDesign.MyTextField_Basic();
        panelBorder1 = new MyDesign.PanelBorder();
        jLabel9 = new javax.swing.JLabel();
        spTable = new javax.swing.JScrollPane();
        tbSachDuocNhap = new MyDesign.MyTable();
        btnNhapQuaSheet = new MyDesign.MyButton();
        jLabel10 = new javax.swing.JLabel();
        cbNhaCungCap = new javax.swing.JComboBox<>();
        lbThemNhaCungCap = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtTongChi = new javax.swing.JLabel();
        btnXacNhan = new MyDesign.MyButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelBorder2.setPreferredSize(new java.awt.Dimension(217, 327));

        pnImageBook.setPreferredSize(new java.awt.Dimension(137, 192));

        lbImageBook.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbImageBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AddImage.png"))); // NOI18N

        javax.swing.GroupLayout pnImageBookLayout = new javax.swing.GroupLayout(pnImageBook);
        pnImageBook.setLayout(pnImageBookLayout);
        pnImageBookLayout.setHorizontalGroup(
            pnImageBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnImageBookLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbImageBook, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnImageBookLayout.setVerticalGroup(
            pnImageBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnImageBookLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbImageBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel2.setText("Số lượng");

        btnLuuThongTin.setForeground(new java.awt.Color(44, 137, 247));
        btnLuuThongTin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/action-save-white.png"))); // NOI18N
        btnLuuThongTin.setText("Lưu thông tin");
        btnLuuThongTin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLuuThongTin.setPreferredSize(new java.awt.Dimension(177, 36));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel4.setText("Giá");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel5.setText("Thể loại");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel6.setText("NXB");

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel7.setText("Tác giả");

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel8.setText("Tên sách");

        txtGia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 229, 229)));

        txtSoLuong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 229, 229)));

        cbTacGia.setBackground(new java.awt.Color(246, 250, 255));
        cbTacGia.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cbTacGia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tác giả" }));
        cbTacGia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 229, 229)));
        cbTacGia.setOpaque(true);
        cbTacGia.setPreferredSize(new java.awt.Dimension(77, 28));

        lbThemTacGia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbThemTacGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        lbThemTacGia.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));

        cbNXB.setBackground(new java.awt.Color(246, 250, 255));
        cbNXB.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cbNXB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NXB" }));
        cbNXB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 229, 229)));
        cbNXB.setOpaque(true);
        cbNXB.setPreferredSize(new java.awt.Dimension(77, 28));

        lbThemNXB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbThemNXB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        lbThemNXB.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));

        cbTheLoai.setBackground(new java.awt.Color(246, 250, 255));
        cbTheLoai.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cbTheLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thể loại" }));
        cbTheLoai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 229, 229)));
        cbTheLoai.setOpaque(true);
        cbTheLoai.setPreferredSize(new java.awt.Dimension(77, 28));

        lbThemTheLoai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbThemTheLoai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        lbThemTheLoai.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));

        cbTenSach.setBackground(new java.awt.Color(246, 250, 255));
        cbTenSach.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cbTenSach.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tên sách" }));
        cbTenSach.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 229, 229)));
        cbTenSach.setOpaque(true);
        cbTenSach.setPreferredSize(new java.awt.Dimension(77, 28));

        lbThemSach.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbThemSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        lbThemSach.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel12.setText("ISBN");

        txtISBN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 229, 229)));

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel13.setText("Lần X.Bản");

        txtLanXuatBan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 229, 229)));

        javax.swing.GroupLayout panelBorder2Layout = new javax.swing.GroupLayout(panelBorder2);
        panelBorder2.setLayout(panelBorder2Layout);
        panelBorder2Layout.setHorizontalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder2Layout.createSequentialGroup()
                        .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLanXuatBan, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelBorder2Layout.createSequentialGroup()
                                    .addComponent(cbTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbThemTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder2Layout.createSequentialGroup()
                                    .addComponent(cbNXB, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbThemNXB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelBorder2Layout.createSequentialGroup()
                                    .addComponent(cbTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbThemTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelBorder2Layout.createSequentialGroup()
                                    .addComponent(cbTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbThemSach, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(54, Short.MAX_VALUE))
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelBorder2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(16, 16, 16)
                                .addComponent(txtSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelBorder2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(54, 54, 54)
                                .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(pnImageBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnLuuThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelBorder2Layout.setVerticalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(pnImageBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtLanXuatBan, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cbTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(cbTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder2Layout.createSequentialGroup()
                                .addComponent(lbThemTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)))
                        .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbThemNXB, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbNXB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)))
                        .addGap(6, 6, 6)
                        .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbThemTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbThemSach, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLuuThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(127, 127, 127));
        jLabel9.setText("Sách được nhập");

        spTable.setBorder(null);

        tbSachDuocNhap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Tên sách", "Giá", "Số lượng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spTable.setViewportView(tbSachDuocNhap);

        btnNhapQuaSheet.setForeground(new java.awt.Color(22, 113, 221));
        btnNhapQuaSheet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/action-import.png"))); // NOI18N
        btnNhapQuaSheet.setText("Nhập qua sheet");
        btnNhapQuaSheet.setToolTipText("");
        btnNhapQuaSheet.setColorClick(new java.awt.Color(153, 204, 255));
        btnNhapQuaSheet.setColorOver(new java.awt.Color(102, 204, 255));
        btnNhapQuaSheet.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(spTable, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNhapQuaSheet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(btnNhapQuaSheet, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Nhà cung cấp");

        cbNhaCungCap.setBackground(new java.awt.Color(246, 250, 255));
        cbNhaCungCap.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cbNhaCungCap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhà cung cấp" }));
        cbNhaCungCap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 229, 229)));
        cbNhaCungCap.setOpaque(true);
        cbNhaCungCap.setPreferredSize(new java.awt.Dimension(77, 28));

        lbThemNhaCungCap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbThemNhaCungCap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        lbThemNhaCungCap.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));

        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Tổng chi");

        txtTongChi.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        txtTongChi.setText("40.000đ");

        btnXacNhan.setBackground(new java.awt.Color(22, 113, 221));
        btnXacNhan.setForeground(new java.awt.Color(255, 255, 255));
        btnXacNhan.setText("Xác nhận");
        btnXacNhan.setBorderColor(new java.awt.Color(22, 113, 221));
        btnXacNhan.setColor(new java.awt.Color(22, 113, 221));
        btnXacNhan.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        javax.swing.GroupLayout panelBorder_Basic1Layout = new javax.swing.GroupLayout(panelBorder_Basic1);
        panelBorder_Basic1.setLayout(panelBorder_Basic1Layout);
        panelBorder_Basic1Layout.setHorizontalGroup(
            panelBorder_Basic1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder_Basic1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBorder_Basic1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder_Basic1Layout.createSequentialGroup()
                        .addGroup(panelBorder_Basic1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(panelBorder_Basic1Layout.createSequentialGroup()
                                .addComponent(cbNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbThemNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 323, Short.MAX_VALUE))
                    .addGroup(panelBorder_Basic1Layout.createSequentialGroup()
                        .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelBorder_Basic1Layout.createSequentialGroup()
                        .addGroup(panelBorder_Basic1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(txtTongChi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150)))
                .addContainerGap())
        );
        panelBorder_Basic1Layout.setVerticalGroup(
            panelBorder_Basic1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder_Basic1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelBorder_Basic1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBorder_Basic1Layout.createSequentialGroup()
                        .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorder_Basic1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelBorder_Basic1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelBorder_Basic1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbThemNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTongChi, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/warehouse-white.png"))); // NOI18N
        jLabel3.setText("Đơn nhập");

        javax.swing.GroupLayout panelBorder_Statistic_Blue1Layout = new javax.swing.GroupLayout(panelBorder_Statistic_Blue1);
        panelBorder_Statistic_Blue1.setLayout(panelBorder_Statistic_Blue1Layout);
        panelBorder_Statistic_Blue1Layout.setHorizontalGroup(
            panelBorder_Statistic_Blue1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder_Statistic_Blue1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder_Statistic_Blue1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBorder_Basic1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelBorder_Statistic_Blue1Layout.setVerticalGroup(
            panelBorder_Statistic_Blue1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder_Statistic_Blue1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBorder_Basic1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder_Statistic_Blue1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder_Statistic_Blue1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WareHouseImport_Dialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WareHouseImport_Dialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WareHouseImport_Dialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WareHouseImport_Dialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                WareHouseImport_Dialog dialog = new WareHouseImport_Dialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private MyDesign.MyButton btnLuuThongTin;
    private MyDesign.MyButton btnNhapQuaSheet;
    private MyDesign.MyButton btnXacNhan;
    private javax.swing.JComboBox<String> cbNXB;
    private javax.swing.JComboBox<String> cbNhaCungCap;
    private javax.swing.JComboBox<String> cbTacGia;
    private javax.swing.JComboBox<String> cbTenSach;
    private javax.swing.JComboBox<String> cbTheLoai;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbImageBook;
    private javax.swing.JLabel lbThemNXB;
    private javax.swing.JLabel lbThemNhaCungCap;
    private javax.swing.JLabel lbThemSach;
    private javax.swing.JLabel lbThemTacGia;
    private javax.swing.JLabel lbThemTheLoai;
    private MyDesign.PanelBorder panelBorder1;
    private MyDesign.PanelBorder panelBorder2;
    private MyDesign.PanelBorder_Basic panelBorder_Basic1;
    private MyDesign.PanelBorder_Statistic_Blue panelBorder_Statistic_Blue1;
    private MyDesign.PanelBorder_Basic pnImageBook;
    private javax.swing.JScrollPane spTable;
    private MyDesign.MyTable tbSachDuocNhap;
    private MyDesign.MyTextField_Basic txtGia;
    private MyDesign.MyTextField_Basic txtISBN;
    private MyDesign.MyTextField_Basic txtLanXuatBan;
    private MyDesign.MyTextField_Basic txtSoLuong;
    private javax.swing.JLabel txtTongChi;
    // End of variables declaration//GEN-END:variables
}

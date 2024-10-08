/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hoa Le
 */
public class QLKhoSach extends javax.swing.JFrame {

    /**
     * Creates new form QLKhoSach
     */
    public QLKhoSach() {
        initComponents();
        this.setLocationRelativeTo(null);
        show_Table();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnMenuChinh = new javax.swing.JButton();
        btnSach = new javax.swing.JButton();
        btnDocGia = new javax.swing.JButton();
        btnNhanVien = new javax.swing.JButton();
        btnTraSach = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnMuonSach = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTimKiemSach = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSach = new javax.swing.JTable();
        btnThemSach = new javax.swing.JButton();
        btnSuaSach = new javax.swing.JButton();
        btnXoaSach = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        btnLayDuLieu = new javax.swing.JButton();
        btnXemChiTiet = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(260, 600));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Users-Administrator-icon.png"))); // NOI18N

        btnMenuChinh.setBackground(new java.awt.Color(255, 255, 255));
        btnMenuChinh.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnMenuChinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home-icon (2).png"))); // NOI18N
        btnMenuChinh.setText("Trang chủ");
        btnMenuChinh.setBorder(null);
        btnMenuChinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuChinhActionPerformed(evt);
            }
        });

        btnSach.setBackground(new java.awt.Color(255, 255, 255));
        btnSach.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bookstack_libr_3024.png"))); // NOI18N
        btnSach.setText("Quản lý sách");
        btnSach.setBorder(null);
        btnSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSachActionPerformed(evt);
            }
        });

        btnDocGia.setBackground(new java.awt.Color(255, 255, 255));
        btnDocGia.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnDocGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/users-2-2-icon (1).png"))); // NOI18N
        btnDocGia.setText("Quản lý độc giả");
        btnDocGia.setBorder(null);
        btnDocGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocGiaActionPerformed(evt);
            }
        });

        btnNhanVien.setBackground(new java.awt.Color(255, 255, 255));
        btnNhanVien.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user-icon.png"))); // NOI18N
        btnNhanVien.setText("Quản lý nhân viên");
        btnNhanVien.setBorder(null);
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });

        btnTraSach.setBackground(new java.awt.Color(255, 255, 255));
        btnTraSach.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnTraSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/account-arrow-right-outline-icon (1).png"))); // NOI18N
        btnTraSach.setText("Quản lý trả sách");
        btnTraSach.setBorder(null);
        btnTraSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraSachActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton6.setText("Quản lý trả sách");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Quản lý thư viện");

        btnMuonSach.setBackground(new java.awt.Color(255, 255, 255));
        btnMuonSach.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnMuonSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/account-edit-outline-icon (1).png"))); // NOI18N
        btnMuonSach.setText("Quản lý mượn sách");
        btnMuonSach.setBorder(null);
        btnMuonSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMuonSachActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMenuChinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDocGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMuonSach, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                    .addComponent(btnTraSach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(96, 96, 96))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addComponent(btnMenuChinh, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSach, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnNhanVien)
                .addGap(29, 29, 29)
                .addComponent(btnMuonSach)
                .addGap(26, 26, 26)
                .addComponent(btnTraSach, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Arial", 1, 34)); // NOI18N
        jLabel3.setText("Quản lý sách");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setText("Tìm kiếm");

        txtTimKiemSach.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        tbSach.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tbSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã sách", "Tiêu đề sách", "Tên tác giả", "Nhà xuất bản", "Năm xuất bản", "Thể loại", "Số lượng", "giaTien"
            }
        ));
        tbSach.setRowHeight(30);
        tbSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbSach);

        jScrollPane2.setViewportView(jScrollPane1);

        btnThemSach.setBackground(new java.awt.Color(255, 255, 255));
        btnThemSach.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnThemSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button-Add-icon.png"))); // NOI18N
        btnThemSach.setText("Thêm");
        btnThemSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSachActionPerformed(evt);
            }
        });

        btnSuaSach.setBackground(new java.awt.Color(255, 255, 255));
        btnSuaSach.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSuaSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Pencil-icon.png"))); // NOI18N
        btnSuaSach.setText("Sửa");
        btnSuaSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaSachActionPerformed(evt);
            }
        });

        btnXoaSach.setBackground(new java.awt.Color(255, 255, 255));
        btnXoaSach.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnXoaSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button-Close-icon.png"))); // NOI18N
        btnXoaSach.setText("Xoá");
        btnXoaSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaSachActionPerformed(evt);
            }
        });

        btnTimKiem.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loupe_78956.png"))); // NOI18N
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnLayDuLieu.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnLayDuLieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/management_paper_search_quality_control_magnifying_glass_optimization_find_business_document_icon_225920.png"))); // NOI18N
        btnLayDuLieu.setText("Lấy dữ liệu");
        btnLayDuLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLayDuLieuActionPerformed(evt);
            }
        });

        btnXemChiTiet.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnXemChiTiet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_visibility_128_28779.png"))); // NOI18N
        btnXemChiTiet.setText("Xem chi tiết");
        btnXemChiTiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemChiTietActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtTimKiemSach, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnTimKiem))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnThemSach, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnLayDuLieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSuaSach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(69, 69, 69)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnXoaSach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnXemChiTiet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jLabel3)))
                .addGap(0, 31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTimKiemSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXemChiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLayDuLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnXoaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSuaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnThemSach, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSachActionPerformed
        QLKhoSach qLKhoSach = new QLKhoSach();
        qLKhoSach.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSachActionPerformed

    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
        QLNhanVien qLNhanVien = new QLNhanVien();
        qLNhanVien.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void btnMenuChinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuChinhActionPerformed
        MenuChinh menuChinh = new MenuChinh();
        menuChinh.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMenuChinhActionPerformed

    private void btnDocGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocGiaActionPerformed
        QLDocGia qLDocGia = new QLDocGia();
        qLDocGia.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDocGiaActionPerformed

    private void btnTraSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraSachActionPerformed
        QLTraSach qLTraSach = new QLTraSach();
        qLTraSach.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTraSachActionPerformed

    private void btnMuonSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMuonSachActionPerformed
        QLMuonSach qLMuonSach = new QLMuonSach();
        qLMuonSach.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMuonSachActionPerformed

    private void btnThemSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSachActionPerformed
        QLKhoSachThem qLKhoSachThem = new QLKhoSachThem();
        qLKhoSachThem.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnThemSachActionPerformed

    private void btnSuaSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaSachActionPerformed
        int selectedRow = tbSach.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn dòng cần sửa");
        } else {
            // Lấy thông tin từ dòng được chọn (lấy giá trị của các cột trong bảng )
            String maSach = tbSach.getValueAt(selectedRow, 0).toString();
            String tieuDeSach = tbSach.getValueAt(selectedRow, 1).toString();
            String tenTacGia = tbSach.getValueAt(selectedRow, 2).toString();
            String nhaXuatBan = tbSach.getValueAt(selectedRow, 3).toString();
            String namXuatBan = tbSach.getValueAt(selectedRow, 4).toString();
            String theLoai = tbSach.getValueAt(selectedRow, 5).toString();
            String soLuong = tbSach.getValueAt(selectedRow, 6).toString();
            String giaTien = tbSach.getValueAt(selectedRow, 7).toString();

            // Mở form QLKhoSachSua và truyền thông tin vào các JTextField trên form đó
            QLKhoSachSua qLKhoSachSua = new QLKhoSachSua();
            qLKhoSachSua.setValues(maSach, tieuDeSach, tenTacGia, nhaXuatBan, namXuatBan, theLoai, soLuong, giaTien);
            qLKhoSachSua.setVisible(true);
        }
    }//GEN-LAST:event_btnSuaSachActionPerformed

    private void tbSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSachMouseClicked

    }//GEN-LAST:event_tbSachMouseClicked

    private void btnXoaSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaSachActionPerformed
        int selectedRow = tbSach.getSelectedRow();
        if (selectedRow == -1) {
            // Không có hàng nào được chọn
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một hàng để xoá.", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            String maSach = tbSach.getValueAt(selectedRow, 0).toString();
            // Hiển thị hộp thoại xác nhận
            int choice = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xoá hàng đã chọn?", "Xác nhận xoá", JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                try {
                    Connect connect = new Connect();
                    connect.DeleteSach(maSach); // Gọi phương thức xóa hàng từ CSDL

                    // Xoá hàng trong mô hình bảng
                    DefaultTableModel model = (DefaultTableModel) tbSach.getModel();
                    model.removeRow(selectedRow);

                    JOptionPane.showMessageDialog(this, "Xoá thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi xoá hàng.\n" + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnXoaSachActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        if (txtTimKiemSach.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập từ khóa tìm kiếm!!");
        } else {
            try {
                Connect ts = new Connect();
                ResultSet rs = null;

                // Xây dựng câu truy vấn với điều kiện LIKE
                String keyword = txtTimKiemSach.getText();
                String query = " WHERE "
                        + "maSach LIKE '%" + keyword + "%' OR "
                        + "tieuDeSach LIKE '%" + keyword + "%' OR "
                        + "tenTacGia LIKE '%" + keyword + "%' OR "
                        + "nhaXuatBan LIKE '%" + keyword + "%' OR "
                        + "namXuatBan LIKE '%" + keyword + "%' OR "
                        + "theLoai LIKE '%" + keyword + "%' OR "
                        + "soLuong LIKE '%" + keyword + "%' OR "
                        + "giaTien LIKE '%" + keyword + "%'";

                rs = ts.getData("sach", query);
                DefaultTableModel model = (DefaultTableModel) tbSach.getModel();
                model.setRowCount(0);
                while (rs.next()) {
                    Object[] data = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)};
                    model.addRow(data);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng định dạng", "Lỗi", JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnLayDuLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLayDuLieuActionPerformed
        show_Table();
    }//GEN-LAST:event_btnLayDuLieuActionPerformed

    private void btnXemChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemChiTietActionPerformed
        int selectedRow = tbSach.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn dòng cần xem");
        } else {
            // Lấy thông tin từ dòng được chọn (lấy giá trị của các cột trong bảng )
            String maSach = tbSach.getValueAt(selectedRow, 0).toString();
            String tieuDeSach = tbSach.getValueAt(selectedRow, 1).toString();
            String tenTacGia = tbSach.getValueAt(selectedRow, 2).toString();
            String nhaXuatBan = tbSach.getValueAt(selectedRow, 3).toString();
            String namXuatBan = tbSach.getValueAt(selectedRow, 4).toString();
            String theLoai = tbSach.getValueAt(selectedRow, 5).toString();
            String soLuong = tbSach.getValueAt(selectedRow, 6).toString();
            String giaTien = tbSach.getValueAt(selectedRow, 7).toString();

            // Mở form QLKhoSachXem và truyền thông tin vào các JTextField trên form đó
            QLKhoSachXem qLKhoSachXem = new QLKhoSachXem();
            qLKhoSachXem.setValues(maSach, tieuDeSach, tenTacGia, nhaXuatBan, namXuatBan, theLoai, soLuong, giaTien);
            qLKhoSachXem.setVisible(true);
        }
    }//GEN-LAST:event_btnXemChiTietActionPerformed

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
            java.util.logging.Logger.getLogger(QLKhoSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLKhoSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLKhoSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLKhoSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLKhoSach().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDocGia;
    private javax.swing.JButton btnLayDuLieu;
    private javax.swing.JButton btnMenuChinh;
    private javax.swing.JButton btnMuonSach;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnSach;
    private javax.swing.JButton btnSuaSach;
    private javax.swing.JButton btnThemSach;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnTraSach;
    private javax.swing.JButton btnXemChiTiet;
    private javax.swing.JButton btnXoaSach;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbSach;
    private javax.swing.JTextField txtTimKiemSach;
    // End of variables declaration//GEN-END:variables

    private void show_Table() {
        DefaultTableModel model = (DefaultTableModel) tbSach.getModel();
        try {
            Connect ts = new Connect();
            ResultSet rs = ts.getData("sach", "");
            model.setRowCount(0);

            while (rs.next()) {
                Object maSach = rs.getString(1);
                Object tieDeSach = rs.getString(2);
                Object tenTacGia = rs.getString(3);
                Object nhaXuatBan = rs.getString(4);
                Object namXuatBan = rs.getString(5);
                Object theLoai = rs.getString(6);
                Object soLuong = rs.getString(7);
                Object giaTien = rs.getString(8);

                Object[] data = {maSach, tieDeSach, tenTacGia, nhaXuatBan, namXuatBan, theLoai, soLuong, giaTien};
                model.addRow(data);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public int getGiaTienByMaSach(String maSach) throws ClassNotFoundException, SQLException {
        Connect ts = new Connect();
        ResultSet rs = ts.getDataFromTableDK("sach", "giaTien", "maSach = '" + maSach + "'");

        int giaTien = 0;

        if (rs.next()) {
            giaTien = rs.getInt("giaTien");
        }

        return giaTien;
    }
}

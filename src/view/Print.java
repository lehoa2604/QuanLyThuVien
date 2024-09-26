/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.*;

/*
 Lớp này triển khai giao diện Printable, cho phép tuân thủ các phương thức cần thiết cho việc in
 được sử dụng để tạo và hiển thị nội dung trên trang giấy khi in.
 Các thông tin từ các trường dữ liệu được lấy và vẽ lên đối tượng Graphics (đối tượng đại diện cho nền tảng đồ họa) để chuẩn bị cho quá trình in. 
 Các dòng thông tin được vẽ lên với các tọa độ x, y tương ứng và sử dụng lineHeight để tạo khoảng cách giữa các dòng.
 */


public class Print implements Printable {

    private JTextArea txtGhiChu;
    private JTextField txtKhoanPhat;
    private JTextField txtMaDocGia;
    private JTextField txtMaNhanVien;
    private JTextField txtMaSach;
    private JTextField txtMaTra;
    private JTextField txtNgayHenTra;
    private JTextField txtNgayMuon;
    private JTextField txtNgayTraThuc;
    private JTextField txtTinhTrangMuon;
    private JTextField txtTinhTrangTra;

    public Print(JTextArea txtGhiChu, JTextField txtKhoanPhat, JTextField txtMaDocGia, JTextField txtMaNhanVien,
            JTextField txtMaSach, JTextField txtMaTra, JTextField txtNgayHenTra, JTextField txtNgayMuon,
            JTextField txtNgayTraThuc, JTextField txtTinhTrangMuon, JTextField txtTinhTrangTra) {
        this.txtGhiChu = txtGhiChu;
        this.txtKhoanPhat = txtKhoanPhat;
        this.txtMaDocGia = txtMaDocGia;
        this.txtMaNhanVien = txtMaNhanVien;
        this.txtMaSach = txtMaSach;
        this.txtMaTra = txtMaTra;
        this.txtNgayHenTra = txtNgayHenTra;
        this.txtNgayMuon = txtNgayMuon;
        this.txtNgayTraThuc = txtNgayTraThuc;
        this.txtTinhTrangMuon = txtTinhTrangMuon;
        this.txtTinhTrangTra = txtTinhTrangTra;
    }

    //phương thức hiển thị nội dung cần in trên một trang,Đối tượng Graphics cho phép vẽ trên ngữ cảnh đồ họa,Định dạng,chỉ mục
    @Override
    public int print(Graphics g, PageFormat pf, int page) throws PrinterException {
        if (page > 0) {
            return NO_SUCH_PAGE;  //trang không tồn tại.
        }

        Graphics2D g2d = (Graphics2D) g;
        g2d.translate(pf.getImageableX(), pf.getImageableY()); //dịch chuyển nó đến vị trí bắt đầu trên trang

        int y = 0; //biến cho vị trí dọc 
        int lineHeight = 15;
        
        //vẽ các chuỗi trên đối tượng Graphics 
        g.drawString("Mã Trả: " + txtMaTra.getText(), 0, y += lineHeight); //0 là tọa độ x, đại diện cho vị trí ngang
        g.drawString("Mã Độc Giả: " + txtMaDocGia.getText(), 0, y += lineHeight);
        g.drawString("Mã Nhân Viên: " + txtMaNhanVien.getText(), 0, y += lineHeight);
        g.drawString("Mã Sách: " + txtMaSach.getText(), 0, y += lineHeight);
        g.drawString("Ngày Mượn: " + txtNgayMuon.getText(), 0, y += lineHeight);
         g.drawString("Ngày Hẹn Trả: " + txtNgayHenTra.getText(), 0, y += lineHeight);
        g.drawString("Ngày Trả Thực: " + txtNgayTraThuc.getText(), 0, y += lineHeight);
        g.drawString("Tình Trạng Mượn: " + txtTinhTrangMuon.getText(), 0, y += lineHeight);
        g.drawString("Tình Trạng Trả: " + txtTinhTrangTra.getText(), 0, y += lineHeight);
        g.drawString("Ghi Chú: " + txtGhiChu.getText(), 0, y += lineHeight);
        g.drawString("Khoản Phạt: " + txtKhoanPhat.getText(), 0, y += lineHeight);
        return PAGE_EXISTS; // trang đã được hiển thị
    }

    public void print() {
        PrinterJob job = PrinterJob.getPrinterJob(); //Đối tượng này đại diện cho một công việc in
        job.setPrintable(this);

        boolean doPrint = job.printDialog(); //hộp thoại in sẽ hiển thị 
        if (doPrint) {
            try {
                job.print(); //bắt đầu quá trình in
            } catch (PrinterException ex) {
                ex.printStackTrace();
            }
        }
    }

}

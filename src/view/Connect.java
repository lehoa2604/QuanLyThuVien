/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Hoa Le
 */
public class Connect {

    public final Connection conn;

    public Connect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/qlthuvien";
        this.conn = DriverManager.getConnection(url, "root", "");
    }

    //lấy tất cả dữ liệu từ bảng và điều kiện truy vấn
    public ResultSet getData(String tbname, String query) throws SQLException {
        Statement ts = this.conn.createStatement();
        ResultSet rs = null;
        String sql = "select * from " + tbname + query;
        rs = ts.executeQuery(sql);
        return rs;
    }

    //lấy 1 cột bất kì từ bảng
    public ResultSet getDataFromTable(String tableName, String columnName) throws SQLException {
        Statement ts = this.conn.createStatement();
        ResultSet rs = null;
        String sql = "SELECT " + columnName + " FROM " + tableName;
        rs = ts.executeQuery(sql);
        return rs;
    }

    public ResultSet getDataFromTableDK(String tableName, String columnName, String query) throws SQLException {
        Statement ts = this.conn.createStatement();
        ResultSet rs = null;
        String sql = "SELECT " + columnName + " FROM " + tableName + " where " + query;
        rs = ts.executeQuery(sql);
        return rs;
    }

    public void insertSach(String maSach, String tieuDeSach, String tenTacGia, String nhaXuatBan, int namXuatBan, String theLoai, int soLuong, int giaTien) throws SQLException {
        Statement ts = this.conn.createStatement();
        String sql = "insert sach values ( '" + maSach + "' , '" + tieuDeSach + "' , '" + tenTacGia + "' , '" + nhaXuatBan + "' ," + namXuatBan + ",'" + theLoai + "'," + soLuong + "," + giaTien + ")";
        ts.executeUpdate(sql);
    }

    public void insertDocGia(String maDG, String tenDG, String lop, int tuoi, String diaChi, int sdt, String email) throws SQLException {
        Statement ts = this.conn.createStatement();
        String sql = "insert docgia values ( '" + maDG + "' , '" + tenDG + "' , '" + lop + "' , " + tuoi + " , '" + diaChi + "' ," + sdt + ", '" + email + "' )";
        ts.executeUpdate(sql);
    }

    public void insertNhanVien(String maNV, String tenNV, int tuoi, String diaChi, int sdt, String email) throws SQLException {
        Statement ts = this.conn.createStatement();
        String sql = "insert nhanvien values ( '" + maNV + "' , '" + tenNV + "' , " + tuoi + " , '" + diaChi + "' ," + sdt + ", '" + email + "' )";
        ts.executeUpdate(sql);
    }

    public void insertMuonSach(String maMuon, String maSach, String maDG, String maNV, String ngayMuon, String ngayHenTra, String tinhTrangMuon) throws SQLException {
        Statement ts = this.conn.createStatement();
        String sql = "insert muonsach values ( '" + maMuon + "' , '" + maSach + "' , '" + maDG + "' , '" + maNV + "' ,'" + ngayMuon + "', '" + ngayHenTra + "','" + tinhTrangMuon + "' )";
        ts.executeUpdate(sql);
    }

    public void insertTraSach(String maTra, String maMuon, String ngayTraThuc, int tinhTrangTra, int khoanThu, String ghiChu) throws SQLException {
        Statement ts = this.conn.createStatement();
        String sql = "insert trasach values ( '" + maTra + "' , '" + maMuon + "' , '" + ngayTraThuc + "' , '" + tinhTrangTra + "' ,'" + khoanThu + "', '" + ghiChu + "' )";
        ts.executeUpdate(sql);
    }

    public void insertAccount(String user, String pass) throws SQLException {
        Statement ts = this.conn.createStatement();
        String sql = "insert into dangnhap (user, password) values ('" + user + "', '" + pass  + "')";
        ts.executeUpdate(sql);
    }

    public void updateSach(String maSach, String tieuDeSach, String tenTacGia, String nhaXuatBan, int namXuatBan, String theLoai, int soLuong, int giaTien) throws SQLException {
        Statement ts = this.conn.createStatement();
        String sql1 = "UPDATE sach SET tieuDeSach = '" + tieuDeSach + "' where maSach = '" + maSach + "'";
        String sql2 = "UPDATE sach SET tenTacGia = '" + tenTacGia + "' where maSach = '" + maSach + "'";
        String sql3 = "UPDATE sach SET nhaXuatBan = '" + nhaXuatBan + "' where maSach = '" + maSach + "'";
        String sql4 = "UPDATE sach SET namXuatBan = " + namXuatBan + " where maSach = '" + maSach + "'";
        String sql5 = "UPDATE sach SET theLoai = '" + theLoai + "' where maSach = '" + maSach + "'";
        String sql6 = "UPDATE sach SET soLuong = " + soLuong + " where maSach = '" + maSach + "'";
        String sql7 = "UPDATE sach SET giaTien = " + giaTien + " where maSach = '" + maSach + "'";

        //executeUpdate() được sử dụng để thực thi các câu lệnh SQL như INSERT, UPDATE hoặc DELETE.
        ts.executeUpdate(sql1);
        ts.executeUpdate(sql2);
        ts.executeUpdate(sql3);
        ts.executeUpdate(sql4);
        ts.executeUpdate(sql5);
        ts.executeUpdate(sql6);
        ts.executeUpdate(sql7);
    }

    public void updateDocGia(String maDG, String tenDG, String lop, int tuoi, String diaChi, int sdt, String email) throws SQLException {
        Statement ts = this.conn.createStatement();
        String sql1 = "UPDATE docgia SET tenDG = '" + tenDG + "' where maDG = '" + maDG + "'";
        String sql2 = "UPDATE docgia SET lop = '" + lop + "' where maDG = '" + maDG + "'";
        String sql3 = "UPDATE docgia SET tuoiDG = " + tuoi + " where maDG = '" + maDG + "'";
        String sql4 = "UPDATE docgia SET diaChiDG = '" + diaChi + "' where maDG = '" + maDG + "'";
        String sql5 = "UPDATE docgia SET sdtDG = " + sdt + " where maDG = '" + maDG + "'";
        String sql6 = "UPDATE docgia SET emailDG = '" + email + "' where maDG = '" + maDG + "'";

        //executeUpdate() được sử dụng để thực thi các câu lệnh SQL như INSERT, UPDATE hoặc DELETE.
        ts.executeUpdate(sql1);
        ts.executeUpdate(sql2);
        ts.executeUpdate(sql3);
        ts.executeUpdate(sql4);
        ts.executeUpdate(sql5);
        ts.executeUpdate(sql6);
    }

    public void updateNhanVien(String maNV, String tenNV, int tuoi, String diaChi, int sdt, String email) throws SQLException {
        Statement ts = this.conn.createStatement();
        String sql1 = "UPDATE nhanvien SET tenNV = '" + tenNV + "' where maNV = '" + maNV + "'";
        String sql2 = "UPDATE nhanvien SET tuoiNV = " + tuoi + " where maNV = '" + maNV + "'";
        String sql3 = "UPDATE nhanvien SET diaChiNV = '" + diaChi + "' where maNV = '" + maNV + "'";
        String sql4 = "UPDATE nhanvien SET sdtNV = " + sdt + " where maNV = '" + maNV + "'";
        String sql5 = "UPDATE nhanvien SET emailNV = '" + email + "' where maNV = '" + maNV + "'";

        //executeUpdate() được sử dụng để thực thi các câu lệnh SQL như INSERT, UPDATE hoặc DELETE.
        ts.executeUpdate(sql1);
        ts.executeUpdate(sql2);
        ts.executeUpdate(sql3);
        ts.executeUpdate(sql4);
        ts.executeUpdate(sql5);
    }

    public void updateMuonSach(String maMuon, String maSach, String maDG, String maNV, String ngayMuon, String ngayHenTra, String tinhTrangMuon) throws SQLException {
        Statement ts = this.conn.createStatement();
        String sql1 = "UPDATE muonsach SET maSach = '" + maSach + "' where maMuon = '" + maMuon + "'";
        String sql2 = "UPDATE muonsach SET maDG = '" + maDG + "' where maMuon = '" + maMuon + "'";
        String sql3 = "UPDATE muonsach SET maNV = '" + maNV + "' where maMuon = '" + maMuon + "'";
        String sql4 = "UPDATE muonsach SET ngayMuon = '" + ngayMuon + "' where maMuon = '" + maMuon + "'";
        String sql5 = "UPDATE muonsach SET ngayHenTra = '" + ngayHenTra + "' where maMuon = '" + maMuon + "'";
        String sql6 = "UPDATE muonsach SET tinhTrangMuon = '" + tinhTrangMuon + "' where maMuon = '" + maMuon + "'";

        //executeUpdate() được sử dụng để thực thi các câu lệnh SQL như INSERT, UPDATE hoặc DELETE.
        ts.executeUpdate(sql1);
        ts.executeUpdate(sql2);
        ts.executeUpdate(sql3);
        ts.executeUpdate(sql4);
        ts.executeUpdate(sql5);
        ts.executeUpdate(sql6);
    }

    public void updateTraSach(String maTra, String maMuon, String ngayTraThuc, int tinhTrangTra, int khoanThu, String ghiChu) throws SQLException {
        Statement ts = this.conn.createStatement();
        String sql1 = "UPDATE trasach SET maMuon = '" + maMuon + "' where maTra = '" + maTra + "'";
        String sql2 = "UPDATE trasach SET ngayTraThuc = '" + ngayTraThuc + "' where maTra = '" + maTra + "'";
        String sql3 = "UPDATE trasach SET tinhTrangTra = " + tinhTrangTra + " where maTra = '" + maTra + "'";
        String sql4 = "UPDATE trasach SET khoanThu = " + khoanThu + " where maTra = '" + maTra + "'";
        String sql5 = "UPDATE trasach SET ghiChu = '" + ghiChu + "' where maTra = '" + maTra + "'";

        //executeUpdate() được sử dụng để thực thi các câu lệnh SQL như INSERT, UPDATE hoặc DELETE.
        ts.executeUpdate(sql1);
        ts.executeUpdate(sql2);
        ts.executeUpdate(sql3);
        ts.executeUpdate(sql4);
        ts.executeUpdate(sql5);

    }

    public void DeleteSach(String maSach) throws SQLException {
        Statement sta = this.conn.createStatement();
        String sql = "delete from sach where maSach = '" + maSach + "'";
        sta.executeUpdate(sql);
    }

    public void DeleteDocGia(String maDG) throws SQLException {
        Statement sta = this.conn.createStatement();
        String sql = "delete from docgia where maDG = '" + maDG + "'";
        sta.executeUpdate(sql);
    }

    public void DeleteNhanVien(String maNV) throws SQLException {
        Statement sta = this.conn.createStatement();
        String sql = "delete from nhanvien where maNV = '" + maNV + "'";
        sta.executeUpdate(sql);
    }

    public void DeleteMuonSach(String maMuon) throws SQLException {
        Statement sta = this.conn.createStatement();
        String sql = "delete from muonsach where maMuon = '" + maMuon + "'";
        sta.executeUpdate(sql);
    }

    public void DeleteTraSach(String maTra) throws SQLException {
        Statement sta = this.conn.createStatement();
        String sql = "delete from trasach where maTra = '" + maTra + "'";
        sta.executeUpdate(sql);
    }

}

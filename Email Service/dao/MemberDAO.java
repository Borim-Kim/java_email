package kr.ac.kopo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.vo.MemberVO;

public class MemberDAO {
	
	//회원가입
	public void insert(MemberVO member) {
	
		StringBuilder sql = new StringBuilder();
		sql.append("insert into member(NM, BD, PN, ID, PW) ");
		sql.append(" values(?, ?, ?, ?, ?) ");
		
		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());) {
				
				String NM = member.getNM();
				int BD = member.getBD();
				int PN = member.getPN();
				String ID = member.getID();
				String PW = member.getPW();
				pstmt.setString(1, NM);
				pstmt.setInt(2, BD);
				pstmt.setInt(3, PN);
				pstmt.setString(4, ID);
				pstmt.setString(5, PW);
				pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 아이디랑 비밀번호로 로그인하기
	public MemberVO select(String ID, String PW) {
		
		MemberVO member = null;
		
		StringBuilder sql = new StringBuilder();
		sql.append("select *");
		sql.append("	from MEMBER");
		sql.append("		where ID = ? and PW = ?");

		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());) {

			pstmt.setString(1, ID);
			pstmt.setString(2, PW);
			ResultSet rs = pstmt.executeQuery();
			
			if (rs.next()) {
				String getNM = rs.getString("NM");
				int getBD = rs.getInt("BD");
				int getPN = rs.getInt("PN");
				String getID = rs.getString("ID");
				String getPW = rs.getString("PW");

				member = new MemberVO(getNM, getBD, getPN, getID, getPW);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return member;
	}
	// 아이디 찾기
	public MemberVO SearchID(MemberVO member) {
		
		MemberVO SearchID = null;
		
		StringBuilder sql = new StringBuilder();
		sql.append("select *");
		sql.append("	from MEMBER");
		sql.append("		where NM = ? and BD = ?");

		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());) {

			pstmt.setString(1, member.getNM());
			pstmt.setInt(2, member.getBD());
			ResultSet rs = pstmt.executeQuery();
			
			if (rs.next()) {
				String getNM = rs.getString("NM");
				int getBD = rs.getInt("BD");
				int getPN = rs.getInt("PN");
				String getID = rs.getString("ID");
				String getPW = rs.getString("PW");

				member = new MemberVO(getNM, getBD, getPN, getID, getPW);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return member;
	}
	// 비밀번호 찾기
	public MemberVO SearchPW(MemberVO member) {
		
		MemberVO SearchPW = null;
		
		StringBuilder sql = new StringBuilder();
		sql.append("select *");
		sql.append("	from MEMBER");
		sql.append("		where ID = ? and NM = ? and BD = ?");

		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());) {

			pstmt.setString(1, member.getID());
			pstmt.setString(2, member.getNM());
			pstmt.setInt(3, member.getBD());
			ResultSet rs = pstmt.executeQuery();
			
			if (rs.next()) {
				String getNM = rs.getString("NM");
				int getBD = rs.getInt("BD");
				int getPN = rs.getInt("PN");
				String getID = rs.getString("ID");
				String getPW = rs.getString("PW");

				member = new MemberVO(getNM, getBD, getPN, getID, getPW);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return member;
	}
}

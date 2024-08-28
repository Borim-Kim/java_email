package kr.ac.kopo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.vo.MailVO;
import kr.ac.kopo.vo.MemberVO;

public class MailDAO {

	// 메일을 쓰자
	public void insert(MailVO mail) {

		StringBuilder sql = new StringBuilder();
		sql.append("insert into Mailservice(Receiver, Sender, Title, Content)");
		sql.append(" values(?, ?, ?, ?) ");

		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());
		) {

			String Receiver = mail.getReceiver();
			String Sender = mail.getSender();
			String Title = mail.getTitle();
			String Content = mail.getContent();

			pstmt.setString(1, mail.getReceiver());
			pstmt.setString(2, mail.getSender());
			pstmt.setString(3, mail.getTitle());
			pstmt.setString(4, mail.getContent());
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 받은 메일 보여줘
	public List<MailVO> ReceiverMail() {
		
		List<MailVO> list = new ArrayList<MailVO>();
		
		StringBuilder sql = new StringBuilder();
		sql.append("select *");
		sql.append("	from MailService");
		sql.append(" where receiver = ?");

		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());) {

			pstmt.setString(1, MemberVO.getID());
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String getReceiver = rs.getString("Receiver");
				String getSender = rs.getString("Sender");
				String getTitle = rs.getString("Title");
				String getContent = rs.getString("Content");

				MailVO mail = new MailVO(getReceiver, getSender, getTitle, getContent);
				list.add(mail);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	// 보낸 메일 보여줘
	public List<MailVO> sendmail() {
		
		List<MailVO> list = new ArrayList<MailVO>();
		
		StringBuilder sql = new StringBuilder();
		sql.append("select *");
		sql.append("	from MailService");
		sql.append(" where Sender = ?");

		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());) {

			pstmt.setString(1, MemberVO.getID());
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String getReceiver = rs.getString("Receiver");
				String getSender = rs.getString("Sender");
				String getTitle = rs.getString("Title");
				String getContent = rs.getString("Content");

				MailVO mail = new MailVO(getReceiver, getSender, getTitle, getContent);
				list.add(mail);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	// 회원정보를 수정하고 싶어
	public void updateMember(MemberVO member) {
		
	    StringBuilder sql = new StringBuilder();
	    
	    sql.append("UPDATE Member SET ... where ID = ?"); 

	    try (Connection conn = new ConnectionFactory().getConnection();
	         PreparedStatement pstmt = conn.prepareStatement(sql.toString());) {

	        int cnt = pstmt.executeUpdate();

	        if (cnt > 0) {
	            System.out.println(member.getID() + "님의 정보를 수정하였습니다...");
	        } else {
	            System.out.println(member.getID() + "님의 정보를 수정 못했습니다.... 실패!!");
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}




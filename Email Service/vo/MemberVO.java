package kr.ac.kopo.vo;

public class MemberVO {

	private String NM;
	private int BD;
	private int PN;
	private static String ID;
	private String PW;
	
	public MemberVO() {
		super();
	}

	public MemberVO(String ID, String NM, int BD) {
		super();
		this.ID = ID;
		this.NM = NM;
		this.BD = BD;
	}

	public MemberVO(String NM, int BD, int PN, String ID, String PW) {
		super();
		this.NM = NM;
		this.BD = BD;
		this.PN = PN;
		this.ID = ID;
		this.PW = PW;
	}

	public String getNM() {
		return NM;
	}

	public void setNM(String NM) {
		this.NM = NM;
	}

	public MemberVO(String nM, int bD) {
		super();
		NM = nM;
		BD = bD;
	}

	public int getBD() {
		return BD;
	}

	public void setBD(int BD) {
		this.BD = BD;
	}

	public int getPN() {
		return PN;
	}

	public void setPN(int PN) {
		this.PN = PN;
	}

	public static String getID() {
		return ID;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public String getPW() {
		return PW;
	}

	public void setPW(String PW) {
		this.PW = PW;
	}

	@Override
	public String toString() {
		return "MemberVO [NM= " + NM + ", BD = " + BD + ", PN + " + PN + ","
				+ "ID = " + ID + ", PW= " + PW + "]";
	}

}	

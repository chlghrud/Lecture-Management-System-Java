package model.dto;

public class Teacher {
	private int tno;
	private String tname, tid, tpw;
	
	public Teacher() {}
	
	public Teacher(int tno, String tname, String tid, String tpw) {
		super();
		this.tno = tno;
		this.tname = tname;
		this.tid = tid;
		this.tpw = tpw;
	}

	public int getTno() {
		return tno;
	}

	public void setTno(int tno) {
		this.tno = tno;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getTpw() {
		return tpw;
	}

	public void setTpw(String tpw) {
		this.tpw = tpw;
	}
	
	
	
}

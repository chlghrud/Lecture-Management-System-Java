package model.dto;


/**
 * User 데이터 객체 (DTO)
 * DB의 user 테이블과 1:1 매핑
 */
public class User {
	private int uno;
	private String uname, ueng, id, pw, card, birth, gender, certy, address;
	
	public User() {}
	
	public User(int uno, String uname, String ueng, String id, String pw, String card, String birth, String gender,
			String certy, String address) {
		super();
		this.uno = uno;
		this.uname = uname;
		this.ueng = ueng;
		this.id = id;
		this.pw = pw;
		this.card = card;
		this.birth = birth;
		this.gender = gender;
		this.certy = certy;
		this.address = address;
	}
	public int getUno() {
		return uno;
	}
	public void setUno(int uno) {
		this.uno = uno;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUeng() {
		return ueng;
	}
	public void setUeng(String ueng) {
		this.ueng = ueng;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCerty() {
		return certy;
	}
	public void setCerty(String certy) {
		this.certy = certy;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}

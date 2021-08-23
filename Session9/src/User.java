
public class User {

	int uid;
	String name;
	String phone;
	String email;
	String gender;
	
	User(){
		// this is reference to cuurent object
		System.out.println("this is: "+this);
	}
	
	User(int uid, String name, String phone, String email, String gender) {
		this.uid = uid;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.gender = gender;
	}

	int getUid() {
		return uid;
	}

	void setUid(int uid) {
		this.uid = uid;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getPhone() {
		return phone;
	}

	void setPhone(String phone) {
		this.phone = phone;
	}

	String getEmail() {
		return email;
	}

	void setEmail(String email) {
		this.email = email;
	}

	String getGender() {
		return gender;
	}

	void setGender(String gender) {
		this.gender = gender;
	}

	/*@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", phone=" + phone + ", email=" + email + ", gender=" + gender
				+ "]";
	}*/
	
	
}

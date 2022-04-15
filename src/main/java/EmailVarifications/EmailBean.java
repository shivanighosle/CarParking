package EmailVarifications;

import java.util.Objects;

public class EmailBean {
  
	String yourname,email;
	int rate;
	
	public EmailBean() {
		super();
	}
	
	public EmailBean(String yourname,String email, int rate) {
		super();
		this.yourname = yourname;
		this.email = email;
		this.rate = rate;
	}

	public String getYourname() {
		return yourname;
	}
	public void setYourname(String yourname) {
		this.yourname = yourname;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "EmailBean [yourname=" + yourname + ", email=" + email + ", rate=" + rate + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, rate, yourname);
	}
}

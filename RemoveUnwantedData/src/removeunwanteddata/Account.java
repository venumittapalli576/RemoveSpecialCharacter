package removeunwanteddata;

public class Account {

	
	private String accountNUmber;
	private String firstName;
	private String lastName;
	public String getAccountNUmber() {
		return accountNUmber;
	}
	public void setAccountNUmber(String accountNUmber) {
		this.accountNUmber = accountNUmber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNUmber == null) ? 0 : accountNUmber.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accountNUmber == null) {
			if (other.accountNUmber != null)
				return false;
		} else if (!accountNUmber.equals(other.accountNUmber))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Account [accountNUmber=" + accountNUmber + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
}

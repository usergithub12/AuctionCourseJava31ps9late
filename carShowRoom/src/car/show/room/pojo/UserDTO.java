package car.show.room.pojo;

public class UserDTO {

    @Override
	public String toString() {
		return "UserDTO [username=" + username + ", password=" + password + ", role=" + role + "]";
	}



	private String username;

	private String password;
  
    private String role;

	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
	}



     
}
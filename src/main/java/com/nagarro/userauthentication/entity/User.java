/** Represents a User entity with
 * attributes such as username and password.
 * 
 */
package com.nagarro.userauthentication.entity;
import javax.persistence.*;

@Entity
@Table(name="user")
public class User {
	
	@Id
    private int id;
	
	@Column(name = "username")
    private String username;
	
	@Column(name = "password")
    private String password;
	

    /** Constructs a User object with the given parameters.
     * 
     * @param id the unique identifier of the User.
     * @param username the username of the User.
     * @param password the password of the User.
    */
	
	public User()
	{
	}
	
    public User(int id, String username, String password) {
    	this.id = id;
    	this.username = username;
    	this.password = password;
    }

    /** Returns the id of the User.
     * 
     * @return the id of the User.
     */
    public int getId() {
        return id;
    }

    /** Sets the id of the User.
     * 
     * @param id the id to set for the User.
     */
    public void setId(int id) {
        this.id = id;
    }


    /** Returns the username of the User.
     * 
     * @return the username of the User.
     */
    public String getUserName() {
        return username;
    }
    
    /** Sets the username of the User.
     * 
     * @param username the username to set for the User.
     */
    public void setUserName(String username) {
        this.username = username;
    }
    
    /** Returns the password of the User.
     * 
     * @return the password of the User.
     */
    public String getPassword() {
        return password;
    }
    
    /** Sets the password of the User.
     * 
     * @param password the password to set for the User.
     */
    public void setPassword(String password) {
        this.password = password;
    }
        
}


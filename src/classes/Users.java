package classes;

public class Users {
    private int ID;
    private String username;
    private String password;
    
    public void setID(int ID){
        this.ID = ID;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public int getID(){
        return ID;
    }
    
    public String getUsername(){
        return username;
    }
    
    public String getPassword(){
        return password;
    }
}

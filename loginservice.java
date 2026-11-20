import java.util.HashMap;
class loginservice {
    HashMap<String, String>map=new HashMap<>(); 

    public loginservice() {
        map.put("harsha", "harsha@123");
        map.put("varshini", "varshini@123");
    }

    public boolean authenticate(String username, String password) {
        if (map.containsKey(username)) {
            String originalPassword = map.get(username);
            if (originalPassword.equals(password)) 
                return true;
        }
            else {
                return false;
        }
        return false;
    }
}
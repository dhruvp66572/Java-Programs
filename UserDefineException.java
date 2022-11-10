public class UserDefineException extends Exception{
    String msg;

    public UserDefineException(String m){
        msg = m;
    }

    public String toString() {
        return "User Define Exception Thown By User "+ msg;
    }
}

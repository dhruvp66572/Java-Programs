public class UseOFUserDefinrException {
    public static void main(String[] args) {
        try{
            int x = 0;

            if(x==0){
                throw new UserDefineException("Value of x should not be zero");
            }
    }catch (UserDefineException e){
            System.out.println(e);
        }
}
}


class Private{
    private int num=123;
    void showcode(){
        System.out.println("Secert code is "+num);
    }
}
public class PrivateAccess {
    public static void main(String[] args) {
        Private obj= new Private();
        obj.showcode();
        
    }
    
}

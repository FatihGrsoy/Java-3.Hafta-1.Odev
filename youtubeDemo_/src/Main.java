public class Main {
    public static void main(String[] args) {

        //IoC Container (araştır!!)
        CustomerManager customerManager=new CustomerManager(new Customer(),new TeacherCreditManager() );
        customerManager.giveCredit();
    }
}
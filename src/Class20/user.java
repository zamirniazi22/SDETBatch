package Class20;


//Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
   // Create a subclass  userInfo that will have user address variable
   // and it also being initialized through constructor call.
    //Print users name, mobile number and address in userDetails method. Test your code.
    public class user{
       static  String name;
       static  String mobileNumber;


     user(String name,String mobileNumber){
            this.name=name;
            this.mobileNumber=mobileNumber;

        }

    }

class userInfo extends user {
    String Address;
       userInfo(String name, String mobileNumber, String Address) {
        super(name,mobileNumber);
        this.Address=Address;

    }
    void userDetails(){
        System.out.println("UserName "+ name+" MobileNumber "+mobileNumber+" Address "+Address);
    }


    public static void main(String[] args) {
        userInfo use=new userInfo("ZamirNiazi","614-6530678","Ohio");
        use.userDetails();

    }
}
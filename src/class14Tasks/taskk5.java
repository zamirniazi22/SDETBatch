package class14Tasks;

public class taskk5 {
    String CreatEmail(String FirstName,String LastName,String EmailType){
        return(FirstName+LastName+"@"+ EmailType);
    }

    public static void main(String[] args) {
        taskk5 find=new taskk5();
        String FullEmailAdress= find.CreatEmail("Johm","Snow","gmail");
        System.out.println(FullEmailAdress);
        System.out.println(find.CreatEmail("zamir","Niazi","gmail.com"));
        System.out.println(find.CreatEmail("Taha","Niazi","yahoo.com"));
    }
}

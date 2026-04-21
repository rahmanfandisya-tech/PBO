public class abc {
    
}


    public static void main(String[] args) {
        System.out.println("Hello, World!"); // Mencetak teks
          System.out.println("selamat pagi, World!");
    }



    public abstract class Karyawan{
       private String id;
        
        public String getId() {
            return id;
        }
        
        public void setId(String id) {
            this.id = id;
        }

    }






    
    public class Kasir extends karyawan{

        

       public void login_kasir(){
           
       }; 


    }

    public class Manager extends karyawan{}
public class VerificarPassword {

    private String password;

    // metodo constructor
//     public VerificarPassword(String password){
//         this.password = password;
//     }

     // methodo validar una mayuscula


    public String getPassword() {
        return password;
    }

    public static boolean validateMayus(String password){
         for(int i=0; i<password.length();i++){
             if(Character.isUpperCase(password.charAt(i))){

             }
         }return true;
}




}

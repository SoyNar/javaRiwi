package Semana2.bucles;

public class NumerosPrimos {

    public static void numeroN(){
     boolean primo = true;

        for(int i =2; i<12;i++){

             for(int j = 2; j<i;j++){
            if(i%j==0){
                primo = false;
             break;

            }


        } if(primo){
                System.out.println("Es primo");
            } else {
                System.out.println("no primo");}
        }


    }
    public static void main(String[] args) {

        numeroN();
    }

}

public class Main {
    public static void main(String[] args) {

        /*

                     OVERRIDE METHOD    (ПЕРЕОПРЕДЕЛЕНИЕ )
        аттары окшош бирок ичиндеги маанилери реализациясы ар кандай кылып озгортуу
        ПЕРЕОПРЕДЕЛЕНИЕ ДЕП АТАЛАТ
         */


        Children children = new Children();
        children.game();
        System.out.println("-------------------------------");
        Girl girl = new Girl();
        girl.game();
        System.out.println("----------------------------");
        Boy boy = new Boy();
        boy.game();


    }
}
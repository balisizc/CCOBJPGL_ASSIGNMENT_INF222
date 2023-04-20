public class Exercise1 {

    static boolean iWillBehave = true;
    static boolean iWillGraduate = true;

   
    public static void main(String[] args) throws Exception {

        assert iWillBehave == true : "chika is life";

        college();

        assert iWillGraduate == true : "No marcha for u, Chika pa more";
    }

    static void college(){
        iWillGraduate = false;
        System.out.println("Graduation Day!!!!");
    }
}

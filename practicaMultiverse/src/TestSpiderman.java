public class TestSpiderman {
    public static void main(String[] args) {
        TestPorker();
        TestMiles();
        TestParker();
    }
     private static void TestPorker(){
        Screen s = new Screen();
        Porker porker1 = new Porker("Peter Porker","Spider-Ham","TRN705","Reportero",
                "secreta","masculino","Estadonuidense");

        porker1.introduce(s);
        porker1.hammerBlow(s);
        porker1.saygoodbye(s);
     }

     private static void TestMiles(){
        Screen s = new Screen();
        Miles miles1 = new Miles("Miles Morales","Spider-Man","TRN-700","Estudiante, artista",
                "secreta","masculino","Estadonuidense");

        miles1.jump(s);
        miles1.hit(s);
        miles1.kick(s);
     }

     private static void TestParker(){
        Screen s = new Screen();
        Parker parker1 = new Parker("Peter Parker","Spider-man","8107","Estudiante, fotografo",
                "secreta","masculino","Estadonuidense");

        parker1.reverse(s);
        parker1.web(s);
        parker1.sexy(s);
     }
}

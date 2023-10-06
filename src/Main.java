public class Main {
    public static void main(String[] args) {

    Lutador l[] = new Lutador[6];

      l [0]= new Lutador("Pretty Boy", "França",
              31,1.75f,68.9f,11,2,1 );
      l [1] = new Lutador("Walter Branco" , "Brasil",
              29, 1.68f, 57.9f, 14,2,3);
      l [2] = new Lutador("Francisvaldo Florentino","Irlanda",
              28, 1.90f,92.5f,
              10,2,6 );
      l [3] = new Lutador("Jãozinho de Goianinha", "Goiania",
              40, 1.92f, 120f, 4,3,0);
      l [4] = new Lutador("Goku", "Japão",
              30, 1.75f, 70.7f, 10,2,4 );
      l [5] = new Lutador(	"Zé do Caixão","Brasil",
              27, 1.65f, 65.9f,12,8,5);



        Luta UFC01 = new Luta();
        UFC01.marcarLuta(l[2],l[3]);
        UFC01.lutar();
        l[2].status();
        l[3].status();

    }
}
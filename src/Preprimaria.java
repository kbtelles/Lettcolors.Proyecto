public class Preprimaria {
    //ESTRUCTURA PARA LA CATEGORÍA DE PREPRIMARIA:
    public static String preprimaria[]={
     "Colores primarios",
     "Colores secundarios",
     "Colores terciarios",
     "Vocales",
     "Consonantes"
     };

     public static void Temas(String data){
      System.out.println("-----------------------------------------------------------------");
      System.out.println("En la categoría de Pre-primaria te brindamos los siguientes temas:");
     for (int i = 0; i<=4; i++){
     System.out.println("["+ i + "] "+ Preprimaria.preprimaria[i]);
     }}

     public static void General(int opción){
     if (opción==0){
     Preprimaria.Temas("");
     }}

     //Opción O:
     public static void Contenido0(String texto){
      System.out.println("-----------------------------------------------------------------");
      System.out.println("COLORES PRIMARIOS:");
     System.out.println("* ¿Qué son los colores primarios?");
     System.out.println("Son los colores que representan a los colores básicos y no pueden ser generado con la combinación de otros colores.");
     System.out.println();
     System.out.println("* ¿Cuáles son los colores primarios?");
     System.out.println("Son tres: rojo, amarillo y azul.");
      System.out.println("-----------------------------------------------------------------");}

      public static void ColoresPrimarios(int preprimaria){
     if (preprimaria==0){
     Preprimaria.Contenido0("");
     }}

     //Opción 1:
     public static void Contenido1(String texto){
      System.out.println("-----------------------------------------------------------------");
      System.out.println("COLORES SECUNDARIOS:");
     System.out.println("* ¿Qué son los colores secundarios?");
     System.out.println("Son los colores que surgen al mezclar dos colores primarios.");
     System.out.println();
     System.out.println("* ¿Cuáles son los colores secundarios?");
     System.out.println("Son tres: anaranjado, verde y morado.");
      System.out.println("-----------------------------------------------------------------");}

      public static void ColoresSecundarios(int preprimaria){
     if (preprimaria==1){
     Preprimaria.Contenido1("");
     }}

     //Opción 2:
     public static void Contenido2(String texto){
      System.out.println("-----------------------------------------------------------------");
      System.out.println("COLORES TERCIARIOS:");
     System.out.println("* ¿Qué son los colores terciarios?");
     System.out.println("Son los colores que se obtienen mezclando un color secundario y un primario.");
     System.out.println();
     System.out.println("* ¿Cuáles son los colores terciarios?");
     System.out.println("Los principales son: Amarillo-anaranjado, Rojo-anaranjado, Rojo-violáceo, Azul-violáceo, Azul-verdoso, Amarillo-Verdoso.");
      System.out.println("-----------------------------------------------------------------");}

      public static void ColoresTerciarios(int preprimaria){
     if (preprimaria==2){
     Preprimaria.Contenido2("");
     }}

     //Opción 3:
     public static void Contenido3(String texto){
      System.out.println("-----------------------------------------------------------------");
      System.out.println("VOCALES:");
     System.out.println("* ¿Qué son las vocales?");
     System.out.println("Son los cinco sonidos que se pronuncian en la boca abierta sin obstrucción de la lengua, los labios o los dientes.");
     System.out.println();
     System.out.println("* ¿Cuáles son las vocales?");
     System.out.println("Son cinco: A , E , I , O , U");
      System.out.println("-----------------------------------------------------------------");}

      public static void Vocales(int preprimaria){
     if (preprimaria==3){
     Preprimaria.Contenido3("");
     }}

     //Opción 4:
     public static void Contenido4(String texto){
      System.out.println("-----------------------------------------------------------------");
      System.out.println("CONSONANTES");
     System.out.println("* ¿Qué son las consonantes?");
     System.out.println("Son los sonidos producidos con la boca semicerrada, y produce una interrupción total o parcial del flujo de aire, combinando movimientos específicos de lengua, labios y dientes frontales.");
     System.out.println();
     System.out.println("* ¿Cuáles son las consonantes?");
     System.out.println("Son 22: B , C , D , F , G , H , J , K , L , M , N , Ñ , P , Q , R , S , T , V , W , X , Z e Y.");
      System.out.println("-----------------------------------------------------------------");}

     public static void Consonantes (int preprimaria) {
      if (preprimaria == 4) {
       Preprimaria.Contenido4("");
      }if (preprimaria>4){
       System.out.println();
       System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
       System.out.println("Error, verifica el número que colocaste e intentalo de nuevo.");
       System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
      }}
}
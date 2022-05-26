public class Primaria {
    //ESTRUCTURA PARA LA CATEGORÍA DE PRIMARIA:
    public static String primaria[] = {
            "Definición de los tipos de letras.",
            "Colores primarios.",
            "Colores secundarios",
            "Colores terciarios",
            "Abecedario completo",
            "Pronunciación del alfabeto."
    };

    public static void Temas(String data) {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("En la categoría de Primaria te brindamos los siguientes temas:");
        for (int i = 0; i <= 5; i++) {
            System.out.println("[" + i + "] " + Primaria.primaria[i]);
        }}

    public static void General(int opción) {
        if (opción == 1) {
            Primaria.Temas("");
        }}

    //Opción O:
    public static void Contenido0(String texto) {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("DEFINICIÓN DE LOS TIPOS DE LETRAS:");
        System.out.println("* ¿Qué es un tipo de letra?");
        System.out.println("Es el texto que conforma un factor informativo, pero al mismo tiempo estético y funcional.");
        System.out.println();
        System.out.println("* Tipos de letras:");
        System.out.println("1. Letra mayúscula: Este tipo se representa más grande con relación a una minúscula, usualmente escrita de manera distinta.");
        System.out.println("2. Letra minúscula: Esta clase suele ser la más usual de las letras, o la que se utiliza para palabras genéricas comunes. En distintos alfabetos, la minúscula es la" +
                "ortografía que, por contrario a la mayúscula, posee un tamaño menor y un estilo distinto.");
        System.out.println("3. Letra acentuada: La tilde o acento gráfico es un signo que se coloca sobre la letra, en el español.");
        System.out.println("-----------------------------------------------------------------");}

        public static void DefiniciondelosTiposdeLetras(int primaria) {
        if (primaria == 0) {
            Primaria.Contenido0("");
        }}

    //Opción 1:
    public static void Contenido1(String texto) {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("COLORES PRIMARIOS:");
        System.out.println("* ¿Qué son los colores primarios?");
        System.out.println("Son los colores que representan a los colores básicos y no pueden ser generado con la combinación de otros colores.");
        System.out.println();
        System.out.println("* ¿Cuáles son los colores primarios?");
        System.out.println("Son tres: rojo, amarillo y azul.");
        System.out.println("-----------------------------------------------------------------");}

        public static void ColoresPrimarios(int primaria) {
        if (primaria == 1) {
            Primaria.Contenido1("");
        }}

    //Opción 2:
    public static void Contenido2(String texto) {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("COLORES SECUNDARIOS:");
        System.out.println("* ¿Qué son los colores secundarios?");
        System.out.println("Son los colores que surgen al mezclar dos colores primarios.");
        System.out.println();
        System.out.println("* ¿Cuáles son los colores secundarios?");
        System.out.println("Son tres: anaranjado, verde y morado.");
        System.out.println("-----------------------------------------------------------------");}

        public static void ColoresSecundarios(int primaria) {
        if (primaria == 2) {
            Primaria.Contenido2("");
        }}

    //Opción 3:
    public static void Contenido3(String texto) {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("COLORES TERCIARIOS:");
        System.out.println("* ¿Qué son los colores terciarios?");
        System.out.println("Son los colores que se obtienen mezclando un color secundario y un primario.");
        System.out.println();
        System.out.println("* ¿Cuáles son los colores terciarios?");
        System.out.println("Los principales son: Amarillo-anaranjado, Rojo-anaranjado, Rojo-violáceo, Azul-violáceo, Azul-verdoso, Amarillo-Verdoso.");
        System.out.println("-----------------------------------------------------------------");}

        public static void ColoresTerciarios(int primaria) {
        if (primaria == 3) {
            Primaria.Contenido3("");
        }}

    //Opción 4:
    public static void Contenido4(String texto) {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("ABECEDARIO COMPLETO:");
        System.out.println("* ¿Qué es el abecedario?");
        System.out.println("Es una representación estructurada de las letras que conforman un idioma. Se le conoce como abecedario o bien como alfabeto.");
        System.out.println();
        System.out.println("* ¿Cuántas letras contiene el abecedario?");
        System.out.println("27 letras.");
        System.out.println();
        System.out.println("* Abecedario Completo:");
        System.out.println("A , B , C , D , E , F , G , H , I , J , K , L , M , N , Ñ , O , P , Q , R , S , T , U , V , W , X , Y , Z.");
        System.out.println("-----------------------------------------------------------------");}

        public static void AbecedarioCompleto(int primaria) {
        if (primaria == 4) {
            Primaria.Contenido4("");
        }}

    //Opción 5:
    public static void Contenido5(String texto) {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("PRONUNCIACIÓN DEL ALFABETO.");
        System.out.println("* Podras observar de primero la letra y luego la pronciación.");
        System.out.println("| A - a | B - be | C - se/ce | D - de | E - e | F - efe | G - ge/he | H - hache | I - i | J - hota/jota | K - ka | L - ele | M - eme | N - ene |" +
                "Ñ - eñe | ");
        System.out.println(" | O - o | P - pe | Q - cu | R - erre | S - ese | T - te | U - u | V - uve | W - doble uve | X - equis | Y - ye | Z - zeta | ");
        System.out.println();
        System.out.println("* Dato interesante: ¿Te diste cuenta que las vocales se pronuncian y escriben igual?.");
        System.out.println("-----------------------------------------------------------------");}

        public static void PronunciaciondelAlfabeto (int primaria){
            if (primaria == 5) {
                Primaria.Contenido5("");
            }if(primaria>5){
                System.out.println();
                System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                System.out.println("Error, verifica el número que colocaste e intentalo de nuevo.");
                System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
            }}
}
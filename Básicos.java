public class Básicos {
    //ESTRUCTURA PARA LA CATEGORÍA DE BÁSICOS:
    public static String básicos[] = {
            "Abecedario completo.",
            "Colores por inicial de letra.",
            "Definición de las principales tipografías de letras.",
            "Ejemplo de los colores en la naturaleza.",
            "Historia de las letras.",
            "Propiedades del color."
    };

    public static void Temas(String data) {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("En la categoría de Básicos te brindamos los siguientes temas:");
        for (int i = 0; i <= 5; i++) {
            System.out.println("[" + i + "] " + Básicos.básicos[i]);
        }}

    public static void General(int opción) {
        if (opción == 2) {
            Básicos.Temas("");
        }}

    //Opción 0:
    public static void Contenido0(String texto) {
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

        public static void AbecedarioCompleto(int básicos) {
        if (básicos == 0) {
            Básicos.Contenido0("");
        }}

    //Opción 1:
    public static void Contenido1(String texto) {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("COLORES POR INICIAL DE LETRA:");
        System.out.println("* A: Agua, Albaricoque, Almendra, Amaranto, Amarillo, Amatista, Ámbar, Anaranjado, Avellana, Azabache y Azul.");
        System.out.println("* B: Beige, Bermejo, Blanco y Bronce.");
        System.out.println("* C: Café, Canela, Caqui, Caramelo, Carbón, Carmesí, Carmín, Carne, Castaño, Celeste, Cereza, Champán, Chocolate, Cian, Ciruela, Cobre, Coral y Crema.");
        System.out.println("* D: Damasco, Dorado y Durazno.");
        System.out.println("* E: Esmeralda.");
        System.out.println("* F: Frambuesa y Fucsia.");
        System.out.println("* G: Grana, Gris y Guinda.");
        System.out.println("* H: Hueso y Humo.");
        System.out.println("* I: Índigo.");
        System.out.println("* J: Jazmín y Jade.");
        System.out.println("* K: Kaki y Kiwi.");
        System.out.println("* L: Lavanda, Lila y Lima.");
        System.out.println("* M: Magenta, Malva, Mamey, Marfil, Marrón, Melocotón, Melón, Menta, Miel y Mostaza.");
        System.out.println("* N: Naranja, Negro y Níquel.");
        System.out.println("* O: Ocre, Oro y Oliva.");
        System.out.println("* P: Pardo, Pistacho, Plata, Platino, Plomo y Púrpura.");
        System.out.println("* Q: Quermes y Quercitrón.");
        System.out.println("* R: Rojo, Rosa y Rubí.");
        System.out.println("* S: Salmón.");
        System.out.println("* T: Turquesa y Tomate.");
        System.out.println("* U: Uva y Ultramar.");
        System.out.println("* V: Vainilla, Verde, Vinotinto y Violeta.");
        System.out.println("* W: Wisteria, Wasabí y Wengué.");
        System.out.println("* X: Xanadú y Xántico.");
        System.out.println("* Y: Yema y Yeso.");
        System.out.println("* Z: Zafiro, Zanahoria y Zinc.");
        System.out.println("-----------------------------------------------------------------");}

        public static void ColoresporInicialdeLetra(int básicos) {
        if (básicos == 1) {
            Básicos.Contenido1("");
        }}

    //Opción 2:
    public static void Contenido2(String texto) {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("DEFINICIÓN DE LAS PRINCIPALES TIPOGRAFÍAS DE LETRAS:");
        System.out.println("* ¿Qué es la tipografía?");
        System.out.println("Son los estilos de escritura.");
        System.out.println();
        System.out.println("* Tipografías principales:");
        System.out.println("1. Letra capital: Es un estilo de escritura que aparece al inicio de la obra, de un capítulo o de un párrafo y que tiene un tamaño mayor que las del resto del texto.");
        System.out.println("2. Letra uncial: Es un estilo de escritura en el que todo el texto se escribe en letras mayúsculas.");
        System.out.println("3. Letra cursiva: Es un estilo de escritura cuyas características más comunes son la inclinación de sus letras y, aunque no necesariamente, la concatenación de las mismas dentro de cada palabra.");
        System.out.println("4. Letra magistral: Escritura bastarda grande hecha con todas las reglas caligráficas.");
        System.out.println("5. Letra gótica: Es un estilo de letra de fácil reconocimiento gracias al uso de mayúsculas, las cuales resaltan en los textos.");
        System.out.println();
        System.out.println("(Algunos derivados de las antemencionadas, como la con serif, sans serif, latina, cursiva inglesa, script, Arial, Times New Roman, la letra estilo Franckfurt, etc.).");
        System.out.println("-----------------------------------------------------------------");}

        public static void Tipografías(int básicos) {
        if (básicos == 2) {
            Básicos.Contenido2("");
        }}

    //Opción 3:
    public static void Contenido3(String texto) {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("EJEMPLO DE LOS COLORES EN LA NATURALEZA:");
        System.out.println("- Color rojo de una rosa.");
        System.out.println("- El amarillo del girasol.");
        System.out.println("- Violeta de unas violetas.");
        System.out.println("- Fucsia en unas fucsias.");
        System.out.println("- Color magenta de un cardo.");
        System.out.println("- Naranja de la fruta homónima naranja");
        System.out.println("- Color lima en limas o limones");
        System.out.println("- El color de la mora es un referente del morado");
        System.out.println("- Color oliva de unas olivas");
        System.out.println("- Granate dentro de una granada");
        System.out.println("- El azul de unas gitanillas");
        System.out.println("- Color rosa de una rosa");
        System.out.println("- El blanco de los cartuchos");
        System.out.println("- Rojo vivo de una anémona");
        System.out.println("- Color lavanda de una lavanda");
        System.out.println("- Colores turquesa y plata en la turquesa y la plata");
        System.out.println("- Color ámbar del ámbar");
        System.out.println("- El granate de un granate");
        System.out.println("- Las esmeraldas dan varios tonos de esmeralda");
        System.out.println("- Color café del grano y la taza de café");
        System.out.println("- Verde vivo de un loro macho");
        System.out.println("- Los tonos del cielo son un referente para el celeste");
        System.out.println("- El mar tiene una tonalidad similar al azul ultramar");
        System.out.println("- El mar en las Bahamas es cian, turquesa y esmeralda");
        System.out.println("-----------------------------------------------------------------");}

        public static void Naturaleza(int básicos) {
        if (básicos == 3) {
            Básicos.Contenido3("");
        }}

    //Opción 4:
    public static void Contenido4(String texto) {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("HISTORIA DE LAS LETRAS:");
        System.out.println("* La creación de las letras se vio precedida por la escritura semítica occidental, que apareció en Canán hacia el año 1000 a. C. Se estima que hay antecedentes en la escritura proto-canita, que se remonta hacia el 1800 a. C. En última instancia, todos los alfabetos tienen sus orígenes en este sistema.");
        System.out.println("Se da el nombre de letra a cada uno de los sonidos o articulaciones que contribuyen a formar una lengua, y también a los signos o figuras con que dichos sonidos se representan.Según esta definición, debemos considerar en toda letra su forma o figura (escritura) y"+
                "su sonido (pronunciación). A este sonido, es decir a la letra hablada o pronunciada, se le llama también fonema elemental, la cual se define como la voz con que se modula o articula un sonido simple y determinado.");
        System.out.println("-----------------------------------------------------------------");}

        public static void HistoriasdelasLetras(int básicos) {
        if (básicos == 4) {
            Básicos.Contenido4("");
        }}

    //Opción 5:
    public static void Contenido5(String texto) {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("PROPIEDADES DEL COLOR: ");
        System.out.println("* Existen tres propiedades del color, estas son: ");
        System.out.println("1. Matiz: Es el tono o tonalidad, ubica la posición de un color dentro del círculo cromático, por lo que depende de la o las longitudes de onda.");
        System.out.println("2. Saturación: colorido o pureza, depende de la distancia entre determinado color y la escala de grises; con la mayor saturación un color será más vivo, puro o colorido.");
        System.out.println("3. Brillo: que según el modelo depende de la luminosidad o el valor, se da de acuerdo a la claridad u oscuridad del color, en donde el mínimo valor (cero) corresponde al negro y el máximo depende si se trata del modelo HSL (luminosidad) o HSV (valor), como se ve en la imagen.");
        System.out.println("-----------------------------------------------------------------");}

        public static void PropiedadesdelColor(int básicos) {
        if (básicos == 5) {
            Básicos.Contenido5("");
        }if(básicos>5){
                System.out.println();
                System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                System.out.println("Error, verifica el número que colocaste e intentalo de nuevo.");
                System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        }}
}



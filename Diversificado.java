public class Diversificado {
    //ESTRUCTURA PARA LA CATEGORÍA DE DIVERSIFICADO:
    public static String diversificado[] = {
            "Colores por inicial de letra.",
            "Ejemplo de los colores en la naturaleza.",
            "Historia de las letras.",
            "Expresiones relacionadas con la letra.",
            "Teoría de Wilhem Ostwald (Color).",
            "Efecto de los colores en los estados de ánimo de las personas.",
            "Lingüística histórica del color.",
            "Los signos alfabéticos que integran la familia tipográfica.",
            "Dígrafos del español."
    };

    public static void Temas(String data) {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("En la categoría de Diversificado te brindamos los siguientes temas:");
        for (int i = 0; i <= 8; i++) {
            System.out.println("[" + i + "] " + Diversificado.diversificado[i]);
        }}

    public static void General(int opción) {
        if (opción == 3) {
            Diversificado.Temas("");
        }}

    //Opción 0:
    public static void Contenido0(String texto) {
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

        public static void ColoresporInicialdeLetra(int diversificado) {
        if (diversificado == 0) {
            Diversificado.Contenido0("");
        }}

    //Opción 1:
    public static void Contenido1(String texto) {
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

        public static void Naturaleza(int diversificado) {
        if (diversificado == 1) {
            Diversificado.Contenido1("");
        }}

    //Opción 2:
    public static void Contenido2(String texto) {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("HISTORIA DE LAS LETRAS:");
        System.out.println("* La creación de las letras se vio precedida por la escritura semítica occidental, que apareció en Canán hacia el año 1000 a. C. Se estima que hay antecedentes en la escritura proto-canita, que se remonta hacia el 1800 a. C. En última instancia, todos los alfabetos tienen sus orígenes en este sistema.");
        System.out.println("Se da el nombre de letra a cada uno de los sonidos o articulaciones que contribuyen a formar una lengua, y también a los signos o figuras con que dichos sonidos se representan.Según esta definición, debemos considerar en toda letra su forma o figura (escritura) y"+
                "su sonido (pronunciación). A este sonido, es decir a la letra hablada o pronunciada, se le llama también fonema elemental, la cual se define como la voz con que se modula o articula un sonido simple y determinado.");
        System.out.println("-----------------------------------------------------------------");}

        public static void HistoriasdelasLetras(int diversificado) {
        if (diversificado == 2) {
            Diversificado.Contenido2("");
        }}

    //Opción 3:
    public static void Contenido3(String texto) {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("EXPRESIONES RELACIONADAS CON LA LETRA:");
        System.out.println("- Al pie de la letra: Realizar algo siguiendo escrupulosamente las instrucciones.");
        System.out.println("- Despacito y con buena letra: Se refiere a que hay que proceder con extremo cuidado y precaución.");
        System.out.println("- La letra con sangre entra: Da a entender que no se ha de escatimar esfuerzos a la hora de aprender, tal frase española es anacrónica y tiene rasgos sádicos, ya que sugiere que la educación (la letra) se aprende (queda grabada en la memoria) mediante apremio debido al temor a los castigos.");
        System.out.println("- Ser una persona de letras: Ser una persona instruida o de conocimientos.");
        System.out.println("-----------------------------------------------------------------");}

        public static void ExpresionesLetra(int diversificado) {
        if (diversificado == 3) {
            Diversificado.Contenido3("");
        }}

    //Opción 4:
    public static void Contenido4(String texto) {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("TEORÍA DE WILHEM OSTWALD (COLOR):");
        System.out.println("* La teoría del color propuesta por el químico y filósofo alemán Wilhelm Ostwald consta de cuatro sensaciones cromáticas elementales (amarillo, rojo, azul y verde) y dos sensaciones acromáticas intermedias.");
        System.out.println("Un espacio de color define un modelo de composición del color. Por lo general un espacio de color lo define una base de N vectores (por ejemplo, el espacio RGB lo forman 3 vectores: rojo, verde y azul), cuya combinación lineal genera todo el espacio de color. Los espacios de color más generales intentan englobar " +
                "la mayor cantidad posible de los colores visibles por el ojo humano, aunque existen espacios de color que intentan aislar tan solo un subconjunto de ellos.");
        System.out.println("- Existen espacios o modelos de color de:");
        System.out.println("Una dimensión: escala de grises, escala Jet, etc.");
        System.out.println("Dos dimensiones: sub-espacio rg, sub-espacio xy, etc.");
        System.out.println("Tres dimensiones: espacio RGB, HSV, YCbCr, YUV, YI'Q', etc.");
        System.out.println("Cuatro dimensiones: espacio CMYK.");
        System.out.println("De los cuales, los espacios de color de tres dimensiones son los más extendidos y los más utilizados. Entonces, un color se especifica usando tres coordenadas, o atributos, que representan su posición dentro de un espacio de color específico. Estas coordenadas no nos dicen cuál es el color, sino que muestran dónde" +
                " se encuentra un color dentro de un espacio de color en particular.");
        System.out.println("-----------------------------------------------------------------");}

        public static void TeoríadelColor (int diversificado) {
        if (diversificado == 4) {
            Diversificado.Contenido4("");
        }}

    //Opción 5:
    public static void Contenido5(String texto) {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("EFECTO DE LOS COLORES EN LOS ESTADOS DE ÁNIMO DE LAS PERSONAS:");
        System.out.println("* El uso de ciertos colores impacta gradualmente en el estado de ánimo de las personas, muchos de ellos son utilizados con esa intención en lugares específicos, por ejemplo en los restaurantes es muy común que se utilice decoración de color naranja ya que abre el apetito, en los hospitales se usa colores neutros para " +
                "dar tranquilidad a los pacientes, y para las entrevistas de trabajo es recomendable llevar ropa de colores oscuros, ya que da la impresión de ser una persona responsable y dedicada; así como los colores en la ropa nos pueden favorecer y hacer lucir el rostro más radiantes o más opacos; estos son algunos ejemplos de la relación " +
                "entre los colores y las emociones:");
        System.out.println("- Colores análogos: Se utilizan de manera adjunta y producen una sensación de armonía.");
        System.out.println("- Colores complementarios: Cuando son usados producen un efecto de agresividad, provocado por el máximo contraste al utilizarlos juntos.");
        System.out.println("- Colores monocromáticos: Al utilizarlos producen una sensación de unidad y estabilidad se pueden usar con diferente intensidad (más claro o más oscuro) esto va a depender de la luz.");
        System.out.println("-----------------------------------------------------------------");}

        public static void EfectodelosColores (int diversificado) {
            if (diversificado == 5) {
                Diversificado.Contenido5("");
            }}

    //Opción 6:
    public static void Contenido6(String texto) {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("LINGÜISTICA HISTÓRICA DEL COLOR:");
        System.out.println("* No existe una homología completa entre las distintas lenguas que cubra completamente la paleta del color. Algunas lenguas ni siquiera poseían el concepto. Platón consideraba que existían " +
                "cuatro colores básicos: el blanco, el negro, el rojo y el brillante, algo que para nosotros no es ni siquiera un color, y definió también al color como: «una emanación de las figuras, proporcionado a la " +
                "vista y, por tanto, perceptible»; William Ewart Gladstone (1809-1898), quien no solo fue un gran político, sino un experto helenista, estudió el color en Homero (quien describía el mar como vino oscuro " +
                "y el cielo como bronce) y contó que los colores más citados en sus obras eran el negro (200 veces) y el blanco (100); el rojo solo 15 y el verde y el amarillo menos de diez. No se mencionaban nada ni el" +
                " azul, ni el índigo, ni el añil. Y no había tampoco mención alguna del color azul en el resto de los autores griegos.");
        System.out.println();
        System.out.println("El filósofo y lingüista alemán Lazarus Geiger encontró que tampoco en muchas otras civilizaciones antiguas se conocía el color azul: en el Corán, en antiguas historias chinas, en la versión" +
                " antigua de la Biblia hebrea, en las sagas islandesas y hasta en los Vedas indios no aparece el color del cielo. La única cultura antigua que sabía representar el color azul fue la egipcia, e incluso" +
                " así les costó mucho fabricar el pigmento de forma sintética, pues no se encuentra fácilmente en la naturaleza (por ejemplo, no hay flores azules: las primeras las fabricaron los humanos).");
        System.out.println();
        System.out.println("Guy Deutscher descubrió con diversos experimentos que, en general, el color del cielo es el último que suelen aprender los niños. Para los pueblos antiguos el cielo era blanco, y el mar," +
                " negro. Por otra parte, las denominaciones de los colores antiguos fue evolucionando con la lengua y, por ejemplo, el color negro entre los hebreos (kajol) pasó a significar azul con el tiempo, y lo " +
                "mismo ocurrió con el color kuanos de los griegos, que en Homero significa negro y en la actualidad azul.");
        System.out.println();
        System.out.println("Esta noción de que los conceptos y el lenguaje limitan la percepción cognitiva se llama relativismo lingüístico, y describe las maneras en que diferentes culturas pueden tener dificultades" +
                " para recordar o retener información sobre los objetos o conceptos para los que carecen de identificación de idioma. Los inuit poseen, por ejemplo, 50 formas de decir blanco. Y, aunque la tribu Himba " +
                "de Namibia no posee palabra alguna para el azul, si saben distinguir matices del color verde que a nosotros nos cuesta notar. Existen también diferencias biológicas entre los sexos humanos en cuanto" +
                " a la percepción del color: el naranja puede parecer más rojizo para los hombres que las mujeres, y el verde siempre aparece más brillante para las mujeres que para los hombres, que siempre ven un " +
                "tono más amarillento, entre otras disimilitudes.");
        System.out.println("-----------------------------------------------------------------");}

        public static void LingüisticadelColor (int diversificado) {
            if (diversificado == 6) {
                Diversificado.Contenido6("");
            }}

    //Opción 7:
    public static void Contenido7(String texto) {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("LOS SIGNOS ALFABÉTICOS QUE INTEGRAN LA FAMILIA TIPOGRÁFICA:");
        System.out.println("* Los signos alfabéticos que componen la familia tipográfica son letras mayúsculas, mayúsculas tildadas, minúsculas y minúsculas tildadas; mientras que los no alfabéticos son los números, los signos de puntuación y los signos comerciales.");
        System.out.println("-----------------------------------------------------------------");}

        public static void SignosAlfabeticos (int diversificado) {
            if (diversificado == 7) {
                Diversificado.Contenido7("");
            }}

    //Opción 8:
    public static void Contenido8(String texto) {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("DÍGRAFOS DEL ESPAÑOL:");
        System.out.println("* ¿Qué son los dígrafos?");
        System.out.println("Son conjuntos de dos letras cuya representación es un solo segmento acústico o uno doble con articulación africada.");
        System.out.println();
        System.out.println("* ¿Cuantos dígrafos existen?");
        System.out.println("Según la Ortografía de 2010, el español consta de 5 dígrafos.");
        System.out.println();
        System.out.println("* Dígrafos y su pronunciación.");
        System.out.println("Podras observar de primero el dígrafo y luego la pronciación.");
        System.out.println("CH - che");
        System.out.println("GU - ge u");
        System.out.println("LL - elle/doble ele");
        System.out.println("QU - cu");
        System.out.println("RR - doble erre");
        System.out.println("-----------------------------------------------------------------");}

        public static void DigrafosdelEspañol (int diversificado) {
            if (diversificado == 8) {
                Diversificado.Contenido8("");
            }if (diversificado>8){
                System.out.println();
                System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                System.out.println("Error, verifica el número que colocaste e intentalo de nuevo.");
                System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
            }}
    }



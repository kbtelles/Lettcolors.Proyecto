public class Universidad {
    //ESTRUCTURA PARA LA CATEGORÍA DE UNIVERSIDAD:
    public static String universidad[]={
            "Colores por inicial de letra.",
            "Ejemplo de los colores en la naturaleza.",
            "Efecto de los colores en los estados de ánimo de las personas.",
            "Lingüística histórica del color.",
            "Colores neutros o acromáticos.",
            "Colores elementales.",
            "Definición de serie de letras.",
            "La reflexión en las superficies: el color de los objetos.",
            "Códigos de números a letras.",
            "Consejos para tener letra bonita."
    };

    public static void Temas(String data) {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("En la categoría de Universidad te brindamos los siguientes temas:");
        for (int i = 0; i <= 9; i++) {
            System.out.println("[" + i + "] " + Universidad.universidad[i]);
        }}

    public static void General(int opción) {
        if (opción == 4) {
            Universidad.Temas("");
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

    public static void ColoresporInicialdeLetra(int universidad) {
        if (universidad == 0) {
            Universidad.Contenido0("");
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

    public static void Naturaleza(int universidad) {
        if (universidad == 1) {
            Universidad.Contenido1("");
        }}

    //Opción 2:
    public static void Contenido2(String texto) {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("EFECTO DE LOS COLORES EN LOS ESTADOS DE ÁNIMO DE LAS PERSONAS:");
        System.out.println("* El uso de ciertos colores impacta gradualmente en el estado de ánimo de las personas, muchos de ellos son utilizados con esa intención en lugares específicos, por ejemplo en los restaurantes es muy común que se utilice decoración de color naranja ya que abre el apetito, en los hospitales se usa colores neutros para " +
                "dar tranquilidad a los pacientes, y para las entrevistas de trabajo es recomendable llevar ropa de colores oscuros, ya que da la impresión de ser una persona responsable y dedicada; así como los colores en la ropa nos pueden favorecer y hacer lucir el rostro más radiantes o más opacos; estos son algunos ejemplos de la relación " +
                "entre los colores y las emociones:");
        System.out.println("- Colores análogos: Se utilizan de manera adjunta y producen una sensación de armonía.");
        System.out.println("- Colores complementarios: Cuando son usados producen un efecto de agresividad, provocado por el máximo contraste al utilizarlos juntos.");
        System.out.println("- Colores monocromáticos: Al utilizarlos producen una sensación de unidad y estabilidad se pueden usar con diferente intensidad (más claro o más oscuro) esto va a depender de la luz.");
        System.out.println("-----------------------------------------------------------------");}

    public static void EfectodelosColores (int universidad) {
        if (universidad == 2) {
            Universidad.Contenido2("");
        }}

    //Opción 3:
    public static void Contenido3(String texto) {
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

    public static void LingüisticadelColor (int universidad) {
        if (universidad == 3) {
            Universidad.Contenido3("");
        }}

    //Opción 4:
    public static void Contenido4(String texto) {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("COLORES NEUTROS O ACROMÁTICOS:");
        System.out.println("* Los principales colores del círculo cromático y sus derivados oscuros (hacia el negro),agrisados (semisaturados o hacia el gris) y claros (hacia el blanco) son:");
        System.out.println();
        System.out.println("- Colores vivos del círculo cromático: rojo, rojo naranja, naranja, ámbar, amarillo, lima o verde limón, verde puro, verde cian, cian o acua, cerúleo o azur, azul, violeta, magenta y fucsia.");
        System.out.println();
        System.out.println("- Oscuros: granate, caoba o rojo indio, marrón o pardo, marrón dorado, oliva, palta o aguacate, verde estándar, esmeralda o viridián, cerceta o azul verde, añil o cobalto, azul marino, azul púrpura, púrpura o morado y vino.");
        System.out.println();
        System.out.println("- Agrisados: lacre, cobre, canela u ocre, dorado, chartreuse, verde manzana, verde bosque, verde mar, turquesa, azul acero, zafiro, amatista, purpúreo o murasaki y fandango o rojo violeta.");
        System.out.println();
        System.out.println("- Claros: coral, salmón, melón o durazno, crema, maíz, té verde, verde claro, menta, aguamarina, celeste, bígaro o aciano, lavanda o lila, malva y rosa o rosado.");
        System.out.println("-----------------------------------------------------------------");}

        public static void ColoresNeuAcro (int universidad) {
            if (universidad == 4) {
                Universidad.Contenido4("");
            }}

    //Opción 5:
    public static void Contenido5(String texto) {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("COLORES ELEMENTALES:");
        System.out.println("* Los ocho colores elementales corresponden a las ocho posibilidades extremas de percepción del órgano de la vista. Las posibilidades últimas de sensibilidad de color que es capaz de captar el ojo humano. Estos resultan " +
                "de las combinaciones que pueden realizar los tres tipos de conos del ojo, o lo que es lo mismo las posibilidades que ofrecen de combinarse los tres primarios. Estas ocho posibilidades son los tres colores primarios, los tres " +
                "secundarios que resultan de la combinación de dos primarios, más los dos colores acromáticos, el blanco que es percibido como la combinación de los tres primarios (síntesis aditiva: colores luz) y el negro es la ausencia de los tres.");
        System.out.println("-----------------------------------------------------------------");}

        public static void ColoresElementales (int universidad) {
            if (universidad == 5) {
                Universidad.Contenido5("");
            }}

    //Opción 6:
    public static void Contenido6(String texto) {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("DEFINICIÓN DE SERIE DE LETRAS:");
        System.out.println("* Se conoce como una serie al conjunto de diversas letras, trazado en mayor parte por una misma casa o por un mismo diseñador, en el cual se distinguen en ciertas características clasificables: inclinación, peso, espaciado y" +
                " proporción. Una nota resultante de este concepto es la expresión familia tipográfica, en la cual se pueden ordenar los tipos según sus características principales, con autonomía de su pertenencia a una serie.");
        System.out.println("-----------------------------------------------------------------");}

        public static void DefiniciondeseriesdeLetras (int universidad) {
            if (universidad == 6) {
                Universidad.Contenido6("");
            }}

    //Opción 7:
    public static void Contenido7(String texto) {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("LA REFLEXIÓN EN LAS SUPERFICIES: EL COLOR DE LOS OBJETOS:");
        System.out.println("* Cuando la luz incide sobre un objeto, su superficie absorbe ciertas longitudes de onda y refleja otras. Solo las longitudes de onda reflejadas podrán ser vistas por el ojo y por tanto en el cerebro solo se percibirán esos colores." +
                " Es un proceso diferente a luz natural que tiene todas las longitudes de onda, allí todo el proceso nada más tiene que ver con luz, ahora en los colores que percibimos en un objeto hay que tener en cuenta también el objeto en si, que tiene" +
                " capacidad de absorber ciertas longitudes de onda y reflejar las demás.");
        System.out.println();
        System.out.println("Consideremos una manzana \"roja\". Cuando es vista bajo una luz blanca, parece roja. Pero esto no significa que emita luz roja, que sería el caso una síntesis aditiva. Si lo hiciese, seríamos capaces de verla en la oscuridad." +
                " En lugar de eso, absorbe algunas de las longitudes de onda que componen la luz blanca, reflejando solo aquellas que el humano ve como rojas. Los humanos ven la manzana roja debido al funcionamiento particular de su ojo y a la " +
                "interpretación que hace el cerebro de la información que le llega del ojo.");
        System.out.println("-----------------------------------------------------------------");}

    public static void ReflexionColor (int universidad) {
            if (universidad == 7) {
                Universidad.Contenido7("");
            }}

    //Opción 8:
    public static void Contenido8(String texto) {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("CÓDIGOS DE NÚMEROS A LETRAS:");
        System.out.println("* El cifrado por rango alfabético , a veces llamado código alfanumérico/alfabeto numerado, consiste en reemplazar cada letra por su posición (su rango) en el alfabeto.Por ejemplo A=1, B=2, Z=26, de ahí su otro nombre A1Z26.");
        System.out.println();
        System.out.println("* Códigos de números a letras:");
        System.out.println("A - 1");
        System.out.println("B - 2");
        System.out.println("C - 3");
        System.out.println("D - 4 ");
        System.out.println("E - 5");
        System.out.println("F - 6");
        System.out.println("G - 7");
        System.out.println("H - 8");
        System.out.println("I - 9");
        System.out.println("J - 10 ");
        System.out.println("K - 11");
        System.out.println("L - 12");
        System.out.println("M - 13 ");
        System.out.println("N - 14");
        System.out.println("O - 15");
        System.out.println("P - 16");
        System.out.println("Q - 17");
        System.out.println("R - 18");
        System.out.println("S - 19");
        System.out.println("T - 20");
        System.out.println("U - 21");
        System.out.println("V - 22 ");
        System.out.println("W - 23");
        System.out.println("X - 24");
        System.out.println("Y - 25");
        System.out.println("Z - 26");
        System.out.println("-----------------------------------------------------------------");}

    public static void CodigosdeNumerosaLetras (int universidad) {
            if (universidad == 8) {
                Universidad.Contenido8("");
            }}

    //Opción 9:
    public static void Contenido9(String texto) {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("CONSEJOS PARA TENER LETRA BONITA:");
        System.out.println("* Algunos consejos para mejorar tu letra y conseguir una letra bonita:");
        System.out.println("- Cuida la postura al sentarte.");
        System.out.println("- Atento al papel.");
        System.out.println("- Elige el bolígrafo o el lápiz adecuado (y sujétalo bien).");
        System.out.println("- Practica trazos con plantillas.");
        System.out.println("- Tómate tu tiempo, no te presiones demasiado.");
        System.out.println("- Sé creativo.");
        System.out.println("- Prueba los métodos clásicos.");
        System.out.println("- Experimenta con aplicaciones para tablet y móvil.");
        System.out.println("-----------------------------------------------------------------");}


    public static void ConsejosLetra (int universidad) {
            if (universidad == 9) {
                Universidad.Contenido9("");
            }if (universidad>9){
            System.out.println();
            System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
            System.out.println("Error, verifica el número que colocaste e intentalo de nuevo.");
            System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        }}
    }
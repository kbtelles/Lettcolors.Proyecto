import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /**EVALUACIÓN - KEILY BELÉN TELLES PÉREZ - IV bach en Ciencias y Letras - Prof:Jossue Emmanuel Fuentes*/

        //Introducción
        Introduccion.MensajePrincipal();

        //Opciones
        Opciones.mostrarDatos("");

        //Elección opciones
        System.out.println("                ");
        Scanner input_opcion = new Scanner(System.in);
        System.out.print("Tú opción es:  ");
        int opción = input_opcion.nextInt();

        //Pre-primaria
        int regresar = 0;
        if (opción == 0) {
            System.out.println("Hey, recuerda que estos temas tienen relación con la categoría de Pre-primaria.");
        do {
            System.out.println("                ");
            Scanner input_preprimaria = new Scanner(System.in);
            Preprimaria.General(opción);
            System.out.println();
            System.out.print("Selecciona la opción del tema en el que desees indagar:  ");
            int preprimaria = input_preprimaria.nextInt();

                //Preprimaria(0)
                Preprimaria.ColoresPrimarios(preprimaria);

                //Preprimaria(1)
                Preprimaria.ColoresSecundarios(preprimaria);

                //Preprimaria(2)
                Preprimaria.ColoresTerciarios(preprimaria);

                //Preprimaria(3)
                Preprimaria.Vocales(preprimaria);

                //Preprimaria(4)
                Preprimaria.Consonantes(preprimaria);
                regresar++;
        }while (regresar<=5);{
            System.out.println("                                                                           ");
            System.out.println("Hey, vuelve a reiniciar el programa para poder seguir interactuando con el.");
        }}


        //Primaria
        int regresar1 =0;
        if (opción == 1) {
            System.out.println("Hey, recuerda que estos temas tienen relación con la categoría de Primaria.");
        do {
            System.out.println("                ");
            Scanner input_primaria = new Scanner(System.in);
            Primaria.General(opción);
            System.out.println();
            System.out.print("Selecciona la opción del tema en el que desees indagar:  ");
            int primaria = input_primaria.nextInt();

                //Primaria(0)
                Primaria.DefiniciondelosTiposdeLetras(primaria);

                //Primaria(1)
                Primaria.ColoresPrimarios(primaria);

                //Primaria(2)
                Primaria.ColoresSecundarios(primaria);

                //Primaria(3)
                Primaria.ColoresTerciarios(primaria);

                //Primaria(4)
                Primaria.AbecedarioCompleto(primaria);

                //Primaria(5)
                Primaria.PronunciaciondelAlfabeto(primaria);
                regresar1++;
        }while (regresar1<=6);{
            System.out.println("                                                                           ");
            System.out.println("Hey, vuelve a reiniciar el programa para poder seguir interactuando con el.");
        }}


        //Básicos
        int regresar2 =0;
        if (opción == 2) {
            System.out.println("Hey, recuerda que estos temas tienen relación con la categoría de Básicos.");
            do {
                System.out.println("                ");
                Scanner input_basicos = new Scanner(System.in);
                Básicos.General(opción);
                System.out.println();
                System.out.print("Selecciona la opción del tema en el que desees indagar:  ");
                int basicos = input_basicos.nextInt();

                //Básicos(0)
                Básicos.AbecedarioCompleto(basicos);

                //Básicos(1)
                Básicos.ColoresporInicialdeLetra(basicos);

                //Básicos(2)
                Básicos.Tipografías(basicos);

                //Básicos(3)
                Básicos.Naturaleza(basicos);

                //Básicos(4)
                Básicos.HistoriasdelasLetras(basicos);

                //Básicos(5)
                Básicos.PropiedadesdelColor(basicos);
                regresar2++;
            }while (regresar2<=6);{
                System.out.println("                                                                           ");
                System.out.println("Hey, vuelve a reiniciar el programa para poder seguir interactuando con el.");
            }}

        //Diversificado
        int regresar3 =0;
        if (opción == 3) {
            System.out.println("Hey, recuerda que estos temas tienen relación con la categoría de Diversificado.");
            do {
                System.out.println("                ");
                Scanner input_diversificado = new Scanner(System.in);
                Diversificado.General(opción);
                System.out.println();
                System.out.print("Selecciona la opción del tema en el que desees indagar:  ");
                int diversificado = input_diversificado.nextInt();

                //Diversificado(0)
                Diversificado.ColoresporInicialdeLetra(diversificado);

                //Diversificado(1)
                Diversificado.Naturaleza(diversificado);

                //Diversificado(2)
                Diversificado.HistoriasdelasLetras(diversificado);

                //Diversificado(3)
                Diversificado.ExpresionesLetra(diversificado);

                //Diversificado(4)
                Diversificado.TeoríadelColor(diversificado);

                //Diversificado(5)
                Diversificado.EfectodelosColores(diversificado);

                //Diversificado(6)
                Diversificado.LingüisticadelColor(diversificado);

                //Diversificado(7)
                Diversificado.SignosAlfabeticos(diversificado);

                //Diversificado(8)
                Diversificado.DigrafosdelEspañol(diversificado);
                regresar3++;
            }while (regresar3<=9);{
                System.out.println("                                                                           ");
                System.out.println("Hey, vuelve a reiniciar el programa para poder seguir interactuando con el.");
            }}

        //Universidad
        int regresar4 =0;
        if (opción == 4) {
            System.out.println("Hey, recuerda que estos temas tienen relación con la categoría de Universidad.");
            do {
                System.out.println("                ");
                Scanner input_universidad = new Scanner(System.in);
                Universidad.General(opción);
                System.out.println();
                System.out.print("Selecciona la opción del tema en el que desees indagar:  ");
                int universidad = input_universidad.nextInt();

                //Universidad(0)
                Universidad.ColoresporInicialdeLetra(universidad);

                //Universidad(1)
                Universidad.Naturaleza(universidad);

                //Universidad(2)
                Universidad.EfectodelosColores(universidad);

                //Universidad(3)
                Universidad.LingüisticadelColor(universidad);

                //Universidad(4)
                Universidad.ColoresNeuAcro(universidad);

                //Universidad(5)
                Universidad.ColoresElementales(universidad);

                //Universidad(6)
                Universidad.DefiniciondeseriesdeLetras(universidad);

                //Universidad(7)
                Universidad.ReflexionColor(universidad);

                //Universidad(8)
                Universidad.CodigosdeNumerosaLetras(universidad);

                //Universidad(9)
                Universidad.ConsejosLetra(universidad);
                regresar4++;
            }while (regresar4<=10);{
                System.out.println("                                                                           ");
                System.out.println("Hey, vuelve a reiniciar el programa para poder seguir interactuando con el.");
            }}

        //Indicación por si ponen un número que no corresponden a las opciones.
        if (opción>4){
            System.out.println();
            System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
            System.out.println("Error, verifica el número que colocaste e intentalo de nuevo.");
            System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
            System.out.println();
        }
    }
}
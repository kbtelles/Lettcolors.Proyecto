public class Opciones {
    //ESTRUCTURA PARA OPCIONES:
    public static String categorias []= {
            "Pre-primaria",
            "Primaria",
            "Básicos",
            "Diversificado",
            "Universidad"
    };

    public static void mostrarDatos (String data){
        System.out.println();
        for (int i =0; i<=4; i++){
            System.out.println("["+i+"] "+ Opciones.categorias [i]);
        }
    }
}

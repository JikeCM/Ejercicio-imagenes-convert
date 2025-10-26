package dam.procesos;

import java.io.IOException;

public class ImagenesJpgPng {
    private static final int IMAGEN_REQUERIDA = 0;
    private static final int IMAGEN_DESEADA = 1;
    private static final String COMANDO_CONVERTIR = "convert";
    private static final String RUTA_IMAGEN = "src/main/resources/";
    public static void main(String[] args) {
        String imagen_origen = args[IMAGEN_REQUERIDA];
        String imagen_destino = args[IMAGEN_DESEADA];
        String imagen_jpg = RUTA_IMAGEN+imagen_origen;
        String imagen_png = RUTA_IMAGEN+imagen_destino;
        ejecutarCoversor(COMANDO_CONVERTIR, imagen_jpg, imagen_png);
    }

    public static void ejecutarCoversor(String COMANDO_CONVERTIR, String imagen_jpg, String imagen_png){
        try{
            String [] comandos = {COMANDO_CONVERTIR,imagen_jpg,imagen_png};
            Process proceso = Runtime.getRuntime().exec(comandos);
            System.out.println("La conversión funcionó correctamente");
            proceso.waitFor();
        } catch(IOException | InterruptedException ex){
            ex.printStackTrace();
        }
    }
}
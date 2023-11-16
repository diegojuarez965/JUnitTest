public class UtilidadParaCadenas {

    public String concatenar(String str1, String str2) {
        if (str1 == null) {
            str1 = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        return str1 + str2;
    }

    public  int obtenerLongitud(String str) {
        if (str == null) {
            return 0;
        }
        return str.length();
    }

    public  String convertirMayusculas(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase();
    }

}

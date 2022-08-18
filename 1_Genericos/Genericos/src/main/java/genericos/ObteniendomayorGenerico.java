package genericos;

public class ObteniendomayorGenerico {
    
    public static void main(String[] args) {
        
        System.out.println("Mayor [1, 4, 7] es:  "+ maximo(1, 4, 7));
        System.out.println("Mayor [hola, holaa, holaaa] es:  "+ maximo("hola", "holaa", "holaaa"));
    }

    // metodo genericos que obtiene 3 genericos por parametros
    public static <T extends Comparable<T>> T maximo(T a, T b, T c){

        T max = a;

        if(b.compareTo(max) > 0){
            max = b;
        }
        if(c.compareTo(max) > 0){
            max = c;
        }
        return max;
    }

}

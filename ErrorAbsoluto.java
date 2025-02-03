/*El error absoluto es la diferencia entre el valor exacto y el valor aproximado de una cantidad. 
Es una medida de cuán lejos está la aproximación del valor real.
Se calcula de la siguiente manera: 
Error absoluto= Valor exacto−Valor aproximado
*/
public class ErrorAbsoluto {
    public static void main(String[] args) {
        double valorExacto = 10.0;
        double valorAproximado = 9.8;
        
        // Cálculo del error absoluto
        double errorAbsoluto = Math.abs(valorExacto - valorAproximado);
        
        System.out.println("Error absoluto: " + errorAbsoluto);
    }
}

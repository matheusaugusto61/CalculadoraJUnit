
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author rafap
 */
public class CalculadoraTest {

    static Calculadora c;

    public CalculadoraTest() {

    }

    @BeforeAll
    public static void setUpClass() {
        c = new Calculadora();
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testeSomar() {
        System.out.println("Testando o método Somar");
        double n1 = 2, n2 = 2, resultadoEsperado, resultadoObtido;
        resultadoEsperado = 4;
        resultadoObtido = c.somar(n1, n2);

        assertEquals(resultadoEsperado, resultadoObtido);
        assertEquals(5, c.somar(3, 2));
        //assertEquals(3,c.somar(3, 2) );
    }

    @Test
    public void testeSubtrair() {
        System.out.println("Testando o método Subtrair");
        assertEquals(1, c.subtrair(3, 2));
    }
    @Test
    public void testeMultiplicar() {
        System.out.println("Testando o método Multiplicar");
        assertEquals(6, c.multiplicar(3, 2));
    }
    @Test
    public void testeMultiplicarNegativos() {
        System.out.println("Testando o método Multiplicar com Números Negativos");
        assertEquals(6, c.multiplicar(-3, -2));
    }
    @Test
    public void testeDividir() {
        System.out.println("Testando o método Dividir");
        assertEquals(3, c.dividir(6, 2));
    }

    public void testaDivisaoporZero() {
        System.out.println("Testando divisao por zero");
        IllegalArgumentException assertThrows = assertThrows(IllegalArgumentException.class, () -> {
            double result = c.dividir(5, 0);
        });
        assertEquals("Divisão por 0 não é permitido!", assertThrows.getMessage());

    }

}
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LogisticaTest {
    Transportador drone;
    Transportador moto;
    Transportador van;
    Transportador caminhao;

    @BeforeEach
    void setUp() {
        caminhao = new Caminhao(null);
        van = new Van(caminhao);
        moto = new Motocicleta(van);
        drone = new Drone(moto);
    }

    @Test
    void deveDespacharCargaPelaMoto() {
        Carga carga = new Carga(10.0);
        assertEquals("Motocicleta de Entrega", drone.despacharCarga(carga));
    }

    @Test
    void vanNaoDeveAceitarCargaDeDrone() {
        Carga carga = new Carga(3.0);
        assertEquals("Carga fora das especificações da frota", van.despacharCarga(carga));
    }

    @Test
    void deveDespacharCargaNoLimiteDaVan() {
        Carga carga = new Carga(500.0);
        assertEquals("Van de Carga", drone.despacharCarga(carga));
    }

    @Test
    void naoDeveDespacharCargaNegativaOuZero() {
        Carga carga = new Carga(0.0);
        assertEquals("Carga fora das especificações da frota", drone.despacharCarga(carga));
    }
}

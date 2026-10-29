package br.com.estudo.cardapioapi;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@ActiveProfiles("demo")
class DemoTest {
    @Autowired PratoModel model;
    @Test void selecionaImplementacaoDemo() { assertInstanceOf(PratoModelDemo.class,model); assertEquals(1, model.listar(null).size()); }
}

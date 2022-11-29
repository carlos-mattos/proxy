import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaginaProxyTest {

    @Test
    void deveCarregarInformacoesIniciaisApenasUmaVez() {
        PaginaProxy paginaProxy = new PaginaProxy();

        paginaProxy.renderizar();
        paginaProxy.renderizar();

        assertEquals("Carregando as configuracoes iniciais..., Pagina renderizada por completo, Pagina renderizada por completo",
                paginaProxy.retornoLogsPagina());
    }

}
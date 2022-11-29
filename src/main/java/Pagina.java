import java.util.ArrayList;
import java.util.List;

public class Pagina implements IPagina{

    private List<String> logsPagina;

    public Pagina () {
        this.logsPagina = new ArrayList<String>();
        configuracoesIniciais();
    }

    public void renderizar() {
        logsPagina.add("Pagina renderizada por completo");
    }

    public void configuracoesIniciais () {
        this.logsPagina.add("Carregando as configuracoes iniciais...");
    }

    public List<String> getLogsPagina () {
        return logsPagina;
    }
}

import java.util.stream.Collectors;

public class PaginaProxy implements IPagina {

    private static Pagina pagina;

    public void renderizar() {
        if (pagina == null) {
            pagina = new Pagina();
        }

        pagina.renderizar();
    }

    public String retornoLogsPagina() {
        return pagina.getLogsPagina().stream().map(Object::toString)
                .collect(Collectors.joining(", "));
    }
}

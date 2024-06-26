
import telefone.Iphone;

public class App {
    public static void main(String[] args) throws Exception {

        Iphone iphone = new Iphone();

        //Aparelho Telefonico
        iphone.ligar("2345598745");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        //Reprodutor Musical
        iphone.selecionarMusica("Taylor Swift - the alchemy");
        iphone.tocar();
        iphone.pausar();

        //Navegador Internet
        iphone.adicionarNovaAba();
        iphone.exibirPagina("http://localhost");
        iphone.atualizarPagina();
    }
}

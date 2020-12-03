package controller;

import controller.helper.LoginHelper;
import model.Usuario;
import model.dao.UsuarioDAO;
import view.Login;
import view.MenuPrincipal;

public class LoginController {

    private final Login view;
    private final LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void entrarNoSistema() {
        
        // pegar um usuario da view
        Usuario usuario = helper.obterModelo();
        
        // pesquisar usuario no banco
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        
        // se o usuario da view tiver o mesmo usuario e senha que o usuario vindo do banco direcionar p o menu
        // senao mostrar uma mensagem ao usuario "usuario ou senha invalidos
        if (usuarioAutenticado != null) {
            // navegar menu principal
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            view.dispose();
        } else {
            view.exibeMensagem("Usuario ou Senha invalidos!");
        }
    } 
}

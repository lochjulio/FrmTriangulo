package principal;

import visao.FrmTriangulo; // Importa a classe FrmTriangulo do pacote visao

public class Principal {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTriangulo().setVisible(true); // Cria uma instância de FrmTriangulo e a torna visível
            }
        });
    }
}
import javax.swing.*;
import java.awt.*;

public class TelaCadastro extends JFrame {
    private JLabel labelTitulo, labelNome, labelEmail, labelCPF, labelIdade, labelTelefone;
    private JTextField campoNome, campoEmail, campoCPF, campoIdade, campoTelefone;
    private JButton botaoSalvar, botaoLimpar, botaoFechar;
    private int contador = 0;

    public TelaCadastro() {
        setTitle("✨ Sistema de Cadastro - Interface Premium ✨");
        setSize(500, 550);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(245, 180, 210));

        // Título estilizado
        labelTitulo = new JLabel("✨ Cadastro de Usuário ✨");
        labelTitulo.setFont(new Font("Serif", Font.BOLD, 28));
        labelTitulo.setForeground(new Color(150, 20, 90));
        labelTitulo.setBounds(100, 20, 400, 40);
        add(labelTitulo);

        // Labels
        labelNome = criarLabel("Nome:", 50, 90);
        labelEmail = criarLabel("Email:", 50, 140);
        labelCPF = criarLabel("CPF:", 50, 190);
        labelIdade = criarLabel("Idade:", 50, 240);
        labelTelefone = criarLabel("Telefone:", 50, 290);

        add(labelNome);
        add(labelEmail);
        add(labelCPF);
        add(labelIdade);
        add(labelTelefone);

        // Campos
        campoNome = criarCampo(150, 90);
        campoEmail = criarCampo(150, 140);
        campoCPF = criarCampo(150, 190);
        campoIdade = criarCampo(150, 240);
        campoTelefone = criarCampo(150, 290);

        add(campoNome);
        add(campoEmail);
        add(campoCPF);
        add(campoIdade);
        add(campoTelefone);

        // Botões
        botaoSalvar = criarBotao("Salvar", 60, 360, new Color(220, 40, 120));
        botaoLimpar = criarBotao("Limpar", 190, 360, new Color(200, 80, 150));
        botaoFechar = criarBotao("Fechar", 320, 360, new Color(180, 60, 130));

        add(botaoSalvar);
        add(botaoLimpar);
        add(botaoFechar);

        // Ações dos botões
        botaoSalvar.addActionListener(e -> salvarCadastro());
        botaoLimpar.addActionListener(e -> limparCampos());
        botaoFechar.addActionListener(e -> dispose());

        setVisible(true);
    }

    private JLabel criarLabel(String texto, int x, int y) {
        JLabel label = new JLabel(texto);
        label.setFont(new Font("SansSerif", Font.BOLD, 16));
        label.setForeground(new Color(120, 0, 70));
        label.setBounds(x, y, 100, 30);
        return label;
    }

    private JTextField criarCampo(int x, int y) {
        JTextField campo = new JTextField();
        campo.setBounds(x, y, 250, 30);
        campo.setBackground(new Color(250, 220, 235));
        campo.setBorder(BorderFactory.createLineBorder(new Color(130, 30, 90), 2));
        return campo;
    }

    private JButton criarBotao(String texto, int x, int y, Color corFundo) {
        JButton botao = new JButton(texto);
        botao.setBounds(x, y, 100, 35);
        botao.setBackground(corFundo);
        botao.setForeground(Color.WHITE);
        botao.setFont(new Font("SansSerif", Font.BOLD, 14));
        botao.setFocusPainted(false);
        botao.setBorder(BorderFactory.createLineBorder(new Color(90, 0, 60), 2));
        return botao;
    }

    private void salvarCadastro() {
        String nome = campoNome.getText();
        String email = campoEmail.getText();
        String cpf = campoCPF.getText();
        String idade = campoIdade.getText();
        String telefone = campoTelefone.getText();
        contador++;

        JOptionPane.showMessageDialog(this,
                "✨ Cadastro realizado com sucesso! ✨\n\n" +
                        "Nome: " + nome +
                        "\nEmail: " + email +
                        "\nCPF: " + cpf +
                        "\nIdade: " + idade +
                        "\nTelefone: " + telefone +
                        "\n\nTotal de cadastros: " + contador,
                "Sucesso!",
                JOptionPane.INFORMATION_MESSAGE);
    }

    private void limparCampos() {
        campoNome.setText("");
        campoEmail.setText("");
        campoCPF.setText("");
        campoIdade.setText("");
        campoTelefone.setText("");
    }

    public static void main(String[] args) {
        new TelaCadastro();
    }
}

package view;

//import java.awt.BorderLayout;
//import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Interface01 {
    
    public Interface01(){
        JFrame janela = new JFrame("Minha Primeira Janela"); //Criar janela
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setSize(500, 500); //Dimensão da janela
        
        //janela.setLayout(new GridLayout(2,1));
        janela.setLayout(null);
        
        JButton botao = new JButton("CLIQUE AQUI!"); //Texto do botão
        botao.setBounds(200, 250, 150, 25); //Localização do botão
        
        JLabel texto = new JLabel("TEXTO PADRÃO"); //Texto na janela
        texto.setBounds(250, 100, 150, 50); //Localização do texto
        
        JTextField input = new JTextField();
        input.setBounds(200, 400, 150, 50);
        
        botao.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               String mensagem = input.getText();
               texto.setText(mensagem);
           } 
        });
        
        janela.add(input);
        janela.add(texto);
        janela.add(botao);
        
        janela.setVisible(true);
    }
}

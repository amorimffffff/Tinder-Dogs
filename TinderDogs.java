import java.awt.*;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*; 

public class TinderDogs extends JFrame   
{  
 
private int currCard = 1;  
   
private CardLayout card;  
  
public TinderDogs()  
{  

setTitle("TINDER DOGS");  //título do frame;
  
setSize(1200,900);        //tamanho do frame;

setResizable(false);      //tamanho do frame não ajustável;

setLocationRelativeTo(null);   //abertura do frame no centro;

Color fundo = new Color(164,3,71);  //cor de fundo do frame;

this.getContentPane().setBackground(fundo);
this.setVisible(true);                           //frame visível;

addWindowListener(new WindowAdapter() {
    public void windowClosing(WindowEvent windowEvent){
       System.exit(0);
    }
 });

    
JPanel cPanel = new JPanel(); 
   
card = new CardLayout();  

cPanel.setLayout(card);  //Configuração do layout do Panel;

JPanel jPanel1 = new JPanel();          //criação do panel;
jPanel1.setBackground(fundo);           //cor de fundo do panel;
  
JPanel jPanel2 = new JPanel();          //criação do panel;
jPanel2.setBackground(fundo);           //cor de fundo do panel;           
  
JPanel jPanel3 = new JPanel();          //criação do panel;
jPanel3.setBackground(fundo);           //cor de fundo do panel;
  
JPanel jPanel4 = new JPanel();          //criação do panel;
jPanel4.setBackground(fundo);           //cor de fundo do panel;

JPanel jPanel5 = new JPanel();          //criação do panel;
jPanel5.setBackground(fundo);           //cor de fundo do panel;

JPanel jPanel11 = new JPanel();         //criação do panel; 
jPanel11.setBackground(fundo);           //cor de fundo do panel;

JPanel jPanel12 = new JPanel();         //criação do panel;
jPanel12.setBackground(fundo);           //cor de fundo do panel;

JPanel jPanel13 = new JPanel();         //criação do panel;
jPanel13.setBackground(fundo);           //cor de fundo do panel;

JPanel jPanel14 = new JPanel();         //criação do panel;
jPanel14.setBackground(fundo);           //cor de fundo do panel;

JPanel jPanel15 = new JPanel();         //criação do panel;
jPanel15.setBackground(fundo);           //cor de fundo do panel;

ImageIcon imagem1 = new ImageIcon(getClass().getResource("pet1.png"));              //Adição da imagem no código;
JLabel jLabel1 = new JLabel(imagem1);                                               //Adição da imagem em label;
 
ImageIcon imagem2 = new ImageIcon(getClass().getResource("pet2.png"));               //Adição da imagem no código; 
JLabel jLabel2 = new JLabel(imagem2);                                                //Adição da imagem em label;

ImageIcon imagem3 = new ImageIcon(getClass().getResource("pet3.png"));               //Adição da imagem no código; 
JLabel jLabel3 = new JLabel(imagem3);                                                //Adição da imagem em label;
   
ImageIcon imagem4 = new ImageIcon(getClass().getResource("pet4.png"));               //Adição da imagem no código; 
JLabel jLabel4 = new JLabel(imagem4);                                                //Adição da imagem em label;

ImageIcon imagem5 = new ImageIcon(getClass().getResource("pet5.png"));                //Adição da imagem no código; 
JLabel jLabel5 = new JLabel(imagem5);                                                 //Adição da imagem em label;

ImageIcon imagem6 = new ImageIcon(getClass().getResource("perfil1.png"));               //Adição da imagem no código; 
JLabel jLabel6 = new JLabel(imagem6);                                                   //Adição da imagem em label;

ImageIcon imagem7 = new ImageIcon(getClass().getResource("perfil2.png"));              //Adição da imagem no código; 
JLabel jLabel7 = new JLabel(imagem7);                                                  //Adição da imagem em label;

ImageIcon imagem8 = new ImageIcon(getClass().getResource("perfil3.png"));               //Adição da imagem no código; 
JLabel jLabel8 = new JLabel(imagem8);                                                   //Adição da imagem em label;

ImageIcon imagem9 = new ImageIcon(getClass().getResource("perfil4.png"));               //Adição da imagem no código; 
JLabel jLabel9 = new JLabel(imagem9);                                                   //Adição da imagem em label;

ImageIcon imagem10 = new ImageIcon(getClass().getResource("perfil5.png"));                //Adição da imagem no código; 
JLabel jLabel10 = new JLabel(imagem10);                                                  //Adição da imagem em label;

ImageIcon imagem11 = new ImageIcon(getClass().getResource("pet6.png"));                 //Adição da imagem no código; 
JLabel jLabel11 = new JLabel(imagem11);                                                 //Adição da imagem em label;

ImageIcon imagem12 = new ImageIcon(getClass().getResource("pet7.png"));             //Adição da imagem no código; 
JLabel jLabel12 = new JLabel(imagem12);                                             //Adição da imagem em label;

ImageIcon imagem13 = new ImageIcon(getClass().getResource("pet8.png"));            //Adição da imagem no código; 
JLabel jLabel13 = new JLabel(imagem13);                                            //Adição da imagem em label;

ImageIcon imagem14 = new ImageIcon(getClass().getResource("pet9.png"));           //Adição da imagem no código; 
JLabel jLabel14 = new JLabel(imagem14);                                           //Adição da imagem em label;
 
ImageIcon imagem15 = new ImageIcon(getClass().getResource("pet10.png"));             //Adição da imagem no código; 
JLabel jLabel15 = new JLabel(imagem15);                                              //Adição da imagem em label;

ImageIcon imagem16 = new ImageIcon(getClass().getResource("perfil6.png"));          //Adição da imagem no código; 
JLabel jLabel16 = new JLabel(imagem16);                                             //Adição da imagem em label;

ImageIcon imagem17 = new ImageIcon(getClass().getResource("perfil7.png"));           //Adição da imagem no código; 
JLabel jLabel17 = new JLabel(imagem17);                                              //Adição da imagem em label;
 
ImageIcon imagem18 = new ImageIcon(getClass().getResource("perfil8.png"));        //Adição da imagem no código; 
JLabel jLabel18 = new JLabel(imagem18);                                           //Adição da imagem em label;

ImageIcon imagem19 = new ImageIcon(getClass().getResource("perfil9.png"));        //Adição da imagem no código; 
JLabel jLabel19 = new JLabel(imagem19);                                           //Adição da imagem em label;

ImageIcon imagem20 = new ImageIcon(getClass().getResource("perfil10.png"));        //Adição da imagem no código; 
JLabel jLabel20 = new JLabel(imagem20);                                            //Adição da imagem em label;

jPanel1.add(jLabel1);         //adição da label com imagem no panel;
  
jPanel2.add(jLabel2);         //adição da label com imagem no panel;
  
jPanel3.add(jLabel3);         //adição da label com imagem no panel;

jPanel4.add(jLabel4);         //adição da label com imagem no panel;

jPanel5.add(jLabel5);         //adição da label com imagem no panel;

jPanel11.add(jLabel11);       //adição da label com imagem no panel;

jPanel12.add(jLabel12);       //adição da label com imagem no panel;

jPanel13.add(jLabel13);       //adição da label com imagem no panel;

jPanel14.add(jLabel14);       //adição da label com imagem no panel;

jPanel15.add(jLabel15);       //adição da label com imagem no panel;
  
cPanel.add(jPanel1, "1");         //adição do panel com a label no panel com layout definido (card);
 
cPanel.add(jPanel2, "2");         //adição do panel com a label no panel com layout definido (card);
  
cPanel.add(jPanel3, "3");         //adição do panel com a label no panel com layout definido (card);
 
cPanel.add(jPanel4, "4");         //adição do panel com a label no panel com layout definido (card);

cPanel.add(jPanel5, "5");         //adição do panel com a label no panel com layout definido (card);

cPanel.add(jPanel11, "6");        //adição do panel com a label no panel com layout definido (card);

cPanel.add(jPanel12,"7");         //adição do panel com a label no panel com layout definido (card);

cPanel.add(jPanel13, "8");        //adição do panel com a label no panel com layout definido (card);

cPanel.add(jPanel14, "9");        //adição do panel com a label no panel com layout definido (card);

cPanel.add(jPanel15, "10");       //adição do panel com a label no panel com layout definido (card);
 
JPanel btnPanel = new JPanel();         //criação do panel dos botões;
btnPanel.setBackground(fundo);          //cor do fundo; 
 
ImageIcon like = new ImageIcon("C:\\Users\\aluno\\eclipse-workspace\\JuliaAmorim\\TinderDogs\\src\\heartIcon.png"); //adição de imagem;
JButton likeButton = new JButton(like);        //criação do botão e definição do fundo com imagem;

Color corBG = new Color(255,255,255);          //criação da cor de fundo do botão;
likeButton.setBorder(null);                    //bordas transparentes do botão;
likeButton.setBackground(corBG);               //definição da cor de fundo do botão;

ImageIcon cross = new ImageIcon("C:\\Users\\aluno\\eclipse-workspace\\JuliaAmorim\\TinderDogs\\src\\cross.png");  //adição de imagem;
JButton nextButton = new JButton(cross);        //criação do botão e definição do fundo com imagem;
nextButton.setBorder(null);                     //bordas transparentes do botão;
nextButton.setBackground(corBG);                //definição da cor de fundo do botão;

ImageIcon previous = new ImageIcon("C:\\Users\\aluno\\eclipse-workspace\\JuliaAmorim\\TinderDogs\\src\\return.png"); //adição de imagem;
JButton returnButton = new JButton(previous);        //criação do botão e definição do fundo com imagem;  
returnButton.setBorder(null);                        //bordas transparentes do botão;
returnButton.setBackground(corBG);                   //definição da cor de fundo do botão;

btnPanel.add(likeButton);                           //adição do botão em seu respectvo panel;

btnPanel.add(nextButton);                           //adição do botão em seu respectvo panel;

btnPanel.add(returnButton);                         //adição do botão em seu respectvo panel;
  
nextButton.addActionListener(new ActionListener()       //programação do botão "próximo"
{  
public void actionPerformed(ActionEvent ae)  
{  
  
if (currCard < 10)                                     //condição para que as imagens mudem de acordo com os cliques do botão;   
{  

currCard = currCard + 1;  
   
card.show(cPanel, "" + (currCard));                   //exibe o panel de acordo com o número armazenado na variável;
}  
}  
});    

likeButton.addActionListener(new ActionListener() {                     //programação do botão "like";
    public void actionPerformed(ActionEvent e) {
 	   JFrame frame2 = new JFrame();                                    //criação do segundo frame; 
 	   frame2.setSize(1200,900);                                        //tamanho do segundo frame;
 	   frame2.setLocationRelativeTo(null);                              //abertura do frame no centro;  
 	   frame2.getContentPane().setBackground(fundo);                    //definição da cor de fundo; 
 	  
 	   frame2.setVisible(true);                                         //torna o frame visível;
 	   
 	  if (currCard == 1) {                         //condição para que as labels (imagens) correspondentes abram de acordo com os cliques do botão; 
 		   frame2.add(jLabel6);                    //adiciona a imagem correspondente ao frame; 
 	   }
 	   
 	  if (currCard == 2) {
		   frame2.add(jLabel7);                    //adiciona a imagem correspondente ao frame;
	   }
 	  
 	  if (currCard == 2) {
		   frame2.add(jLabel7);                    //adiciona a imagem correspondente ao frame;
	   }
 	 
 	  if (currCard == 3) {
		   frame2.add(jLabel8);                    //adiciona a imagem correspondente ao frame;
	   }
 	
 	  if (currCard == 4) {
		   frame2.add(jLabel9);                    //adiciona a imagem correspondente ao frame;
	   }
 	
 	  if (currCard == 5) {
		   frame2.add(jLabel10);                    //adiciona a imagem correspondente ao frame;
	   }
 	 
 	  if (currCard == 6) {
		   frame2.add(jLabel16);                    //adiciona a imagem correspondente ao frame;
	   }
 	   
 	  if (currCard == 7) {
		   frame2.add(jLabel17);                    //adiciona a imagem correspondente ao frame;
	   }
 	
 	  if (currCard == 8) {
		   frame2.add(jLabel18);                    //adiciona a imagem correspondente ao frame;
	   }
 	
 	  if (currCard == 9) {
		   frame2.add(jLabel19);                    //adiciona a imagem correspondente ao frame;
	   }
	
 	  if (currCard == 10) {
		   frame2.add(jLabel20);                    //adiciona a imagem correspondente ao frame;
	   }
    }
 }); 

returnButton.addActionListener(new ActionListener()           //programação do botão "anterior";
{  
public void actionPerformed(ActionEvent ae)  
{  
  
if (currCard <= 10)                                  //condição para que as labels (imagens) mudem de acordo com os cliques do botão;
{  

currCard = currCard - 1;                            //volta a label anterior;   
   
card.show(cPanel, "" + (currCard));                 //exibe o panel de acordo com o número armazenado na variável;
}  
}  
});    
 
getContentPane().add(cPanel, BorderLayout.NORTH);        //configura posição do panel com o layout no frame;

getContentPane().add(btnPanel, BorderLayout.SOUTH);      //configura posição do panel com os botões no frame;
}  

public static void main(String argvs[])  
{  
 
TinderDogs cll = new TinderDogs();  
   
cll.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
 
cll.setVisible(true);  
}  
}  
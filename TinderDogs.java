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

setTitle("TINDER DOGS");  //t�tulo do frame;
  
setSize(1200,900);        //tamanho do frame;

setResizable(false);      //tamanho do frame n�o ajust�vel;

setLocationRelativeTo(null);   //abertura do frame no centro;

Color fundo = new Color(164,3,71);  //cor de fundo do frame;

this.getContentPane().setBackground(fundo);
this.setVisible(true);                           //frame vis�vel;

addWindowListener(new WindowAdapter() {
    public void windowClosing(WindowEvent windowEvent){
       System.exit(0);
    }
 });

    
JPanel cPanel = new JPanel(); 
   
card = new CardLayout();  

cPanel.setLayout(card);  //Configura��o do layout do Panel;

JPanel jPanel1 = new JPanel();          //cria��o do panel;
jPanel1.setBackground(fundo);           //cor de fundo do panel;
  
JPanel jPanel2 = new JPanel();          //cria��o do panel;
jPanel2.setBackground(fundo);           //cor de fundo do panel;           
  
JPanel jPanel3 = new JPanel();          //cria��o do panel;
jPanel3.setBackground(fundo);           //cor de fundo do panel;
  
JPanel jPanel4 = new JPanel();          //cria��o do panel;
jPanel4.setBackground(fundo);           //cor de fundo do panel;

JPanel jPanel5 = new JPanel();          //cria��o do panel;
jPanel5.setBackground(fundo);           //cor de fundo do panel;

JPanel jPanel11 = new JPanel();         //cria��o do panel; 
jPanel11.setBackground(fundo);           //cor de fundo do panel;

JPanel jPanel12 = new JPanel();         //cria��o do panel;
jPanel12.setBackground(fundo);           //cor de fundo do panel;

JPanel jPanel13 = new JPanel();         //cria��o do panel;
jPanel13.setBackground(fundo);           //cor de fundo do panel;

JPanel jPanel14 = new JPanel();         //cria��o do panel;
jPanel14.setBackground(fundo);           //cor de fundo do panel;

JPanel jPanel15 = new JPanel();         //cria��o do panel;
jPanel15.setBackground(fundo);           //cor de fundo do panel;

ImageIcon imagem1 = new ImageIcon(getClass().getResource("pet1.png"));              //Adi��o da imagem no c�digo;
JLabel jLabel1 = new JLabel(imagem1);                                               //Adi��o da imagem em label;
 
ImageIcon imagem2 = new ImageIcon(getClass().getResource("pet2.png"));               //Adi��o da imagem no c�digo; 
JLabel jLabel2 = new JLabel(imagem2);                                                //Adi��o da imagem em label;

ImageIcon imagem3 = new ImageIcon(getClass().getResource("pet3.png"));               //Adi��o da imagem no c�digo; 
JLabel jLabel3 = new JLabel(imagem3);                                                //Adi��o da imagem em label;
   
ImageIcon imagem4 = new ImageIcon(getClass().getResource("pet4.png"));               //Adi��o da imagem no c�digo; 
JLabel jLabel4 = new JLabel(imagem4);                                                //Adi��o da imagem em label;

ImageIcon imagem5 = new ImageIcon(getClass().getResource("pet5.png"));                //Adi��o da imagem no c�digo; 
JLabel jLabel5 = new JLabel(imagem5);                                                 //Adi��o da imagem em label;

ImageIcon imagem6 = new ImageIcon(getClass().getResource("perfil1.png"));               //Adi��o da imagem no c�digo; 
JLabel jLabel6 = new JLabel(imagem6);                                                   //Adi��o da imagem em label;

ImageIcon imagem7 = new ImageIcon(getClass().getResource("perfil2.png"));              //Adi��o da imagem no c�digo; 
JLabel jLabel7 = new JLabel(imagem7);                                                  //Adi��o da imagem em label;

ImageIcon imagem8 = new ImageIcon(getClass().getResource("perfil3.png"));               //Adi��o da imagem no c�digo; 
JLabel jLabel8 = new JLabel(imagem8);                                                   //Adi��o da imagem em label;

ImageIcon imagem9 = new ImageIcon(getClass().getResource("perfil4.png"));               //Adi��o da imagem no c�digo; 
JLabel jLabel9 = new JLabel(imagem9);                                                   //Adi��o da imagem em label;

ImageIcon imagem10 = new ImageIcon(getClass().getResource("perfil5.png"));                //Adi��o da imagem no c�digo; 
JLabel jLabel10 = new JLabel(imagem10);                                                  //Adi��o da imagem em label;

ImageIcon imagem11 = new ImageIcon(getClass().getResource("pet6.png"));                 //Adi��o da imagem no c�digo; 
JLabel jLabel11 = new JLabel(imagem11);                                                 //Adi��o da imagem em label;

ImageIcon imagem12 = new ImageIcon(getClass().getResource("pet7.png"));             //Adi��o da imagem no c�digo; 
JLabel jLabel12 = new JLabel(imagem12);                                             //Adi��o da imagem em label;

ImageIcon imagem13 = new ImageIcon(getClass().getResource("pet8.png"));            //Adi��o da imagem no c�digo; 
JLabel jLabel13 = new JLabel(imagem13);                                            //Adi��o da imagem em label;

ImageIcon imagem14 = new ImageIcon(getClass().getResource("pet9.png"));           //Adi��o da imagem no c�digo; 
JLabel jLabel14 = new JLabel(imagem14);                                           //Adi��o da imagem em label;
 
ImageIcon imagem15 = new ImageIcon(getClass().getResource("pet10.png"));             //Adi��o da imagem no c�digo; 
JLabel jLabel15 = new JLabel(imagem15);                                              //Adi��o da imagem em label;

ImageIcon imagem16 = new ImageIcon(getClass().getResource("perfil6.png"));          //Adi��o da imagem no c�digo; 
JLabel jLabel16 = new JLabel(imagem16);                                             //Adi��o da imagem em label;

ImageIcon imagem17 = new ImageIcon(getClass().getResource("perfil7.png"));           //Adi��o da imagem no c�digo; 
JLabel jLabel17 = new JLabel(imagem17);                                              //Adi��o da imagem em label;
 
ImageIcon imagem18 = new ImageIcon(getClass().getResource("perfil8.png"));        //Adi��o da imagem no c�digo; 
JLabel jLabel18 = new JLabel(imagem18);                                           //Adi��o da imagem em label;

ImageIcon imagem19 = new ImageIcon(getClass().getResource("perfil9.png"));        //Adi��o da imagem no c�digo; 
JLabel jLabel19 = new JLabel(imagem19);                                           //Adi��o da imagem em label;

ImageIcon imagem20 = new ImageIcon(getClass().getResource("perfil10.png"));        //Adi��o da imagem no c�digo; 
JLabel jLabel20 = new JLabel(imagem20);                                            //Adi��o da imagem em label;

jPanel1.add(jLabel1);         //adi��o da label com imagem no panel;
  
jPanel2.add(jLabel2);         //adi��o da label com imagem no panel;
  
jPanel3.add(jLabel3);         //adi��o da label com imagem no panel;

jPanel4.add(jLabel4);         //adi��o da label com imagem no panel;

jPanel5.add(jLabel5);         //adi��o da label com imagem no panel;

jPanel11.add(jLabel11);       //adi��o da label com imagem no panel;

jPanel12.add(jLabel12);       //adi��o da label com imagem no panel;

jPanel13.add(jLabel13);       //adi��o da label com imagem no panel;

jPanel14.add(jLabel14);       //adi��o da label com imagem no panel;

jPanel15.add(jLabel15);       //adi��o da label com imagem no panel;
  
cPanel.add(jPanel1, "1");         //adi��o do panel com a label no panel com layout definido (card);
 
cPanel.add(jPanel2, "2");         //adi��o do panel com a label no panel com layout definido (card);
  
cPanel.add(jPanel3, "3");         //adi��o do panel com a label no panel com layout definido (card);
 
cPanel.add(jPanel4, "4");         //adi��o do panel com a label no panel com layout definido (card);

cPanel.add(jPanel5, "5");         //adi��o do panel com a label no panel com layout definido (card);

cPanel.add(jPanel11, "6");        //adi��o do panel com a label no panel com layout definido (card);

cPanel.add(jPanel12,"7");         //adi��o do panel com a label no panel com layout definido (card);

cPanel.add(jPanel13, "8");        //adi��o do panel com a label no panel com layout definido (card);

cPanel.add(jPanel14, "9");        //adi��o do panel com a label no panel com layout definido (card);

cPanel.add(jPanel15, "10");       //adi��o do panel com a label no panel com layout definido (card);
 
JPanel btnPanel = new JPanel();         //cria��o do panel dos bot�es;
btnPanel.setBackground(fundo);          //cor do fundo; 
 
ImageIcon like = new ImageIcon("C:\\Users\\aluno\\eclipse-workspace\\JuliaAmorim\\TinderDogs\\src\\heartIcon.png"); //adi��o de imagem;
JButton likeButton = new JButton(like);        //cria��o do bot�o e defini��o do fundo com imagem;

Color corBG = new Color(255,255,255);          //cria��o da cor de fundo do bot�o;
likeButton.setBorder(null);                    //bordas transparentes do bot�o;
likeButton.setBackground(corBG);               //defini��o da cor de fundo do bot�o;

ImageIcon cross = new ImageIcon("C:\\Users\\aluno\\eclipse-workspace\\JuliaAmorim\\TinderDogs\\src\\cross.png");  //adi��o de imagem;
JButton nextButton = new JButton(cross);        //cria��o do bot�o e defini��o do fundo com imagem;
nextButton.setBorder(null);                     //bordas transparentes do bot�o;
nextButton.setBackground(corBG);                //defini��o da cor de fundo do bot�o;

ImageIcon previous = new ImageIcon("C:\\Users\\aluno\\eclipse-workspace\\JuliaAmorim\\TinderDogs\\src\\return.png"); //adi��o de imagem;
JButton returnButton = new JButton(previous);        //cria��o do bot�o e defini��o do fundo com imagem;  
returnButton.setBorder(null);                        //bordas transparentes do bot�o;
returnButton.setBackground(corBG);                   //defini��o da cor de fundo do bot�o;

btnPanel.add(likeButton);                           //adi��o do bot�o em seu respectvo panel;

btnPanel.add(nextButton);                           //adi��o do bot�o em seu respectvo panel;

btnPanel.add(returnButton);                         //adi��o do bot�o em seu respectvo panel;
  
nextButton.addActionListener(new ActionListener()       //programa��o do bot�o "pr�ximo"
{  
public void actionPerformed(ActionEvent ae)  
{  
  
if (currCard < 10)                                     //condi��o para que as imagens mudem de acordo com os cliques do bot�o;   
{  

currCard = currCard + 1;  
   
card.show(cPanel, "" + (currCard));                   //exibe o panel de acordo com o n�mero armazenado na vari�vel;
}  
}  
});    

likeButton.addActionListener(new ActionListener() {                     //programa��o do bot�o "like";
    public void actionPerformed(ActionEvent e) {
 	   JFrame frame2 = new JFrame();                                    //cria��o do segundo frame; 
 	   frame2.setSize(1200,900);                                        //tamanho do segundo frame;
 	   frame2.setLocationRelativeTo(null);                              //abertura do frame no centro;  
 	   frame2.getContentPane().setBackground(fundo);                    //defini��o da cor de fundo; 
 	  
 	   frame2.setVisible(true);                                         //torna o frame vis�vel;
 	   
 	  if (currCard == 1) {                         //condi��o para que as labels (imagens) correspondentes abram de acordo com os cliques do bot�o; 
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

returnButton.addActionListener(new ActionListener()           //programa��o do bot�o "anterior";
{  
public void actionPerformed(ActionEvent ae)  
{  
  
if (currCard <= 10)                                  //condi��o para que as labels (imagens) mudem de acordo com os cliques do bot�o;
{  

currCard = currCard - 1;                            //volta a label anterior;   
   
card.show(cPanel, "" + (currCard));                 //exibe o panel de acordo com o n�mero armazenado na vari�vel;
}  
}  
});    
 
getContentPane().add(cPanel, BorderLayout.NORTH);        //configura posi��o do panel com o layout no frame;

getContentPane().add(btnPanel, BorderLayout.SOUTH);      //configura posi��o do panel com os bot�es no frame;
}  

public static void main(String argvs[])  
{  
 
TinderDogs cll = new TinderDogs();  
   
cll.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
 
cll.setVisible(true);  
}  
}  
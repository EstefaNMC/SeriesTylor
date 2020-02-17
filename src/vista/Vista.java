package vista;


import javax.swing.JFrame;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Vista extends JFrame {
	
	private JTextField num1 = new JTextField(6);	
	private JTextField num2 = new JTextField(6);	
   private JButton calculateButton = new JButton("Calcular");
   private JTextField calcSolution= new JTextField(6);
 
  


    public Vista(){
	   
	   JPanel calcPanel= new JPanel();
	   JPanel calcPane2= new JPanel();

	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   this.setSize(600, 200);
	   
	   calcPanel.add(num1);
	   calcPanel.add(num2);
	   calcPanel.add(calculateButton);
	   calcPanel.add(calcSolution);
	   
	   

	   this.add(calcPanel);
	
	   
   }
   	 
   
   public double getNum1(){
	       
	        return  Double.parseDouble(num1.getText());
  
	       }
   
  
   
   public double getNum2(){
       
       return Double.parseDouble(num2.getText());

      }
   
   public double getCalcSolution(){
       
       return Double.parseDouble(calcSolution.getText());

      }
   
   
    public void setCalcSolution(double Solution){
	   
	   calcSolution.setText(Double.toString(Solution));
       
      }
   
   
   public void addCalculateListener(ActionListener listenForCalcButton){
	  
	   calculateButton.addActionListener(listenForCalcButton);

	       }

   public void displayErrorMessage(String errorMessage){
	   
	            
	   
	           JOptionPane.showMessageDialog(this, errorMessage);
	   
	            
	   
	       }

   
	

}

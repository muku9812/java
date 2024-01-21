import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class actionListerners extends JFrame implements ActionListener {
    JButton button1,button2,button3,button0,button4,button5,button6,button7,button8,button9,button10,buttonPlus,buttonMinus,buttonMul,buttonDiv;
    public static void main(String[] args) {
        new actionListerners();

    }
    public actionListerners(){
        setTitle("Calculator");
        JPanel panel=new JPanel();
        panel.setLayout(new FlowLayout());
        button1= new JButton("1");
        button2= new JButton("2");
        button3= new JButton("3");
        button4= new JButton("4");
        button5= new JButton("5");
        button6= new JButton("6");
        button7= new JButton("7");
        button8= new JButton("8");
        button9= new JButton("9");
        button0= new JButton("0");
        button0.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);




        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(button0);





        add(panel);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button0){
            System.out.println("you clicked button0");
        }
        if(e.getSource()==button1){
            System.out.println("you clicked button1");
        }
        if(e.getSource()==button2){
            System.out.println("you clicked button2");
        }
        if(e.getSource()==button3){
            System.out.println("you clicked button3");
        }
        if(e.getSource()==button4){
            System.out.println("you clicked button4");
        }
        if(e.getSource()==button5){
            System.out.println("you clicked button5");
        }
        if(e.getSource()==button6){
            System.out.println("you clicked button6");
        }
        if(e.getSource()==button7){
            System.out.println("you clicked button7");
        }
        if(e.getSource()==button8){
            System.out.println("you clicked button8");
        }
        if(e.getSource()==button9){
            System.out.println("you clicked button9");
        }

    }
}

import java.awt.event.*;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;

class Dateselector implements ItemListener {
    JFrame frame;
    JComboBox <Integer>  days;
    JComboBox <String>  Month; //Ayush Sharma 23
    JComboBox <Integer>  Year;
    JLabel label;
    int Defaultyear = 2000;
   

   Dateselector (){
   frame = new JFrame();
   frame.getContentPane().setBackground(Color.cyan);
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setLayout(new FlowLayout());
   
   frame.setSize(1000,1000);
   label = new JLabel();
  // days combobox
   Integer [] validdays = new  Integer[31];
   for(int i = 0; i<31; i++)
    { 
    validdays[i] = i+1;
    }

    days = new JComboBox<Integer>(validdays);

 
   
   //Month combobox
    String[] months = {"January","Febuary","March","April","May","June","July","August","September","October","November","December"};
    Month = new JComboBox<>(months);
  
    
    //year combobox
    Integer  [] validyears = new Integer[61];
    for(int i = 0; i<61; i++)
    { 
    validyears[i] = 1990+i;
    }
    Year = new JComboBox<>(validyears);
    Year.setSelectedItem(Defaultyear);
  
 
    frame.add(days);
    frame.add(Month);
    frame.add(Year);
    days.addItemListener(this);
    Month.addItemListener(this);
    Year.addItemListener(this);
    label.setText("1/January/2000");
    frame.add(label);
    frame.setVisible(true);
    }
 public void itemStateChanged(ItemEvent event){
    int selectedDay = (int)days.getSelectedItem();
    String selectedMonth = (String)Month.getSelectedItem();
    int selectedYear = (int)Year.getSelectedItem();
    label.setText(selectedDay+" /"+selectedMonth+" /"+selectedYear);
   
    frame.add(label);
 }
public static void main(String[] args) {
    Dateselector d = new Dateselector();
}
}

import java.awt.FlowLayout;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
 
public class MyFrame extends JFrame{

Calendar calendar;
SimpleDateFormat timeFormat;
SimpleDateFormat dayFormat;
SimpleDateFormat dateFormat;
JLabel dateLabel;
JLabel timeLabel;
JLabel dayLabel;
String date;
String day;
String time;

MyFrame()
 {
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  this.setTitle("KS// Clock App");
  this.setLayout(new FlowLayout());
  this.setSize(450,300);
  this.setResizable(false);

  timeFormat=new SimpleDateFormat("hh:mm:ss a");
  dayFormat=new SimpleDateFormat("EEEE");
  dateFormat=new SimpleDateFormat("MMMMM dd, yyyy");
  timeLabel =new JLabel();
  timeLabel.setFont(new Font("Verdana",Font.PLAIN,60));
  timeLabel.setForeground(Color.red);
  timeLabel.setBackground(Color.black);
  timeLabel.setOpaque(true);
  dayLabel=new JLabel();
  dayLabel.setFont(new Font("Ink Free",Font.PLAIN,45));
  dateLabel=new JLabel();
  dateLabel.setFont(new Font("Ink Free",Font.PLAIN,45));
  this.add(timeLabel);
  this.add(dayLabel);
  this.add(dateLabel);

  this.setVisible(true);

  setTime();
 }

 public void setTime(){
  while(true){
      time =timeFormat.format(Calendar.getInstance().getTime());
      timeLabel.setText(time);
      
       day =dayFormat.format(Calendar.getInstance().getTime());
      dayLabel.setText(day);
      
      date=dateFormat.format(Calendar.getInstance().getTime());
      dateLabel.setText(date);
      
      try{
         Thread.sleep(1000);
         }
      catch(Exception e){
           e.printStackTrace();
          }
    }
  }
}
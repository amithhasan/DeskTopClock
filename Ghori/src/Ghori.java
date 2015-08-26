
import java.awt.Color;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Amith Hasan
 */
public class Ghori extends javax.swing.JFrame
{
    
    int timeRun=0;        
    public Ghori()
   {
       super("Clock");
        initComponents(); 
        getContentPane().setBackground(Color.BLACK);
        
        new Thread()
    {
            public void run()
     {
            while(timeRun == 0)
        {
            Calendar cal = new GregorianCalendar();
            int hour = cal.get(Calendar.HOUR);
            int min  = cal.get(Calendar.MINUTE);
            int sec  = cal.get(Calendar.SECOND);
            int AM_PM = cal.get(Calendar.AM_PM);
            
            
         String day_night="";
         
         if(AM_PM==1)
        {
            day_night="PM";
        }
            else
        {
            day_night="AM";
        }
         
            String time = hour + ":" + min + ":" + sec + " " + day_night;
            clock.setText(time);
            
        }
            
     }
            
   }.start();     
        
  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clock = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        clock.setBackground(new java.awt.Color(0, 0, 0));
        clock.setFont(new java.awt.Font("DS-Digital", 0, 68)); // NOI18N
        clock.setForeground(new java.awt.Color(0, 165, 255));
        clock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clock, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(clock, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ghori().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel clock;
    // End of variables declaration//GEN-END:variables
}

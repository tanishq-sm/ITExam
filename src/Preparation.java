
import hib.software.beans.CExam;
import hib.software.beans.CplusExam;
import hib.software.beans.DsaExam;
import hib.software.beans.HtmlExam;
import hib.software.beans.JavaExam;
import hib.software.beans.PythonExam;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Preparation extends javax.swing.JFrame 
{

    SessionFactory sf = new Configuration().configure().buildSessionFactory();
    Session session=sf.openSession();
    Transaction tx = session.beginTransaction();
    ArrayList technologyname=new ArrayList();
    ArrayList qno=new ArrayList();
    ArrayList qdis=new ArrayList();
    ArrayList ch1=new ArrayList();
    ArrayList ch2=new ArrayList();
    ArrayList ch3=new ArrayList();
    ArrayList ch4=new ArrayList();
    ArrayList correct=new ArrayList();
    
    
    public Preparation() 
    {
        initComponents();
        String technology=Prep.Technologyname;
        if(technology.equalsIgnoreCase("java"))
        {
            Criteria crit = session.createCriteria(JavaExam.class);
            List<JavaExam>list=crit.list();
            for(JavaExam data:list)
            {
                qno.add(data.getQno());
                technologyname.add(data.getTechnologyname());
                qdis.add(data.getQdis());
                ch1.add(data.getChoice1());
                 ch2.add(data.getChoice2());
                  ch3.add(data.getChoice3());
                   ch4.add(data.getChoice4());
                   correct.add(data.getCorrectchoice());
                
            }
            jTextField1.setText("Question no:"+qno.get(0));
            jTextArea1.setText(""+qdis.get(0)); 
            jRadioButton1.setText(""+ch1.get(0));
            jRadioButton2.setText(""+ch2.get(0)); 
            jRadioButton3.setText(""+ch3.get(0));
            jRadioButton4.setText(""+ch4.get(0));
      }
        
        if(technology.equalsIgnoreCase("c"))
        {
            Criteria crit = session.createCriteria(CExam.class);
            List<CExam>list=crit.list();
            for(CExam data:list)
            {
                qno.add(data.getQno());
                technologyname.add(data.getTechnologyname());
                qdis.add(data.getQdis());
                ch1.add(data.getChoice1());
                 ch2.add(data.getChoice2());
                  ch3.add(data.getChoice3());
                   ch4.add(data.getChoice4());
                   correct.add(data.getCorrectchoice());
                
            }
            jTextField1.setText("Question no:"+qno.get(0));
            jTextArea1.setText(""+qdis.get(0)); 
            jRadioButton1.setText(""+ch1.get(0));
            jRadioButton2.setText(""+ch2.get(0)); 
            jRadioButton3.setText(""+ch3.get(0));
            jRadioButton4.setText(""+ch4.get(0));
      }
        
        if(technology.equalsIgnoreCase("html"))
        {
            Criteria crit = session.createCriteria(HtmlExam.class);
            List<HtmlExam>list=crit.list();
            for(HtmlExam data:list)
            {
                qno.add(data.getQno());
                technologyname.add(data.getTechnologyname());
                qdis.add(data.getQdis());
                ch1.add(data.getChoice1());
                 ch2.add(data.getChoice2());
                  ch3.add(data.getChoice3());
                   ch4.add(data.getChoice4());
                   correct.add(data.getCorrectchoice());
                
            }
            jTextField1.setText("Question no:"+qno.get(0));
            jTextArea1.setText(""+qdis.get(0)); 
            jRadioButton1.setText(""+ch1.get(0));
            jRadioButton2.setText(""+ch2.get(0)); 
            jRadioButton3.setText(""+ch3.get(0));
            jRadioButton4.setText(""+ch4.get(0));
      }
        
        if(technology.equalsIgnoreCase("dsa"))
        {
            Criteria crit = session.createCriteria(DsaExam.class);
            List<DsaExam>list=crit.list();
            for(DsaExam data:list)
            {
                qno.add(data.getQno());
                technologyname.add(data.getTechnologyname());
                qdis.add(data.getQdis());
                ch1.add(data.getChoice1());
                 ch2.add(data.getChoice2());
                  ch3.add(data.getChoice3());
                   ch4.add(data.getChoice4());
                   correct.add(data.getCorrectchoice());
                
            }
            jTextField1.setText("Question no:"+qno.get(0));
            jTextArea1.setText(""+qdis.get(0)); 
            jRadioButton1.setText(""+ch1.get(0));
            jRadioButton2.setText(""+ch2.get(0)); 
            jRadioButton3.setText(""+ch3.get(0));
            jRadioButton4.setText(""+ch4.get(0));
      }
        
        if(technology.equalsIgnoreCase("python"))
        {
            Criteria crit = session.createCriteria(PythonExam.class);
            List<PythonExam>list=crit.list();
            for(PythonExam data:list)
            {
                qno.add(data.getQno());
                technologyname.add(data.getTechnologyname());
                qdis.add(data.getQdis());
                ch1.add(data.getChoice1());
                 ch2.add(data.getChoice2());
                  ch3.add(data.getChoice3());
                   ch4.add(data.getChoice4());
                   correct.add(data.getCorrectchoice());
                
            }
            jTextField1.setText("Question no:"+qno.get(0));
            jTextArea1.setText(""+qdis.get(0)); 
            jRadioButton1.setText(""+ch1.get(0));
            jRadioButton2.setText(""+ch2.get(0)); 
            jRadioButton3.setText(""+ch3.get(0));
            jRadioButton4.setText(""+ch4.get(0));
      }
        
        if(technology.equalsIgnoreCase("C++"))
        {
            Criteria crit = session.createCriteria(CplusExam.class);
            List<CplusExam>list=crit.list();
            for(CplusExam data:list)
            {
                qno.add(data.getQno());
                technologyname.add(data.getTechnologyname());
                qdis.add(data.getQdis());
                ch1.add(data.getChoice1());
                 ch2.add(data.getChoice2());
                  ch3.add(data.getChoice3());
                   ch4.add(data.getChoice4());
                   correct.add(data.getCorrectchoice());
                
            }
            jTextField1.setText("Question no:"+qno.get(0));
            jTextArea1.setText(""+qdis.get(0)); 
            jRadioButton1.setText(""+ch1.get(0));
            jRadioButton2.setText(""+ch2.get(0)); 
            jRadioButton3.setText(""+ch3.get(0));
            jRadioButton4.setText(""+ch4.get(0));
      }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 400, 90));
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));
        getContentPane().add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));

        jButton1.setText("Previous");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jButton2.setText("Next");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, -1, -1));

        jButton3.setText("Answer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/logouticon.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 20, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/it.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed
int i;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
jButton3.setText("ANSWER");
++i;
if(i<=qno.size())
// TODO add your handling code here:
{
   jTextField1.setText("Question no:"+qno.get(i));
            jTextArea1.setText(""+qdis.get(i)); 
            jRadioButton1.setText(""+ch1.get(i));
            jRadioButton2.setText(""+ch2.get(i)); 
            jRadioButton3.setText(""+ch3.get(i));
            jRadioButton4.setText(""+ch4.get(i));
            jButton1.setEnabled(true);
}
if(i==qno.size()-1)
{
    jButton2.setEnabled(false);
}        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
jButton3.setText("ANSWER");
--i;
if(i>=0)
// TODO add your handling code here:
{
   jTextField1.setText("Question no:"+qno.get(i));
            jTextArea1.setText(""+qdis.get(i)); 
            jRadioButton1.setText(""+ch1.get(i));
            jRadioButton2.setText(""+ch2.get(i)); 
            jRadioButton3.setText(""+ch3.get(i));
            jRadioButton4.setText(""+ch4.get(i));
            jButton2.setEnabled(true);
}
if(i==0)
{
    jButton1.setEnabled(false);
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
if(jRadioButton1.isSelected() || jRadioButton2.isSelected() || jRadioButton3.isSelected() || jRadioButton4.isSelected())
        {
        jButton3.setText(""+correct.get(i));
        }
        else
        {
            JOptionPane.showMessageDialog(this, "please select any choice");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
      new HomeWindow().setVisible(true);   // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Preparation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Preparation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Preparation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Preparation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Preparation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

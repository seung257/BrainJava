// ��Ű�� 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

 
class JDBC_Delete { 
     public static void main(String args[]) { 
         // 1�ܰ� : DB ������ ���� Ŀ�ؼ� �������̽�
    	 Connection conn = null; 
    	 Statement stmt = null;
    	
         // try ~ catch ������ DB�����߿� ���ܰ� �߻��ϴ����� �˻�.
    	 try {
        	 // 2�ܰ� : JDBC����̹��� �ε��Ѵ�.
             Class.forName("com.mysql.jdbc.Driver");
             // 3�ܰ� : ����̹��Ŵ��� Ŭ������ DB�� �����Ѵ�.
             conn = DriverManager.getConnection( 
                "jdbc:mysql://localhost:3306/mysql", "root", "12345"); 
             System.out.println("�����ͺ��̽��� �����߽��ϴ�."); 
             //DB SQL �۾�
             stmt = conn.createStatement();
             String sql = "delete from person where pname = '"+args[0]+ "'"; //������'
             			//"delete from person where pname = '�̼���'";
             int chageRecord = stmt.executeUpdate(sql);
             
             
            //4�ܰ� : DB������ �����Ѵ�.
             conn.close();
             if(chageRecord > 0)
             System.out.println(chageRecord +" ���� ���� �Ǿ����ϴ�.");
             else
            	 System.out.println("������ �����Ͱ� �����ϴ�");
         } 
         catch (ClassNotFoundException cnfe) { 
             System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�." +  
                               cnfe.getMessage()); 
         } 
         catch (SQLException se) { 
        	 
             System.out.println(se.getMessage()); 
         } 
     } 

} 
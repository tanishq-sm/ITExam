import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.rmi.server.UnicastRemoteObject;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CheckLogin extends UnicastRemoteObject implements LoginInterface
{
    public CheckLogin() throws Exception
    {}

    /**
     *
     * @param id
     * @param password
     * @return
     * @throws RemoteException
     */
    @Override
    public boolean check(String id, String password)throws RemoteException
    {
        try
        {
            
            
             Class.forName("com.mysql.jdbc.Driver");
Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","root"); 
          PreparedStatement preparedStatement=connection.prepareStatement("select* from adtab where id=? and password=?");
            
            
            
            preparedStatement.setString(1,id);
 
 preparedStatement.setString(2,password);
 ResultSet rs = preparedStatement.executeQuery();
 return rs.next();
    }
catch(  ClassNotFoundException | SQLException ex)
{
    return false;
}
    }
}

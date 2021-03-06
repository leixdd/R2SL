import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/**
 *
 * @author Lei
 */
public class R2SL {
    
    public static List convert(ResultSet rs){
        
        ArrayList list = new ArrayList();
            
        try {
        
            while(rs.next()){
  
                    HashMap row = new HashMap(rs.getMetaData().getColumnCount());
                    for(int i = 1; i <= rs.getMetaData().getColumnCount(); i++ ){
                        row.put(rs.getMetaData().getColumnName(i), rs.getObject(i));
                    }
                    list.add(row);

            }
        
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return list;

    }
}
package pl.edu.pwr.aerospace.app4hab.server.daos;

import com.sun.jersey.api.NotFoundException;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import pl.edu.pwr.aerospace.app4hab.server.entities.Commands;

public class CommandsDao extends Dao {

    public Commands getLatestCommands(){
        Session s = Db.getSession();
        Transaction tx = s.beginTransaction();
        Criteria c = s.createCriteria(Commands.class);
        c.addOrder(Order.desc("ID"));

        try {
            return (Commands)c.list().get(0);
        }catch (IndexOutOfBoundsException e){
            throw new NotFoundException();
        }
    }
}

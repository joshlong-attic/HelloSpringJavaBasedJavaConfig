package com.johnathanmarksmith.hellospring.dao;

import com.johnathanmarksmith.hellospring.model.Message;
import org.apache.commons.logging.*;
import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;


/**
 * Last changed: $LastChangedDate: 2012-11-14 11:31:35 -0500 (Wed, 14 Nov 2012)
 * $
 *
 * @author Johnathan Mark Smith (johnathan.smith@uftwf.org)
 * @version $Revision$
 */

@Transactional
@Repository
public class MessageDaoImpl implements MessageDao {
    private Log log = log = LogFactory.getLog(MessageDaoImpl.class);
    @Autowired
    private SessionFactory sessionFactory;

    @PostConstruct
    public void setup() throws Throwable {
        System.out.println("setup()");
    }

    @SuppressWarnings("unchecked")
    @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
    public List<Message> listMessages() {
        try {
            return (List<Message>) sessionFactory.getCurrentSession()
                    .createCriteria(Message.class).list();

        } catch (Exception e) {
            log.fatal(e.getMessage());
            return null;
        }
    }

    @SuppressWarnings("unchecked")
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void SaveOrUpdateMessage(Message message) {
        try {
            Session mySession = sessionFactory.getCurrentSession();
            mySession.save(message);
            mySession.flush();
        } catch (Exception e) {
            log.fatal(e.getMessage());
        }
    }


}


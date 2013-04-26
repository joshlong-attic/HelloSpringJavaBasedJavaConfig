package com.johnathanmarksmith.HelloSpringJavaBasedJavaConfig.dao;

import com.johnathanmarksmith.HelloSpringJavaBasedJavaConfig.model.Message;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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
public class MessageDaoImpl implements MessageDao
{


    private Log log = null;
    @Autowired
    private SessionFactory sessionFactory;

    public MessageDaoImpl()
    {
        super();
        log = LogFactory.getLog(MessageDaoImpl.class);

    }

    @SuppressWarnings("unchecked")
    @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
    public List<Message> listMessages()
    {
        try
        {
            return (List<Message>) sessionFactory.getCurrentSession()
                    .createCriteria(Message.class).list();

        } catch (Exception e)
        {
            log.fatal(e.getMessage());
            return null;
        }
    }


    @SuppressWarnings("unchecked")
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void SaveOrUpdateMessage(Message message)
    {
    }


}


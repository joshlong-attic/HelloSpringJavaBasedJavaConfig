package com.johnathanmarksmith.hellospring.service;

import com.johnathanmarksmith.hellospring.dao.MessageDao;
import com.johnathanmarksmith.hellospring.model.Message;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Date:   4/26/13 / 10:38 AM
 * Author: Johnathan Mark Smith
 * Email:  john@johnathanmarksmith.com
 * <p/>
 * Comments:
 * <p/>
 * This service layer does not do much but I wanted to add it to show how you should layer you projects.
 */


public class MessageServiceImpl implements MessageService
{


    private Log log = null;
    @Autowired
    private MessageDao messageDao;

    public MessageServiceImpl()
    {
        super();
        log = LogFactory.getLog(MessageServiceImpl.class);

    }

    public List<Message> listMessages()
    {
        return messageDao.listMessages();
    }

    public void SaveMessage(Message message)
    {
        messageDao.SaveOrUpdateMessage(message);
    }


}

